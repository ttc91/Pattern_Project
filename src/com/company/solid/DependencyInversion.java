package com.company.solid;

import java.util.*;

public class DependencyInversion {
    public enum Relationship{
        Parent, Child, Sibling
    }

    public static class Person{
        private String name;
        private Relationship relationship;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Relationship getRelationship() {
            return relationship;
        }

        public void setRelationship(Relationship relationship) {
            this.relationship = relationship;
        }
    }

    public interface IAdder{
        void  AddParentAndChildren(Person parent, Person child);
    }

    public interface IRelationShip
    {
        List<Person> FindAllChildOf(String name);
    }

    public interface IRelationAdder extends IAdder, IRelationShip
    {

    }

    public static class RelationShipFamily implements IRelationAdder {

        @Override
        public void AddParentAndChildren(Person parent, Person child) {

        }

        @Override
        public List<Person> FindAllChildOf(String name) {
            return null;
        }
    }

    public static class Explorer
    {
        public void findRelationParent(IRelationShip relationshipfamily)
        {
            for (Person p : relationshipfamily.FindAllChildOf("Phung")){
                System.out.println("Phung has a child call " + p.name);
            }
        }
    }
    public static void main(String[] args) {
        IRelationAdder relationshipfamily = new RelationShipFamily();
        Person phung = new Person();
        phung.name = "Phung";
        phung.relationship = Relationship.Parent;
        Person nhat = new Person();
        nhat.name = "Nhat";
        nhat.relationship = Relationship.Child;

        relationshipfamily.AddParentAndChildren(phung, nhat);

        Explorer exp = new Explorer();
        exp.findRelationParent(relationshipfamily);
    }
}