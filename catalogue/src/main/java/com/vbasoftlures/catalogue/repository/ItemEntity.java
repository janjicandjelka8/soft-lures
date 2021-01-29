package com.vbasoftlures.catalogue.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "model")
public class ItemEntity {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "image_url")
	private String imageUrl;
	
	@ManyToOne
	@JoinColumn(name="mode_id", referencedColumnName="id")
	private ModelEntity model;

	@ManyToOne
	@JoinColumn(name="deco_id", referencedColumnName="id")
	private DecorEntity decor;
	
}
