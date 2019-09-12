package com.falabella.pim.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.falabella.pim.security.dao.ApplicationUser;
import com.falabella.pim.security.repository.ApplicationUserRepository;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private ApplicationUserRepository applicationUserRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public AuthController(ApplicationUserRepository applicationUserRepository,
            BCryptPasswordEncoder bCryptPasswordEncoder) {
			this.applicationUserRepository = applicationUserRepository;
			this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@PostMapping("/sign-up")
    public void signUp(@RequestBody ApplicationUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        applicationUserRepository.save(user);
    }

	@GetMapping("/test")
	public String testURL() {
		return "All Good !!";
	}
}
