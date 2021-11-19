#### 어노테이션
#
| 어노테이션 | 설     명 |
| ------ | ------ |
| @RunWith | JUnit 확장 어노테이션이며 SpringJUnit4classRunner로 JUnit용 테스트 컨텍스트 프레임워크 확장 클래스를 지정하면 테스트 진행 시 컨텍스트를 생성하고 관리하는 작업을 한다. 지정하지 않으면 SpringRunner.class로 사용된다. |
| @ContextConfiguration | SpringBean 메타 설정 파일의 위치를 지정하고, 지정하지 않으면 테스트 파일의 패키지에서 설정파일을 찾는다. |
| @WebAppConfiguration | 웹 어플리케이션 전용 DI 컨테이너로 처리한다. |
| @ignore | 해당 테스트를 테스트 하지 않는다. |
| @Test | 단위 테스트 선언 @Test(timeout=6000) 단위는 밀리, 해당 시간을 넘기면 실패한다. @Test(expected=NullPointerException)은 NullPointerException이 발생해야 통과한다.|
| @Before | 테스트 이전에 실행 할 메서드를 지정한다. (실행 될 때 마다 객체를 생성하여 실행)|
| @After | 테스트 이후에 실행 할 메서드를 지정한다. (실행 될 때 마다 객체를 생성하여 실행)|
| @BeforeClass | 테스트 이전에 실행 할 메서드를 지정한다. (한번만 실행되며 static으로 선언해야함)|
| @AfterClass | 테스트 이후에 실행 할 메서드를 지정한다. (한번만 실행되며 static으로 선언해야함)|