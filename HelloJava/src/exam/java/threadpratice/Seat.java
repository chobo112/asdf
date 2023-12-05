package exam.java.threadpratice;

import java.util.Map;

//좌석 25개 = 총 125개인디.. 25*5니까 예약자들 정보도 여기서 뭔가 같이 불러오나
public class Seat {//좌석에 예약이 되어있는지 아닌지는 여기서 판단함?
//위 아래 시트번호와 예약번호들을 가지고 있다 = has a 관계	
	private String seatNo;
	@Override
	public String toString() {
		return "Seat [seatNo=" + seatNo + ", reservationYN=" + reservationYN + "]";
	}
	private boolean reservationYN;//시트가 예매가 되었는지 아닌지?
	public Seat() {
	}
	public Seat(String seatNo, boolean reservationYN) {
		super();
		this.seatNo = seatNo;
		this.reservationYN = false;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public boolean isReservationYN() {
		return reservationYN;
	}
	public void setReservationYN(boolean reservationYN) {
		this.reservationYN = reservationYN;
	}
	
	

	

	
	

}
