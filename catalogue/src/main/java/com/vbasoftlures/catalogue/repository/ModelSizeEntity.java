package com.vbasoftlures.catalogue.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "model_size")
public class ModelSizeEntity {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "type")
	private String type;
	
	@Column(name = "value")
	private Integer value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
