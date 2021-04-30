public class heidiguishugaodu {
    //非递归求二叉树的高度
    public static void main(String[] args) {
        int[] a = new int[]{7,6,0,8,5,8};
        int k = 2;
        quicksort(a, 0, a.length - 1);
        System.out.println(a[a.length - k + 1]);
        for(int c : a){
            System.out.println(c);
        }
    }
    public static void quicksort(int[] arr, int l, int r){
        if(l < r){
            int q = sort(arr, l, r);
            quicksort(arr, l, q - 1);
            quicksort(arr, q + 1, r);
            }
    }
    public static int sort(int[] arr, int l, int r){
        int key = arr[l];
        while(l < r){
            while (key < arr[r] && l < r){
                r--;
            }
            if(l < r){
                arr[l] = arr[r];
            }
            while(key >= arr[l] && l < r){
                l++;
            }
            if(l < r){
                arr[r] = arr[l];
            }
        }
        arr[l] = key;
        return l;
    }
}
