package cn.lh.ssm.dubbo.member.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.lh.ssm.dubbo.member.dao.IActionDAO;
import cn.lh.ssm.dubbo.member.dao.IMemberDAO;
import cn.lh.ssm.dubbo.member.dao.IRoleDAO;
import cn.lh.ssm.dubbo.service.IMemberService;
import cn.lh.ssm.dubbo.vo.Member;
@Service
public class MemberServiceImpl implements IMemberService {
	@Resource
	private IMemberDAO memberDAO ;
	@Resource
	private IRoleDAO roleDAO ;
	@Resource
	private IActionDAO actionDAO ;
	@Override
	public Member get(String mid) {
		return this.memberDAO.findById(mid);
	}

	@Override
	public Map<String, Set<String>> getRoleAndActionByMember(String mid) {
		Map<String, Set<String>> map = new HashMap<>() ;
		map.put("allRoles", this.roleDAO.findAllByMember(mid)) ;
		map.put("allActions", this.actionDAO.findAllByMember(mid)) ;
		return map;
	}

}
