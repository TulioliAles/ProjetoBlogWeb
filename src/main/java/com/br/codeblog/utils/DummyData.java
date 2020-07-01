package com.br.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.codeblog.model.Post;
import com.br.codeblog.repository.CodeblogRepository;

@Component
public class DummyData {
	
	@Autowired
	private CodeblogRepository codeblogRepository;
	
	//@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		
		Post post1 = new Post();
		post1.setAutor("Alessandro Tulioli");
		post1.setData(LocalDate.now());
		post1.setTitulo("Java");
		post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec porta felis. Vestibulum laoreet rhoncus lectus vitae tempus. Pellentesque id congue orci. Fusce mattis vestibulum quam, non tristique ex dictum ac. Suspendisse potenti. Donec non ultricies tellus. Fusce sit amet volutpat nisi. Vestibulum hendrerit posuere hendrerit. Etiam gravida vestibulum eleifend. Cras vitae congue ex. Phasellus aliquet fermentum tristique. Phasellus tempor nisl sed nisl dignissim hendrerit. Duis convallis scelerisque tortor, non varius eros auctor sit amet. Vestibulum viverra ipsum sit amet magna viverra maximus. Curabitur blandit interdum dui quis congue. Vestibulum scelerisque nibh a mi rutrum interdum."); 
				
		Post post2 = new Post();
		post2.setAutor("Alessandro Tulioli");
		post2.setData(LocalDate.now());
		post2.setTitulo("Angular");
		post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec porta felis. Vestibulum laoreet rhoncus lectus vitae tempus. Pellentesque id congue orci. Fusce mattis vestibulum quam, non tristique ex dictum ac. Suspendisse potenti. Donec non ultricies tellus. Fusce sit amet volutpat nisi. Vestibulum hendrerit posuere hendrerit. Etiam gravida vestibulum eleifend. Cras vitae congue ex. Phasellus aliquet fermentum tristique. Phasellus tempor nisl sed nisl dignissim hendrerit. Duis convallis scelerisque tortor, non varius eros auctor sit amet. Vestibulum viverra ipsum sit amet magna viverra maximus. Curabitur blandit interdum dui quis congue. Vestibulum scelerisque nibh a mi rutrum interdum."); 
	
		postList.add(post1);
		postList.add(post2);
		
		for(Post post : postList) {
			Post postSaved = codeblogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}

}
