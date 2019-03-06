

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder("");
        String m = "";
        while (true) {
            m= br.readLine();
            char[] arr = m.toCharArray();
            if ("#".equals(m)) {
                break;
            }
            int indexMin = -1, indexMax = -1;
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i - 1] < arr[i]) {
                    indexMin = i - 1;
                    break;
                }
            }
            if (indexMin != -1) {
                for (int i = arr.length - 1; i > -1; i--) {
                    if (arr[i] > arr[indexMin]) {
                        indexMax = i;
                        break;
                    }
                }
                char temp;
                temp = arr[indexMax];
                arr[indexMax] = arr[indexMin];
                arr[indexMin] = temp;

                for (int i = indexMin + 1, j = arr.length - 1; i < j; i++, j--) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                sb.append(new String(arr)).append("\n");
            } else {
                sb.append("No Successor").append("\n");
            }
        }
        System.out.print(sb);
    }
}


514--rails

#include<cstdio>
#include<stack>
 
using namespace std;
 
int N, c;
stack<int> cars;
 
void marshal() {
    for(;;) {
        while(cars.size() > 0) cars.pop();
        int j = 0;
        for(int i = 0; i < N; i++) {
            scanf("%d", &c);
            if(c == 0) return;
 
            while(j < N && j != c) {
                if(cars.size() > 0 && cars.top() == c) break;
                j++;
                cars.push(j);
            }
            if(cars.top() == c) cars.pop();
        }
        if(cars.size() == 0) printf("Yes\n");
        else printf("No\n");
    }
}
 
int main() {
    for(;;) {
        scanf("%d", &N);
        if(N == 0) break;
 
        marshal();
        printf("\n");
    }
}



