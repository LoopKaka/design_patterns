package design_patterns.builder.solution4;

public class Employee {
    private String name;
    private String email;
    private String address;
    private int salary;
    private String skill;

    public Employee(Builder b) {
        this.name = b.name;
        this.email = b.email;
        this.address = b.address;
        this.salary = b.salary;
        this.skill = b.skill;
    }

    public static Builder build() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public String getSkill() {
        return skill;
    }

    static class Builder {
        private String name;
        private String email;
        private String address;
        private int salary;
        private String skill;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder setSkill(String skill) {
            this.skill = skill;
            return this;
        }

        private boolean validate() {
            if (this.salary > 2000 &&
                    this.skill.equalsIgnoreCase("java") &&
                    this.name.trim().length() > 3) {
                return true;
            }

            return false;
        }

        public Employee build() {
            if (!validate()) {
                throw new IllegalArgumentException("Invalid slary, skill and name");
            }
            return new Employee(this);
        }
    }
}
