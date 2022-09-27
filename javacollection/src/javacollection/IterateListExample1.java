package javacollection;
import java.util.*;  
public class IterateListExample1  
{  
public static void main(String args[])   
{  
//defining a List  
List<String> city = Arrays.asList("Boston", "San Diego", "Las Vegas", "Houston", "Miami", "Austin");  

//iterate list using for loop  
city.forEach(games -> System.out.print(games+"\n"));
}  

}  