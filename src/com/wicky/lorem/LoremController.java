package com.wicky.lorem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import com.jfinal.core.Controller;
import com.spreada.utils.chinese.ZHConverter;

public class LoremController extends Controller {
    public void index() throws HttpException, IOException {
        Lorem lorem = getLoremFromRichyliDotCom(true);
        renderJson(lorem);
    }

    public void full() throws HttpException, IOException {
        Lorem lorem = getLoremFromRichyliDotCom(false);
        renderJson(lorem);
    }
    
    public void html() throws HttpException, IOException {
        Lorem lorem = getLoremFromRichyliDotCom(true);
        renderHtml(lorem.getS_data());
    }
    
	private Lorem getLoremFromRichyliDotCom(boolean simpleOnly) throws IOException, HttpException,
			UnsupportedEncodingException {
		HttpClient client = new HttpClient();
        // 设置代理服务器地址和端口
//        client.getHostConfiguration().setProxy("cdc-s-tmg1",8080);
        // 使用GET方法，如果服务器需要通过HTTPS连接，那只需要将下面URL中的http换成https
        PostMethod method = new PostMethod("http://www.richyli.com/tool/loremipsum/");
        /*
        POST /tool/loremipsum/ HTTP/1.1
        Host: www.richyli.com
        Connection: keep-alive
        Content-Length: 10
        Cache-Control: max-age=0
        Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,* /*;q=0.8
        Origin: http://www.richyli.com
        User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36 SE 2.X MetaSr 1.0
        Content-Type: application/x-www-form-urlencoded
        Referer: http://www.richyli.com/tool/loremipsum/
        Accept-Encoding: gzip,deflate,sdch
        Accept-Language: zh-CN,zh;q=0.8
        */
        method.setRequestHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        method.setRequestHeader("Accept-Encoding", "gzip,deflate,sdch");
        method.setRequestHeader("Accept-Language", "zh-CN,zh;q=0.8");
        method.setRequestHeader("Cache-Control", "max-age=0");
        method.setRequestHeader("Host", "www.richyli.com");
        method.setRequestHeader("Origin", "http://www.richyli.com");
        method.setRequestHeader("Referer", "http://www.richyli.com/tool/loremipsum/");
        method.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        method.setRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36 SE 2.X MetaSr 1.0");
        
        NameValuePair[] param = {new NameValuePair("words","500")} ;  
        method.setRequestBody(param);  
        client.executeMethod(method);
        // 打印服务器返回的状态
        System.out.println(method.getStatusLine());
        
        InputStream responseBody = method.getResponseBodyAsStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(responseBody, "big5"));
        String line = reader.readLine();
        Lorem lorem = new Lorem();
        boolean bodyFlag = false;
        while (line != null) {
            String data = new String(line.getBytes("big5"), "big5");
            System.out.println(data);
            
            if(data.indexOf("<div id=\"text\">") != -1){
                bodyFlag = true;
            }
            if(bodyFlag){
                if(data.indexOf("h2") != -1){
                	
                	if(!simpleOnly){
                        int size = length(data);
						lorem.setT_size(size);
                        lorem.setT_data(data);
                        System.out.println("t_size: " + size);
                        System.out.println("t_data: " + data);
                	}
                    
                    if(data != null && !data.isEmpty()){
                        ZHConverter converter = ZHConverter.getInstance(ZHConverter.SIMPLIFIED);
                        data = converter.convert(data);
                        int size = length(data);
						lorem.setS_size(size);
                        lorem.setS_data(data);
                        System.out.println("s_size: " + size);
                        System.out.println("s_data: " + data);
                    }
                    
                    break;
                }
            }
            line = reader.readLine();
        }
        
        // 释放连接
        method.releaseConnection();
		return lorem;
	}
    
    public static int length(String value) {
        int valueLength = 0;
        if(value != null){
        	return value.length();
        }
//        String chinese = "[\u0391-\uFFE5]";
//        /* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
//        for (int i = 0; i < value.length(); i++) {
//            /* 获取一个字符 */
//            String temp = value.substring(i, i + 1);
//            /* 判断是否为中文字符 */
//            if (temp.matches(chinese)) {
//                /* 中文字符长度为2 */
//                valueLength += 1;
//            } else {
//                /* 其他字符长度为1 */
//                valueLength += 0;
//            }
//        }
        return valueLength;
    }
}
