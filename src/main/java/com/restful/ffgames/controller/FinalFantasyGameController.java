package com.restful.ffgames.controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.restful.ffgames.model.FinalFantasyGame;
import com.restful.ffgames.service.FinalFantasyService;

@RestController
public class FinalFantasyGameController {

	private final static Logger logger = Logger.getLogger(FinalFantasyGameController.class.getName());
	@Autowired
	FinalFantasyService finalFantasyService;

	@GetMapping(value = "/games")
	public List<FinalFantasyGame> getFinalFantasyGames() {
		List<FinalFantasyGame> listOfFFGames = finalFantasyService.findAllGames();
		return listOfFFGames;
	}

	@GetMapping(value = "/games/{gameId}")
	public Optional<FinalFantasyGame> findFFGame(@PathVariable String gameId) {
		return finalFantasyService.findFinalFantasyGameById(gameId);
	}

	@DeleteMapping(value = "/games/delete/{gameId}")
	public void delete(@PathVariable("gameId") String gameId) throws Exception {
		logger.info("Deleting the game with id:" + gameId);
		logger.log(Level.INFO, "Size is  ", getFinalFantasyGames().size());
		finalFantasyService.deleteFinalFantasyGame(gameId);
		logger.log(Level.INFO, "Size is after", getFinalFantasyGames().size());
	}

}