
public class movieRepository {
	private MovieService movieService = new MovieService();
	
	public executeAdd(Movie movie){
		movieService.insert(movie);
	}

}
