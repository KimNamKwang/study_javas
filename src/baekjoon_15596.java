import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 파악
// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.

// 유추 파악

// 주요 단어 영문 이름 선정

// 테스트 케이스

// 프로그래밍 순서

// try-on

// 실패 시 원인 기록
public class baekjoon_15596 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0; // 입력받은 정수의 갯수 파악용

        String input = br.readLine(); // 입력받은 값 문자열로 보관
        String nums[] = input.split(" "); // 입력받은 정수들 공백으로 끊어서 배열에 보관
        System.out.println(nums);
    }
}
