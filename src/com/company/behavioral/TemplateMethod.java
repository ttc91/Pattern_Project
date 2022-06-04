package com.company.behavioral;

abstract class DoUong {
    void ChonNuoc(){
        System.out.println("\tChon nuoc soi");
    };

    abstract void ChoNguyenLieu();

    abstract void ChoDoUongVaoLy();

    abstract void ThemGiaVi();

    abstract void ThemDa();

    abstract void ThemTopping();

    final void CheBien() {
        ChonNuoc();
        ChoNguyenLieu();
        ChoDoUongVaoLy();
        ThemGiaVi();
        ThemDa();
        ThemTopping();
    }
}

class TraSua extends DoUong {

    @Override
    void ChoNguyenLieu() {
        System.out.println("\tThem tra va sua vao nuoc soi toi khuay deu");
    }

    @Override
    void ChoDoUongVaoLy() {
        System.out.println("\tCho tra sua vao ly danh cho tra");
    }

    @Override
    void ThemGiaVi() {
        System.out.println("\tThem duong den");
    }

    @Override
    void ThemDa() {
        System.out.println("\tThem da");
    }

    @Override
    void ThemTopping() {
        System.out.println("\tThem tran chau");
    }
}

class CaPhe extends DoUong {

    @Override
    void ChoNguyenLieu() {
        System.out.println("\tThem ca phe vao nuoc soi roi khuay deu");
    }

    @Override
    void ChoDoUongVaoLy() {
        System.out.println("\tCho ca phe vao ly danh cho ca phe");
    }

    @Override
    void ThemGiaVi() {
        System.out.println("\tThem duong");
    }

    @Override
    void ThemDa() {
        System.out.println("\tThem da");
    }

    @Override
    void ThemTopping() {

    }
}
public class TemplateMethod {
    public static void main(String[] args) {
        System.out.println("1 Cac buoc che bien ca phe");
        CaPhe caPhe = new CaPhe();
        caPhe.CheBien();

        System.out.println("2 Cac buoc che bien tra sua");
        TraSua traSua = new TraSua();
        traSua.CheBien();
    }
}
