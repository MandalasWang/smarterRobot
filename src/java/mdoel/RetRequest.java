package java.mdoel;

import java.io.Serializable;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/12/16 13:35
 * @description
 **/
public class RetRequest implements Serializable {


    private String key ="free";

    private String appid = "0";

    private String msg ;


    RetRequest(){

    }

    RetRequest(String msg){
        this.msg = msg;
    }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
