package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.Receiver;
import com.capgemini.service.ReceiverService;


@RestController
@RequestMapping("/receiver")
public class ReceiverController {
	
	@Autowired
	private ReceiverService receiverService;
	
	@GetMapping(value = "/home")
	public String home() {
		return " welcome Home";
		}
	
	
	@PostMapping(value = "/addReceiver")
	public String addReceiver(@RequestBody Receiver receiver) {
		receiverService.addReceiver(receiver);
		return "Receiver saved Sucessfully";
		
	}
	@GetMapping(value ="/getReceiverById/{id}" )
	public Receiver getReceiverById(@PathVariable("id") String receiverEmail) {
		Receiver receiver = receiverService.getReceiverById(receiverEmail);
		System.out.println(receiver);
		return receiver;
		
	}
	@PutMapping(value = "/updateReceiverById/{id}")
	public Receiver updateReceiverById(@PathVariable("id") int receiverId) {
		return null;
		
	}

}
