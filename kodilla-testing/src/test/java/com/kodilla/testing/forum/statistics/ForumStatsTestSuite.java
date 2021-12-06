package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;



import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;





@ExtendWith(MockitoExtension.class)
public class ForumStatsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsPosts0(){
        ForumStats forumStats = new ForumStats();
        List<String> usersNameList = new ArrayList<String>();


        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersNameList);

        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();
        Assertions.assertEquals(0,forumStats.getPosts());
    }

    @Test
    void calculateAdvStatisticsTestPosts1000(){
        ForumStats forumStats = new ForumStats();
        List<String> usersNameList = new ArrayList<String>();


        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersNameList);

        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();
        Assertions.assertEquals(1000,forumStats.getPosts());

    }

    @Test
    void calculateAdvStatisticsTestComments0(){
        ForumStats forumStats = new ForumStats();
        List<String> usersNameList = new ArrayList<String>();


        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersNameList);

        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();
        Assertions.assertEquals(0,forumStats.getComments());

    }

    @Test
    void calculateAdvStatisticsTestPostsMoreThanComments(){
        ForumStats forumStats = new ForumStats();
        List<String> usersNameList = new ArrayList<String>();


        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(9);
        when(statisticsMock.usersNames()).thenReturn(usersNameList);

        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();
        Assertions.assertTrue(forumStats.getPosts() > forumStats.getComments());

    }

    @Test
    void calculateAdvStatisticsTestCommentsMoreThanPosts(){
        ForumStats forumStats = new ForumStats();
        List<String> usersNameList = new ArrayList<String>();


        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.usersNames()).thenReturn(usersNameList);

        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();
        Assertions.assertTrue(forumStats.getPosts() <forumStats.getComments());

    }

    @Test
    void calculateAdvStatisticsTestUsers0(){
        ForumStats forumStats = new ForumStats();
        List<String> usersNameList = new ArrayList<String>();


        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.usersNames()).thenReturn(usersNameList);

        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();
        Assertions.assertEquals(0, forumStats.getUsers());

    }

    @Test
    void calculateAdvStatisticsTestUsers100(){
        ForumStats forumStats = new ForumStats();
        List<String> usersNameList = new ArrayList<String>();
        for(int i = 0; i <100 ; i++){
            usersNameList.add("user");
        }

        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.usersNames()).thenReturn(usersNameList);

        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();
        Assertions.assertEquals(100, forumStats.getUsers());

    }
}
