package automationtest;
//program to display if given age falls under Teenage or not
public class IfThenElse_Q3 {


    public boolean isTeen(int age) {
        if (age <= 18)

            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        IfThenElse_Q3 obj = new IfThenElse_Q3();
        System.out.println( " 15 " + " - " +  obj.isTeen(15));
        System.out.println(" 25 " + " - " + obj.isTeen(25));
    }
}
