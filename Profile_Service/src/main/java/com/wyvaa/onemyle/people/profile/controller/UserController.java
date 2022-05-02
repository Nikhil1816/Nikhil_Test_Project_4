package com.wyvaa.onemyle.people.profile.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wyvaa.onemyle.people.profile.service.ProfileService;

@RestController
public class UserController {

	private final ProfileService service;

	@Autowired
	public UserController(ProfileService service) {
		this.service = service;
	}

	@GetMapping("/users")
	public ResponseEntity<?> getCustomers() {
		return new ResponseEntity<>(service.getUser(), HttpStatus.OK);
	}

	@GetMapping("/users/{userid}")
	public ResponseEntity<?> getUserById(@PathVariable String userid) {
		try {
			return new ResponseEntity<>(service.getUserById(userid), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping("/users/emailid/query")
	public ResponseEntity<?> getUserByEmail(@RequestParam("emailid") String emailid) {
		try {
			return new ResponseEntity<>(service.getUserByEmail(emailid), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
