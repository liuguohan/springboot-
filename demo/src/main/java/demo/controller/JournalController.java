package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.dao.JournalRepository;

@Controller
public class JournalController {

	/*@Autowired
	JournalRepository repo;
	
	@RequestMapping("/journal")
	public String index(Model model) {
		model.addAttribute("journal", repo.findAll());
		return "index";
	}*/
	
}
