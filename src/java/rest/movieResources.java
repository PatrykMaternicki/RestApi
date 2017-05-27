package rest;

import domain.Movie;
import domain.Service.MovieService;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;


@Path ("/movies")
public class movieResources {
    private MovieRepository repository = new MovierRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> getAll(){
        return db.getAll();
    }
     
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setMovie(Movie movie){
    	db.insert(movie);
    	return Response.ok(db.get(movie.getId())).build();
    }
    
    @PUT
    @Path ("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateMovie(@PathParam("id") int id, Movie movie){
    	Movie result = db.get(id);
    	if (result == null){
    		return Response.status(404).build();
    	}
    	movie.setId(id);
    	db.update(movie);
    	return Response.ok().build();
    	
    }
    
    @DELETE
    @Path ("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response removeMovie(@PathParam("id") int id, Movie movie){
    	Movie result = db.get(id);
    	if (result == null){
    		return Response.status(404).build();
    	}
    	movie.setId(id);
    	db.update(result);
    	return Response.ok().build();
    	
    }
    
    @GET
    @Path ("/{id}/get/comments")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getComments(@PathParam("id") int id, Movie movie){
    	Movie result = db.get(id);
    	if (result == null){
    		return Response.status(404).build();
    	}
    	return Response.ok(db.get(id).getComments()).build();
    	
    }
    @PUT
    @Path ("/{id}/add/comments")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateComments (@PathParam("id") int id, List<String> comments){
    	Movie result = db.get(id);
    	if (result == null){
    		return Response.status(404).build();
    	}
    	result.setId(id);
    	result.setComments(comments);
    	db.updateComment(result);
    	return Response.ok().build();
    	
    }
    @DELETE
    @Path ("/{id}/remove/comments/{idComments}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response removeComments(@PathParam("id") int id, @PathParam("idComments") int idComents,  Movie movie){
    	Movie result = db.get(id);
    	if (result == null || result.getComments().get(idComents) == null){
    		return Response.status(404).build();
    	}
    	movie.setId(id);
    	db.removeComments(movie,idComents);
    	return Response.ok().build();
    	
    }
    
    @PUT
    @Path ("/{id}/add/rating/{rating}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addRating (@PathParam("id") int id, @PathParam("rating") int rating){
    	Movie result = db.get(id);
    	if (result == null){
    		return Response.status(404).build();
    	}
    	result.setId(id);
    	db.addRating (result,rating);
    	return Response.ok().build();
    }
    
  
  
    
    
    
    
    
}
