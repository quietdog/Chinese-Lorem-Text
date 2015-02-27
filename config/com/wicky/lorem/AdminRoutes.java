package com.wicky.lorem;

import com.jfinal.config.Routes;

public class AdminRoutes extends Routes {

    @Override
    public void config() {
        add("/admin", AdminController.class);
        add("/admin/user", UserController.class);
    }

}
