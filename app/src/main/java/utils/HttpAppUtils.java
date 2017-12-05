package utils;

import com.lzy.okgo.callback.StringCallback;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ASUS on 2017/11/17.
 */

public class HttpAppUtils{
    private static String baseurl="http://192.168.191.3:8080/FirstProject/";

    public static void regUser(String username,String password,String  email,StringCallback callback){
        String url=baseurl+"regMobileuserAction";
        Map<String,String> params=new HashMap<>();
        params.put("username","username");
        params.put("password","password");
        params.put("email","email");


        HttpUtils.post(url,params,callback);
    }
     public static void loginUser(String username,String password,StringCallback callback){
        String  url=baseurl+"loginMobileuserAction";
        Map<String,String> params=new HashMap<>();
        params.put("username","username");
        params.put("password","password");
        HttpUtils.post(url,params,callback);
}
}
