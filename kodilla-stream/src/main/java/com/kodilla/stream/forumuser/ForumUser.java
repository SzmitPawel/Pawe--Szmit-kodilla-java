package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int publishedPosts;

    public ForumUser(int userID, String userName, char userSex, LocalDate birthDate, int publishedPosts) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = birthDate;
        this.publishedPosts = publishedPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}