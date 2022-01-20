import java.util.Date;
import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal() {
        int sum = 0 ;
        for (int i=1; i<=10; i++){
            sum += i;
        }
        return sum;
    }
    

    
    public double getOrderTotal(double[]prices) {
        double sum = 0 ;
        for (double price : prices){
            sum += price;
        }
        return sum;
    }
    
    public void displayMenu(ArrayList<String> menuItems) {

        for(int i =0; i < menuItems.size(); i++) {
            System.out.println(menuItems);
        }
    }
    
    

    public ArrayList<String> addCustomer(ArrayList<String> customers) {

        String userName = System.console().readLine("Please enter your name: ");
        System.out.printf("Hello, " + userName);
        System.out.printf("There are " + customers.size() + " people in front of you");
        customers.add(userName);

        for(int i=0; i<customers.size(); i++) {
            System.out.print(customers);
        }

        return customers;

    }

}