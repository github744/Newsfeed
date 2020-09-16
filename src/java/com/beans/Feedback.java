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
public class Feedback {
   private int id;
    String name,message;

    public Feedback(int id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public Feedback() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
