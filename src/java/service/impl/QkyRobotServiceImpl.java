package java.service.impl;

import com.google.gson.Gson;

import java.mdoel.RetResponse;
import java.service.RobotService;
import java.util.Arrays;
import java.util.HttpUtil;
import java.util.List;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/12/16 13:36
 * @description
 **/
public class QkyRobotServiceImpl implements RobotService {

    private static final String API_TEMPLATE="http://api.qingyunke.com/api.php?key=free&appid=0&msg=%s";

    private static final Gson gson = new Gson();

    @Override
    public RetResponse reply(String msg,String smartName) {
        int isBye = bye(msg);
        if(isBye == 1){
            return new RetResponse(smartName+"那主人，下次再见！");
        }
        String api = String.format(API_TEMPLATE,msg);
        String connection = HttpUtil.getConnection(api);
        if(connection == null){
            return new RetResponse(smartName+"主人，"+smartName+"出去玩喽，可能会暂时接收不到你的消息！");
        }
        RetResponse retResponse = gson.fromJson(connection, RetResponse.class);
        return retResponse;
    }

    public int bye(String msg){
        String[] str = {"再见","明天见","bye bye","see you","晚安","886"};
        List<String> list = Arrays.asList(str);
        for(String strs : list){
            if(strs.equals(msg)){
                return 1;
            }
        }
       return 0;
    }
}
