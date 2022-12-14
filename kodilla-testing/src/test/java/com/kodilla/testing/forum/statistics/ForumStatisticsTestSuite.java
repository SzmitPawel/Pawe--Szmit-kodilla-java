package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.Stats;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateUsers(int usersQuantity) {

        List<String> generatedUsers = new ArrayList<>();

        for (var i = 0; i < usersQuantity; i++) {
            generatedUsers.add("user" + i);
        }

        return generatedUsers;
    }

    @Nested
    class PostTests {

        @Test
        void testCalculateAdvStatistics0Posts() {

            // given
            Stats stats = new Stats();

            List<String> resultUsers = generateUsers(100);

            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(50);
            when(statisticsMock.usersNames()).thenReturn(resultUsers);

            // when
            stats.calculateAdvStatistics(statisticsMock);

            // then
            assertEquals(0, stats.getNumbersOfPosts());
            assertEquals(100,stats.getUsers());
            assertEquals(50,stats.getNumberOfComments());

            assertEquals(0, stats.getAveragePostPerUser());
            assertEquals(0.5, stats.getAverageCommentsPerUser());
            assertEquals(Double.POSITIVE_INFINITY, stats.getAverageCommentsPerPost()); // divide by 0
        }

        @Test
        void testCalculateAdvStatistics1000Posts() {
            //given
            Stats stats = new Stats();

            List<String> resultUsers = generateUsers(100);

            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(50);
            when(statisticsMock.usersNames()).thenReturn(resultUsers);

            // when
            stats.calculateAdvStatistics(statisticsMock);

            // then
            assertEquals(1000, stats.getNumbersOfPosts());
            assertEquals(100,stats.getUsers());
            assertEquals(50,stats.getNumberOfComments());

            assertEquals(10, stats.getAveragePostPerUser());
            assertEquals(0.5, stats.getAverageCommentsPerUser());
            assertEquals(0.05, stats.getAverageCommentsPerPost());
        }
    }

    @Nested
    class CommentsTest {

        @Test
        void testCalculateAdvStatistics0Comments() {
            // given
            Stats stats = new Stats();

            List<String> resultUsers = generateUsers(100);

            when(statisticsMock.postsCount()).thenReturn(50);
            when(statisticsMock.commentsCount()).thenReturn(0);
            when(statisticsMock.usersNames()).thenReturn(resultUsers);

            // when
            stats.calculateAdvStatistics(statisticsMock);

            // then
            assertEquals(50, stats.getNumbersOfPosts());
            assertEquals(100,stats.getUsers());
            assertEquals(0,stats.getNumberOfComments());

            assertEquals(0.5, stats.getAveragePostPerUser());
            assertEquals(0, stats.getAverageCommentsPerUser());
            assertEquals(0, stats.getAverageCommentsPerPost());
        }

        @Test
        void testCalculateAdvStatisticsCommentsLessThanPosts() {
            // given
            Stats stats = new Stats();

            List<String> resultUsers = generateUsers(100);

            when(statisticsMock.postsCount()).thenReturn(100);
            when(statisticsMock.commentsCount()).thenReturn(50);
            when(statisticsMock.usersNames()).thenReturn(resultUsers);

            // when
            stats.calculateAdvStatistics(statisticsMock);

            // then
            assertEquals(100, stats.getNumbersOfPosts());
            assertEquals(100,stats.getUsers());
            assertEquals(50,stats.getNumberOfComments());

            assertEquals(1, stats.getAveragePostPerUser());
            assertEquals(0.5, stats.getAverageCommentsPerUser());
            assertEquals(0.5, stats.getAverageCommentsPerPost());
        }

        @Test
        void testCalculateAdvStatisticsCommentsGraterThanPosts() {
            // given
            Stats stats = new Stats();

            List<String> resultUsers = generateUsers(100);

            when(statisticsMock.postsCount()).thenReturn(50);
            when(statisticsMock.commentsCount()).thenReturn(100);
            when(statisticsMock.usersNames()).thenReturn(resultUsers);

            // when
            stats.calculateAdvStatistics(statisticsMock);

            // then
            assertEquals(50, stats.getNumbersOfPosts());
            assertEquals(100,stats.getUsers());
            assertEquals(100,stats.getNumberOfComments());

            assertEquals(0.5, stats.getAveragePostPerUser());
            assertEquals(1, stats.getAverageCommentsPerUser());
            assertEquals(2, stats.getAverageCommentsPerPost());
        }
    }

    @Nested
    class UserTest {

        @Test
        void testCalculateAdvStatistics0Users() {
            // given
            Stats stats = new Stats();

            List<String> resultUsers = generateUsers(0);

            when(statisticsMock.postsCount()).thenReturn(50);
            when(statisticsMock.commentsCount()).thenReturn(100);
            when(statisticsMock.usersNames()).thenReturn(resultUsers);

            // when
            stats.calculateAdvStatistics(statisticsMock);

            // then
            assertEquals(50, stats.getNumbersOfPosts());
            assertEquals(0,stats.getUsers());
            assertEquals(100,stats.getNumberOfComments());

            assertEquals(Double.POSITIVE_INFINITY, stats.getAveragePostPerUser());  // divide by 0
            assertEquals(Double.POSITIVE_INFINITY, stats.getAverageCommentsPerUser());  // divide by 0
            assertEquals(2, stats.getAverageCommentsPerPost());
        }

        @Test
        void testCalculateAdvStatistics100Users() {
            // given
            Stats stats = new Stats();

            List<String> resultUsers = generateUsers(100);

            when(statisticsMock.postsCount()).thenReturn(50);
            when(statisticsMock.commentsCount()).thenReturn(100);
            when(statisticsMock.usersNames()).thenReturn(resultUsers);

            // when
            stats.calculateAdvStatistics(statisticsMock);

            // then
            assertEquals(50, stats.getNumbersOfPosts());
            assertEquals(100,stats.getUsers());
            assertEquals(100,stats.getNumberOfComments());

            assertEquals(0.5, stats.getAveragePostPerUser());
            assertEquals(1, stats.getAverageCommentsPerUser());
            assertEquals(2, stats.getAverageCommentsPerPost());
        }
    }
}