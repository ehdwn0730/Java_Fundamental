package java_20200603;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao1 mdao = new MemberDao1();
		int num = 10;
		String name = "김택진";
		String addr = "서울";
		// MemberDto m = new MemberDto(num, name, addr);
		
		/* 데이터 추가
		  int resultCount = mdao.insert(new MemberDto(num, name, addr)); 
		  if(resultCount == 1)
		   { System.out.println("정상적인 회원 가입이 되었습니다."); 
		  }else {
		  System.out.println("오류..");
		   }
		 */

		/* 데이터 수정
		  int resultCount = mdao.update(new MemberDto(num, name, addr)); 
		  if(resultCount == 1) 
		  { System.out.println("회원이 정상적으로 수정 되었습니다."); 
		  }else {
		  System.out.println("오류.."); 
		  }
		/*
		
		/*데이터 삭제*/
		/*
		int resultCount = mdao.delete(num); 
		 if(resultCount == 1) 
		 { System.out.println("회원이 정상적으로 삭제 되었습니다."); 
		 }else {
		 System.out.println("오류..");	
		 }
		 */
		 
		 
		/*
		ArrayList<MemberDto> list = mdao.select();
		for(int i =0; i< list.size(); i++) {
			MemberDto m = (MemberDto)list.get(i);
			int _num = m.getNum();
			String _name = m.getName();   // 이미 위에 같은 이름의 변수가 있으므로 
			String _addr = m.getAddr();	  // 이중출력 에러를 피하기 위해 _를 사용
			System.out.printf("%d, %s, %s %n", _num, _name, _addr);
		}
		
		for(MemberDto m : list) {
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
			System.out.printf("%d, %s, %s %n", _num, _name, _addr);
		}
		System.out.println("===================================");
		*/
		
		
		//select의 결과가 1개 밖에 없을때는 굳이 ArrayList를 안쓰고 아래 코드로 쓴다
		/*
		MemberDto mdto = mdao.select(num);
		if(mdto != null) {
			System.out.println();
			int _num = mdto.getNum();
			String _name = mdto.getName();
			String _addr = mdto.getAddr();
			System.out.printf("%d, %s, %s %n", _num, _name, _addr);
		}else {
			System.out.println("회원정보가 없습니다.");
		}
		*/
		
		
		
	}
}
