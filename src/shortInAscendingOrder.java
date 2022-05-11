public class shortInAscendingOrder {
    public static void main(String[] args) {
        //define array
        int temp;
        int m[] = {25,10,22,5,11};
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if (m[i]>m[j])
                {
                    temp = m[i];
                    m[i]= m[j];
                    m[j]= temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(m[i]+ "");
        }

    }
}
