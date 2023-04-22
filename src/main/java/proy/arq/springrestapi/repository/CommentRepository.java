package proy.arq.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proy.arq.springrestapi.model.Comments;

@Repository
public interface CommentRepository extends JpaRepository<Comments, Long> {

}
