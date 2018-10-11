package com.ict.erp.service;

import java.util.List;

import com.ict.erp.vo.JoinInfo;

public interface JoinInfoService {
	public List<JoinInfo> getJoinInfoList(JoinInfo ji);
	public JoinInfo getJoinInfo(Integer ujNum);
	public int insertJoinInfo(JoinInfo ji);
	public int updateJoinInfo(JoinInfo ji);
	public int deleteJoinInfo(int ujNum);

}
