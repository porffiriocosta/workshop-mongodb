package com.porffirio.workshopmongodb.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.porffirio.workshopmongodb.domain.User;
import com.porffirio.workshopmongodb.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){

		
		List<User> list = userService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}
