import com.sun.deploy.util.StringUtils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 돌던지기 {

    static List<String> similar_val(List<String> answers){
        List<String> result = new LinkedList<>();

        for(String answer : answers){
            int similar_val = 0;
            for (String distance : answer.split(" ")) {
                Math.abs(Integer.valueOf(distance));

            }
        }


        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case_cnt = br.read();
        List<String> answers = new ArrayList<>();

        for(int i = 0 ; i < test_case_cnt ; i++){
            int rock_throws_humans = br.read();
            String temp = "";
            for(int j = 0 ; j < rock_throws_humans ; j++){
                temp += br.readLine();
            }
            answers.add(String.join(temp," "));
        }

    }
}
