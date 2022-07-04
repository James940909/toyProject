package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import model.users.usersService;
import model.users.usersVO;

public class usersController {
	
	@Autowired
	usersService usersService;
	
	@RequestMapping("/insertUsers.do")
	public String insertUsers(usersVO vo) {
		
		vo.setU_id(vo.getU_id());
		vo.setU_password(vo.getU_password());
		vo.setU_email(vo.getU_email());
		vo.setU_phoneNumber(vo.getU_phoneNumber());
		vo.setU_profile(vo.getU_profile());
		
		vo.toString();
		
		usersService.insertUsers(vo);
		
		return "main.do";
	}

}
