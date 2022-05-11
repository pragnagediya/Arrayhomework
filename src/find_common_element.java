public class find_common_element {
    public static void main(String[] args) {

        int[] a = {10,20,30,45,60};
        int[] b = {20,30,40,50,60};
        int i,j;
        for (i=0;i< a.length;i++){
            for (j=0;i< b.length;j++)
            {
                if(a[i]==b[j]){
                    System.out.println(a[i]+" ");
                }
            }
        }
    }

}
