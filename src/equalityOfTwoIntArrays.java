import java.util.Arrays;

public class equalityOfTwoIntArrays {
    public static void main(String[] args) {
        //difine array
        int x[]={100,200,300,400,500};
        int y[]={100,200,300,400,500};
       boolean stutus= Arrays.equals(x,y);
       //condition
        if(stutus==true)
        {System.out.println("Array are equal");}
        else
        {System.out.println("Array are not equal");}
    }
}
