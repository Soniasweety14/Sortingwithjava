import java.util.Scanner;
    class hello{
        public static void show(int arr[],int l){
            for(int i=0; i<l; i++){
                System.out.print(arr[i]+" , ");
            }
            System.out.println();
        }
        public static void bubble(int arr[], int l){
            for(int i=0; i<l-1; i++){
                int min=i;
                for(int j=i+1; j<l; j++){
                    if(arr[min]>arr[j]){
                        min=j;
                    }
                    int temp = arr[i];
                    arr[i]= arr[min];
                    arr[min]=temp;
                }
            }
            show(arr,l);
        }
        public static void main(String[] args) {
            int a[]={3,6,2,1,8,7,4,5,3,1};
            int l=a.length;
            show(a,l);
            bubble(a,l);

        }
}

