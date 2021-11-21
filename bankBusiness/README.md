## 실습정리
---
##### 1단계 : 계좌 생성 

`<질문>`
**구현해야 할 기능을 파악** 하고, 기능 구현 ToDo 목록을 작성한다. 
~~~
클래스 이름은 Account
기능은 1. 잔고조회 2. 입금 3. 출금
~~~
계좌 생성 기능을 구현하기 위한 최초의 테스트 케이스를 만들고 실패하는 모습을 확인한다.

`<응답>`
계좌 생성 테스트 케이스를 통과하는 코드를 작성한다.

`<정제>`
리팩토링을 적용할 부분이 있는지 찾아본다.
ToDo 목록에서 완료된 부분을 지운다.

~~~
public class AccountTest {
    
    @Test
    public void testAccount() throws Exception {
        Account account = new Account();
    }
}
~~~

~~~
public class Account {
    public Account(int i){
        
    }
}
~~~
---
##### 2단계 : 잔고 조회

`<질문>`
잔고 조회(getBalance) 기능 작성을 위한 테스트 케이스를 작성한다.
~~~
잔고 조회
- 10000원으로 계좌 생성
- 잔고 조회 결과 일치
~~~
테스트 수행 결과가 오류(error)로 표시된 항목은 실패(failure)항목으로 만든다.

`<응답>`
앞서 작성된 테스트 케이스를 이용해 잔고 조회 기능을 구현한다.
테스트 실패 시에 메시지를 보여줄 수 있는 구조를 생각해본다.

`<정제>`
구현된 잔고 조회 로직에 대한 리팩토링 작업을 한다.
본격적으로 JUnit 테스트 프레임워크를 사용한다.

~~~
public class AccountTest {
    @Test
    public void testAccount() throws Exception{
        Account account = new Account(10000);
    }
    @Test
    public void testGetBalance() throws Exception{
        Account account = new Account(10000);
        assertEquals(10000, account.getBalance));
        
        account = new Account(1000);
        assertEquals(1000, account.getBalance));
        
        account = new Account(0);
        assertEquals(0, account.getBalance));
    }
}
~~~
~~~
public class Account {
    private int balance;
    
    public Account(int money){
        this.balance = money;
    }
    
    public int getBalance(){
        return this.balance;
    }
}
~~~
---
##### 3단계 : 입금/출금

`<질문>`
입금과 출금 기능을 구현하기 위한 테스트 케이스를 작성한다.
~~~
입금
- 10000원으로 계좌 생성
- 1000원 입금
- 잔고 11000원 확인
출금
- 10000원으로 계좌 생성
- 1000원 출금
- 잔고 9000원 확인
~~~

`<응답>`
입금과 출금 기능을 구현한다.

`<정제>`
중복해서 나타나는 계좌 클래스 생성 부분을 리팩토링한다.
테스트에 사용할 객체를 초기화하기 위한 setUp 메서드를 구현한다.
ToDo리스트에서 작성된 부분을 제거한다.

~~~
public class AccountTest{
    private Account account;
    
    @Before
    public void setUp(){
        account = new Account(10000);
    }
    
    @Test
    public void testAccount() throws Exception {
    }
    
    @Test
    public void testGetBalance() throws Exception{
        Account account = new Account(10000);
        assertEquals(10000, account.getBalance));
        
        account = new Account(1000);
        assertEquals(1000, account.getBalance));
        
        account = new Account(0);
        assertEquals(0, account.getBalance));
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
~~~
~~~
public class Account {
    private int balance;
    
    public Account(int money){
        this.balance = money;
    }
    
    public int getBalance() {
        return this.balance;
    }
    
    public void deposit(int money) {
        this.balance += money;
    }
    
    public void withdraw(int money){
        this.balance -= money;
    }
}
~~~
