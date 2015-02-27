package com.wicky.lorem;

import javax.servlet.http.HttpServletRequest;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

public class LoremInterceptor implements Interceptor {
    public void intercept(ActionInvocation ai) {
        HttpServletRequest request = ai.getController().getRequest();
        String remoteAddr = getIpAddr(request);
        System.out.println(">>>>>>>>>>" + remoteAddr);
        if ("127.0.0.1".equals(remoteAddr) || "localhost".equals(remoteAddr) || "0.0.0.0".equals(remoteAddr) || "0:0:0:0:0:0:0:1".equals(remoteAddr)) {
            ai.invoke();
        } else {
            System.out.println("Distrusted IP Connection: " + remoteAddr);
            ai.getController().renderError(404);
        }
    }

    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader(" x-forwarded-for ");
        if (ip == null || ip.length() == 0 || " unknown ".equalsIgnoreCase(ip)) {
            ip = request.getHeader(" Proxy-Client-IP ");
        }
        if (ip == null || ip.length() == 0 || " unknown ".equalsIgnoreCase(ip)) {
            ip = request.getHeader(" WL-Proxy-Client-IP ");
        }
        if (ip == null || ip.length() == 0 || " unknown ".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
