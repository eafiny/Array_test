public class Array {
    public static int[] getArrayAfterLast4(int[] arr){
        int index = 0;
        boolean flag = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 4) {
                index = j;
                flag = true;
                System.out.println(index);
            }
        }
        if (!flag) {throw new RuntimeException();}
        int[] returnArr = new int[arr.length - index - 1];
        System.out.println(returnArr.length);
        for (int j = index +1; j < arr.length; j++) returnArr[j - index -1] = arr[j];
        return returnArr;
    }

    public static boolean checkArrayConsistsOf1And4(int[] arr){
        boolean flag1 = false;
        boolean flag4 = false;

        for (int i:arr){
            if (i == 1) {
                flag1 = true;
            }else if (i== 4){
                flag4 = true;
            }else {
                return false;
            }
        }
        if (flag1 && flag4){
            return true;
        } else return false;
    }
}
