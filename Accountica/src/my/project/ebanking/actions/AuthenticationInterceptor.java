package my.project.ebanking.actions;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import my.project.ebanking.domains.UserAccount;


public class AuthenticationInterceptor implements Interceptor{
	
	public void destroy(){
		
	}
	
	public void init(){
		
	}
	
	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception{
		//System.out.println("inside auth interceptor");
		Map<String,Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
		if(sessionAttributes.isEmpty())
			return Action.LOGIN;		
		UserAccount userinfo = (UserAccount)sessionAttributes.get("user");
		
		//System.out.println(" in Intercept "+userinfo.toString());
		
		
		if(userinfo.getLoginId()==null || userinfo.equals(null)){
			return Action.LOGIN;			
		}else{
			//System.out.println(actionInvocation.getInvocationContext().getName());
			if(actionInvocation.getInvocationContext().getName().equals("home")){
				if(userinfo.getLoginType().equals("AccountHolder")){			
					return "AccountHolderHome"; 
				}
				else if(userinfo.getLoginType().equals("Admin")){
					return "AdminHome";
				}
			}
			
			return actionInvocation.invoke();
		}
	}
}
