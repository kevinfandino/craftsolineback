package proy.arq.springrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proy.arq.springrestapi.model.Comments;
import proy.arq.springrestapi.repository.CommentRepository;

@Service
public class ServiceComments implements CommentsService {
	
	@Autowired
	private CommentRepository eRepository;
	
	@Override
	public 
	List<Comments> getComments(){
		return eRepository.findAll();
	}
	
	@Override
	public Comments saveComments(Comments comments) {
		return eRepository.save(comments);
	}
	
	@Override
	public Comments getSingleComment(Long id) {
		Optional<Comments> comment = eRepository.findById(id);
		if (comment.isPresent()) {
			return comment.get();
		}
		throw new RuntimeException("Comentario no encontrado con ID " +id);
	}
	
	@Override
	public void deleteComment(Long id) {
		eRepository.deleteById(id);
		
	}
	
	
	@Override
	public Comments updateComments(Comments comment) {
		return eRepository.save(comment);
	}


	

}
