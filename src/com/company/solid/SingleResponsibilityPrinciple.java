package com.company.solid;

import java.util.List;

public class SingleResponsibilityPrinciple {

    //Step 1 : Class Object

    public class Employee{

        public int id;
        public String name;
        public String email;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    }

    //Step 2 : Interface method :

    public interface  IEmployeeStore {
        public Employee findEmployeeById(int id, List<Employee> list);
        public void addEmployee(Employee employee, List<Employee> list);
    }

    public interface IEmployeeEmailSender{
        public void sendEmail(Employee employee, IEmailContent content);
    }

    public interface IEmailContent{

    }

    //Step 3 : Implement all interface method :
    public class ImlEmployeeStore implements  IEmployeeStore{

        @Override
        public Employee findEmployeeById(int id, List<Employee> list) {
            for (Employee empl: list) {
                if (empl.getId() == id){
                    return empl;
                }
            }
            return null;
        }

        @Override
        public void addEmployee(Employee employee, List<Employee> list) {
            list.add(employee);
        }
    }

    public class ImlEmailContent implements  IEmailContent{
        private String type;
        private String content;

        public ImlEmailContent(String type, String content) {
            this.type = type;
            this.content = content;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public class ImlEmployeeEmailSender implements IEmployeeEmailSender{

        @Override
        public void sendEmail(Employee employee, IEmailContent content) {
            System.out.println("Email is sending...");
        }
    }


    public static void main(String[] args) {
        // write your code here
        ImlEmailContent email = new ImlEmailContent("HTML", "");
    }

}
