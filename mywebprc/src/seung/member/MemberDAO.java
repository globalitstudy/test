package seung.member;
import java.sql.*;

public class MemberDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public MemberDAO() {
		System.out.println("1기능이 호출되었습니다.");
		dbConnect();//꼭생성자에서 자동으로 불러오게하자
	}
	/**DB호출*/
	public void dbConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//이거틀려도 널포인트뜬다 조심하자 ㅠㅠㅠ
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="scott";
			String pwd="1234";
	
			conn = DriverManager.getConnection(url,user,pwd);

		} catch (Exception e) {//꼭모든 예외를 처리하기위해Exception을이용하자
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("가입기능이 호출되었습니다.");
	}
	/**회원가입*/
	public int join(MemberDTO dto) {
		
		try {
			String sql="insert into jsp_member values(jsp_member_idx.nextval,?,?,?,?,?,?,sysdate)";
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getEmail());
			ps.setString(5, dto.getAddr());
			ps.setString(6, dto.getTel());
			
			int count=ps.executeUpdate();//실행된횟수
			
			return count;
		}catch (Exception e) {
			e.printStackTrace();
			return -1;
		}finally {
			try {
				ps.close();
				conn.close();
			} catch (Exception e2) {
			
			}
		}
		
	}
	/**중복검사*/
	public int idCheck(String id) {
		try {
			String sql="select * from jsp_member where id=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			
			int count=ps.executeUpdate();//실행횟수 중복된게있느냐

			//count랑  excute라는걸 동시에 실행못시킨다
			if(count>0) {//값이 있을때 0을 돌려줘
				return count;
			}else {//값이 없으면 실행한횟수를 반환해
				return 0;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			return -1;
		}finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			}catch (Exception e2) {
				// TODO: handle exception
			}
		}

		
	}
}


