package design_patterns.builder.solution3;

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

    public Employee(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Employee(String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public Employee(String name, String email, String skill) {
        this.name = name;
        this.email = email;
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
