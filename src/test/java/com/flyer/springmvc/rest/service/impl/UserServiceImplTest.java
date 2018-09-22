package com.flyer.springmvc.rest.service.impl;

import com.flyer.springmvc.rest.AbstractTest;
import com.flyer.springmvc.rest.dao.UserDao;
import com.flyer.springmvc.rest.data.UserData;
import com.flyer.springmvc.rest.domain.User;
import com.flyer.springmvc.rest.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by jianying.li on 2018/9/16.
 */
public class UserServiceImplTest extends AbstractTest {

    @Mock
    private UserDao userDao;

    @InjectMocks
    @Inject
    private UserService userService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void saveUser() throws Exception {
        when(userDao.saveUser(any(User.class))).thenReturn(1);
        assertThat(userService.saveUser(UserData.generatOne(true)), is(notNullValue()));
        verify(userDao, times(1)).saveUser(any(User.class));
    }

    @Test
    public void removeUser() throws Exception {
        when(userDao.removeUser(anyLong())).thenReturn(1);
        assertThat(userService.removeUser(anyLong()), is(1));
        verify(userDao, times(1)).removeUser(anyLong());
    }

    @Test
    public void updateUser() throws Exception {
        when(userDao.updateUser(any(User.class))).thenReturn(1);
        assertThat(userService.updateUser(UserData.generatOne(true)), is(1));
        verify(userDao, times(1)).updateUser(any(User.class));
    }

    @Test
    public void findUserById() throws Exception {
        when(userDao.findUserById(anyLong())).thenReturn(UserData.generatOne(true));
        assertThat(userService.findUserById(anyLong()), is(notNullValue()));
        verify(userDao, times(1)).findUserById(anyLong());
    }

}
