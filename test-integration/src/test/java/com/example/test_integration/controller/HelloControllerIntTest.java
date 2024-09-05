package com.example.test_integration.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static java.lang.reflect.Array.get;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloControllerIntTest {
@Autowired
    private MockMvc mvc;
@Test
    void hello() throws Exception{
    RequestBuilder request = get("/hello");
    MvcResult result = mvc.perform(request).andReturn();
    assertEquals("Hello, World",result.getResponse().getContentAsString());
}

@Test
    public  void testHelloWithName() throws Exception{
    mvc.perform(get("/hello?name=Tanaya"))
            .andExpect(content().string("Hello, Tanaya"));

    }

}