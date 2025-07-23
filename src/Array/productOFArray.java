package Array;

public class productOFArray {

    public static int[] arrayProduct(int arr[])
    {

        int productarray[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
           int product =1;
            for (int j = 0; j < arr.length; j++) {

                if(i!=j)
                {
                    product *=arr[j];

                }
            }
            productarray[i]=product;
        }
        return productarray;
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4};

        int[] product = arrayProduct(arr);
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i] +"\t");
        }


    }
}
