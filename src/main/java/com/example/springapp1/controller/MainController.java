package com.example.springapp1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
//	@Autowired 
//	private UserRepository userRepository;
	
	@Value("${user.signature}")
	private String user;
	
    @RequestMapping("/")
    public String index() {
        return "Hello World, " + user + "!";
    }
	
//	@GetMapping(path="/demo/add") // Map ONLY GET Requests
//	public @ResponseBody String addNewUser (@RequestParam String name
//			, @RequestParam String email) {
//		// @ResponseBody means the returned String is the response, not a view name
//		// @RequestParam means it is a parameter from the GET or POST request
//		
//		User n = new User();
//		n.setName(name);
//		n.setEmail(email);
//		userRepository.save(n);
//		return "Saved";
//	}
//	
//	@GetMapping(path="/demo/all")
//	public @ResponseBody Iterable<User> getAllUsers() {
//		// This returns a JSON or XML with the users
//		return userRepository.findAll();
//	}
}
