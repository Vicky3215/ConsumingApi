package com.pract.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pract.model.Contact;
import com.pract.proxy.ContactProxy;
@RestController
public class ContactController {


	@Autowired
	ContactProxy contactProxy;
	
	@GetMapping("/getMessage")
	public List<Contact>getMessage(@RequestBody Contact contact){
		return contactProxy.getAllMessageByStatus(contact);
	}
}
