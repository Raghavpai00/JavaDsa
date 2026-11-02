package streams; 
import java.util.*;

public class DataFactory {

    // --- DOMAIN MODELS ---
    
    public static class Employee {
        private String name;
        private String department;
        private double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return String.format("Employee{name='%s', dept='%s', salary=%.2f}", name, department, salary);
        }
    }

    public static class Transaction {
        private String id;
        private String category;
        private double amount;

        public Transaction(String id, String category, double amount) {
            this.id = id;
            this.category = category;
            this.amount = amount;
        }

        public String getId() { return id; }
        public String getCategory() { return category; }
        public double getAmount() { return amount; }

        @Override
        public String toString() {
            return String.format("Transaction{id='%s', cat='%s', amt=%.2f}", id, category, amount);
        }
    }

    // --- RAW DATA REPOSITORIES ---

    public static List<Integer> getNumbersWithDuplicates() {
        return Arrays.asList(45, 12, 89, 12, 34, 45, 7, 89, 23, 4);
    }

    public static List<Integer> getRawNumbers() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public static List<String> getWordsList() {
        return Arrays.asList("apple", "banana", "apple", "cherry", "date", "banana", "fig", "elephant", "cat");
    }

    public static List<List<Integer>> getNestedNumbers() {
        return Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(3, 4, 5),
            Arrays.asList(6, 7, 1)
        );
    }

    public static List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee("Amit Singh", "IT", 85000),
            new Employee("Priya Sharma", "HR", 60000),
            new Employee("Rohan Verma", "IT", 120000),
            new Employee("Sneha Reddy", "Finance", 95000),
            new Employee("Vikram Malhotra", "HR", 55000),
            new Employee("Ananya Das", "Finance", 110000),
            new Employee("Rahul Joshi", "IT", 72000)
        );
    }

    public static List<Transaction> getTransactions() {
        return Arrays.asList(
            new Transaction("T1", "Electronics", 1200.50),
            new Transaction("T2", "Grocery", 150.75),
            new Transaction("T3", "Electronics", 450.00),
            new Transaction("T4", "Travel", 2500.00),
            new Transaction("T5", "Grocery", 85.20),
            new Transaction("T6", "Travel", 300.00)
        );
    }

    public static List<Integer> getListA() { return Arrays.asList(1, 2, 3, 4, 5); }
    public static List<Integer> getListB() { return Arrays.asList(4, 5, 6, 7, 8); }

public static void main(String args[]) {
	
}
}
