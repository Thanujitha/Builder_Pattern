package RealeTimeExample;


class Phone {

    private final String Brand;
    private final String Model;
    private final int Camera;
    private final int RAM;
    private final boolean NFC;
    private final double Price;
    private final double Display_Size;
    private final int Storage;

    private Phone(Builder builder) {
        this.Brand = builder.Brand;
        this.Model = builder.Model;
        this.Camera = builder.Camera;
        this.RAM = builder.RAM;
        this.NFC = builder.NFC;
        this.Price = builder.Price;
        this.Display_Size = builder.Display_Size;
        this.Storage = builder.Storage;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public int getCamera() {
        return Camera;
    }

    public int getRAM() {
        return RAM;
    }

    public boolean isNFC() {
        return NFC;
    }

    public double getPrice() {
        return Price;
    }

    public double getDisplay() {
        return Display_Size;
    }

    public int getStorage() {
        return Storage;
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() + " , Model: " + getModel() + " , Camara: " + getCamera() + " , RAM: " + getRAM() + " , NFC: " + isNFC()
                + " , Proce: " + getPrice() + " , Display Size" + getDisplay() + " , Starage: " + getStorage();
    }

    static class Builder {

        private String Brand;
        private String Model;
        private int Camera;
        private int RAM;
        private boolean NFC;
        private double Price;
        private double Display_Size;
        private int Storage;

        public Builder setBrand(String Brand) {
            this.Brand = Brand;
            return this;
        }

        public Builder setModel(String Model) {
            this.Model = Model;
            return this;

        }

        public Builder setCamera(int Camera) {
            this.Camera = Camera;
            return this;

        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;

        }

        public Builder setNFC(boolean NFC) {
            this.NFC = NFC;
            return this;

        }

        public Builder setPrice(double Price) {
            this.Price = Price;
            return this;
        }

        public Builder setDisplay_Size(double Display_Size) {
            this.Display_Size = Display_Size;
            return this;
        }

        public Builder setStorage(int Storage) {
            this.Storage = Storage;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}

public class MobilePhone {
    public static void main(String[] args) {
        Phone phone=new Phone.Builder()
                .setBrand("apple")
                .setCamera(12)
                .setDisplay_Size(24)
                .setModel("IPhone")
                .setNFC(true)
                .setPrice(12000)
                .setRAM(4)
                .setStorage(128)
                .build();
        
        System.out.println(phone);
    }
}
