package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import model.users.usersVO;


@Controller
public class mainController {
	
	@Autowired
	usersVO usersVO;
	
	@RequestMapping(value="/main.do")
	public String selectOneMeal(usersVO vo) {
		return "main.jsp";
	}

}
