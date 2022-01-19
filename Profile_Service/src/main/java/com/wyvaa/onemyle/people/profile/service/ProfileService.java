package com.wyvaa.onemyle.people.profile.service;

import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wyvaa.onemyle.people.profile.model.User;
import com.wyvaa.onemyle.people.profile.model.Experts;
import com.wyvaa.onemyle.people.profile.model.Influencer;

@Service
public class ProfileService {

	private final RestTemplate restTemplate;
	@Autowired
	public ProfileService(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	public List<?> getUser() {
		HttpHeaders headers =new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<User> entity=new HttpEntity<User>(headers);
		ResponseEntity<List> user=restTemplate.exchange("https://staging.onemyle.com/api/people/users",  HttpMethod.GET, entity, List.class);
		return user.getBody();
	}
	public User getUserByEmail(String emailid) {
		HttpHeaders headers =new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<User> entity=new HttpEntity<User>(headers);
		ResponseEntity<User> user=restTemplate.exchange("https://staging.onemyle.com/api/people/users/email/"+emailid,  HttpMethod.GET, entity, User.class);
		return user.getBody();
	}
	public User getUserById(String userid) {
		HttpHeaders headers =new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<User> entity=new HttpEntity<User>(headers);
		ResponseEntity<User> user=restTemplate.exchange("https://staging.onemyle.com/api/people/users/"+userid,  HttpMethod.GET, entity, User.class);
		return user.getBody();
	}
	public List<?> getInfluencer() {
		HttpHeaders headers =new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Influencer> entity=new HttpEntity<Influencer>(headers);
		ResponseEntity<List> influencer=restTemplate.exchange("https://staging.onemyle.com/api/people/influencers",  HttpMethod.GET, entity, List.class);
		return influencer.getBody();
	}
	public Influencer getInfluencerById(String influencerid) {
		HttpHeaders headers =new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Influencer> entity=new HttpEntity<Influencer>(headers);
		ResponseEntity<Influencer> influencer=restTemplate.exchange("https://staging.onemyle.com/api/people/influencers/"+influencerid,  HttpMethod.GET, entity, Influencer.class);
		return influencer.getBody();
	}
	public Influencer getInfluencerUserById(String userid) {
		HttpHeaders headers =new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Influencer> entity=new HttpEntity<Influencer>(headers);
		ResponseEntity<Influencer> influencer=restTemplate.exchange("https://staging.onemyle.com/api/people/influencers?userid="+userid,  HttpMethod.GET, entity, Influencer.class);
		return influencer.getBody();
	}
	public List<?> getExperts() {
		HttpHeaders headers =new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Experts> entity=new HttpEntity<Experts>(headers);
		ResponseEntity<List> experts=restTemplate.exchange("https://staging.onemyle.com/api/people/experts",  HttpMethod.GET, entity, List.class);
		return experts.getBody();
	}
	public Experts getExpertsById(String areaExpertId) {
		HttpHeaders headers =new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Experts> entity=new HttpEntity<Experts>(headers);
		ResponseEntity<Experts> experts=restTemplate.exchange("https://staging.onemyle.com/api/people/experts/"+areaExpertId,  HttpMethod.GET, entity, Experts.class);
		return experts.getBody();
	}
	public Experts getExpertsUserById(String userid) {
		HttpHeaders headers =new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Influencer> entity=new HttpEntity<Influencer>(headers);
		ResponseEntity<Experts> experts=restTemplate.exchange("https://staging.onemyle.com/api/people/experts?userid="+userid,  HttpMethod.GET, entity, Experts.class);
		return experts.getBody();
	}
	
	
}
