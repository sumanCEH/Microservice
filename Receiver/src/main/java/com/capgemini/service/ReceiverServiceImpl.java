package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.Receiver;
import com.capgemini.repository.ReceiverRepository;


@Service
public class ReceiverServiceImpl implements ReceiverService {

	@Autowired
	private ReceiverRepository receiverRepository;
	
	@Override
	public String addReceiver(Receiver receiver) {
		receiverRepository.save(receiver);
		return "Receiver saved";
	}

	@Override
	public Receiver getReceiverById(String receiverEmail) {
		Receiver receiver = receiverRepository.findById(receiverEmail).get();
		System.out.println("in receiver service impl");
		System.out.println(receiver);
		return receiver;
	}

	@Override
	public Receiver updateReceiverById(int receiverId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
