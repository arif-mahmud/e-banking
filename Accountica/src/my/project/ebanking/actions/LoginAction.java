package my.project.ebanking.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import my.project.ebanking.dao.UserAccountDao;
import my.project.ebanking.domains.UserAccount;

public class LoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private String loginId;
	private String password;
	private String loginType;
	private Integer bankAccNumber;
	
	UserAccountDao userAccountDao;
	
	public UserAccountDao getUserAccountDao() {
		return userAccountDao;
	}

	public void setUserAccountDao(UserAccountDao userAccountDao) {
		this.userAccountDao = userAccountDao;
	}

	private Map<String,Object> sessionAttributes = null;
	
	@Override
	public void setSession(Map<String, Object> session) {
		sessionAttributes = session;
	}
	public String execute1() throws Exception{
		System.out.println(loginId+"  password");
		return SUCCESS;
	}
	public String execute() throws Exception{
		UserAccount searchaccnt  = new UserAccount();
		searchaccnt.setLoginId(this.loginId);
		//JdbcAuthDao dao = new JdbcAuthDao();
				
		try{
			
			UserAccount userinfo =  userAccountDao.getUserAccountInfo(searchaccnt);
			System.out.println(userinfo.toString());
			//System.out.println("User #"+this.LoginId+" Pass #"+this.Password+" & type #"+this.LoginType);
			System.out.println("testing .... ");
			if(userinfo.getLoginId().equalsIgnoreCase(loginId) && userinfo.getPassword().equalsIgnoreCase(password) && userinfo.getLoginType().equalsIgnoreCase(loginType)){
				sessionAttributes.put("user", userinfo);		
				
				if(userinfo.getLoginType().equalsIgnoreCase("AccountHolder")){	
					System.out.println("AdminHome");
					return "AccountHolderHome"; 
				}
				else if(userinfo.getLoginType().equalsIgnoreCase("admin")){		
					System.out.println("AdminHome");
					return "AdminHome";
				}else{
					addFieldError("username","Username & password not match!");
					System.out.println("loginType not match");
					return "input";
				}
			} else{
				addFieldError("username","Username & password not match!");
				System.out.println("loginType not match");
				return "input";
			}
			
			
			
			
		}catch(Exception e){
			addActionError("User name is not valid");
//			/addFieldError("username","Username Not Found!");
			return "input";
			
		}
	}
	
	public String Logout() throws Exception{
		try{
		sessionAttributes.remove("user");
		}catch(Exception e){
			e.printStackTrace();
		}
		return "success";
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public Integer getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(Integer bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	public Map<String, Object> getSessionAttributes() {
		return sessionAttributes;
	}

	public void setSessionAttributes(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}

	
	
}
