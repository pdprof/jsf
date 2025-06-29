package pdprof.jsf12;

import java.io.Serializable;

public class HelloBean implements Serializable {

	private String message = "Hello World!";

	public String getMessage() {
		System.out.println("HelloBean.gettMessage : << " + message);
		return message;
	}

	public void setMessage(String message) {
		System.out.println("HelloBean.setMessage : >> " + message);
		try {
			throw new Exception("Exception to check stacktrace");
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.message = message;
	}

}