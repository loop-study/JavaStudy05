package com.example.study;

// 자바 파일명과 클래스명은 동일해야한다. 앗. 소문자로 썻네 실수... ㅎ
public class example01 {

    public static void main(String[] args) {

        // 객체 생성방법 : new 연산자를 사용
        Car car = new Car();

        System.out.println(car); // com.example.study.Car@5b2133b1
    }

}

// 하나의 파일에 2개 이상 클래스 선언이 가능하다.
// 대신 파일명과 동일한 클래스만 public 을 붙일 수 있다. 다 붙이면 에러 발생.
// 바이트코드로 변환 시 클래스마다 Example01.class, SubClass.class 로 변환된다.
class SubClass {

    //
    void methodName(String name, String name02, String name03) {

    }

    int testMethod() {
        // 리턴 타입이 int 이면 int 타입의 값을 리턴해줘야한다.
        return 11;
    }

}
