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

}
