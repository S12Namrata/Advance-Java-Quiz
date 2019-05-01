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

/**
 * @author namrata
 *
 */

@Component
@Entity
@Table (name = Constants.QUIZES)
public class Quiz implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column (name = Constants.TEXT)
	private String text;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = Constants.QUIZ_QUESTIONS,
        joinColumns = @JoinColumn(name = "QUIZ_ID", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "QUES_ID", referencedColumnName = "id"))
	private Set<Question> setOfQuestion;

	public Quiz() { 
		// default constructor
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setText(String name) {
		this.text = name;
	}
	
	
	/**
	 * @return the setOfQuestion
	 */
	public Set<Question> getSetOfQuestion() {
		return setOfQuestion;
	}

	/**
	 * @param setOfQuestion the setOfQuestion to set
	 */
	public void setSetOfQuestion(Set<Question> setOfQuestion) {
		this.setOfQuestion = setOfQuestion;
	}

	
}
