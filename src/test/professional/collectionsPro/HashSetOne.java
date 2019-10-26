package test.professional.collectionsPro;

import java.util.HashSet;
import java.util.Set;

public class HashSetOne {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("Sqd", 21));
        employees.add(new Employee("Jd", 21));
        employees.add(new Employee("Sqds", 21));
        employees.add(new Employee("an", 21));
        System.out.println(employees);
    }

    private static class Employee {
        String name;
        int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode() {
            return name.length();
        }

        @Override
        public boolean equals(Object obj) {
            return age == ((Employee) obj).age;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
