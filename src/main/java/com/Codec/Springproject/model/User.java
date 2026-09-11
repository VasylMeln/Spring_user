package com.Codec.Springproject.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "USER")
public class User {

	  @Id
	  @GeneratedValue
	  private Long id;
	
	  @Column(name = "NAME")
	  private String name;
	  
	  @Column(name = "CITY")
	  private String city;
	  
	  @Column(name = "state")
	  private String state;
	  
	  @Column(name = "zipcode")
	  private int zipcode; 
	  
	  @Column(name = "p_all")
	  private boolean p_all;
	  
	  @Column(name = "e_all")
	  private boolean e_all;
	  
	  @Column(name = "d_all")
	  private boolean d_all;
	  
}

/* 
their display name, one that’s unique to only that user
city
state
zipcode
whether they’re interested in peanut allergies
whether they’re interested in egg allergies
whether they’re interested in dairy allergies
*/