package java.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/12/16 13:34
 * @description
 **/
public class HttpUtil {




    public static String getConnection(String api){
        HttpURLConnection urlConnection = null;
        int responseCode =0;
        try{
            URL url = new URL(api);
            urlConnection = (HttpURLConnection)url.openConnection();
            responseCode = urlConnection.getResponseCode();

        }catch (Exception e){
            e.printStackTrace();
        }

        if(200<=responseCode&&responseCode<300){
            try(InputStream inputStream = urlConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){

                StringBuilder stringBuilder = new StringBuilder();
                String creentLine ;

                while((creentLine=bufferedReader.readLine())!=null){
                    stringBuilder.append(creentLine);
                }
                String result = stringBuilder.toString();
                return result;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       return null;
    }

}
