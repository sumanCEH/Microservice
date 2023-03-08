package com.capgemini.service;

import org.springframework.stereotype.Service;


import com.capgemini.entity.Receiver;

@Service
public interface ReceiverService {
	public String addReceiver(Receiver receiver);
	public Receiver getReceiverById(String receiverEmail);
	public Receiver updateReceiverById(int receiverId);

}
