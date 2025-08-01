package javawrapperclass;

public class StringParsingDemo {
    public static void main(String[] args) {
        
        String intStr = "123";
        String doubleStr = "45.67";
        String booleanStr = "true";

        
        int parsedInt = Integer.parseInt(intStr);
        double parsedDouble = Double.parseDouble(doubleStr);
        boolean parsedBoolean = Boolean.parseBoolean(booleanStr);

        
        System.out.println("Parsed int value: " + parsedInt + " (Type: int)");
        System.out.println("Parsed double value: " + parsedDouble + " (Type: double)");
        System.out.println("Parsed boolean value: " + parsedBoolean + " (Type: boolean)");
    }
}

