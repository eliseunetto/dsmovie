package com.devsuperior.dsmovie.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.repositories.ScoreRepository;
import com.devsuperior.dsmovie.repositories.UserRepository;
import com.devsuperior.dsmovie.services.exceptions.ObjectNotFoundException;

@Service
public class ScoreService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;

	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		Score score = new Score();
		
		Optional<User> userOpt = userRepository.findByEmail(dto.getEmail());
		if(!userOpt.isPresent() ) {
			User user = userRepository.saveAndFlush(new User(null, dto.getEmail()));
			score.setUser(user);
		} else {
			score.setUser(userOpt.get());
		}
		
		Optional<Movie> movieOpt = movieRepository.findById(dto.getMovieId());
		if(!movieOpt.isPresent()) {
			throw new ObjectNotFoundException("Movie not found");
		}
	
		score.setMovie(movieOpt.get());
		
		if(dto.getScore() < 0 || dto.getScore() > 5) {
			throw new IllegalArgumentException("Score must be between 1 to 5");
		} else {
			score.setValue(dto.getScore());
		}
		
		score = scoreRepository.saveAndFlush(score);
		
		Double sum = 0.0;
		for(Score s : movieOpt.get().getScores()) {
			sum += s.getValue();
		}
		
		Double avg = sum / movieOpt.get().getScores().size();
		
		movieOpt.get().setScore(avg);
		movieOpt.get().setCount(movieOpt.get().getScores().size());
		
		movieRepository.save(movieOpt.get());
			
		return new MovieDTO(movieOpt.get());
	}
}
