package com.uttara.spring;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegController {

	@Autowired
	RegService service;
	
	public RegController() {
		System.out.println("in RC no-arg constr");
	}
	
	@RequestMapping("/openRegisterView")
	public String showRegisterView(Model model)
	{
		//pre-processing method for Register view
		System.out.println("in RC->showRegisterView()");
		UserBean bean = new UserBean();
		//bean.setUname("Vivekananda");
		//bean.setEmail("viveka@anywhere.com");
		model.addAttribute("reg",bean);
		
		return "Register";
	}
	
	@RequestMapping("/")
	public String showHome()
	{
		//pre-processing of view
		System.out.println("in RC->showHome()");
		return "Home"; // name of JSP
	}
	
	@RequestMapping("/displayRegUsers")
	public String showDisplayUsersView(Model model)
	{
		System.out.println(" in RC->showdisplayRegUsers() ");
		
		List<UserBean> beans = service.fetchRegUsers();
		if(beans!=null)
		{
			model.addAttribute("usersData",beans);
		}
		return "DisplayUsers";
	}
	
	
	//we want instantiated, d.t conv, user input injected, validated bean obj!
	@RequestMapping("/register")
	public String register(@Valid @ModelAttribute("reg") UserBean bean,BindingResult result,Model model) 
	{
		System.out.println("RC->register()-> bean = "+bean);
		//if validation succeeds...
		if(result.hasErrors())
			return "Register";
		else
		{
			//bean validation has succeeded!
			String msg = service.register(bean);
			if(msg.equals(Constants.SUCCESS))
				return "Success";
			else
			{
				model.addAttribute("errorMsg", msg);
				return "Error";
			}
		}
			
	}
	
}






