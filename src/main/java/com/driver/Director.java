package com.driver;

public class Director {
    private String Name;
    private int numberOfMovies;
    private double imbdRating;

    public Director(){

    }
    public Director(String name, int numberOfMovies, double imbdRating) {
        Name = name;
        this.numberOfMovies = numberOfMovies;
        this.imbdRating = imbdRating;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public double getImbdRating() {
        return imbdRating;
    }

    public void setImbdRating(double imbdRating) {
        this.imbdRating = imbdRating;
    }
}
