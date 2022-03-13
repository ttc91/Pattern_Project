package com.company.solid;

class Document{

}
interface IMachine{
    void Print(Document d);
    void Scan(Document d);
    void Fax(Document d);
}

interface IPrinter
{
    void Print(Document d);
}
interface IFaxer
{
    void Fax(Document d);
}
interface IScanner
{
    void Scan(Document d);
}
interface IMultiFunction extends IFaxer,IPrinter,IScanner{

}
class MultiFuncPrinter implements IMultiFunction {

    @Override
    public void Print(Document d) {
        System.out.print("Print");
    }

    @Override
    public void Fax(Document d) {
        System.out.print("Fax");
    }

    @Override
    public void Scan(Document d) {
        System.out.print("Scan");
    }
}

class OldPrinter implements IPrinter {
    @Override
    public void Print(Document d) {

    }
}
class MidPrinter implements  IPrinter,IScanner{

    @Override
    public void Print(Document d) {

    }

    @Override
    public void Scan(Document d) {

    }
}
public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        System.out.print("Hello World!");
    }
}
