package miueternacexam;

public class isPerfectSquare {
    public static void main(String[] args) {
        int reslut = isPerfectSquare_next(35); //Integer.parseInt(args[0])
        System.out.println("The next perfect squareNo:" + reslut);
    }
     
    private static int isPerfectSquare_next(int num) {
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
