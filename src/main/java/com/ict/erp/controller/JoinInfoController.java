package com.ict.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ict.erp.service.JoinInfoService;
import com.ict.erp.vo.JoinInfo;

@Controller
public class JoinInfoController {

	@Autowired
	private JoinInfoService jis;
	
	//select list
	@RequestMapping(value="/joininfo",method=RequestMethod.GET)
	@ResponseBody
	public List<JoinInfo> getJoinInfoList(@ModelAttribute JoinInfo ji){
	return jis.getJoinInfoList(ji);	
	}
	
	//select one
	@RequestMapping(value="/joininfo/{ujNum}",method=RequestMethod.GET)
	@ResponseBody
	public JoinInfo getJoinInfo(@PathVariable Integer ujNum) {
	return jis.getJoinInfo(ujNum);	
	}
	
	//insert
	@RequestMapping(value="/joininfo",method=RequestMethod.POST)
	@ResponseBody 
	public Integer insertJoinInfo(@RequestBody JoinInfo ji) {
		return jis.insertJoinInfo(ji);
	}
	
	//update
	@RequestMapping(value="/joininfo/{ujNum}",method=RequestMethod.PUT)
	@ResponseBody
	public Integer updateJoinInfo(@RequestBody JoinInfo ji,@PathVariable Integer ujNum) {
		ji.setUjNum(ujNum);
		return jis.updateJoinInfo(ji);
	}
	
	//delete
	@RequestMapping(value="/joininfo/{ujNum}",method=RequestMethod.DELETE)
	@ResponseBody
	public String  deleteJoinInfo(@PathVariable int ujNum) {
		return jis.deleteJoinInfo(ujNum)+"";
	}
	
	//signup
    @RequestMapping(value="/signup", method=RequestMethod.GET)
    public String signUp() {
        return "/signup";
    }
}
