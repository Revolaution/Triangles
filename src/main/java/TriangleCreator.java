/**
 * Created by ryanlau on 2/19/16.
 */
public class TriangleCreator {

    public void easiestExercise(){
        System.out.println("*");
    }

    public void horizontalLine(int length){
        for (int i = 0; i < length; i++){
            System.out.print("*");
        }
    }

    public void verticalLine(int height){
        for (int i = 0; i < height; i++){
            System.out.println("*");
        }
    }

    public void rightTriangle(int base){
        for (int i = 1; i < (base + 1); i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void isoscelesTriangle(int numOfRows){
        int counter = 0;
        while (counter < numOfRows){
            for (int i = 1; i < (numOfRows + 4); i += 2){
                for (int k = 0; k < (2 - (i / 2)); k++){
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++){
                    System.out.print("*");
                }
                System.out.println("");
                counter ++;
            }
        }
    }
}
