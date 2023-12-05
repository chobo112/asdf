package board.service;

import java.util.List;

import board.bean.Board;

//보드를 만들건데 추상으로 만들거다 = AbstractBoard 관례
public abstract class AbstractBoard implements BoardService {
//인터페이스의 추상메서드를 기본구현만 해놓자.
//인터페이스는 목록만 / 추상클래스는 기본구현만 / 상속받는 클래스에서 구체화하자
	@Override
	public List<Board> getBoardList() {

		return null;
	}

	@Override
	public void registBoard(Board board) {

	}

	@Override
	public void deleteBoard(int bid) {

	}

	@Override
	public void updateboard(Board board) {

	}

}
