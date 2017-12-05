
package utils;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import java.util.Map;

/**
 * Created by ASUS on 2017/11/17.
 */

public class HttpUtils {
    //get方法
    public  static  void get(String url,StringCallback callback){
      OkGo.<String>get(url).execute(callback);
  }


    //post方法
    public static void post(String url,Map<String,String> params,StringCallback callback){
            OkGo.<String>post(url).params(params).execute(callback);
  }
}
