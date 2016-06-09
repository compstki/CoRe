// This program converts a binary number to decimal

public class SAMPLE1
{
    public void sampleMethod()
    {
       // The 8 bit number to be converted 
       String bits = "10000001";
       
       // to store the final value
       int total = 0;
       // the highest binary place value
       int power = 128;

       // loop for each bit in the byte left to right
       for (int index = 0; index < 8; index++) {
           
           // check if it is a 1 ..
           if(bits.charAt(index) == '1')
           {
               // .. add the place value to the total
               total = total + power;
            }
            
            // calculate the next place value
            power = power / 2;
        }
        
        // display final result
        System.out.println(total);
    }
}
