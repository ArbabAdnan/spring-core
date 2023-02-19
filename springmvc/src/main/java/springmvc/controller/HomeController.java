package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.print.MultiDoc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this home url");
		model.addAttribute("name", "khan kasi");
		model.addAttribute("id", 23);
		
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("thi is about url");
		
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("name", "khan");
		modelAndView.addObject("rollnum", 123);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(23);
		list.add(56);
		list.add(78);
		
		modelAndView.addObject("marks",list);
		
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
