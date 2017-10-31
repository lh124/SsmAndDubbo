package cn.lh.dubbo.web.action;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pages/back/dept/*")
public class DeptAction {
	// @RequiresRoles("dept")
	// @RequiresPermissions("dept:list")
	@RequestMapping("dept_list")
	@ResponseBody
	public Object list() {
		return Arrays.asList("Hello", "Word", "MLDN");
	}
}
