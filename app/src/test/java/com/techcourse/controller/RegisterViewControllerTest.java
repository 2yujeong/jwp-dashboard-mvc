package com.techcourse.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegisterViewControllerTest {

    private final ControllerTestEnv controllerTestEnv = new ControllerTestEnv();

    @BeforeEach
    void init() {
        controllerTestEnv.init();
    }

    @Test
    void registerView() throws ServletException, IOException {
        final HttpServletRequest request = controllerTestEnv.getRequestOf("/register/view", "GET");
        final HttpServletResponse response = controllerTestEnv.getResponse();

        controllerTestEnv.sendRequest(request, response);

        verify(request, times(1)).getRequestDispatcher("/register.jsp");
    }
}