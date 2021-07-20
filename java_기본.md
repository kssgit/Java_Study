# Java_Study


##  Variable(변수)



### 기본 변수

**논리형**  ``boolean``

**문자형** ``char``

**정수형** ``byte``, ``short``,`` int``, ``long``

**실수형** ``float`` , ``double``

여기서 **String**은 문자의 연속돈 나열 로 **Class**이다



### 상수 표현(constant)

``final`` 사용

**상수는 선언과 동시에 초기화를 해줘야 한다**

```java
final int MAX_SPEED = 10;
```



### 형식화 된 출력 - printf()

``printf()``

```java
System.out.printf("age : %d",age);
System.out.printf("age : %d",14);
```

**지시자**

``%d`` : 10진 정수형식으로 출력

``%b`` : 불리언 형식으로 출력

``%c`` : 문자로 출력

``%s`` : 문자열로 출력



### 화면에서 입력 받기 - Scanner

Scanner를 사용하기위해 ``import java.utill.Scanner`` 를 추가 한다

Scanner 매서드인 nextInt()를 이용해 정수형태의 문자열을 int로 형변환 가능

``` java
import java.utill.*;

Scanner scanner = new Scanner(System.in);
int num = scanner.nextInt();
String input = scanner.nextLine();

```



## 연산자 (Operator)

