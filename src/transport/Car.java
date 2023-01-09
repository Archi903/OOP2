package transport;

public class Car {
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
    private boolean  typeTires;
    private Key key;

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VALUE = 1.5;
    private static final String DEFAULT_COLOR = "белый";
    private static final int DEFAULT_YEAR = 2000;
    private static final int DEFAULT_SEATS = 5;


    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int seatsAmount, boolean typeTires, boolean remoteStart, boolean keyless) {


        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        setColor(color);
        if (productionYear <= 0) {
            this.productionYear = DEFAULT_YEAR;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = DEFAULT_VALUE;
        } else {
            this.productionCountry = productionCountry;
        }
        setTransmission(transmission);
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = bodyType;
        }
        setRegistrationNumber(registrationNumber);
        if (seatsAmount <= 0) {
            this.seatsAmount = DEFAULT_SEATS;
        } else {
            this.seatsAmount = seatsAmount;
        }
        this.typeTires = typeTires;
        setKey(remoteStart, keyless);
    }

    class Key {
        private final boolean remoteStart;
        private final boolean keyless;

        public Key(boolean remoteStart, boolean keyless) {
            this.remoteStart = remoteStart;
            this.keyless = keyless;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeyless() {
            return keyless;
        }

        @Override
        public String toString() {
            return ", удаленный запуск = " + remoteStart +
                    ", бесключевой доступ = " + keyless;
        }
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getColor() {
        return color;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VALUE;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = DEFAULT_VALUE;
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = DEFAULT_VALUE;
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public boolean isTypeTires() {
        return typeTires;
    }

    public void setTypeTires(boolean typeTires) {
        this.typeTires = typeTires;
    }

    public void changeTires (int month) {
        if (month >= 4 && month <= 10){
            setTypeTires(true);
        }else {
            setTypeTires(false);
        }
    }
    public void setKey (Boolean keyless, Boolean remoteStart){
            this.key = new Key(keyless, remoteStart);
    }

    @Override
    public String toString() {
        return "Машина: " +
                "брэнд = " + brand + '\'' +
                ", модель = " + model + '\'' +
                ", мощность двигателя = " + engineVolume +
                ", цвет = " + color + '\'' +
                ", год производства = " + productionYear +
                ", страна производства = " + productionCountry + '\'' +
                ", трансмиссия = " + transmission + '\'' +
                ", тип кузова = " + bodyType + '\'' +
                ", регистрационный номер = " + registrationNumber + '\'' +
                ", количество мест = " + seatsAmount +
                ", летние шины = " + typeTires +
                ", key=" + key;
    }
}
