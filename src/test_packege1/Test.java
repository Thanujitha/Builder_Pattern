package test_packege1;


class User {

    private final int id;
    private final String name;
    private final String mobile;

    private User(User.Builder bilder) {
        this.id = bilder.id;
        this.name = bilder.name;
        this.mobile = bilder.mobile;
    }  

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + " , Name: " + getName() + " , Mobile: " + getMobile();
    }

    static class Builder {

        private int id;
        private String name;
        private String mobile;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        
        public User build(){
            return new User(this);
        }

    }

}

public class Test {

    public static void main(String[] args) {
      User user = new User.Builder().setId(1).setName("Tester").setMobile("075685956").build();
      
        System.out.println(user);
    }

}
