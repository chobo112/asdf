package board.service;
//얘가 포사드의 역할 // 서비스 포샤드 = 포샤드패턴
//게시물 목록을 보는거, 삭제, 수정하는것들 Facade
import java.util.List;
import board.bean.Board;

//Board 서비스 facade = 보더서비스를 알고싶으면 얘만 알면된다. = 서비스를 이용하기위한 진입로
//=BoardSevice만 알면 기타 하위 서비스들은 여기를 통해서 알겠다. 포샤드먼저 정의할것
public interface BoardService {
	
	//보드의 리스트를 얻을 애 = 목록
	 public abstract List<Board> getBoardList();
	 
	 //등록
	public abstract void registBoard(Board board);
	
	//삭제  파라미터는 뭔가 지우려니까 번호가 필요할것같다 = 순서?
	public abstract void deleteBoard(int bid);
	
	public abstract void updateboard(Board board);
	//위 아래 같은건데 Board클래스니까 그냥 상위로 한번에 받자
	//public abstract void updateboard(String title, String content);
	
}
