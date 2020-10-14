package com.zerock.collection_framework.stack;

import java.util.Stack;

import lombok.extern.log4j.Log4j;


@Log4j
public class StackExample {

   public static void main(String[] args) {
	   //스택 객체를 만들고, 타입은 Coin을 따른다.
	   Stack<Coin> coinBox = new Stack<>();
	   
	   Coin coin10 = new Coin(10);		//객체 생성
	   Coin coin500 = new Coin(500);
	   
	   coinBox.push(new Coin(100));		//새로운객체 생성후 그안에 넣는다.
	   coinBox.push(new Coin(50));		//이하동문...
	   coinBox.push(coin500);			//만들었던 객체를 Stack객체 안에 넣는다.
	   coinBox.push(coin10);			//만들었던 객체를 Stack객체 안에 넣는다.
	   coinBox.push(new Coin(100));		//새로운객체 생성후 그안에 넣는다.
	   
	   log.info(coinBox + "\n");
	   //--------------------------------------------------------------------------//	   
	   
	   int index = coinBox.search(new Coin(10)); //10원이라는건 똑같지만 다른동전이다 즉 새로운 객체그래서 위에 추가
	   
	   log.info(index); //결과값 -1 --> 10원짜리를 정 찾고싶으면 new해서 찾으면 안됨.
		//새로운 동전은 스택공간에 담겨져있지않다. 그러므로 코인객체를 새롭게 만들어라10원
	   log.info(coinBox.search(coin500));			//뒤에서 세번째.
	   log.info(coinBox.search(coin10) + "\n\n");	//뒤에서 두번째.
	   //--------------------------------------------------------------------------//
	   System.out.print("2020-10-13 11:43:37,276 [main] INFO  StackExample:28 - ");
	   
	   for(Coin i : coinBox) {
		   System.out.print("" + i + " ");
	   }	//enhanced for
	   
	   System.out.println("\n");
	   //--------------------------------------------------------------------------//	
	   
	   //Last In First Out
	   while(!coinBox.isEmpty()) {
		   Coin coin = coinBox.peek();		//하나를 peek(살짝보기)	-> 마지막꺼
		   
		   log.info(">>>꺼내온 동전" + coin.getValue() + "원");
		   
		   coinBox.pop();				//마지막꺼 펑
		   
		   log.info(">>>남은 동전" + coinBox + "\n");
		   
	   }	//while
	   
	   
	   
      
      //-------------------------------//

   } //main
   
} //end class
