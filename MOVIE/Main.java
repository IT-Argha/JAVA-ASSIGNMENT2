// Q: 5
// AUTHOR: ARGHA DIGAR
// TITLE: Movie Class
// DESCRIPTION: This Java program defines a simple Movie class with attributes for a title, director, actor, and review, along with methods for adding and retrieving reviews.

class Movie {
     String title;
     String director;
     String actor;
     String review;

    public Movie(String title, String director, String actor, String reviewText) {
        this.title = title;
        this.director = director;
        this.actor = actor;
        this.review = reviewText;
    }

}

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Harry Potter", "Mike Newell", "Daniel Radcliffe","Great performances by the actors.");



        System.out.println("Movie Title: " + movie.title);
        System.out.println("Director: " + movie.director);
        System.out.println("Actor: " + movie.actor);
        System.out.println("Review: " + movie.review);
    }
}
