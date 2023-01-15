package com.pract.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pract.config.ProjectConfiguration;
import com.pract.model.Contact;

import feign.Headers;

@FeignClient(name="contact",url="http://localhost:8080/api",configuration = ProjectConfiguration.class)
public interface ContactProxy {

	@RequestMapping(value = "/getAllMessageByStatus",method = RequestMethod.GET)
	@Headers(value = "Content-Type: application/json")
	public List<Contact>getAllMessageByStatus(@RequestBody Contact contact);
		
}
