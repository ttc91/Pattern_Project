package com.company.structural;

import java.util.HashMap;
import java.util.Map;

enum PlatformType{
    JAVA,
    C_PLUS,
    PYTHON,
    RUBY
}

/**
 *  <b>Parameter</b>
 */

class Code {

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

/**
 * <b>Flyweight</b>
 */

interface Platform {

    public void execute(Code code);

}

/**
 * <b>Concrete Flyweight</b>
 */

class JavaPlatform implements Platform {

    public JavaPlatform(){
        System.out.println("Java Platform object is created ");
    }

    @Override
    public void execute(Code code) {
        System.out.println("System.out.println (" + code.getCode() + ");");
    }
}

class PythonPlatform implements Platform {

    public  PythonPlatform(){
        System.out.println("Python Platform object is created ");
    }

    @Override
    public void execute(Code code) {
        System.out.println("print (" + code.getCode() + ")");
    }
}

class RubyPlatform implements Platform {

    public RubyPlatform(){
        System.out.println("Ruby Platform object is created ");
    }

    @Override
    public void execute(Code code) {
        System.out.println("puts (" + code.getCode() + ");");
    }
}

class CPlusPlatform implements Platform {

    public CPlusPlatform(){
        System.out.println("C++ Platform object is created ");
    }

    @Override
    public void execute(Code code) {
        System.out.println("cout << " + code.getCode() + " << endl;");
    }
}

/**
 * <b>Flyweight Factory</b>
 */

final class PlatformFactory {

    private static Map<String, Platform> map = new HashMap<>();

    private PlatformFactory(){
        throw new AssertionError("Cannot instantiate the class");
    }

    public static synchronized Platform getPlatformInstance(PlatformType type){

        Platform platform = map.get(type);

        if(platform == null){
            switch (type) {

                case JAVA: platform = new JavaPlatform();
                break;

                case RUBY: platform = new RubyPlatform();
                break;

                case C_PLUS: platform = new CPlusPlatform();
                break;

                case PYTHON: platform = new PythonPlatform();
                break;
            }
        }

        return platform;

    }


}

public class Flyweight {

    public static void main(String[] args) {
        // write your code here

        Code code = new Code();
        code.setCode("Hello world !");

        //Java :
        Platform platform = PlatformFactory.getPlatformInstance(PlatformType.JAVA);
        platform.execute(code);

        System.out.println("\n-------------------------------\n");

        platform = PlatformFactory.getPlatformInstance(PlatformType.C_PLUS);
        platform.execute(code);

        System.out.println("\n-------------------------------\n");

        platform = PlatformFactory.getPlatformInstance(PlatformType.PYTHON);
        platform.execute(code);

        System.out.println("\n-------------------------------\n");

        platform = PlatformFactory.getPlatformInstance(PlatformType.RUBY);
        platform.execute(code);

        System.out.println("\n-------------------------------\n");
    }

}
