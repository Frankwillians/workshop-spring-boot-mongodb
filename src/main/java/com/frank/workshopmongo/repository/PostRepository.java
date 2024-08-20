package com.frank.workshopmongo.repository;

import com.frank.workshopmongo.domain.Post;
import com.frank.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
