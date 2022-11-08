package com.mycompany.dvdstore.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedEntityGraph(name = "movie.actor-and-reviews",attributeNodes = {@NamedAttributeNode("mainActor"),@NamedAttributeNode("reviews")})
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 20)
    private String title;
    @Column(nullable = false,length = 20)
    private String genre;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_MAIN_ACTOR")
    private Actor mainActor;
    @ManyToMany
    @JoinTable(
            name="MOVIE_SEC_ACTORS",
            joinColumns = {@JoinColumn(name="ID_MOVIE")},
            inverseJoinColumns = {@JoinColumn(name="ID_ACTOR")}
    )
    private List<Actor> secondaryActors=new ArrayList<>();
    @OneToMany(
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "movie"
    )
    private List<Review> reviews=new ArrayList<>();


    public Movie(Long id, String title, String genre, String description, Actor mainActor) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.mainActor = mainActor;
    }

    public Movie(Long id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public Movie() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Actor getMainActor() {
        return mainActor;
    }

    public void setMainActor(Actor mainActor) {
        this.mainActor = mainActor;
    }

    public List<Actor> getSecondaryActors() {
        return secondaryActors;
    }

    public void addSecondaryActor(Actor actor){
        this.secondaryActors.add(actor);
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review){
        this.reviews.add(review);
    }

}
