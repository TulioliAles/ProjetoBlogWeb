package com.br.codeblog.service;

import java.util.List;

import com.br.codeblog.model.Post;

public interface CodeblogService {
	
	List<Post> findAll();
	
	Post findById(long id);
	
	Post save(Post post);

}
