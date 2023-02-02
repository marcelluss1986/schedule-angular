package io.github.marcelluss1986.schedule.model;

import io.github.marcelluss1986.schedule.model.entity.Contact;

import java.io.Serializable;

public class ContactDTO implements Serializable {

    private String name;

    private String email;

    private Boolean favorite;

    public ContactDTO() {
    }

    public ContactDTO(String name, String email, Boolean favorite) {
        this.name = name;
        this.email = email;
        this.favorite = favorite;
    }

    public ContactDTO(Contact entity) {
        name = entity.getName();
        email = entity.getEmail();
        favorite = entity.getFavorite();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}
