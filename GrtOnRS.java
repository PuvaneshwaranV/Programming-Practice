import java.util.ArrayList;
class GrtOnRS {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(-1);
        int c = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (i == arr.length - 2) {
                arr1.add(arr[i + 1]);
                if (arr[i] < arr[i + 1])
                    c = arr[i + 1];
                else
                    c = arr[i];

            } else {
                arr1.add(c);
                if (c < arr[i])
                    c = arr[i];
            }
        }
        for (int i = arr1.size() - 1; i >= 0; i--) {
            arr2.add(arr1.get(i));
        }
        return arr2;
    }
    public static void main(String[] args)
    {
        int[] arr={50,40,30,20,10};
        ArrayList arr3=new ArrayList<>();
        arr3=nextGreatest(arr);
        for(int i=0;i<arr3.size();i++)
            System.out.print(arr3.get(i)+" ");
    }
}