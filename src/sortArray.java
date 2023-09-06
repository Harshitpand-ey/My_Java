public class sortArray {
    public static void sort(int x[], int size){
        int i,j;
        for(i=0;i<(size-1);i++){
            for(j=1;j<size;j++){
                if(x[i]>x[j]){
                    int temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={21,56,9,0,11,43,678,341,34,01};
        int size=10;
        sort(arr,size);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }


    }
}
