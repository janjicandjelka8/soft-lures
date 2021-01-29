package com.vbasoftlures.catalogue.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "model")
public class ModelEntity {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "short_name")
	private String shortName;

	@ManyToOne
	@JoinColumn(name="mosi_id", referencedColumnName="id")
	private ModelSizeEntity modelSize;
	
}
