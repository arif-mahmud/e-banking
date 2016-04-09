package my.project.ebanking.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction__ extends ActionSupport{
	private String LoginId;
	private String Password;
	
	
	
	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}



	public String getLoginId() {
		return LoginId;
	}



	public void setLoginId(String loginId) {
		LoginId = loginId;
	}



	public String execute() throws Exception{
		return SUCCESS;
	}

}
