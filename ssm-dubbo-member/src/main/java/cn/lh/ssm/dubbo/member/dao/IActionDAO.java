package cn.lh.ssm.dubbo.member.dao;

import java.util.Set;

public interface IActionDAO { 
	public Set<String> findAllByMember(String id) ;
}
