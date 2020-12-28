import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class letterGrade {
    @Test
    public void letterGradetest() {
        char level = letterGrade(-1);
        assertEquals('X',level);
        level = letterGrade(101);
        assertEquals('X',level);
        level = letterGrade(0);
        assertEquals('F',level);
        level = letterGrade(10);
        assertEquals('F',level);
        level = letterGrade(20);
        assertEquals('F',level);
        level = letterGrade(30);
        assertEquals('F',level);
        level = letterGrade(40);
        assertEquals('F',level);
        level = letterGrade(50);
        assertEquals('F',level);
        level = letterGrade(60);
        assertEquals('D',level);
        level = letterGrade(70);
        assertEquals('C',level);
        level = letterGrade(80);
        assertEquals('B',level);
        level = letterGrade(90);
        assertEquals('A',level);
        level = letterGrade(100);
        assertEquals('A',level);
    }

    @Test
    public void letterGradetest2() {
        char level = letterGrade(-1);
        assertEquals('X',level);
        level = letterGrade(101);
        assertEquals('X',level);
        level = letterGrade(0);
        assertEquals('F',level);
        level = letterGrade(10);
        assertEquals('F',level);
        level = letterGrade(59);
        assertEquals('F',level);
        level = letterGrade(60);
        assertEquals('D',level);
        level = letterGrade(69);
        assertEquals('D',level);
        level = letterGrade(70);
        assertEquals('C',level);
        level = letterGrade(79);
        assertEquals('C',level);
        level = letterGrade(80);
        assertEquals('B',level);
        level = letterGrade(89);
        assertEquals('B',level);
        level = letterGrade(90);
        assertEquals('A',level);
        level = letterGrade(99);
        assertEquals('A',level);
        level = letterGrade(100);
        assertEquals('A',level);
    }

    public  static char letterGrade(int score){
        char grade;
        if(score<0 || score >100)
            grade = 'X';
        else if(score>=90 && score <= 100)
            grade = 'A';
        else if(score>=80 && score < 90)
            grade = 'B';
        else if(score>=70 && score < 80)
            grade = 'C';
        else if(score>=60 && score < 70)
            grade = 'D';
        else
            grade = 'F';
        return grade;
    }

    public static void main(String[] args) {
        System.out.print("Enetr the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int score = Integer.parseInt(br.readLine());
            char grade = letterGrade(score);
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.println("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}