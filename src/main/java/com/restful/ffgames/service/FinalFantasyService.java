package com.restful.ffgames.service;

import java.util.List;
import java.util.Optional;

import com.restful.ffgames.model.FinalFantasyGame;

public interface FinalFantasyService {
	public Optional<FinalFantasyGame> findFinalFantasyGameById(String finalFantasyGameId);

	public void deleteFinalFantasyGame(String finalFantasyGameId);

	public void addFinalFantasyGame(FinalFantasyGame finalfantasygame);

	List<FinalFantasyGame> findAllGames();


}
