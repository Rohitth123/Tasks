package javawrapperclass;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingUnboxingDemo {
    public static void main(String[] args) {
        
        List<Double> marks = new ArrayList<>();

        
        marks.add(85.5);
        marks.add(78.0);
        marks.add(92.25);
        marks.add(69.75);
        marks.add(88.0);

        
        double sum = 0.0;
        for (Double mark : marks) {
            sum += mark; 
        }

       
        double average = sum / marks.size();

        
        System.out.println("Marks: " + marks);
        System.out.println("Total Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

