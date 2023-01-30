package k23.vko2teht.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Vko2Controller {

	//Tehtava 1
	@GetMapping("hello")
	public String sayHello(@RequestParam(name="name") String name,
			@RequestParam(name="age") int age,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
}


