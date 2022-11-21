import java.time.LocalDate;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 1");
        System.out.println("Задания 1-2");
        Human firstHuman = new Human(1988, "Максим", "Минск", "");
        Human secondHuman = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human thirdHuman = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human fourthHuman = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println(firstHuman);
        System.out.println(secondHuman);
        System.out.println(thirdHuman);
        System.out.println(fourthHuman);
        System.out.println("Задание 3");
        Car firstCar = new Car("Lada", null, 1.7, "желтый", 2015, "Россия");
        Car secondCar = new Car("Audi", "50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car thirdCar = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car fourthCar = new Car("Kia", "Sportage 4", 2.4, "красный", 2018, "Южная Корея");
        Car fifthCar = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);
        System.out.println(fourthCar);
        System.out.println(fifthCar);
        System.out.println("Encapsulation. Homework 1}");
        System.out.println("Task 1");
        Human Vladimir = new Human(LocalDate.now().getYear() - 21, "Владимир", "Казань", "");
        System.out.println(Vladimir);
        System.out.println("Task 2");
        Flower rose = new Flower("Голландия", 35.59);
        Flower chrysanthemum = new Flower(15, 5);
        Flower peony = new Flower("Англия", 69.9, 1);
        Flower gypsophila = new Flower("Турция", 19.5, 10);
        System.out.println("Роза обыкновенная: " + rose);
        System.out.println("Хризантема: " + chrysanthemum);
        System.out.println("Пион: " + peony);
        System.out.println("Гипсофила: " + gypsophila);
    }
}