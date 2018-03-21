package com.springmvc.firstcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")

public class firstspringmvccontroller {
@RequestMapping("/hello")
public String sayhello()
{
	return "hello";
}
@RequestMapping("/message")
public String sendMessage(Model m)
{
	m.addAttribute("mymessage", "hello spring");
	m.addAttribute("mymessage1", "kayal");
	m.addAttribute("message2","renu");
	return "kitchen";
}
@RequestMapping("/supermessage")
public ModelAndView sendMessage(ModelAndView m)
{
	m.addObject("mymessage", "hello spring");
	m.setViewName("food");
	return m;
	
}
}
