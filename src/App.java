import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    void send(String str){
        System.out.print(str);
    }
    void input() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String out = input.readLine();
    }
}
