import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str = st.nextToken();

            switch(str){
                case "push_back":
                    int num = Integer.parseInt(st.nextToken());
                    arr.add(num);
                    break;
                case "pop_back":
                    arr.remove(arr.size()-1);
                    break;
                case "size":
                    System.out.println(arr.size());
                    break;
                case "get":
                    int num2 = Integer.parseInt(st.nextToken());
                    System.out.println(arr.get(num2-1));
                    break;
            }

        }
    }
}