package kr.pe.constr.join.controller;

import java.util.Locale;

import kr.pe.constr.join.controller.vo.Member;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class JoinController {
	
	//private static final Logger logger = LoggerFactory.getLogger(LogInController.class);
	private static final Logger logger = LogManager.getLogger(JoinController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/join/join.json", method = RequestMethod.GET)
	public ModelAndView join(Locale locale) {
		
		logger.info("Welcome Join~!!");
		
		ModelAndView jv = new ModelAndView();
		
		jv.setViewName("Join");
		jv.addObject("message","Do you want to login?");
		
		//model.addAttribute("serverTime",  );
		
		return jv;
	}
	
	@RequestMapping(value = "/join/insertDB.json", method = RequestMethod.GET)
	public String joinInsert(@ModelAttribute("joinAttribute") Member member) {
		
		logger.info("Welcome RND~~~~~~!!");
		logger.debug("id : "+member.getId());
		logger.debug("pw : "+member.getPassword());
		
		return null;
		
	}
	
	// 
	
}
