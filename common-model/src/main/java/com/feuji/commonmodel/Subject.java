package com.feuji.commonmodel;import java.util.Set;import javax.persistence.CascadeType;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.GeneratedValue;import javax.persistence.GenerationType;import javax.persistence.Id;import javax.persistence.OneToMany;import javax.persistence.Table;import com.fasterxml.jackson.annotation.JsonIgnore;@Entity@Table(name = "subject_table")public class Subject {	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)	private Long id;	private String name;	@Column(name = "description", unique = true)	private String description;	private String status;	@JsonIgnore	@OneToMany(mappedBy = "subject", cascade = CascadeType.ALL, orphanRemoval = true)	private Set<Question> questionSet;	public Long getId() {		return id;	}	public void setId(Long id) {		this.id = id;	}	public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public String getDescription() {		return description;	}	public void setDescription(String description) {		this.description = description;	}	public Set<Question> getQuestionSet() {		return questionSet;	}	public void setQuestionSet(Set<Question> questionSet) {		this.questionSet = questionSet;	}	public String getStatus() {		return status;	}	public void setStatus(String status) {		this.status = status;	}	public Subject(String name, String description) {		this.name = name;		this.description = description;		// this.questionSet = questionSet;	}	public Subject() {	}}