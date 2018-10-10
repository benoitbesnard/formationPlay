package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.ebean.Finder;
import io.ebean.Model;

@Entity
public class User extends Model {
	
	@Id
	private Long id;
	@Column(length=50)
	private String name;
	
	private static Finder<Long, User> find = new Finder<>(User.class);
	
	public static List<User> findAll() {
		return find.all();
	}
}
