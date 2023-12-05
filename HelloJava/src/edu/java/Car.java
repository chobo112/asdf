package edu.java;




public class Car {
    int speed;
    String color;
    
    public Car(int 초기속도, String 초기색상) {
        speed = 초기속도;
        color = 초기색상;
    }
    
    public void 자동차정보표시() {
        System.out.println("자동차 속도: " + speed);
        System.out.println("자동차 색상: " + color);
    }
    
    public static void main(String[] args) {
        // 새로운 자동차 객체를 생성하고 초기 속도와 색상을 설정합니다.
        Car myCar = new Car(60, "빨간색");
        
        // 자동차의 정보를 표시합니다.
        myCar.자동차정보표시();
    }
}

