package com.zerock.collection_framework.set;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@AllArgsConstructor
@Log4j
public class Member {
	public String name;
	public int age;
	
	
	@Override
	public boolean equals(Object obj) {
		log.info("equals() invoked.");
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			
			boolean isSame = member.name.equals(name) && (member.age == age);
			log.info("\t>>> myHashCode: " + isSame + " 이므로 안넣음.");
			
			return isSame;
		} else {
			return false;
		}	//if-else
		
	}	//equals	
	
	@Override
	public int hashCode() {
		log.info("hashCode() invoked.");
		
		int myHashCode = name.hashCode() + age;
		log.info("\t>>> myHashCode: " + myHashCode);
		
		return name.hashCode() + age;
	}	//hashCode

}	//end class
