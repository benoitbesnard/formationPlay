package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;

import forms.UserData;
import forms.Users;
import play.Logger;
import play.libs.Json;
import play.cache.Cached;
import play.libs.ws.WSClient;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;

public class WSController extends Controller {

    private final WSClient wsClient;

    @Inject
    public WSController(WSClient wsClient) {
        this.wsClient = wsClient;
    }

    @Cached( key = "ws-get", duration = 10)
    public CompletionStage<Result> get() {
        String url = "http://www.clever-age.com";

        CompletionStage<WSResponse> wsResponseCompletionStage = wsClient.url(url).setFollowRedirects(true).get();
        Logger.info("WS URL request :" + url  + " " + System.currentTimeMillis());

        return wsResponseCompletionStage.thenApply(response -> {
            Logger.info("WS URL response " + response.getStatus() + " " + System.currentTimeMillis());
            return ok(response.getBody()).as("text/html");
        });
    }
    
    public CompletionStage<Result> post() {
        String url = "http://localhost:9000/receive-persons";

        List<UserData> users = new ArrayList<>();
		for(int i = 0; i<10 ; i++) {
			UserData user = new UserData();
			user.setFirstname("Prénom"+i);
			user.setLastname("Nom"+i);
			if(i%2 == 0) {
				user.setEmail("Email"+i);
				user.setContent("Content"+i);
			}
			users.add(user);
		}
		
		Users u = new Users();
		u.setUsers(users);
				
        
        CompletionStage<WSResponse> wsResponseCompletionStage = wsClient.url(url).post(Json.toJson(u));
        Logger.info("WS URL request :" + url  + " " + System.currentTimeMillis());

        return wsResponseCompletionStage.thenApply(response -> {
            Logger.info("WS URL response " + response.getStatus() + " " + System.currentTimeMillis());
            return ok(response.getBody()).as("application/json");
        });
    }
}