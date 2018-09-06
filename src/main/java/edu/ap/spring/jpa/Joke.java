package edu.ap.spring.jpa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by nicolas on 06/09/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Joke {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String joke;


    public Joke() {}

    public Joke(String joke) {
        this.joke = joke;

    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "joke='" + joke + '\'' +
                '}';
    }
}
