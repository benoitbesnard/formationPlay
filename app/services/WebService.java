package services;

import javax.inject.Inject;

import play.libs.ws.WSClient;

public class WebService {

	private static String URL = ""; 
	private final WSClient wsClient;

    @Inject
    public WebService(WSClient wsClient) {
        this.wsClient = wsClient;
    }
    
    public String get(String url) {
    	return "";
    }
}
