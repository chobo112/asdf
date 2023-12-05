package exam.java.threadpratice;

import java.util.List;

//상영관이 25개
public class Room {
	@Override
	public String toString() {
		return "Room [roomname=" + roomname + ", seatList=" + seatList + "]";
	}
	private List<Seat> seatList;
	private String roomname;
	

	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	
	public Room() {
	}
	public Room(String roomname, List<Seat> seatList) {
		super();
		this.roomname = roomname;
		this.seatList = seatList;
	}

	public List<Seat> getSeatList() {
		return seatList;
	}

	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}

}
