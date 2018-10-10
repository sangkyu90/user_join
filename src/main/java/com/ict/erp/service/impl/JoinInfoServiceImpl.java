package com.ict.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.erp.dao.JoinInfoDAO;
import com.ict.erp.service.JoinInfoService;
import com.ict.erp.vo.JoinInfo;

@Service
public class JoinInfoServiceImpl implements JoinInfoService {
	
	@Autowired
	private JoinInfoDAO jidao;
	@Override
	public List<JoinInfo> getJoinInfoList(JoinInfo ji) {
		// TODO Auto-generated method stub
		return jidao.getJoinInfoList(ji);
	}

	@Override
	public int insertJoinInfo(JoinInfo ji) {
		// TODO Auto-generated method stub
		return jidao.insertJoinInfo(ji);
	}

	@Override
	public int deleteJoinInfo(int ujNum) {
		// TODO Auto-generated method stub
		return jidao.deleteJoinInfo(ujNum);
	}

	@Override
	public JoinInfo getJoinInfoList(Integer ujNum) {
		// TODO Auto-generated method stub
		return jidao.getJoinInfoList(ujNum);
	}

	@Override
	public int updateJoinInfo(JoinInfo ji) {
		// TODO Auto-generated method stub
		return jidao.updateJoinInfo(ji);
	}

}
