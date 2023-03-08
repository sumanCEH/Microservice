package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Receiver;


@Repository
public interface ReceiverRepository extends JpaRepository<Receiver,String> {

}
