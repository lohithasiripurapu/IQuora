package com.example.IQuora;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.Service.QnAService;

@Controller
@RequestMapping("/")
public class MainPageController {
	
	@Autowired
	QnAService qnAService;
	
	@GetMapping("/home")
	public String index(Model model) {
		List<QnA> documents = qnAService.getAllQnA();
        model.addAttribute("documents", documents);
		return "home.html";
		
		
//		return new RedirectView("home");
//		return "this is home";
		
	}
	
	@GetMapping("/addAnswer")
	public String addAnswer() {
		return "addAnswer.html";
	}

}
