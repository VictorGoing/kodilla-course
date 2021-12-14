package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userId;
    private String nameOfUser;
    private char sexOfUser;
    private LocalDate dateOfBirth;
    private int numberOfPosts;

    public ForumUser(int userId, String nameOfUser, char sexOfUser, LocalDate dateOfBirth, int numberOfPosts) {
        this.userId = userId;
        this.nameOfUser = nameOfUser;
        this.sexOfUser = sexOfUser;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public char getSexOfUser() {
        return sexOfUser;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", nameOfUser='" + nameOfUser + '\'' +
                ", sexOfUser=" + sexOfUser +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
