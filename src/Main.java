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
        Car firstCar = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car secondCar = new Car("Audi", "50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car thirdCar = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car fourthCar = new Car("Kia", "Sportage 4", 2.4, "красный", 2018, "Южная Корея");
        Car fifthCar = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);
        System.out.println(fourthCar);
        System.out.println(fifthCar);
    }
}