package com.wyvaa.onemyle.people.profile.controller;
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
public class ExpertController {

	private final ProfileService service;

	@Autowired
	public ExpertController(ProfileService service) {
		this.service = service;
	}
	@GetMapping("/experts")
	public ResponseEntity<?> getCustomers() {
		return new ResponseEntity<>(service.getExperts(), HttpStatus.OK);
	}
	@GetMapping("/experts/{areaExpertId}")
	public ResponseEntity<?> getExpertsById(@PathVariable String areaExpertId) {
		
			return new ResponseEntity<>(service.getExpertsById(areaExpertId), HttpStatus.OK);
		
	}
	@GetMapping("/experts/userid/query")
	 public ResponseEntity<?> getInfluencerUserById(@RequestParam("userid") String userid) {
		   try {
		   return new ResponseEntity<>(service.getExpertsUserById(userid),HttpStatus.OK);
		   }catch(Exception e) {
			   e.printStackTrace();
				  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		   }
		
	}
	
}
