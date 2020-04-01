package com.restful.ffgames.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "games")
public class FinalFantasyGame {

    @Id
	String finalFantasyGameId;
    
	String finalFantasyGameName;
	
	String finalFantasyVideoGamePrice;
	
	

	public FinalFantasyGame(String finalFantasyGameName, String finalFantasyVideoGamePrice) {
		super();
		this.finalFantasyGameName = finalFantasyGameName;
		this.finalFantasyVideoGamePrice = finalFantasyVideoGamePrice;
	}

	public String getFinalFantasyGameId() {
		return finalFantasyGameId;
	}

	public void setFinalFantasyGameId(String finalFantasyGameId) {
		this.finalFantasyGameId = finalFantasyGameId;
	}

	public String getFinalFantasyGameName() {
		return finalFantasyGameName;
	}

	public void setFinalFantasyGameName(String finalFantasyGameName) {
		this.finalFantasyGameName = finalFantasyGameName;
	}

	public String getFinalFantasyVideoGamePrice() {
		return finalFantasyVideoGamePrice;
	}

	public void setFinalFantasyVideoGamePrice(String finalFantasyVideoGamePrice) {
		this.finalFantasyVideoGamePrice = finalFantasyVideoGamePrice;
	}

	@Override
	public String toString() {
		return String.format(
				"FinalFantasyGame [finalFantasyGameId=%s, finalFantasyGameName=%s, finalFantasyVideoGamePrice=%s]",
				finalFantasyGameId, finalFantasyGameName, finalFantasyVideoGamePrice);
	}




}
