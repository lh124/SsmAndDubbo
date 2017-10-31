package cn.lh.ssm.dubbo.constmer;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.lh.ssm.dubbo.service.IMemberService;
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMemberDemo {
	@Resource
	private IMemberService memberService ;
	@Test
	public void testGetRoleAndAction() throws Exception {
		System.err.println("dddd"+this.memberService.getRoleAndActionByMember("mldn"));
	}
	@Test
	public void testGet() throws Exception {
		System.err.println("dddd"+this.memberService.get("mldn"));
	}
}
