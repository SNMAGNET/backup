//このクラスはログインボタンを押したときに実行されます。

package com.internousdev.supershop.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public void setsession(Map<String,Object>session){
		this.session=session;
	}
	public Map<String,Object> getsession(){
		return this.session;
	}

public String execute() {
	String result = "login";
	if(session.containsKey("id")){
		result = SUCCESS;
	}

return result;

}

}