public class remove_element_from_array {
    public static void main(String[] args) {
        int[] a = {10, 32, 45, 22, 25, 11, 34};
        int b = 45;
        remove_element_from_array.toRemoveElement(a ,b);
    }
    public static void toRemoveElement(int[]a,int b){
        int[]j=a;
        int k=b;
        System.out.println("before Removing the element");
        for (int i=0;i<j.length;i++){
            System.out.println(j[i]+" ");
            if(j[i]==k){
                j[i]=j[i+1];
                j[i+1]=0;
            }}
            System.out.println("After removing the element"+k);
            for (int i =0;i<j.length;i++){
                System.out.println(j[i]+" ");
            }
        }
     }

