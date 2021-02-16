package BasicCode;

public class Loops {

    public static void main(String []args) 
    { 

        //while loop
 
        int g = 1; 
        while(g <= 5) //termination sequence 
        {
            System.out.println("Values of g =" + g);
            g++;//term 
        

        }


        //for loop
        //int i = 0;
        for(int i = 0; i <= 4; i++)
        {
            System.out.println("The values of i = " + i);
            
        }


        //do while loop
        int x = 1;
        do
        { 
             
            System.out.println("Value of x:" + x); 
            x++;
            
        } 
        while (x <= 5); 
        
        //for each loop

        int[] numbers = {3, 6, 9, -5};
        for(int num: numbers)
        {
            System.out.println("Current Num is: " + num);
        }
    } 
    
}
