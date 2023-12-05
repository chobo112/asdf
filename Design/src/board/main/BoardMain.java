package board.main;

import board.dao.BoardDao;
import board.service.BoardService;
import board.templet.AbstractClass;

public class BoardMain extends AbstractClass{
	//BoardService는 인터페이스 / AbstractBoard도 추상이라 객체불가능
	//따라서 상위를 상속한 BoardDao()로 객체를 생성(C is a A, C is a C) 
	static BoardService boardService= BoardDao.getInstacne();
	//BoardDao는 1개만 필요하니까 이렇게 사용함
	/*static {
		boardService = BoardDao.getInstacne();
	}*/
	
	public static void main(String[] args) {
		//추상클래스 템플릿메서드 클래스인 타입으로 받자.
		AbstractClass ac = new BoardMain();
		
		ac.printList();
		//BoardDao에서 Delet도 위에서처럼 클라이언트는 Service만 볼수있으니까
		//boardService를 해야함
		/*boardService.deleteBoard(2);
		
		printList();
		
		//여기 한번 4객체 만들고 쭉 이용
		Board board4 = new Board(4,"제목4","내용4");
		boardService.registBoard(board4);
		printList();
		
		board4.setTitle("새로운 제목4");
		board4.setContent("새로운 내용4");
		
		boardService.updateboard(board4);
		//여기서도 위에 있는 객체와동일한 객체
		printList();*/
	}
	@Override
	public void printTop() {
		System.out.println("####리스트 출력시작");
	}
	@Override
	public void printMiddle() {
		boardService.getBoardList().forEach(bl -> {
			//보더리스트 각각(forEach)에 대해서(여기서말하는 각각은 bl)
			//-> {}여기 작업을 하겠다.
			System.out.println("제목 : "+bl.getTitle());
			System.out.println("내용 : "+bl.getContent());
		});
		System.out.println("--------------------");
	}
	@Override
	public void printBottom() {
		System.out.println("####리스트 출력끝");
	}
	
		
}
