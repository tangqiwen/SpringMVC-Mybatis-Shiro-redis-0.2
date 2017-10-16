package shiro.demo.test.service;

import com.sojson.user.manager.UserManager;

public class UserManagerTest {

	
	public static void main(String[] args) {
		
	String pass=	UserManager.md5Pswd("admin", "123456");
		System.out.println(pass);
		
	}
	
	
}
