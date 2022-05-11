public class maxandminvalue {
    public static void main(String[] args) {
        int a[]={50,40,35,56,83};
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
                max =a[i];
            }
        }
        System.out.println("max element is array is;"+max);
    }
}
