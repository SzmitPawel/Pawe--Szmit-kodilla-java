package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        List<ForumUser> forums = forum.getUserList();

        Map<Integer, ForumUser> forumUserMap = forum.getUserList().stream().
                filter(user -> user.getUserSex() == 'M').
                filter(user -> LocalDate.now().getYear() - user.getBirthDate().getYear() >= 20).
                filter(user -> user.getPublishedPosts() > 0).
                collect(Collectors.toMap(ForumUser::getUserID, user -> user));


        forumUserMap.entrySet().stream().
                map(user -> "Key: " + user.getKey() + "\n" +  "Values: " + user.getValue()).
                forEach(System.out::println);
    }
}