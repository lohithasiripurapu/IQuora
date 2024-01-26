package com.example.Service;

import java.util.List;
import java.util.Optional;

import com.example.IQuora.QnA;

public interface QnAService {
	
	//Read
	List<QnA> fetchQnA();
	
	//save
	QnA saveQuestion(QnA question);
	
	//update new answer
	Optional<QnA> addAnswer(String id, String answer);
	
	boolean deleteById(String id);
	
	List<QnA> getAllQnA();
	

}
