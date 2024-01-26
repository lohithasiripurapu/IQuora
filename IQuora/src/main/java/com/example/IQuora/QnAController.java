package com.example.IQuora;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.Service.QnAService;

@RestController
public class QnAController {

	@Autowired(required = true)
	private QnAService qnAService;

	
//	@GetMapping("/homeing")
//	public RedirectView getAllQnA(ModelMap model) {
//		
//		
//		List<QnA> home = qnAService.getAllQnA();
//		
//		 model.addAttribute("home",home);
//		 System.out.println(model.getAttribute(home.get(0).getQuestion()));
////		 System.out.println(model.);
//		
//		//return "home.html";
//		// return new RedirectView("home");
//		 //return "home.html";
//		
//	}
//	
	@PostMapping("/addQuestion")
	public QnA saveQuestion(QnA question) {
		
		return qnAService.saveQuestion(question);
		
	}
	
	@PutMapping("/addAnswer/{id}")
	public Optional<QnA> addAnswer(@PathVariable String id, @RequestParam String answer) {
		System.out.println(id);
		return qnAService.addAnswer(id, answer);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteById(@PathVariable String id) {
		return qnAService.deleteById(id);
	}
	
//	@GetMapping("/addAnswer")
//	public RedirectView addAnswer() {
//		return new RedirectView("addAnswer");
//	}
	
	
}
