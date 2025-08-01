package javawrapperclass;

public class WrapperConversionDemo {
    public static void main(String[] args) {
        
        int intPrimitive = 10;
        char charPrimitive = 'A';

        
        Integer intWrapper = Integer.valueOf(intPrimitive);
        Character charWrapper = Character.valueOf(charPrimitive);

        
        int intUnboxed = intWrapper.intValue();
        char charUnboxed = charWrapper.charValue();

        
        System.out.println("Original int: " + intPrimitive);
        System.out.println("Integer Wrapper: " + intWrapper);
        System.out.println("Unboxed int: " + intUnboxed);

       
        System.out.println("Original char: " + charPrimitive);
        System.out.println("Character Wrapper: " + charWrapper);
        System.out.println("Unboxed char: " + charUnboxed);
    }
}

