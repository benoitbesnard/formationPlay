package forms;

import java.util.ArrayList;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import play.data.validation.Constraints;
import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Required;
import play.data.validation.Constraints.Validate;
import play.data.validation.ValidationError;

@Validate
public class UserData implements Constraints.Validatable<List<ValidationError>> {
	
	@Required
	private String lastname;
	@Required
	private String firstname;
	@Email
	@JsonInclude(Include.NON_NULL)
	private String email;
	@JsonInclude(Include.NON_NULL)
	private String content;
	
	public UserData() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public List<ValidationError> validate() {
		List<ValidationError> errors = new ArrayList<>();
		if(content.length() < 3 && content.length() > 0) {
			errors.add(new ValidationError("content", "error.content.size"));
		}
		return errors.size() > 0 ? errors : null;
	}

}
