package BuilderPatternOOP;

public class User {
    private final String firstName;
    private final String lastName;
    private String middleName;
    private final String email;
    private String phone;
    private String password;
    private String sex;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public static final class Builder {
        private final String fName;
        private final String lName;
        private String mName;
        private final String email;
        private String phone;
        private String password;
        private String sex;

        public Builder(String fName, String lName, String email) {
            this.fName = fName;
            this.lName = lName;
            this.email = email;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setmName(String mName) {
            this.mName = mName;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    private User(Builder builder) {
        this.firstName = builder.fName;
        this.lastName = builder.lName;
        this.email = builder.email;
        this.password = builder.password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}