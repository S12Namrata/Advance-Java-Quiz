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
 * The Class Question.
 *
 * @author namrata
 */
@Component
@Entity
@Table (name = Constants.QUESTIONS)
public class Question implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	/** The text. */
	@Column(columnDefinition = "VARCHAR(1024)")
	private String text;
	
	/** The level. */
	@Column
	private String level;
	
	/** The type. */
	@Column
	private String type;
	
	/** The set of answers. */
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = Constants.QUESTION_ANSWERS,
        joinColumns = @JoinColumn(name = "QUES_ID", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "ANS_ID", referencedColumnName = "id"))
	private Set<Answer> setOfAnswers;
	
	/** The set of topic. */
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = Constants.QUESTIONS_TOPIC,
        joinColumns = @JoinColumn(name = "QUES_ID", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "TOPIC_ID", referencedColumnName = "id"))
	private Set<Topic> setOfTopic;
	
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
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * Sets the text.
	 *
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Sets the level.
	 *
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Gets the sets the of answers.
	 *
	 * @return the setOfAnswers
	 */
	public Set<Answer> getSetOfAnswers() {
		return setOfAnswers;
	}
	
	/**
	 * Sets the sets the of answers.
	 *
	 * @param setOfAnswers the setOfAnswers to set
	 */
	public void setSetOfAnswers(Set<Answer> setOfAnswers) {
		this.setOfAnswers = setOfAnswers;
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
	 * Gets the sets the of topic.
	 *
	 * @return the setOfTopic
	 */
	public Set<Topic> getSetOfTopic() {
		return setOfTopic;
	}
	
	/**
	 * Sets the sets the of topic.
	 *
	 * @param setOfTopic the setOfTopic to set
	 */
	public void setSetOfTopic(Set<Topic> setOfTopic) {
		this.setOfTopic = setOfTopic;
	}
	
	/**
	 * Instantiates a new question.
	 */
	public Question() { 
		// default constructor
	}
	
}
