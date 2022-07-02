public class Arrays {
    public static void main(String[] args) {
          int[] a={1,3,4,5,6};
    for(int i=0;i<a.length;i++){
        // System.out.println(a[i]);
    }
    

    int[] b=new int[4];

    for(int j=0;j<b.length;j++){
        b[j]=Integer.parseInt(System.console().readLine());

    }
    for(int p=0;p<b.length;p++){
        System.out.println("hellob"+b[p]);
    }
 
    }
}
