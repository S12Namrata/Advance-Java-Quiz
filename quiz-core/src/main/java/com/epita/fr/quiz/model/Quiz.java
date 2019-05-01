/**
 * 
 */
package com.epita.fr.quiz.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.epita.fr.quiz.utils.Constants;

// TODO: Auto-generated Javadoc
/**
 * The Class Quiz.
 *
 * @author namrata
 */

@Component
@Entity
@Table (name = Constants.QUIZES)
public class Quiz implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	/** The text. */
	@Column (name = Constants.TEXT)
	private String text;
	
	/** The set of question. */
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = Constants.QUIZ_QUESTIONS,
        joinColumns = @JoinColumn(name = "QUIZ_ID", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "QUES_ID", referencedColumnName = "id"))
	private Set<Question> setOfQuestion;

	/**
	 * Instantiates a new quiz.
	 */
	public Quiz() { 
		// default constructor
	}

	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	 * @return the name
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Sets the text.
	 *
	 * @param name the name to set
	 */
	public void setText(String name) {
		this.text = name;
	}
	
	
	/**
	 * Gets the sets the of question.
	 *
	 * @return the setOfQuestion
	 */
	public Set<Question> getSetOfQuestion() {
		return setOfQuestion;
	}

	/**
	 * Sets the sets the of question.
	 *
	 * @param setOfQuestion the setOfQuestion to set
	 */
	public void setSetOfQuestion(Set<Question> setOfQuestion) {
		this.setOfQuestion = setOfQuestion;
	}

	
}
