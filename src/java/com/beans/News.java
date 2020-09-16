/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

/**
 *
 * @author HP
 */
public class News {
    private int id,reporter_id;
    private String title,description,image,status,status_text;
   
    public News() {
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReporter_id(int reporter_id) {
        this.reporter_id = reporter_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatus_text(String status_text) {
        this.status_text = status_text;
    }

    public int getReporter_id() {
        return reporter_id;
    }

    public String getStatus() {
        return status;
    }

    public String getStatus_text() {
        return status_text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

 
    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

   
    
    
}
