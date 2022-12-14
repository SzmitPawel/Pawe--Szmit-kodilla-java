package com.kodilla.testing.forum.statistics;

public class Stats {

    private double users;
    private double numbersOfPosts;
    private double numberOfComments;

    private double averagePostPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){

        this.users = statistics.usersNames().size();
        this.numbersOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();

        this.averagePostPerUser = this.numbersOfPosts / this.users;
        this.averageCommentsPerUser = this.numberOfComments / this.users;
        this.averageCommentsPerPost = this.numberOfComments / this.numbersOfPosts;

    }

    public void showStatistics() {
        System.out.println("Number Of Users: " + this.users);
        System.out.println("Number of Posts: " + this.numbersOfPosts);
        System.out.println("NUmber of Comments: " + this.numberOfComments);
        System.out.println("Average Post Per User: " + this.getAveragePostPerUser());
        System.out.println("Average Comments PerUser: " + this.getAverageCommentsPerUser());
        System.out.println("Average Comments Per Post: " + this.getAverageCommentsPerPost());
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public double getUsers() {
        return users;
    }

    public double getNumbersOfPosts() {
        return numbersOfPosts;
    }

    public double getNumberOfComments() {
        return numberOfComments;
    }
}
