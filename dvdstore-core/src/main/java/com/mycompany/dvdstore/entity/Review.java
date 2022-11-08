package com.mycompany.dvdstore.entity;


import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reviewComment;
    @Column(nullable = false)
    private Short mark;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "ID_MOVIE")
    private Movie movie;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "ID_REVIEWER")
    private User reviewer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    public Short getMark() {
        return mark;
    }

    public void setMark(Short mark) {
        this.mark = mark;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getReviewer() {
        return reviewer;
    }

    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }
}
