package automationtest;

import java.util.ArrayList;

//program to declare arraylist and using foreach loop
public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
     //adding data to the list
        list.add("Scrum");
        list.add("Java");
        list.add("Jira");
        list.add("Selenium");
        list.add("Cucumber");
        list.add("Postman");
        list.add("Rest Assured");
        //using foreach loop to get the data from arraylist list
        for (String data :list)
        {
            System.out.println(data);
        }
    }

}
