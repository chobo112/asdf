package board.dao;

import java.util.ArrayList;
import java.util.List;

import board.aggregate.ConcreteAggregate;
import board.bean.Board;
import board.iterator.Iterator;
import board.service.AbstractBoard;
//추상에서만 기본구현 => 객체생성을 못하니까 구현클래스에서 작업하자.
public class BoardDao extends AbstractBoard {
	
	private List<Board> boardList;
	
	//싱글톤을 사용함. => BoardMain에서 쓰기위함
	private static BoardDao boardDao = new BoardDao();
	private BoardDao() {
		//getBoardDao해 써놓으면 계속3개가 생성됨. 
		//생성자에 넣어서 초기값은 3개만 가지도록 해놓음
		boardList = new ArrayList<Board>();
		
		/*iterator를 만들면 여기 코드가 빠뀜
		registBoard(new Board(1, "제목1","내용1"));
		registBoard(new Board(2, "제목2","내용2"));
		registBoard(new Board(3, "제목3","내용3"));
		*/
		Iterator it = (Iterator) new ConcreteAggregate().iterator();
		while(it.hasNext()) {
			int itNext = (Integer)it.next();
			registBoard(new Board(itNext, "제목"+itNext,"내용"+itNext));
		}
	}
	public static BoardDao getInstacne() {
		return boardDao;
	}//여기까지가 싱글톤임
	
	
	@Override
	public List<Board> getBoardList() {
		//여기에 getBoardList에 써있으면 3개가 계속 반환됨
		return boardList;
	}
	
	@Override 
	//registBoard는 상품을 등록하는건데 밑에 리스트보드에 add했으니까
	//void = return값은 반환할 필요가 없어짐
	public void registBoard(Board board) {
		boardList.add(board);
	}
	
	@Override
	public void deleteBoard(int bid) {
		//보더리스트에서 보더타입의 보더를 빼겟다.
		for (Board board :boardList) {
			if(board.getBid()==bid) {
				boardList.remove(board);
			}
		}//같은 번호가 제거된 boardList
		
	}
	
	@Override
	public void updateboard(Board board) {
		//업데이트 = 방법1 지우고 추가 / 방법2 정보를 가져와서 찾아옴
		for(Board board2 : boardList) {//리스트에 잇던 bid
			if(board2.getBid()==board.getBid()) { 
				board2.setTitle(board.getTitle());
				board2.setContent(board.getContent());
			}
	//board2를 설정하는데 Board의 board에서 가져와서 수정을 하겠다.		
		}
		
	}
}
