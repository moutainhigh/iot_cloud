package com.iot.nero.service;


import com.iot.nero.mq.dto.ClientConn;
import com.iot.nero.mq.dto.MQMessage;
import com.iot.nero.mq.dto.Result;

import java.util.List;

/**
 * Author neroyang
 * Email  nerosoft@outlook.com
 * Date   2017/7/4
 * Time   上午9:45
 */
public interface IClientService {

    /**
     * 客户端认证
     * @param clientId
     * @param productKey
     * @param productSecret
     * @return
     */
    Result<ClientConn> clientAuth(String clientId, String productKey, String productSecret);


    /**
     * 客户端下线
     * @param clientId
     * @return
     */
    Result<ClientConn> clientOffLine(String productKey, String clientId);


    /**
     * 消息发送
     * @param secretKey
     * @param from
     * @param to
     * @param qos
     * @param message
     */
    Result<MQMessage> sendMessage(String secretKey, String from, String to, String qos, String message);


    /**
     * 获取智能客户端发送消息
     * @param uid
     * @param token
     * @param aid
     * @param clientId
     * @param page
     * @param num
     * @return
     */
    Result<List<MQMessage>> getClientSendMessage(Integer uid, String token, Integer aid, String clientId, Integer page, Integer num);

    /**
     * 获取智能客户端接收消息
     * @param uid
     * @param token
     * @param aid
     * @param clientId
     * @param page
     * @param num
     * @return
     */
    Result<List<MQMessage>> getClientReceivedMessage(Integer uid, String token, Integer aid, String clientId, Integer page, Integer num);


    /**
     * 获取设备发送信息条数
     * @param uid
     * @param token
     * @param aid
     * @param clientId
     * @return
     */
    Result<Integer> getClientSendMessageCount(Integer uid, String token, Integer aid, String clientId);

}
