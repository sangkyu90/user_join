package com.ict.erp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.erp.dao.JoinInfoDAO;
import com.ict.erp.vo.JoinInfo;

@Repository
public class JoinInfoDAOImpl implements JoinInfoDAO {
	
	@Autowired
	private SqlSession ss;
	@Override
	public List<JoinInfo> getJoinInfoList(JoinInfo ji) {
		
		return ss.selectList("SQL.JOININFO.selecetJoinInfoList",ji);
	}

	@Override
	public int insertJoinInfo(JoinInfo ji) {
		
		return ss.insert("SQL.JOININFO.insertJoinInfo", ji);
	}

	@Override
	public int deleteJoinInfo(int ujNum) {
	
		return ss.delete("SQL.JOININFO.deleteJoinInfo",ujNum);
	}

	@Override
	public JoinInfo getJoinInfoList(Integer ujNum) {
		// TODO Auto-generated method stub
		return ss.selectOne("SQL.JOININFO.deleteJoinInfo2",ujNum);
	}

	@Override
	public int updateJoinInfo(JoinInfo ji) {
		// TODO Auto-generated method stub
		return ss.update("SQL.JOININFO.updateJoinInfo",ji);
	}

}
