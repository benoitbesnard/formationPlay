package controllers;

import java.util.List;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;

import forms.EmployeeName;
import models.Employee;
import play.cache.AsyncCacheApi;
import play.data.Form;
import play.data.FormFactory;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;

public class EmployeeController extends Controller {
	
	private FormFactory formFactory;
	private AsyncCacheApi cache;
	
	@Inject
	public EmployeeController(FormFactory formFactory, AsyncCacheApi cache) {
		this.formFactory = formFactory;
		this.cache = cache;
	}

	public Result listAll() {
		List<Employee> employees = Employee.findAll();
		return ok(views.html.employees.render(employees));
	}
	
	public Result listAllActifByAge(String order) {
		List<Employee> employees = Employee.findAllActifOrderedByAge(order);
		return ok(views.html.employees.render(employees));
	}
	
	public Result formName() {
		Form<EmployeeName> form = formFactory.form(EmployeeName.class);
		return ok(views.html.searchEmployees.render(form));
	}
	
	public Result search() {
		Form<EmployeeName> form = formFactory.form(EmployeeName.class);
		form = form.bindFromRequest();
		if(form.hasErrors()) {
			return badRequest(views.html.searchEmployees.render(form));
		}
		EmployeeName employeeName = form.get();
		List<Employee> employees = Employee.findAllByName(employeeName.name);
		return ok(views.html.employees.render(employees));
	}

}
