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
@Table (name = Constants.QUESTIONS)
public class Question implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(columnDefinition = "VARCHAR(1024)")
	private String text;
	@Column
	private String level;
	@Column
	private String type;
	
	@ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = Constants.QUESTION_ANSWERS,
        joinColumns = @JoinColumn(name = "QUES_ID", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "ANS_ID", referencedColumnName = "id"))
	private Set<Answer> setOfAnswers;
	
	@ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = Constants.QUESTIONS_TOPIC,
        joinColumns = @JoinColumn(name = "QUES_ID", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "TOPIC_ID", referencedColumnName = "id"))
	private Set<Topic> setOfTopic;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @return the text
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
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the setOfAnswers
	 */
	public Set<Answer> getSetOfAnswers() {
		return setOfAnswers;
	}
	/**
	 * @param setOfAnswers the setOfAnswers to set
	 */
	public void setSetOfAnswers(Set<Answer> setOfAnswers) {
		this.setOfAnswers = setOfAnswers;
	}
	
	
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the setOfTopic
	 */
	public Set<Topic> getSetOfTopic() {
		return setOfTopic;
	}
	/**
	 * @param setOfTopic the setOfTopic to set
	 */
	public void setSetOfTopic(Set<Topic> setOfTopic) {
		this.setOfTopic = setOfTopic;
	}
	public Question() { 
		// default constructor
	}
	
}
