package com.almi.movierating.backend;

import com.almi.movierating.backend.beans.UserData;
import com.almi.movierating.backend.controllers.movies.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by c309044 on 2017-03-27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void beforeTest() {
        UserData userData = new UserData.Builder().name("Test user 1").build();
        UserData userData2 = new UserData.Builder().name("Test User 2").build();
        userRepository.save(Arrays.asList(userData, userData2));
    }

    @Test
    public void testFindUserById() {
        UserData testUser = userRepository.findUserById(1L);
        assertNotNull(testUser);
        assertEquals("Test user 1", testUser.getName());
    }
}
