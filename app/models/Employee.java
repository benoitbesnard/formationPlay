package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.ebean.Finder;

@Entity
public class Employee {
	@Id
	private Long id;
	@Column(nullable=false)
	private String lastname;
	private String firstname;
	private Integer age;
	private Boolean enabled;
	@ManyToOne
	private Company company;
	
	private static Finder<Long, Employee> find = new Finder<>(Employee.class);
	
	public static List<Employee> findAll() {
		return find.all();
	}
	
	public static List<Employee> findAllActifOrderedByAge(String order) {
		return find.query().where().eq("enabled", true).orderBy("age "+order).findList();
	}
	
	public static List<Employee> findAllByName(String name) {
		return find.query().where().ilike("lastname", "%"+name+"%").findList();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
