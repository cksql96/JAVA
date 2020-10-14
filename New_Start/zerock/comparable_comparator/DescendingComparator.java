package com.zerock.comparable_comparator;

import java.util.Comparator;

import lombok.extern.log4j.Log4j;


@Log4j
public class DescendingComparator implements Comparator<Fruit> {
	
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		log.info("compare(Fruit, Fruit) invoked");
		//기존의 정석대로라면, o1.price < o2.price 는 기존객체가 저 작으므로, -1로 가야한다.
		//그러나 descending으로 가려면, 반대로 넣어주면 된다.
//		
//		if(o1.price < o2.price) {
//			return 1;
//		} else if(o1.price == o2.price) {
//			return 0;
//		} else {
//			return -1;
//		}	//if-else		
		
//		 return Integer.compare(o1.price, o2.price);			//ascending
		 return Integer.compare(o2.price, o1.price);		//descending
		
	}	//compare

}	//end class
