package com.ict.erp.dao;

import java.util.List;

import com.ict.erp.vo.JoinInfo;

public interface JoinInfoDAO {
	
	public List<JoinInfo> getJoinInfoList(JoinInfo ji);
	public int insertJoinInfo(JoinInfo ji);
	public int deleteJoinInfo(int jiNum);
	public JoinInfo getJoinInfoList(Integer jiNum);
	public int updateJoinInfo(JoinInfo ji);
	

}
