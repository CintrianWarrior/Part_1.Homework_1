public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.length() == 0) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.length() == 0) {
            this.model = "Default";
        } else {
            this.model = model;
        }

        if (country == null || country.length() == 0) {
            this.country = "Default";
        } else {
            this.country = country;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.length() == 0) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public String toString() {
        return brand + " " +  model + " Год выпуска - " + year + ". Сборка - " + country + ". Цвет кузова - " + color + ". Объем двигателя " + engineVolume;
    }
}
