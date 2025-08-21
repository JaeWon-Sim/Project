package movie.service;

import java.util.List;

import movie.DAO.MovieDAO;
import movie.DTO.MovieDTO;

public class MovieService {

	public List<MovieDTO> getlist(MovieDTO dto){
		MovieDAO dao = new MovieDAO();
		return dao.movieList();
	}
	
}
