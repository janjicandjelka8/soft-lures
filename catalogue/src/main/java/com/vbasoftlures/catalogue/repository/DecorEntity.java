package com.vbasoftlures.catalogue.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "decor")
public class DecorEntity {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;
	
}
