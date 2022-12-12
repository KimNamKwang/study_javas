import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mul {

    public void name() {
        
    }
    public static void main(String[] args) {
        // 문제
        // 2588번
        // (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
        // (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때
        // (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

        // 입력
        // 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
        // 출력
        // 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

        /**
         * 
         * - 문제 파악
         * 3자리 자연수 * 3자리 자연수 를 할때 단계별로 계산과정을 모두 출력하라
         * 
         * - 유추 파악
         * abc * def 일때 abc*f, abc*e, abc*d, acd*def를 모두 기록하는 것
         * 
         * - 주요 단어 영문 이름 선정
         * 입력
         * 출력
         * 자연수
         * 
         * - 테스트 케이스
         * 472
         * 385
         * --------
         * 2360
         * 3776
         * 1416
         * 181720
         * 
         * 
         * - 프로그래밍 순서
         * 
         * - try-on
         * 
         * - 실패 시 원인 기록
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        try {
            int first = Integer.parseInt(br.readLine());
            String second = br.readLine();

            char[] array = second.toCharArray();

            result1 = (first * (array[2] - '0'));
            result2 = (first * (array[1] - '0'));
            result3 = (first * (array[0] - '0'));
            result4 = (first * Integer.parseInt(second));
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
