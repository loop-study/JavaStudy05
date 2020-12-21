package com.example.study;

// 클래스명 첫글자는 대문자이다.
public class Car {

    // 필드
    String name;

    //
    public Car() {

    }

    // 생성자
    public Car(String carName, String carModel, String carColor, int maxSpeed) {
        this.name = "제네시";
    }

    // 메소드
    public void setName(String name){
        this.name = name;
    };

    public String getName() {
        return this.name;
    }
}
