package com.restful.ffgames.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.ffgames.model.FinalFantasyGame;
import com.restful.ffgames.repositories.FinalFantasyGameRepository;
import com.restful.ffgames.service.FinalFantasyService;

@Service("finalFantasyService")
public class FinalFantasyGameServiceImpl implements FinalFantasyService {
	private final static Logger logger = Logger.getLogger(FinalFantasyGameServiceImpl.class.getName());
	@Autowired
	FinalFantasyGameRepository finalFantasyGameRepository;
	@Override
	public Optional<FinalFantasyGame> findFinalFantasyGameById(String finalFantasyGameId) {
		return finalFantasyGameRepository.findById(finalFantasyGameId);
	}
	@Override
	public void deleteFinalFantasyGame(String finalFantasyGameId) {
		finalFantasyGameRepository.deleteById(finalFantasyGameId);	
	}
	@Override
	public void addFinalFantasyGame(FinalFantasyGame finalfantasygame) {
		finalFantasyGameRepository.insert(finalfantasygame);
		
	}
	@Override
	public List<FinalFantasyGame> findAllGames() {
		return finalFantasyGameRepository.findAll();
	}
	
}
