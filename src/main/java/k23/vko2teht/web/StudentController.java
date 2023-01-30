package k23.vko2teht.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import k23.vko2teht.domain.Student;

@Controller
public class StudentController {

	//Tehtävä 2: listojen käsittely
	@GetMapping("hellos")
	public String sayHelloToStudents(Model model) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Salla", "Komppa"));
		students.add(new Student("Sanna", "Salminen"));
		students.add(new Student("Anna", "Saarikko"));
		students.add(new Student("Maiju", "Drischenko"));
		model.addAttribute("students", students);
		return "studentList";
	}
}
