package com.appsdeveloperblog.photoapp.api.users.ui.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.photoapp.api.users.service.UserService;
import com.appsdeveloperblog.photoapp.api.users.ui.model.CreateUserRequestModel;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private Environment environment;
	@Autowired
	private UserService userService;

	@GetMapping("/status/check")
	public String getStatus() {
		return "Working on port " + environment.getProperty("local.server.port");
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public String createUser(@Valid @RequestBody CreateUserRequestModel user) {
		return "create user method is called";
	}
}
