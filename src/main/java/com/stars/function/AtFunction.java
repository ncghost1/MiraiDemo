package com.stars.function;

import com.stars.utils.BotUtils;
import net.mamoe.mirai.event.events.GroupMessageEvent;
import net.mamoe.mirai.message.data.At;

/**
 * @program: MiraiDemo
 * @description:
 * @author: HanZiXin
 * @create: 2022-10-13 14:41
 **/
public class AtFunction {

    public static void handleEvent(GroupMessageEvent event) {


        // Has @Bot ?
        if (event.getMessage().contains(new At(BotUtils.getBot().getId()))) {
            long fromGroup = event.getGroup().getId();
            long fromQQ = event.getSender().getId();
            String receiveMsg = event.getMessage().contentToString();

//            // Get Answer And SendMsg.
//            String sendMsg = QingYunKe_API.getAnswer(receiveMsg);
//            MessageManager.sendMessageBySituation(fromGroup, fromQQ, sendMsg);
        }

    }
}