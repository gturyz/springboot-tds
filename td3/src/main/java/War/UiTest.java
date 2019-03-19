package War;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.jeemv.springboot.vuejs.VueJS;

@Controller
@RequestMapping("/ui/")
public class UiTest {

	@Autowired
	private VueJS vue;
	
	@GetMapping("test")
	public String index(ModelMap model) {
		vue.addData("message", "Hello world!");
		model.put("vue", vue);
		return "index";
	}
}