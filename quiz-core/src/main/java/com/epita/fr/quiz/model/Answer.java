/**
 * 
 */
package com.epita.fr.quiz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.epita.fr.quiz.utils.Constants;


/**
 * @author namrata
 *	POJO Options 
 *
 */

@Component
@Entity
@Table (name = Constants.ANSWERS)
public class Answer implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	@Id
	@Column (name = Constants.ID)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column (name = Constants.TEXT)
	private String text;
	
	@Column (name = Constants.IS_CORRECT)
	private String isCorrect;
	

	public Answer() { 
		// default constructor
	}


	public Integer getId() {
		return id;
	}


	public String getText() {
		return text;
	}


	public String getIsCorrect() {
		return isCorrect;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}


	public void setIsCorrect(String isCorrect) {
		this.isCorrect = isCorrect;
	}

}
