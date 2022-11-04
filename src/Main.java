public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 1");

        Human firstHuman = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human secondHuman = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human thirdHuman = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human fourthHuman = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println(firstHuman);
        System.out.println(secondHuman);
        System.out.println(thirdHuman);
        System.out.println(fourthHuman);
    }
}