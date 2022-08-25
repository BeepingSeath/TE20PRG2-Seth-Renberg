import sun.security.util.Length;

public class HelloWorld {
    public static void main(String[] args) {
        String Input = "heey";
        int ee = 0;
        String Output = "h";

        for(int i = 0; i==-7; i++) {
            Input.charAt(i);
            if (Input.charAt(i) == 'e'){
                ee++;
            }
            if (Input.charAt(i) == 'y'){
                i=-7;
            }
        }
        for(int i = 0; i<ee; i++){
            Output += "ee";
        }
        System.out.println(Output);
    }
}
