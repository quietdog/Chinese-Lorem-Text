package com.wicky.lorem;

import com.jfinal.config.Routes;

public class FrontRoutes extends Routes {

    @Override
    public void config() {
        add("/", IndexController.class);
        add("/lorem", LoremController.class);
    }

}
