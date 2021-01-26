package com.synechron.spring.drools.controller;

import java.util.List;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.spring.drools.model.Participant;
import com.synechron.spring.drools.service.ParticipantService;

@RestController
public class ParticipantValidatorController {
	@Autowired
	private KieSession session;

	@Autowired
	private ParticipantService participantService;
	
	@PostMapping("/participant")
	public List<String> orderNow(@RequestBody Participant participant) {
		Participant p3Obj = participantService.findServiceBySSN(participant.getSsn());
		if(p3Obj == null) {
			participant.addValidations("SSN Not Valid");
			return participant.getValidations();
		}
		
		session.insert(participant);
		session.insert(p3Obj);
		session.fireAllRules();
		return participant.getValidations();
	}

}
