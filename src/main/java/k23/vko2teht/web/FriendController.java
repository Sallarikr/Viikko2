package k23.vko2teht.web;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k23.vko2teht.domain.Friend;

@Controller
public class FriendController {
	
	private ArrayList<Friend> friends = new ArrayList<>();
	
	@GetMapping("index")
	public String listFriends(Model model) {
		return "friends";
	}
	
	@PostMapping("index")
	public String addFriend(@RequestParam (name="firstName") String etunimi, 
	@RequestParam (name="lastName") String sukunimi, Model model) {
		friends.add(new Friend(etunimi, sukunimi));
		model.addAttribute("friends", friends);
		return "friends";
	}
}
