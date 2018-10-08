package com.ict.erp.service;

import java.util.List;

import com.ict.erp.vo.JoinInfo;

public interface JoinInfoService {
	public List<JoinInfo> getJoinInfoList(JoinInfo ji);
	public int insertJoinInfo(JoinInfo ji);
	public int deleteJoinInfo(int jiNum);
	public JoinInfo getJoinInfoList(Integer jiNum);
	public int updateJoinInfo(JoinInfo ji);

}
