package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;

import forms.UserData;
import forms.Users;
import models.User;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import services.ConfigurationService;

public class HelloworldController extends Controller {

	private ConfigurationService config;
	private FormFactory formFactory;
	private WSClient client;

	@Inject
	public HelloworldController(ConfigurationService config,
				FormFactory formFactory,
				WSClient client) {
		this.client = client;
		this.formFactory = formFactory;
		this.config = config;
	}

	public Result helloworld() {
		// Config ??
		Logger.debug("API key : " + config.getConfig().getString("api.key"));
		Form<UserData> form = formFactory.form(UserData.class);
//		form.fill
		return ok(views.html.helloworld.render(form));
	}
	
	public Result submit() {
		Form<UserData> form = formFactory.form(UserData.class);
		form = form.bindFromRequest();
		if(form.hasErrors()) {
			return badRequest(views.html.helloworld.render(form));
		} else {
			UserData user = form.get();
			Logger.info("Lastname : "+user.getLastname());
			Logger.info("Firstname : "+user.getFirstname());
			if(StringUtils.isNotEmpty(user.getEmail())) {
				Logger.info("Email : "+user.getEmail());
			}
			if(StringUtils.isNotEmpty(user.getContent())) {
				Logger.info("Content : "+user.getContent());
			}
			return ok(views.html.helloworld.render(form));
		}
	}

	public Result pasTrouve() {
		return notFound("404 Not Found");
	}

	public Result pasAutorise() {
		return unauthorized("401 Unauthorized");
	}

	public Result hello(String name) {
		session().remove("page");
		return ok(views.html.hello.render(name));
	}

	public Result gotohome() {
		return redirect(controllers.routes.HomeController.index());
		// return redirect("/");
	}

	public Result gotohelloworld() {
		// return redirect("/");
		return redirect(controllers.routes.HelloworldController.helloworld());
	}
	
	public Result getPersons() {
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
		
		return ok(Json.toJson(users));
	}
	
	@BodyParser.Of(BodyParser.Json.class)
	public Result receivePerson() {
		play.libs.ws.WSClient client;
		JsonNode json = request().body().asJson();
		Users users = Json.fromJson(json, Users.class);
		return ok(Json.toJson(users));
	}
}
