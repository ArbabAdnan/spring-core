package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userservice;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "LearnCodeWith Arbab");
		m.addAttribute("Desc", "Home for programmer");
		System.out.println("adding common data ");
	}
	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("Creating form");
		return "contact";
	}
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		//process
		int createUser = this.userservice.createUser(user);
		model.addAttribute("msg", "User created wit id " +createUser);
		return "success";
	}
	

}

/*
@RequestMapping(path = "/processForm", method = RequestMethod.POST)
public String handleForm(
		@RequestParam("email") String userEmail,
		@RequestParam("name")String userName,
		@RequestParam("password") String useraPassword,
		Model model
		) {
//	System.out.println("user email "+ userEmail);
//	System.out.println("user name "+ userName);
//	System.out.println("user password "+ useraPassword);
	
	User user = new User();
	user.setEmail(userEmail);
	user.setUserName(userName);
	user.setPassword(useraPassword);
	System.out.println(user);
	
	model.addAttribute("user", user);
	
	//process
	
//	model.addAttribute("email", userEmail);
//	model.addAttribute("name", userName);
//	model.addAttribute("password", useraPassword);
	
	return "success";
}
*/
