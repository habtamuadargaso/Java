package miuExamSolution;

public class removeDuplicateItem {
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        int[] sample = { 1, 1, 2, 3, 4, 5, 6, 7, 7 };
        int[] result = RemoveDuplicateItem(sample);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    static int[] RemoveDuplicateItem(int[] givenArry) {

        if (givenArry == null || givenArry.length == 0) {
            return givenArry;
        } else {
            int[] output = new int[givenArry.length];
            int counter = 0;
            boolean isDuplicate = false;
            for (int i = 0; i < givenArry.length; i++) {
                isDuplicate = false;
                for (int j = 0; j < givenArry.length; j++) {
                    if (givenArry[i] == output[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate == false) {
                    output[counter] = givenArry[i];
                    counter++;
                }
            }

            if (counter == output.length) {
                return givenArry;
            } else {
                int[] filerArray = new int[counter];
                for (int x = 0; x < filerArray.length; x++) {
                    filerArray[x] = output[x];
                }
                return filerArray;
            }

        }
    }
}
