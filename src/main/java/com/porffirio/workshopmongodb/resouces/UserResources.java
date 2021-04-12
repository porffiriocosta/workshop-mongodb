package com.porffirio.workshopmongodb.resouces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.porffirio.workshopmongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User reginaldo = new User("1", "Reginaldo Porfirio", "porffiriocosta@gmail.com");
		User simone = new User("2", "Simone Galdino", "sgaldinocosta@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(reginaldo, simone));
		
		return ResponseEntity.ok().body(list);
	}
}
