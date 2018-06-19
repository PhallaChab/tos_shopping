package tos_shopping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LayoutController {
	
	@RequestMapping(value = {"/", "/index", "/index"}, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("pageName", "index");
		return "interface/layouts"; 
	}
	@RequestMapping(value = {"/contact"}, method = RequestMethod.GET)
	public String contact(Model model) {
		model.addAttribute("pageName", "contact");
		return "interface/layouts"; 
	}
	@RequestMapping(value = {"/product"}, method = RequestMethod.GET)
	public String product(Model model) {
		model.addAttribute("pageName", "products");
		return "interface/layouts"; 
	}
	@RequestMapping(value = {"/details"}, method = RequestMethod.GET)
	public String details(Model model) {
		model.addAttribute("pageName", "details");
		return "interface/layouts"; 
	}

}