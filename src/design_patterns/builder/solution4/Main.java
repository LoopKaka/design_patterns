package design_patterns.builder.solution4;

public class Main {
    public static void main(String[] args) {
        Employee e = Employee.build()
                .setName("LoopKaka")
                .setEmail("abc@gmail.com")
                .setAddress("India")
                .setSalary(3000)
                .setSkill("java")
                .build();

        System.out.println(e.getName() + " - " + e.getEmail() + " - " + e.getAddress());
    }
}
