package javadatatypes;

public class DefaultValues {

    
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    
    public void printDefaults() {
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: [" + c + "]"); // char defaults to '\u0000'
        System.out.println("boolean: " + bool);
    }

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        obj.printDefaults();
    }
}

