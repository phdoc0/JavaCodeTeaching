package BasicCode;
import java.util.*; 

public class JavaCollections {
    public static void main(String[] args) {

        List<String> aList =new ArrayList<String>();
        LinkedList<String> lList = new LinkedList<String>();

        Map map=new HashMap();
        Map<Integer,String> mapString =new HashMap<Integer,String>();

        Set<String> hash_Set = new HashSet<String>();

        List<String> list_string = new ArrayList<String>(); 
        list_string.add("red");
        list_string.add("green");

        System.out.println(list_string); //[red, green]
        for (String word : list_string){
            System.out.println(word);
    }

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("red");
        list_Strings.add("green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");


        System.out.println(list_Strings); //[red, green]

        for (String word : list_Strings){
        		System.out.println(word);
        }
        
    }
    
}
