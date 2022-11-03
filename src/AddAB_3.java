import java.util.Scanner;

public class AddAB_3 {

    public int plus(int input_first, int input_second) {
        int output_plus = input_first + input_second;
        return output_plus;
    }
    public static void main(String[] args) {
        /*
        # 문제 파악
        두 정수 A와 B를 입력받은 다음, A+B를 출력

        # 유추 파악
        제일 먼저 몇회 테스트 할지 횟수 T 가 주어지고 그 수 만큼 
        두 정수 A와 B를 입력받은 다음, A+B를 출력한다.
        
        # 주요 단어 영문 이름 선정
        입력 input
        반복횟수 T
        출력 output
        정수 decimal
        합 plus

        # 테스트 케이스
        5   (반복횟수 T)
        1 1
        2 3
        3 4
        9 8
        5 2
        
        프로그래밍 순서
        
        
        try-on
        
        
        실패 시 원인 기록
        */

        // 입력
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int array[] = new int [T];
        int input_first =  input.nextInt();
        int input_second = input.nextInt();


        for(int i = 0; i < T; i++){
            input_first = input.nextInt();
            input_second = input.nextInt();
            array[i] = input_first + input_second;
        }
        input.close();

        // 처리
        AddAB_3 main = new AddAB_3();
        int output_plus = main.plus(input_first, input_second);

        // 출력
        for(int D : array){
            System.out.println(D);
        }

    }
    
}
