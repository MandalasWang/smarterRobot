package java.app;

import java.mdoel.RetResponse;
import java.service.RobotService;
import java.service.impl.QkyRobotServiceImpl;
import java.util.Scanner;

/**
 * @author
 */
public class Main {

    public static void main(String[] args) {
        RobotService robotService = new QkyRobotServiceImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("************************欢迎使用人工智能助理**************************");
        System.out.print("请为我取个名字吧！");
        String smarterName = sc.next();
        System.out.println(smarterName+"：我有名字了！");
        System.out.print(smarterName+"：那么，我应该怎么称呼您呢？");
        String yourName = sc.next();
        System.out.println(smarterName+"：好的"+yourName+"请下达命令吧！");
        while (true){
           String msg = sc.next();
           if(((QkyRobotServiceImpl) robotService).bye(msg)==1){
               break;
           }else {
               RetResponse reply = robotService.reply(msg,smarterName);
               System.out.println(smarterName+":"+reply);
           }
        }
    }
}
