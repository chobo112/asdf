package exam.java.threadpratice;

import java.util.List;

//요구사항
//영화관 내에 5개의 상영관이 있습니다. = Cinema
//각 상영관에는 25개의 좌석이 있습니다. = seat 
//200명의 사람이 선착순으로 모든 좌석을 예매할 수 있다.=구현시 Math.random()을 활용
//모든 상영관의 모든 좌석이 에매되면 예매현황을 출력

//필요클래스 Cinema, Room, Seat, ChinemaPerson 예매자정보클래스
//ReservationThread 예매스레드, ReservationMain - 메인클래스
//영화관 예매현황은 : 1관 1석 - CP10 부터 등등이 출력됨(중복되면 안된다)
//---- 예매실패자 : 75명(CP1~CP75이런식으로 출력됨)
//시네마의 이름을 주기 위함 //영화관 클래스
public class Cinema {
@Override
	public String toString() {
		return "Cinema [roomList=" + roomList + "]";
	}
	//제일 중요한건 각 객체들을 무엇으로 할건지가 1번. 각 객체가 가지는게 무엇인지 설계가 1번임	
	private List<Room> roomList;//시네마는 영화관들의 리스트를 가진다.
	
	public Cinema() {//기본생성자
	}
	public Cinema(List<Room> roomList) {
		super();
		this.roomList = roomList;
	}
	public List<Room> getRoomList() {
		return roomList;
	}
	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}


	
	
}
