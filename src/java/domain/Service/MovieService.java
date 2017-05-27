package domain.Service;

import domain.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private  List<Movie> db = new ArrayList<>();
    private  int currentId = 0;

    public List<Movie> getAll(){
        return db;
    }
    public MovieService (){
    	setup("emc2","Komedia");
    	setup("Killer2","opis");
    }
    public void insert (Movie movie){
    	Movie result = new Movie();
    	result = movie;
        movie.setId(currentId);
        db.add(result);
        ++currentId;
    }
    
    public void remove (Movie movie){
        db.remove(movie);
    }
    public void update (Movie movie){
        for (Movie elementList : db){
            if (isEqual (elementList,movie)){
                elementList.setComments(movie.getComments());
                elementList.setDescription(movie.getDescription());
                elementList.setRatting(movie.getRatting());
                elementList.setComments(movie.getComments());
            }

        }
    }

    private boolean isEqual(Movie elementList, Movie movie) {
        return movie.getId() == elementList.getId();
    }
	public Movie get(int id) {
		return db.get(id);
	}
	public void updateComment(Movie result) {
		db.get(result.getId()).setComments(result.getComments());
		
	}
	public void removeComments(Movie movie, int idComents) {
		db.get(movie.getId()).getComments().remove(idComents);
		
	}
	public void addRating(Movie result, int rating) {
		db.get(result.getId()).getRatting().add(rating);
		
	}
	private void setup(String name, String comment){
		Movie movie = new Movie();
		movie.setName(name);
		movie.setComment(comment);
		
		++currentId;
	}
	
	


}
