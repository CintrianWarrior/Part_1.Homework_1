public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public String toString() {
        return brand + " " +  model + " Год выпуска - " + year + ". Сборка - " + country + ". Цвет кузова - " + color + ". Объем двигателя " + engineVolume;
    }
}
