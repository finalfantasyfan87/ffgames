package com.restful.ffgames.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.restful.ffgames.model.FinalFantasyGame;

public interface  FinalFantasyGameRepository  extends MongoRepository<FinalFantasyGame, String> {

	
}
