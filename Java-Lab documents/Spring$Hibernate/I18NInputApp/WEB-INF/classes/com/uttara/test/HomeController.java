package com.uttara.test;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	List<RegBean> beans = new ArrayList<RegBean>();
	@RequestMapping("/")
	public String showHome(Model model)
	{
		model.addAttribute("reg",new RegBean());
		return "Home";
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("reg") @Valid RegBean reg, BindingResult result,Model model)
	{
		System.out.println("result = "+result+" bean = "+reg+" pic "+reg.getPic().getAbsolutePath());
		if(result.hasErrors())
		{
			
			return "Home";
		}
		else
		{
			beans.add(reg);
			model.addAttribute("beans",beans);
			return "Success";
		}
	}
	
}
