import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



class BufRead{
    public static void main(String args[]) throws IOException{
        //ISR requires an obj of IS to be passed as argument.
        //Since System class already has on as "in", we pass that
        InputStreamReader in=new InputStreamReader(System.in);
        //BR accepts an object of input stream reader to be passed.
        // so above line is wirtten to get an obj and pass to BR
        //BR gives IO exception, during compilation, as below if not handled.
        // error: unreported exception IOException; must be caught or declared to be thrown
         BufferedReader br=new BufferedReader(in);
        int n=Integer.parseInt(br.readLine());
        String name=br.readLine();
        System.out.println(n+" "+name);
        br.close();
    }

}