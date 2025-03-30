package pdprof.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Size;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
	
	@Size(min=3)
	private String message = "Hello World!";
		
	public String getMessage() {
		System.out.println("HelloBean.gettMessage : << " + message);
		return message;
	}

	public void setMessage(String message) {
		System.out.println("HelloBean.setMessage : >> " + message);
		this.message = message;
	}

}
