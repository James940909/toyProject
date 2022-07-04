package model.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class usersDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String sql_users_INSERT = "INSERT INTO users (u_id, u_password, u_email, u_phoneNumber, u_profile) VALUES (?,?,?,?,?)";
	private static String sql_users_UPDATE = "";
	private static String sql_users_DELETE = "";
	private static String sql_users_SELECT_ONE = "SELECT * FROM users WHERE u_num=?";
	private static String sql_users_SELECT_ALL = "";
	
	
	public void insertUsers(usersVO vo) {
		Object[] args = { vo.getU_id(), vo.getU_password(), vo.getU_email(), vo.getU_phoneNumber(), vo.getU_profile() };
		jdbcTemplate.update(sql_users_INSERT, args);
	}
}
