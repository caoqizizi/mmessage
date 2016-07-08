package com.caoqi.mmessage.service;

import java.util.ArrayList;
import java.util.List;

import com.caoqi.mmessage.dao.MessageDao;

/**
 * 维护相关业务功能
 * @author caoqi
 */
public class MaintainService {
	
	/**
	 * 单条删除
	 * @param id
	 */
	public void deleteOne(String id) {
		if (id != null && !"".equals(id.trim())) {
			MessageDao messageDao = new MessageDao();
			messageDao.deleteOne(Integer.valueOf(id));
		}
	}
	
	/**
	 * 批量删除
	 * @param id
	 */
	public void deleteBatch(String[] ids) {
		MessageDao messageDao = new MessageDao();
		List<Integer> idList = new ArrayList<Integer>();
		for (String id : ids) {
			if (id != null && !"".equals(id))
				idList.add(Integer.valueOf(id));
		}
		messageDao.deleteBatch(idList);
	}
}
