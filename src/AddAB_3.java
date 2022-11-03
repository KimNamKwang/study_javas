import java.util.Scanner;

public class AddAB_3 {
    public static void main(String[] args) {
        // 문제 파악
        // 두 정수 A와 B를 입력받은 다음, A+B를 출력

        // 유추 파악
        // 
        
        // 주요 단어 영문 이름 선정
        
        
        // 테스트 케이스
        
        
        // 프로그래밍 순서
        
        
        // try-on
        
        
        // 실패 시 원인 기록

        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int array[] = new int [A];

        for(int i = 0; i < A; i++){
            int B = input.nextInt();
            int C = input.nextInt();
            array[i] = B + C;
        }
        input.close();

        for(int D : array){
            System.out.println(D);
        }

    }
    
}
