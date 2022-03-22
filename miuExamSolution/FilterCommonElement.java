package miuExamSolution;

public class FilterCommonElement {
    public static void main(String[] args) {

        int[] sampleData_1 = { 1, 2, 3, 6, 9, 6 };
        int[] sampleData_2 = { 1, 2, 9, 8, 7 };
        int[] result = FiltercommonElement(sampleData_1, sampleData_2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    static int[] FiltercommonElement(int[] firstArray, int[] seconddArray) {
        int[] output = {};
        if (firstArray == null || seconddArray == null) {
            return null;
        } else if (firstArray.length == 0 || seconddArray.length == 0) {
            return output;
        } else {
            int commonElementArraySize;
            if (firstArray.length > seconddArray.length) {
                commonElementArraySize = seconddArray.length;
            } else {
                commonElementArraySize = firstArray.length;
            }
            int[] commonElement = new int[commonElementArraySize];
            int counter = 0;
            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < seconddArray.length; j++) {
                    if (firstArray[i] == seconddArray[j]) {
                        commonElement[counter] = firstArray[i];
                        counter++;
                    }
                }
            }
            if (counter == commonElementArraySize) {
                return commonElement;
            } else {
                int[] finalCommomElement = new int[counter];
                for (int x = 0; x < finalCommomElement.length; x++) {
                    finalCommomElement[x] = commonElement[x];
                }
                return finalCommomElement;
            }
        }
    }
}