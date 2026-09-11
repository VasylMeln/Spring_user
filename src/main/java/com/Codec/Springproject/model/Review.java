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
@Table(name = "REVIEW")
public class Review {
	
	
	  @Id
	  @GeneratedValue
	  private Long id;
	
	  @Column(name = "NAME")
	  private String name;
	  
	  @Column(name = "REST_ID")
	  private Long rest_id;
	  
	  @Column(name = "P_SCORE")
	  private String p_score;
	  
	  @Column(name = "E_SCORE")
	  private String e_score;
	  
	  @Column(name = "D_SCORE")
	  private String d_score;
	  
	  @Column(name = "COMMENT")
	  private String comment;
}

/*who submitted, represented by their unique display name (String)
the restaurant, represented by its Id (Long)
an optional peanut score, on a scale of 1-5
an optional egg score, on a scale of 1-5
an optional dairy score, on a scale of 1-5
an optional commentary
*/