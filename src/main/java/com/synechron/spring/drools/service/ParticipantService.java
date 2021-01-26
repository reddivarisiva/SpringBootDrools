package com.synechron.spring.drools.service;

import org.springframework.stereotype.Service;

import com.synechron.spring.drools.model.Participant;
import com.synechron.spring.drools.util.ParticipantUntil;

@Service
public class ParticipantService {

	public Participant findServiceBySSN(Integer ssn) {
		if(ssn != null) {
			for(Participant participant : ParticipantUntil.getParitcipantsFromP3()) {
				if(participant.getSsn().intValue() == ssn.intValue()) {
					return participant;
				}
			}
		}
		return  null;
	}
	
}
