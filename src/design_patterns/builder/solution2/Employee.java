package design_patterns.builder.solution2;

public class Employee {
    private final String name;
    private final String email;
    private final String address;
    private final int salary;
    private final String skill;

    public Employee(String name, String email, String address, int salary, String skill) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.salary = salary;
        this.skill = skill;
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
}
