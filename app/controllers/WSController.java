package controllers;

import play.Logger;
//import play.cache.Cached;
import play.libs.ws.WSClient;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

public class WSController extends Controller {

    private final WSClient wsClient;

    @Inject
    public WSController(WSClient wsClient) {
        this.wsClient = wsClient;
    }


    //@Cached( key = "ws-get", duration = 10)
    public CompletionStage<Result> get() {
        String url = "http://www.clever-age.com";

        CompletionStage<WSResponse> wsResponseCompletionStage = wsClient.url(url).setFollowRedirects(true).get();
        Logger.info("WS URL request :" + url  + " " + System.currentTimeMillis());

        return wsResponseCompletionStage.thenApply(response -> {
            Logger.info("WS URL response " + response.getStatus() + " " + System.currentTimeMillis());
            return ok(response.getBody()).as("text/html");
        });
    }
}