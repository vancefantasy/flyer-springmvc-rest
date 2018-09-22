package com.flyer.springmvc.rest.web;

import com.flyer.springmvc.rest.AbstractMVCTest;
import com.flyer.springmvc.rest.common.BaseResponse;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by jianying.li on 2018/9/17.
 */
public class CommonControllerTest extends AbstractMVCTest {

    @Test
    public void healthCheck() throws Exception {
        this.mockMvc.perform(get("/healthCheck")).andExpect(status().isOk()).andDo(print())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("code").value(BaseResponse.CODE_SUCCESS));

    }

    @Test
    public void setLoggerLevel() throws Exception {
        this.mockMvc.perform(get("/setLevel").param("logger", "com.flyer").param("level", "DEBUG"))
            .andExpect(status().isOk()).andDo(print())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("code").value(BaseResponse.CODE_SUCCESS));
    }

    @Test
    public void loggers() throws Exception {
        this.mockMvc.perform(get("/loggers"))
            .andExpect(status().isOk()).andDo(print())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("code").value(BaseResponse.CODE_SUCCESS));

        this.mockMvc.perform(get("/loggers/com.flyer"))
            .andExpect(status().isOk()).andDo(print())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("code").value(BaseResponse.CODE_SUCCESS));
    }

}
