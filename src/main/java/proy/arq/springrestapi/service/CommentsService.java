package proy.arq.springrestapi.service;

import java.util.List;

import proy.arq.springrestapi.model.Comments;

public interface CommentsService {
	
	List<Comments> getComments();
	
	Comments saveComments(Comments comments);
	
	Comments getSingleComment (Long id);
	
	void deleteComment (Long id);
	
	Comments updateComments (Comments comment);
	

}
