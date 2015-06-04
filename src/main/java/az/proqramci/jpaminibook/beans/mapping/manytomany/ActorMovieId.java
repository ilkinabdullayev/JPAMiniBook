/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.proqramci.jpaminibook.beans.mapping.manytomany;

/**
 *
 * @author Ilkin Abdullayev
 */
public class ActorMovieId {

    private static final long serialVersionUID = 1L;

    private int actor;
    private int movie;

    public int getActor() {
        return actor;
    }

    public void setActor(int actor) {
        this.actor = actor;
    }

    public int getMovie() {
        return movie;
    }

    public void setMovie(int movie) {
        this.movie = movie;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.actor;
        hash = 71 * hash + this.movie;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ActorMovieId other = (ActorMovieId) obj;
        return true;
    }

}
