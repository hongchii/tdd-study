package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Account;

public class AccountTest {
	
	private Account account;

	@Test
	public void testAccount() throws Exception {
		setup();
	
	}
	
	@Before // @Test 케이스가 실행되기 전에 먼저 실행됨. 
	public void setup() {
		account = new Account(10000);
	}
	
	@Test
	public void testGetBalance() throws Exception { // 잔고 조회 		
		assertEquals(10000, account.getBalance());
		
		account = new Account(1000);
		assertEquals(1000, account.getBalance());
		
		account = new Account(0);
		assertEquals(0, account.getBalance());
	}
	
	@Test
	public void testDeposit() throws Exception {	
		account.deposit(1000);
		assertEquals(11000, account.getBalance());
	}
	
	@Test
	public void testWithdraw() throws Exception {
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
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

/*
첫번째. 응답 : 계좌 생성 메서드 구현
- 계좌 생성 테스트 케이스를 통과하는 코드를 작성한다.
 */
 