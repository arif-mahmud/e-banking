package my.project.ebanking.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import my.project.ebanking.domains.UserAccount;



public class JdbcAuthDao extends SimpleJdbcDaoSupport implements UserAccountDao{
	private static final String SELECT_SQL = "select u.LoginId, u.Password, u.LoginType,u.BankAccNumber from UserAccount u, BankAccount acc where  u.BankAccNumber=acc.BankAccNumber and acc.activeStatus='1'  "
			+" and u.LoginId= ?";
	
	@Override
	public UserAccount getUserAccountInfo(UserAccount userAccount) {
		try{
			return getSimpleJdbcTemplate().queryForObject(SELECT_SQL,new ParameterizedRowMapper<UserAccount>(){
				public UserAccount mapRow(ResultSet rs,int rowNumber) throws SQLException{
					UserAccount useraccount = new UserAccount();
					useraccount.setLoginId(rs.getString("LoginId"));
					useraccount.setPassword(rs.getString("Password"));
					useraccount.setLoginType(rs.getString("loginType"));
					useraccount.setBankAccNumber(rs.getInt("bankAccNumber"));
					return useraccount;
				}
			},userAccount.getLoginId());
		}catch(Exception e){
			System.out.println(e.toString());
			return null;
		}
	}

	

}
