package day21;

public class Board {
	private int bno;
	private String id, title, body;
	
	public Board() {}
	
	public Board(int bno, String id, String title) {
		this.bno =bno;
		this.id =id;
		this.title = title;
	}
	public Board(int bno, String id, String title, String body) {
		this.bno =bno;
		this.id =id;
		this.title = title;
		this.body = body;
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}


}
