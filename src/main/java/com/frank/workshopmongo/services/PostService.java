package com.frank.workshopmongo.services;

import com.frank.workshopmongo.domain.Post;
import com.frank.workshopmongo.domain.User;
import com.frank.workshopmongo.dto.UserDTO;
import com.frank.workshopmongo.repository.PostRepository;
import com.frank.workshopmongo.repository.UserRepository;
import com.frank.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;




    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));

    }

    public List<Post> findByTitle(String text){
        return repo.findByTitleContainingIgnoreCase(text);
    }


}


