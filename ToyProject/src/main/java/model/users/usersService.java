package model.users;

import java.util.List;

public interface usersService {
	void insertUsers(usersVO vo);
	void updateUsers(usersVO vo);
	void deleteUsers(usersVO vo);
	usersVO getUsers(usersVO vo);
	List<usersVO> getUsersList(usersVO vo);
}
