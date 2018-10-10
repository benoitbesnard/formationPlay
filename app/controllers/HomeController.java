package controllers;

import play.Logger;
import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
	public Result index() {
    	session().put("page", "index (/)");
        return ok(views.html.index.render("Benoît"));
    }
    
    public Result myChangeLang(String code) {
    	Logger.debug(code);
    	try {
	    	ctx().changeLang(code);
	    	flash().put("success", "La langue a changé en "+code);
    	} catch (Exception e) {
			flash().put("error", "La langue n'a pas pu être changée en "+code);
			Logger.error("message", e);
		}
    	return redirect(controllers.routes.HomeController.index());
    }

}
