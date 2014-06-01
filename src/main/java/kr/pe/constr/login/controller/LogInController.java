package kr.pe.constr.login.controller;

import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LogInController {
	
	//private static final Logger logger = LoggerFactory.getLogger(LogInController.class);
	private static final Logger logger = LogManager.getLogger(LogInController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login/login.json", method = RequestMethod.GET)
	public ModelAndView login(Locale locale) {
		
		System.out.println("#######logIn########"+locale.getCountry());
		logger.info("Welcome login~!!");
		logger.debug("park----------->");
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("login");
		mv.addObject("message","Do you want to login?");
		
		//model.addAttribute("serverTime",  );
		
		return mv;
	}
	
}
