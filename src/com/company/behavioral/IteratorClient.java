package com.company.behavioral;

import java.util.ArrayList;
import java.util.List;

class Student{
    private int id;
    private String name;
    private String major;

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }
    @Override
    public String toString() {
        return "id:" + id + " Name:" + name +" Major:" + major;
    }
}
interface Iterator{
    Object next();
    boolean hasNext();
}
interface IterableCollection{
    Iterator createIterator();
}
class ConcreteCollection implements IterableCollection{

    private List<Student> studentList = new ArrayList<>();
    public void addStudent(Student student){
        studentList.add(student);
    }
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }
    private class ConcreteIterator implements Iterator{
        int i = 0;
        @Override
        public Object next() {
            if(this.hasNext()){
                return studentList.get(i++);
            }
            return null;
        }
        @Override
        public boolean hasNext() {
            if(i < studentList.size()){
                return true;
            }
            return false;
        }
    }
}

public class IteratorClient {
    public static void main(String[] args) {
        Student s1 = new Student(0,"Nguyen Van A", "CNTT");
        Student s2 = new Student(1,"Nguyen Van B", "CNOT");

        ConcreteCollection concreteCollection = new ConcreteCollection();
        concreteCollection.addStudent(s1);
        concreteCollection.addStudent(s2);

        Iterator iterator = concreteCollection.createIterator();
        while (iterator.hasNext()){
            Object student = iterator.next();
            System.out.println(student);
        }
    }
}
