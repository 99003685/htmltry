package com.ltts.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ltts.dao.UserRepository;
import com.ltts.entities.Book;
import com.ltts.entities.User;
import com.ltts.helper.Message;

@Controller
public class UserController {
	
@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("title", "Library Management System");
		return "home";
	}
	@RequestMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("title", "AboutLibrary Management System");
		return "about";
	}
	@RequestMapping("/signup")
	public String signup(Model model)
	{
		model.addAttribute("title", "Register into Library Management System");
		model.addAttribute("user",new User());
		return "signup";
	}

	
	//handler for registering user
	@RequestMapping(value="/do_register",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user")User user,Model model,HttpSession session)
	{
		try {
			
			user.setImageUrl("default.png");
			System.out.println("User"+user);
			User result=this.userRepository.save(user);
			model.addAttribute("user", new User());
			session.setAttribute("message", new Message("Successful","alert-successg"));
			return "signup";
			
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("user",user);
			session.setAttribute("message", new Message("Something went Wrong"+e.getMessage(),"alert-danger"));
			return "signup";
		}
		
		
		
	}
	
}
