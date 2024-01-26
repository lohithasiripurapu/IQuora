package com.example.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IQuora.QnA;
import com.example.Repos.QnARepository;

@Service
public class QnAServiceImpl implements QnAService{

	@Autowired
	QnARepository qnARepo;
	
	@Override
	public List<QnA> fetchQnA() {
		// TODO Auto-generated method stub
		return (List<QnA>) qnARepo.findAll();
	}


	@Override
	public QnA saveQuestion(QnA question) {
		// TODO Auto-generated method stub
		List<String> ans = new ArrayList<>();
		question.setAnswers(ans);
		return qnARepo.save(question);
	}


	@Override
	public Optional<QnA> addAnswer(String id, String answer) {
		Optional<QnA> newQuestion = qnARepo.findById(id);
		System.out.println(newQuestion.get().getQuestion());
		System.out.println(newQuestion.get().getAnswers());
		List<String> ans = newQuestion.get().getAnswers();
		ans.add(answer);
		newQuestion.get().setAnswers(ans);
		System.out.println(newQuestion.get().getAnswers());
		qnARepo.deleteById(id);
		qnARepo.save(newQuestion.get());
		
		
		// TODO Auto-generated method stub
		return newQuestion;
	}


	@Override
	public boolean deleteById(String id) {
		// TODO Auto-generated method stub
		try {
			qnARepo.deleteById(id);
			return true;
		}catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}


	@Override
	public List<QnA> getAllQnA() {
		
		List<QnA> allQnA = qnARepo.findAll();
		// TODO Auto-generated method stub
		return allQnA;
	}



}
