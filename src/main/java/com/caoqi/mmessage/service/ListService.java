package com.caoqi.mmessage.service;

import java.util.List;

import com.caoqi.mmessage.bean.Message;
import com.caoqi.mmessage.dao.MessageDao;

/**
 * 列表相关的业务功能
 * @author caoqi
 *
 */
public class ListService {
	public List<Message> queryMessageList(String command, String description) {
		MessageDao messageDao = new MessageDao();
		return messageDao.queryMessageList(command, description);
	}
}
