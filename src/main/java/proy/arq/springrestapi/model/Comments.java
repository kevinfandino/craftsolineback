package proy.arq.springrestapi.model;

import java.util.Date;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name="tbl_comments")

public class Comments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="comment_id")
	private Long comment_id;
	
	@Column(name="list_comments")
	private String list_comments;
	
	
	@UpdateTimestamp
	@Column(name="comment_date")
	private Date comment_date;


	public Long getComment_id() {
		return comment_id;
	}


	public void setComment_id(Long comment_id) {
		this.comment_id = comment_id;
	}


	public String getList_comments() {
		return list_comments;
	}


	public void setList_comments(String list_comments) {
		this.list_comments = list_comments;
	}


	public Date getComment_date() {
		return comment_date;
	}


	public void setComment_date(Date comment_date) {
		this.comment_date = comment_date;
	}
	

}
