// binary converter
public class SAMPLE1b {
    public void sampleMethod() {
        // initialise the variables
        String bits = "10000001";
        int a = 0;
        int b = 128;
        int i = 0;
        // loop 8 times
        while (i < 8) { 
            if(bits.charAt(i) == '1') {
                a = a + b;
            }
            if(bits.charAt(i) == '0') {
                a = a + 0;
            }  
            i = i + 1;
            b = b / 2;
        }
        // print the answer
        System.out.println(a);
    }
}
