package test;

public class AccountTest {

	public void testAccount() {
		Account account = new Account(); // 계좌를 생성한다.
		if ( account == null) { // 계좌가 정상적으로 생성됐는지 확인.
			throw new Exception("계좌생성 실패"); // 실패시 Exception
			// 메서드 실행 시 어떤 문제나 메시지가 발생하지 않으면 계좌생성 테스트가 성공한 것으로 간주함.
			
		}
	}
	
	public static void main(String[] args) {
		AccountTest test = new AccountTest();
		test.testAccount(); // 테스트 케이스 실행
	}
}


/*
첫 번째. 질문: 계좌 생성 테스트
- 구현해야 할 기능을 파악하고, 목록을 작성한다.
- 계좌 생성 기능을 구현하기 위한 최초의 테스트 케이스를 만들고 실패하는 모습을 확인한다. 

<< 작성하고자 하는 메서드나 기능이 무엇인지 선별하고 작성 완료 조건을 정해서 실패하는 테스트 케이스를 작성하는 것>>


클래스 이름 Account
기능 잔고 조회, 입금, 출금. 금액은 원 단위 
*/
