package com.project.Spitball.controller;

import com.project.Spitball.AbstractTest;
import com.project.Spitball.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
//@WebMvcTest(value = UserProfileController.class)
public class UserProfileControllerTest extends AbstractTest {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }


    @Test
    public void registerUser() throws Exception {
        String uri = "/register_user";
        User user = new User();
        user.setFirstName("James");
        user.setLastName("Talbot");
        user.setEmail("jt43@spitball.com");
        user.setUsername("jtbaby22");
        user.setPassword("abc123");


        String inputJson = super.mapToJson(user);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(201, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, content);

    }

    @Test
    public void deleteUser() {
        String uri = "/delete_profile";
        MvcResult mvcResult = null;
        try {
            mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);


    }

//    @Test
//    public void findAllUsers() {
//    }
}