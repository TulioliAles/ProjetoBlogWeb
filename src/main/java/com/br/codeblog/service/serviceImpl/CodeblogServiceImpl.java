package com.br.codeblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.codeblog.model.Post;
import com.br.codeblog.repository.CodeblogRepository;
import com.br.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService{
	
	@Autowired
	private CodeblogRepository codeblogRepository;

	@Override
	public List<Post> findAll() {
		return codeblogRepository.findAll() ;
	}

	@Override
	public Post findById(long id) {
		return codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeblogRepository.save(post);
	}

}
