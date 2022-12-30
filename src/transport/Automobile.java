package transport;

import java.time.LocalDate;

public class Automobile {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsAmount;
    private String typeTires;
    private Key key;

    public Automobile(String brand, String model, int productionYear, String productionCountry,
                      String color, double engineVolume, String transmission, String bodyType,
                      String registrationNumber, int seatsAmount) {
        if (brand.equals("Null") || brand.equals("") || brand.equals(" ")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.equals("Null") || model.equals("") || model.equals(" ")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry.equals("Null") || productionCountry.equals("") || productionCountry.equals(" ")) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color.equals("Null") || color.equals("") || color.equals(" ")) {
            this.color = "белого";
        } else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (transmission.equals("Null") || transmission.equals("") || transmission.equals(" ")) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType.equals("Null") || bodyType.equals("") || bodyType.equals(" ")) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber.equals("Null") || registrationNumber.equals("") || registrationNumber.equals(" ")) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (seatsAmount == 0) {
            this.seatsAmount = 5;
        } else {
            this.seatsAmount = seatsAmount;
        }
        if (LocalDate.now().getMonthValue() >= 4 && LocalDate.now().getMonthValue() <= 10) {
            this.typeTires = "летняя";
        } else {
            this.typeTires = "зимняя";
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTypeTires() {
        return typeTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public static class Key {
        private boolean remoteStart;
        private boolean keyLess;

        public Key(boolean remoteStart, boolean keyLess) {
            this.remoteStart = remoteStart;
            this.keyLess = keyLess;
        }
        public Key() {
            this(true, false);
        }
        public boolean isRemoteStart() {
            return remoteStart;
        }
        public boolean isKeyLess() {
            return keyLess;
        }

        @Override
        public String toString() {
            return ", удаленный запуск - " + remoteStart +
                    ", бесключевой доступ - " + keyLess;
        }
    }


    @Override
    public String toString() {
        return brand + " " + model + ", " + productionYear + " год выпуска," + " сборка в " + productionCountry +
                ", " + color + " цвета," + " объем двигателя - " + engineVolume + " л."
                + ", трансмиссия " + transmission + ", кузов " + bodyType + ", регистрационный номер " + registrationNumber +
                ", количество мест " + seatsAmount + ", " + typeTires + " резина" + key;
    }
}
