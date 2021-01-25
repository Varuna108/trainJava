package day6;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Car car = new Car();    // создание объекта Car
        car.setColor("black");
        car.setYear(1998);
        car.setModel("BMW");

        Motorbike motorbike = new Motorbike(2001, "Audi", "blue");     // создание объекта Motorbike

        car.info();
        motorbike.info();

        int yearDifferenceCar = car.yearDifference();
        System.out.println("Разница в годах для объекта - автомобиль: " + yearDifferenceCar);

        int yearDifferenceMotorbike = motorbike.yearDifference();
        System.out.println("Разница в годах для объекта - мотоцикл: " + yearDifferenceMotorbike);

        Airplane airplane = new Airplane("Boing", 2021, 200, 15000);    // создание объекта Airplane
        airplane.setYear(1990);
        airplane.setLength(100);
        airplane.fillUp(50);
        airplane.fillUp(10);
        airplane.info();

        Student student = new Student("John");      // создание объекта Student
        Teacher teacher = new Teacher("ph. D. David Blein", "Magic");       // создание объекта Teacher

        teacher.evaluate(student.name);
    }
}