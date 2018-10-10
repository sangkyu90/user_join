package com.ict.erp.service;

import java.util.List;

import com.ict.erp.vo.JoinInfo;

public interface JoinInfoService {
	public List<JoinInfo> getJoinInfoList(JoinInfo ji);
	public int insertJoinInfo(JoinInfo ji);
	public int deleteJoinInfo(int ujNum);
	public JoinInfo getJoinInfoList(Integer ujNum);
	public int updateJoinInfo(JoinInfo ji);

}
