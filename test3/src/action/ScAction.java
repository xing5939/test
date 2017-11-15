package action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import service.ScService;
import util.BaseAction;
import vo.Sc;

@Controller("scAction")
@Scope("prototype")
public class ScAction extends BaseAction<Sc> {

	@Resource
	private ScService scService;
}
