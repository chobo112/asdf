package exam.java.threadpratice;
//seat은 의자개수/ Cinema는 영화관수 5 int / Room상영관 5개
//Cinema영화관 이름 String
public class ReservationThread extends Thread{
//동시에 예매를 하니까? 쓰레드?? 	
	
	private CinemaPerson cinemaPerson;
	private Seat seat;
	
	ReservationThread(CinemaPerson cinemaPerson, Seat seat) {
		this.cinemaPerson = cinemaPerson;
		this.seat = seat;
	}//2개로 나눠쓸 필요가 없지
	
	Thread thread = new Thread();
	@Override
		public void run() {
		if(!seat.isReservationYN()) {//좌석이예매 되어있을경우에! 비교를 할거야
			seat.setReservationYN(true);//예약을 했을때를 비교할건데
			
		}
		}
	
	
}
	
	

