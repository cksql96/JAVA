package com.zerock.collection_framework.stack;

import java.util.Stack;

import lombok.extern.log4j.Log4j;


@Log4j
public class Coin1Example {

   public static void main(String[] args) {
      Stack<String> coinBox = new Stack<>();
      
//      Coin coin100 = new Coin(100);
//      Coin coin50 = new Coin(50);
//      Coin coin500 = new Coin(500);
//      Coin coin10 = new Coin(10);
//      
//      //--------------------------------//
//      
//      coinBox.push(coin100);
//      coinBox.push(coin50);
//      coinBox.push(coin500);
//      coinBox.push(coin10);
//      coinBox.push(new Coin(""));
//      coing 
      coinBox.push("100");
      coinBox.push("50");
      coinBox.push("500");
      coinBox.push("10");
      
      log.info(coinBox);
      
      int index = coinBox.search("100"); //10원이라는건 똑같지만 다른동전이다
//    즉 새로운 객체그래서 위에 추가함.

      log.info(index + "\n\n"); //결과값 -1 --> 10원짜리를 정 찾고싶으면 new해서 찾으면 안됨.
      //--------------------------------//
      
      //Last In First Out
	  while(!coinBox.isEmpty()) {
	     String coin = coinBox.peek();// 이것을 사용하면 마지막에 넣은값만 나옴 
	     
	     log.info( "꺼내온 동전 : " + coin + "원");
	     
	     coinBox.pop();		//펑~! 
	     
	     log.info(coinBox + "\n");	     
		
	  }//while
	  
	  //---------------------------------------------------------------     
	  //결과값을보면 넣은순서와 반대로나온다. 이런 자료구조형을 보면. 스택은 항아리와같다. |
	  //---------------------------------------------------------------

      
      //-------------------------------//
	  
                       
   } //main
   
} //end class
