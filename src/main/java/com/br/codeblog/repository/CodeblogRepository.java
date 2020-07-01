package com.br.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.codeblog.model.Post;

public interface CodeblogRepository extends JpaRepository<Post, Long>{

}
