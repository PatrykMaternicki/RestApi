package domain;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private int id;
    private String description;
    private List<String> comments = new ArrayList<String>();
    private List<Integer> Ratting = new ArrayList<Integer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public List<Integer> getRatting() {
        return Ratting;
    }

    public void setRatting(List<Integer> ratting) {
        Ratting = ratting;
    }
}
