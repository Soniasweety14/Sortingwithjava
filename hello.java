import java.util.Scanner;
    class hello{
        public static void show(int arr[],int l){ //printing array
            for(int i=0; i<l; i++){
                System.out.print(arr[i]+" , ");
            }
            System.out.println();
        }
        public static void bubble(int arr[], int l){
            System.out.println("Sorting by bubble sort");
            for(int i=0; i<l-1; i++){
                for(int j=0; j<l-1-i; j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            show(arr,l);
        }
        public static void selection(int arr[], int l){
            System.out.println("Sorting by selection sort");
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
        public static void insertion(int arr[],int l){
            System.out.println("Sorting by insetion sort");
            for(int i =1; i<l; i++){
                int j=i-1;
                while(j>=0 && arr[j+1]<arr[i]){
                    arr[j+1]=arr[i];
                    j--;
                }
                arr[j+1]=arr[i];
            }
            show(arr, l);
        }
        public static void counting(int arr[], int l){
            System.out.println("Sorting by Count sort");
            int largest = Integer.MIN_VALUE;
            for(int i=0; i<l; i++){
                largest= Math.max(largest, arr[i]);
            }
            int count[]= new int[largest+1];
            for(int i=0; i<l; i++){
                count[arr[i]]++;
            }
            int j=0;
            for(int i=count.length-1; i>=0; i--){
                while(count[i]<0){
                    arr[j]=i;
                    j++;
                    count[i]--;
                }
            }
            show(arr, l);
        }
        public static void main(String[] args) {
            int a[]={3,6,2,1,8,7,4,5,3,1};
            int l=a.length;
            System.out.println("Orignal array");
            show(a,l);
            bubble(a, l);
            selection(a,l);
            insertion(a, l);
            counting(a, l);

        }
}

