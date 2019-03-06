

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        List<Long> list = new ArrayList<Long>();
        while ((line = br.readLine()) != null) {
            long n = Long.parseLong(line.trim());
            list.add(n);
            Collections.sort(list);
            int size = list.size();
            if (size % 2 == 0) {
                size >>= 1;
                System.out.println((list.get(size) + list.get(size - 1)) / 2);
            } else {
                size >>= 1;
                System.out.println(list.get(size));
            }
        }
    }
}

