package com.wicky.lorem;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;

import com.jfinal.core.Controller;

public class UserController extends Controller {
    
    public void index() throws HttpException, IOException {
        render("/user/index.html");
    }
    
}
