package com.example.student5306.abstracteverything.models;

/**
 * Created by student5306 on 1/04/16.
 */
public class Exemple {

    private String m_title;
    private String m_message;

    public Exemple(String title, String message) {
        this.m_title = title;
        this.m_message = message;
    }

    public String getTitle() {
        return m_title;
    }

    public String getMessage() {
        return m_message;
    }
}
