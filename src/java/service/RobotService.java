package java.service;

import java.mdoel.RetResponse;

/**
 * @author 有缘
 * @version 1.0
 * @date 2019/12/16 13:34
 * @description
 **/
public interface RobotService {

    /**
     *
     * @param msg
     * @return
     */
    RetResponse reply(String msg,String smartName);
}
