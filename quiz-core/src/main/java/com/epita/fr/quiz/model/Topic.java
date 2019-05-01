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
 * The Class Topic.
 *
 * @author namrata
 * 	POJO Options 
 */

@Component
@Entity
@Table (name = Constants.TOPICS)
public class Topic implements Serializable {
	
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
	

	/**
	 * Instantiates a new topic.
	 */
	public Topic() { 
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


}
