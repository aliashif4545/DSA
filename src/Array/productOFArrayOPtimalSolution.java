package Array;

public class productOFArrayOPtimalSolution {

    public static int[] arrayProduct(int arr[])
    {

        int result[] = new int[arr.length];
           result[0]=1;
        for (int i = 1; i < arr.length; i++) {

            result[i] = result[i-1]*arr[i-1];
        }
        int suffix =1;
        for (int i = arr.length-2; i >=0 ; i--) {
            suffix = suffix*arr[i+1];
             result[i] = result[i]*suffix;


        }
        return result;

    }
    public static int[] Product(int arr[])
    {

        int result[] = new int[arr.length];
        result[0]=1;
        int sum=1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

               if(i!=j) {
                   sum = sum * arr[j];
               }
            }
            result[i] = sum;
            sum=1;
        }

        return result;

    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4};

        int[] product = arrayProduct(arr);

        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i] +"\t");
        }

        int[] product1 = Product(arr);

        for (int i = 0; i < product1.length; i++) {
            System.out.println(product1[i] +"\t");
        }


    }
}
