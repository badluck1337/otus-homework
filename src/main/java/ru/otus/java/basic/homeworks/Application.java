package ru.otus.java.basic.homeworks;


import module java.base;

public class Application {
//1
    public static void main(String[] args) {
        List<Integer> numbers = method1(1, 10);
        System.out.println(numbers);

        System.out.println(method2(numbers));

        method3(3, numbers);
        System.out.println(numbers);

        method4(2, numbers);
        System.out.println(numbers);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Олег", 25));
        employees.add(new Employee("Маша", 30));
        employees.add(new Employee("Джон", 20));

        System.out.println(method5(employees));

        System.out.println(method6(employees, 25).size());

        System.out.println(method7(employees, 24));

        System.out.println(method8(employees).getName());

    }
    public static List<Integer> method1(int min, int max) {
        return IntStream.rangeClosed(min, max)
                .boxed()
                .collect(Collectors.toList());
    }


    public static int method2(List<Integer> list) {
        return list.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .sum();
    }


    public static void method3(int value, List<Integer> list) {
        Collections.fill(list, value);
    }


    public static void method4(int value, List<Integer> list) {
        IntStream.range(0, list.size())
                .forEach(i -> list.set(i, list.get(i) + value));
    }


    public static List<String> method5(List<Employee> employees) {
        return employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
    }


    public static List<Employee> method6(List<Employee> employees, int minAge) {
        return employees.stream()
                .filter(e -> e.getAge() >= minAge)
                .collect(Collectors.toList());
    }


    public static boolean method7(List<Employee> employees, int minAverageAge) {
        return employees.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0) > minAverageAge;
    }

    public static Employee method8(List<Employee> employees) {
        return employees.stream()
                .min(Comparator.comparingInt(Employee::getAge))
                .orElse(null);
    }
}
