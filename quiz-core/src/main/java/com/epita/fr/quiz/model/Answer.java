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


// TODO: Auto-generated Javadoc
/**
 * The Class Answer.
 *
 * @author namrata
 * 	POJO Options 
 */

@Component
@Entity
@Table (name = Constants.ANSWERS)
public class Answer implements Serializable {
		
		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = 1L;
	
	/** The id. */
	@Id
	@Column (name = Constants.ID)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	/** The text. */
	@Column (name = Constants.TEXT)
	private String text;
	
	/** The is correct. */
	@Column (name = Constants.IS_CORRECT)
	private String isCorrect;
	

	/**
	 * Instantiates a new answer.
	 */
	public Answer() { 
		// default constructor
	}


	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText() {
		return text;
	}


	/**
	 * Gets the checks if is correct.
	 *
	 * @return the checks if is correct
	 */
	public String getIsCorrect() {
		return isCorrect;
	}


	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Sets the text.
	 *
	 * @param text the new text
	 */
	public void setText(String text) {
		this.text = text;
	}


	/**
	 * Sets the checks if is correct.
	 *
	 * @param isCorrect the new checks if is correct
	 */
	public void setIsCorrect(String isCorrect) {
		this.isCorrect = isCorrect;
	}

}
