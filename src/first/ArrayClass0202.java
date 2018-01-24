package first;

import static first.ArrayClass0201.getScore;
import java.util.Scanner;

public class ArrayClass0202 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numofstd;
        char grade;
        double[][] scores;
        double best;

        System.out.println("Enter the number of Student : ");
        numofstd = sc.nextInt();

        scores = new double[numofstd][3];
        for(int i=0;i<numofstd;i++){
            System.out.println("input scores of student "+i+"midterm final assignment : ");
            scores[i][0] = sc.nextDouble();
            scores[i][1] = sc.nextDouble();
            scores[i][2] = sc.nextDouble();
        }
        System.out.println("midterm\tfinal\tassiment\tTotal");
        for(int i=0;i<numofstd;i++){
            System.out.println(i+": "+scores[i][0]+"\t\t"+scores[i][1]
                    +"\t"+scores[i][2]+"\t"+(scores[i][0]+scores[i][1]+scores[i][2]));
        }
    }
}
