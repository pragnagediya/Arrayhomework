public class countTotalNumberOfaInString {
    public static void main(String[] args) {
        String a = "my name is pragna";
       //total length
       int totalcount= a.length();
       //after removing
        int totalcount_afterremove=(a.replace("a","")).length();
        int count=totalcount-totalcount_afterremove;

        System.out.println("number occurances of a is:"+count);

    }
}
