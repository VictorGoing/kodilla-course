package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStats {
    private int users;
    private int posts;
    private int comments;
    private double postsMeanUser;
    private double commentsMeanUser;
    private double commentsMeanPost;

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostsMeanUser() {
        return postsMeanUser;
    }

    public double getCommentsMeanUser() {
        return commentsMeanUser;
    }

    public double getCommentsMeanPost() {
        return commentsMeanPost;
    }


    public void calculateAdvStatistics(Statistics statistics){

        this.users = statistics.usersNames().size();
        this.posts = statistics.postsCount();
        this.comments = statistics.commentsCount();

        if(this.users != 0)this.postsMeanUser = this.posts / this.users;
        else this.postsMeanUser = 0;
        if(this.users != 0)this.commentsMeanUser = this.comments / this.users;
        else this.commentsMeanUser = 0;
        if(this.posts != 0)this.commentsMeanPost = this.comments / this.posts;
        else this.commentsMeanPost = 0;

    }

    public void showStatistics(){
        System.out.println("Liczba użytkowników: " + this.users );
        System.out.println("Liczba postów: " + this.posts );
        System.out.println("Liczba komentarzy: " + this.comments );
        System.out.println("Liczba średniej liczby postów na użytkownika: " + this.postsMeanUser );
        System.out.println("Liczba średniej liczby komentarzy na użytkownika: " + this.commentsMeanUser );
        System.out.println("Liczba średniej liczby komentarzy na post: " + this.commentsMeanPost );
    }
}
