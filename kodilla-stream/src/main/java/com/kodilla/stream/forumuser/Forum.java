package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum(List<ForumUser> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

    public List<ForumUser> getListOfUsers() {
        return listOfUsers;
    }
}
