package com.uttara.spring;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegAppController {

	@Autowired
	private BusinessService service;
	
	public RegAppController() {
		System.out.println("in no-arg constr of RAC");
	}
	@RequestMapping({"/","/home"})
	public String showHome()
	{
		System.out.println("in RAC->showHome()");
		return "Home";
	}
	
	@RequestMapping("/openRegisterView")
	public String showRegisterView(Model model)
	{
		System.out.println("in RAC->showRegisterView");
		
		RegBean bean = new RegBean();
		model.addAttribute("reg", bean);
		return "Register";
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("reg") @Valid RegBean bean,BindingResult result,Model model)
	{
		System.out.println("in RAC->register() bean = "+bean);
		if(result.hasErrors())
		{
			System.out.println("in RAC->register() result of bean validation failed! result = "+result);
			return "Register";
		}
		else
		{
			//invoke service and ask it to store bean data to db
			
			String msg = service.register(bean);
			if(msg.equals(Constants.SUCCESS))
			{
				model.addAttribute("msg","Your registration has successfully completed!");
				return "Success";
			}
			else
			{
				model.addAttribute("errormsg", msg);
				return "Error";
			}
		}
		
		
	}
	
}






