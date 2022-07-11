
package com.saikumar.springboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin("*")
public class UserController {
	@GetMapping("/")
	public String all() {
		return ("<h1>Good Evening</h1>");
	}

	@GetMapping("/user")
	public String user() {
		return ("<h1>welcome to user page</h1>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>welcome to admin page</h1>");
	}
	@GetMapping("/denied")
	public String denied() {
		return ("<h1>access denied</h1>");
	}

}
