package board.bean;//데이터 패키지

//게시물
public class Board {
	private int bid;// 번호 => Dao에서 Delet를 하기위한 번호
	
	private String title;	//제목
	private String content; //내용
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Board(int bid,String title, String content) {
		super();
		this.bid = bid;
		this.title = title;
		this.content = content;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "Board [bid="+bid+", title=" + title + ", "
				+ "content=" + content + "]";
	}

	//get // set한것을 보니 여기 데이터를 사용하겠구나
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
