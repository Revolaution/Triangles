
public class Triangle {

    public static void main(String[] args) {
        drawAsterisk();
        drawHorizontalLine(8);
        drawVerticalLine(3);
        drawRightTriangle(5);
        drawIsoscelesTriangle(5);
    }

    public static void drawAsterisk(){
        System.out.println("*");
    }

    public static void drawHorizontalLine(int length){
        for (int i = 0; i < length; i++){
            System.out.print("*");
        }
    }

    public static void drawVerticalLine(int height){
        for (int i = 0; i < height; i++){
            System.out.println("*");
        }
    }

    public static void drawRightTriangle(int base){
        for (int i = 1; i < (base + 1); i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void drawIsoscelesTriangle(int numOfRows){
        for (int i = 1; i < (numOfRows + 4); i += 2){
            for (int k = 0; k < (4 - (i / 2)); k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
