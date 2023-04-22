package proy.arq.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import proy.arq.springrestapi.model.Comments;
import proy.arq.springrestapi.service.CommentsService;

@RestController
public class CommentsController {
	
	@Autowired
	private CommentsService eService;
	
	@GetMapping("/comments")
	public List<Comments> getComments(){
		return eService.getComments();
		
	}
	
	
	 @GetMapping("/comments/{id}")
	 public Comments getComment(@PathVariable("id") Long id) {
		 return eService.getSingleComment(id);
	 }
	 
	 
	 @PostMapping("/comments")
	 public Comments saveComments(@RequestBody Comments comment) {
		 return eService.saveComments(comment);
	 }
	 
	 @PutMapping("/comments/{id}")
	 public Comments upComments(@PathVariable Long id, @RequestBody Comments comment) {
		 comment.setComment_id(id);
		 return eService.saveComments(comment);
	 }
	 
	 @DeleteMapping("/comments")
	 public void deleteComment(@RequestParam("id") Long id) {
		 eService.deleteComment(id);
	 }
}
