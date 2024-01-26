package com.example.Repos;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.IQuora.QnA;

@Repository
public interface QnARepository extends MongoRepository<QnA, String> {


}
