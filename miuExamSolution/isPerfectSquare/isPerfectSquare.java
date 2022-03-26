package miuExamSolution.isPerfectSquare;

/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class isPerfectSquare {
    public static void main(String[] args) {
        int reslut = isPerfectSquare(36);
        System.out.println("The next perfect squareNo:" + reslut);
    }

    static int isPerfectSquare(int num) {
        double squareNo = Math.sqrt(num);
        int floorval = (int) Math.floor(squareNo);
        int nextvale = floorval + 1;
        int nextPefectSquare = 0;

        if (num < 0) {
            return 0;
        } else if (num == 0) {
            return 1;
        } else {
            nextPefectSquare = nextvale * nextvale;
            return nextPefectSquare;
        }
    }
}
