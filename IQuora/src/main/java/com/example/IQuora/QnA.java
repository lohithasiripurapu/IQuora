package com.example.IQuora;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "QndA")
public class QnA {
	
	@Id
	private String id;

	private String question;
	
	private List<String> answers;
	

	public QnA(String id, String question, List<String> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	
	
	
	
	

}
