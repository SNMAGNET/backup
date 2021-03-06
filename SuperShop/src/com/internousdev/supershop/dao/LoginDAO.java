package com.internousdev.supershop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.internousdev.supershop.dto.LoginDTO;
import com.internousdev.supershop.util.DBConnector;

public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection D = dbConnector.getConnection();

	private LoginDTO C = new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginParam , String loginPassword){

		String sql = "SELECT * FROM login_user_transaction where (login_id = ? OR user_name=?) AND login_pass = ?";


		try{
			PreparedStatement A = D.prepareStatement(sql);
			A.setString(1, loginParam);
			A.setString(2, loginParam);
			A.setString(3, loginPassword);

			ResultSet B = A.executeQuery();

			if(B.next()){
				C.setLoginId(B.getString("login_id"));
				C.setLoginPassword(B.getString("login_pass"));
				C.setuserName(B.getString("user_name"));

				if(!(B.getString("login_id").equals(null))){
					C.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return C;

	}

	public LoginDTO getLoginDTO(){
		return C;
	}
}
