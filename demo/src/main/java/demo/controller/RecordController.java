package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.service.RecordService;

@Controller
public class RecordController {

	@Autowired
	RecordService repo;
	
	@RequestMapping("/record")
	public String index(Model model) {
		model.addAttribute("record", repo.findAll());
		repo.sendMsg("Load index page");
		return "recordIndex";
	}
	
}
