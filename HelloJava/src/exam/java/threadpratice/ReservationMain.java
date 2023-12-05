package exam.java.threadpratice;

import java.util.ArrayList;
import java.util.List;

public class ReservationMain {// 호출만 해보자는것같은디.
	public static final int CINEMAPERSON_COUNT = 200;
	public static final int ROOM_COUNT = 5;
	public static final int SEAT_COUNT_PER_ROOM = 25;
	// 위에는 예시로 그냥 5개 / 룸마다 시트수 25개, 사람200명:상수로 줘버린거임

	// 메인에서 해야할일은??
	public static void main(String[] args) {

		// 룸을만들고 싶네, seat가 필요하네 => 왜? 영화관은 좌석이 필요하니까
		List<Seat> seatList = new ArrayList();
		for (int i = 0; i < SEAT_COUNT_PER_ROOM * ROOM_COUNT; i++) {
			seatList.add(new Seat(String.valueOf(i + 1), false));
		} // 시트는 seatList를 만들어서 넣으려고 List를 넣음(순서를 있도록)
			//
		// 2.룸 생성(좌석을 받은) 영화관에 상영관의개수니까 5개겠지. 5라고 쓰면 유동적이니까 상수
		List<Room> roomList = new ArrayList<Room>();
		for (int i = 0; i < ROOM_COUNT; i++) {
			roomList.add(new Room((i+1)+"관",
					(seatList.subList //1번부터 25번은 1관 /26번부터50번은 2관에 넣는 작업
							(i * SEAT_COUNT_PER_ROOM, //0
									(i + 1) * (SEAT_COUNT_PER_ROOM/*25*/))
							// API에서 SubList = 25개씩 잘라서 각 room에 넣은것
							))
					);
			
		}
		//Room room = new Room(seatList);

		// 3. 영화관 생성..아직은 필요없지만 만드는것 = 더 많아지면 만드려고 일단 만들어둠
		Cinema cineama = new Cinema(roomList);
		// 시네마를 이렇게 그냥 만든 이유는 roomList를 가진것을 만들고 싶은것임
		// 이 말을 상영관 5개를 가진 영화관을 만든건데 그5개를 위서 roomList에 넣어둔것임
		// 3. 사람생성 여기서 리스트를 한 이유는 사람은 
		List<CinemaPerson> cineamaPersonList = new ArrayList<CinemaPerson>();
		for (int i = 0; i < CINEMAPERSON_COUNT; i++) {
			cineamaPersonList.add(new CinemaPerson("CP" + (i + 1), null));
			//cinemaPerson생성자를 보면 처음은 이름이고, 뒤에는 예매한 좌석인데 아직 예매된지 못봐서 모름
		}
		// 4. 예매로직//여기가 쓰레드를 쓰는거임. 왜? 공통적으로 좌석을 공유하니까 안겹치게 해야지
		
		
		// 5. 출력로직
		
		
	}// main

}// class
