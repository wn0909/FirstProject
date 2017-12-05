package utils;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

/**
 *  Gson的封装类，使用前添加依赖：  compile 'com.google.code.gson:gson:2.8.2'
 * Created by ASUS on 2017/11/17.
 */

public class JsonUtils {
public static String toJson(Object obj){

  return new Gson().toJson(obj);
}
public static <T> T toBean(String json,Class<T> cls){
return new Gson().fromJson(json,cls);


}
public static <T>List<T> toList(String json,Class<T[]> cls){
return Arrays.asList(new Gson().fromJson(json,cls));
}
  public static String getString (String json,String key){
    try {


      return new JSONObject(json).optString(key);
    }catch (JSONException e){
      e.printStackTrace();
    }
    return null;
  }
}
