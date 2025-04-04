package oop.basic;

// 객체 설계용 클래스에는 메인 메서드를 작성하지 않습니다.
public class Pen {

    // 객체의 속성을 표현 -> 필드(멤버변수)라고 부릅니다.
    String color;
    int price;

    Pen() {}

    Pen(String pColor, int pPrice) {
        color = pColor;
        price = pPrice;
    }

    // 객체의 기능을 표현한 함수를 메서드라고 부릅니다.
    void write() {
        System.out.println(color + "색 글을 씁니다.");
    }

    void priceInfo() {
        System.out.println(color + "색 펜의 가격은 " + price + "원 입니다.");
    }



}
