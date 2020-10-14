package com.zerock.collection_framework.list;

import java.util.List;
import java.util.Vector;

import lombok.extern.log4j.Log4j;


@Log4j
public class VectorExample {
	
	
	public static void main(String[] args) {
		//Thread-safe (Synchronized) 한 ArrayList 컬렉션 생성
		List<Vector_Board> list = new Vector<Vector_Board>();
		
		list.add(new Vector_Board( "제목1", "내용1", "글쓴이1" ));
		list.add(new Vector_Board( "제목2", "내용2", "글쓴이2" ));
		list.add(new Vector_Board( "제목3", "내용3", "글쓴이3" ));
		list.add(new Vector_Board( "제목4", "내용4", "글쓴이4" ));
		list.add(new Vector_Board( "제목5", "내용5", "글쓴이5" ));
		
		log.info(list + "\n");		//그나마 이쁘게 찍으려면, 파라미터 즉 Vector_board에 @ToString을 추가한다.
		
		
		for(Vector_Board i : list) {
//			i = list.get(count++);
			log.info(i.subject + "\t" + i.content + "\t" + i.writer);
		}	//enhanced for
		
		System.out.println();
		//------------------------------------------//
		
		list.remove(2);
		log.info("------------2번 인덱스를 지우고 난후------------");
		for(Vector_Board i : list) {
//			i = list.get(count++);
			log.info(i.subject + "\t" + i.content + "\t" + i.writer);
		}	//enhanced for
		
		System.out.println();
		//------------------------------------------//
		
		list.remove(3);
		log.info("------------3번 인덱스를 지우고 난후------------");
		for(Vector_Board i : list) {
//			i = list.get(count++);
			log.info(i.subject + "\t" + i.content + "\t" + i.writer);
		}	//enhanced for
		
		System.out.println();
		//------------------------------------------//
		
		for(int i = 0; i<list.size(); i++) {
			Vector_Board board = list.get(i);
			
			log.info(board.subject + "\t" + board.content + "\t" + board.writer);
			
		}	//for
			
		
	}	//end main

}	//end class
