public class bubblesort {
    public static void main(String[] args) {
        int[] arr1={6,3,8,4,9,5,1,3};

        int l= arr1.length;
        for(int i=0;i<=l-1;i++){
            for(int j=i+1;j<=l-1;j++){
                if(arr1[i]>arr1[j]){
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                    //System.out.println(arr1[]);
                }

            }
            for(int k=0;k<=l-1;k++){
                System.out.println(arr1);
            }
        }
    }
}
