package com.synechron.spring.drools.util;

import java.util.ArrayList;
import java.util.List;

import com.synechron.spring.drools.model.Participant;

public class ParticipantUntil {

	
	public static List<Participant> getParitcipantsFromP3() {
		
		List<Participant> participants = new ArrayList<>();
		
		Participant p1 = new Participant();
		p1.setName("RaKesh Nandan");
		p1.setSsn(123121234);
		p1.setCaseNumber(10001);
		p1.setAddress("2200 W Germann RD");
		p1.setEnhancedSecurityInfo("No");
		p1.setLoanAmt(10000);
		p1.setFromP3(true);
		p1.setDob("05-08-1985");
		p1.setStatus("Death");
		
		Participant p2 = new Participant();
		p2.setName("Ramesh Saho");
		p2.setSsn(123121235);
		p2.setCaseNumber(10002);
		p2.setAddress("2255 W Germann RD");
		p2.setEnhancedSecurityInfo("Yes");
		p2.setLoanAmt(15000);
		p2.setFromP3(true);
		p2.setDob("05-08-1980");
		
		participants.add(p1);
		participants.add(p2);
		return participants;
		
	}
}
