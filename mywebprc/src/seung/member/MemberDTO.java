package seung.member;

public class MemberDTO {
	
	private int idx;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}

	private String id;
	private String pwd;
	private String name;
	private String email;
	private String addr;
	private String tel;
	private String joindate;

	public MemberDTO() {
		System.out.println("정보변수가호출되었습니다.");
	}
	
	public MemberDTO(int idx, String id, String pwd, String name, String email, String addr, String tel,
			String joindate) {
		super();
		this.idx = idx;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.tel = tel;
		this.joindate = joindate;
	}//메뉴 -source - Generate Constructor using Field..
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
