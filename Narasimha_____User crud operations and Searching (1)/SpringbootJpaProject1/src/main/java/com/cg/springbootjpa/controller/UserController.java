package com.cg.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springbootjpa.exception.TrainerException;
import com.cg.springbootjpa.model.Trainee;
import com.cg.springbootjpa.model.Users;
import com.cg.springbootjpa.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/addUser")
	public ResponseEntity<String> saveBook(@RequestBody Users user) {
		//if(user.getUserType().equalsIgnoreCase("Admin")||user.getUserType().equalsIgnoreCase("Customer"))   throw new TrainerException("Usertype should be either Admin or Customer");
		userService.addUserService(user);
        
		return new ResponseEntity<String>("Trainer Added",HttpStatus.OK);
	}
	@GetMapping("/getUser")
    public ResponseEntity<List<Users>> getUserslist() {
			List<Users> list =userService.viewUserService();
			return new ResponseEntity<List<Users>>(list,HttpStatus.OK);
	}
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable("id") int id)
	{
		
		Boolean status = userService.deletebyIdService(id);
		if(!status)throw new TrainerException("User not found.");
		
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		
	}
	@GetMapping("/viewbyid/{id}")
	public ResponseEntity<Users> viewUser(@PathVariable("id") int id)
	{
		Users user=userService.viewByIdService(id);
		return new ResponseEntity<Users>(user,HttpStatus.OK);
	}
	@PutMapping("/updateuser/{id}")
	public ResponseEntity<String> updateUser(@PathVariable("id") int id,@RequestBody Users user)
	{
	
		userService.updateService(id, user);
		return new ResponseEntity<String>("User Updated",HttpStatus.OK);
	}
	
	

}
