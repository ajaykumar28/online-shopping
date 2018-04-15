package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	
	@RequestMapping(value = {"/", "/index"})
	public ModelAndView index() {		
		ModelAndView mv = new ModelAndView("page");	
		mv.addObject("greetings","hello ajay");
		
	return mv;
	}
	
	
	
	/*@RequestMapping(value = {"/test"})
	public ModelAndView test(@RequestParam(value="greeting" ,required=false) String greeting) {		
		ModelAndView mv = new ModelAndView("page");	
		if(greeting==null)
		{
			greeting="hello";
		}
		
		mv.addObject("greetings",greeting);
		
	return mv;
	}
	*/
	
	
	
	@RequestMapping(value = {"/test/{greeting}"})
	public ModelAndView test(@PathVariable("greeting") String greeting) {		
		ModelAndView mv = new ModelAndView("page");	
		if(greeting==null)
		{
			greeting="hello";
		}
		
		mv.addObject("greetings",greeting);
		
	return mv;
	}
	
	
	
	
}
