package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Anime1")
public class model {
	@Id
	private int serialno;
	private String animename;
	private String maincharacter;
	private float ratings;
	
	
	public int getSerialno() {
		return serialno;
	}

	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}

	public String getAnimename() {
		return animename;
	}

	public void setAnimename(String animename) {
		this.animename = animename;
	}

	public String getMaincharacter() {
		return maincharacter;
	}

	public void setMaincharacter(String maincharacter) {
		this.maincharacter = maincharacter;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public model(int serialno, String animename, String maincharacter, float ratings) {
		super();
		this.serialno = serialno;
		this.animename = animename;
		this.maincharacter = maincharacter;
		this.ratings = ratings;
	}

	public model() {
		
	}

	public String toString() {
		return "sno="+serialno+"AnimeName="+animename+"MC="+maincharacter+"ratings="+ratings;
	}

}