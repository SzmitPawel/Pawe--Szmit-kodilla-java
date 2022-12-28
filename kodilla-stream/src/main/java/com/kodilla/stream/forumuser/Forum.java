package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<com.kodilla.stream.forumuser.ForumUser> forumUsers = new ArrayList<>();


    public Forum() {

        int year = 0;
        int posts = 0;

        for (var i = 0; i < 50; i++) {
            forumUsers.add(new com.kodilla.stream.forumuser.ForumUser(i, "UserName" + i, 'F', LocalDate.of(1980 + year, 1, 10), posts));
            year++;
            if (i > 25) {
                posts = 1;
            }

        }

        year = 0;
        posts = 1;

        for (var i = 50; i < 100; i++) {
            forumUsers.add(new com.kodilla.stream.forumuser.ForumUser(i, "UserName" + i, 'M', LocalDate.of(1980 + year, 1, 10), posts));
            year++;
            if (i > 75) {
                posts = 0;
            }
        }
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUsers);
    }
}
