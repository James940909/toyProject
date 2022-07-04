package model.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class usersServiceImpl implements usersService{
	
	@Autowired
	usersDAO usersDAO;

	@Override
	public void insertUsers(usersVO vo) {
		usersDAO.insertUsers(vo);
	}

	@Override
	public void updateUsers(usersVO vo) {
		
	}

	@Override
	public void deleteUsers(usersVO vo) {
		
	}

	@Override
	public usersVO getUsers(usersVO vo) {
		return null;
	}

	@Override
	public List<usersVO> getUsersList(usersVO vo) {
		return null;
	}

}
