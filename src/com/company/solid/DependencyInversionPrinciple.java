package com.company.solid;
import java.util.ArrayList;
import java.util.List;

abstract class Employees {
    abstract public void work();
}

class Manager {
    List<Employee> employees;

    public Manager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

class Developer extends Employees {
    public Developer() { }
    @Override
    public void work() {
        System.out.println("Developer starting for work");
    }
}

class BusinessAnalysis extends Employees {
    public BusinessAnalysis() { }
    @Override
    public void work() {
        System.out.println("QA starting for work");
    }
}

class Tester extends Employees {
    public Tester() {}
    @Override
    public void work() {
        System.out.println("Tester starting for work");
    }
}
public class DependencyInversionPrinciple {
}
