package com.amigoscode.testing.basket;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class BasketControllerTest {

    @Autowired
    private BasketController basketController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void createBasketTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/basket")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
//                .andExpect(MockMvcResultMatchers.content().isNot)
    }

    @Test
    public void getBasketTest() throws Exception {

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/basket"))
                .andExpect(status().isCreated())
                .andReturn();

        String content = mvcResult.getResponse().getContentAsString();
       mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/basket"+content))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.products").exists());
//               .andExpect(MockMvcResultMatchers.jsonPath("$.products").isEmpty());


    }

}
