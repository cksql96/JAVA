package com.zerock.lambda.functional_interface;

import lombok.extern.log4j.Log4j;

@Log4j
public class RunnableExample {

   public static void main(String[] args) {
      
      Runnable task = () -> {

         for(int i=0; i<10; i++) {
            log.info(i);
         }//for
         
      }; //Runnable 타입의 task 생성하는 람다식
      
      Thread thread1 = new Thread(task);
      thread1.start();
      log.info(thread1);
//      Thread thread2 = new Thread() {
//         @Override
//         public void run() {
//            
//         } //task
//         
//      }; //익명자식객체 코딩기법  -> 매개변수없는 객체가 있다.
//      //new Thread에 인터페이스가 들어가면 익명구현객체, 객체가 들어가면 익명자식객체
      
      Thread thread2 = new Thread(() -> {
         //1 익명객체구현객체, 람다식을 쓰던가
         for(int i=0; i<10; i++) {
            log.info(i);
         } //for
         
      }); //람다식 사용하여 스레드가 실행할 Runnable task를 생성하고 있음.
      // 이결과값은 결과적으로 익명구현을 위한함.
      
      thread2.start();
      
   } //main
   
} //end class