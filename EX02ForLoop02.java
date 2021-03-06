package day0306;

// 1. 1~10까지 차례대로 출력하시오.
// 2. 15~3까지 차례대로 출력하시오.
// 3. 1~20까지 짝수만 출력하시오.
// 4. 사용자로부터 숫자를 입력 받아서 1부터 그수까지 출력하시오.
// 5. 사용자로부터 2개의 숫자를 입력받아서 더 작은 숫자부터 더 큰 숫자까지를 차레대로 출력하시오.
// 6. 사용자로부터 숫자를 입력받아서 1부터 그수까지의 합을 출력하시오.
// 7. 사용자로부터 숫자를 입력 받아서 1부터 그수까지의 곱을 출역하시오,
// 4시 20분까지

import java.util.Scanner;

public class EX02ForLoop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("1번");
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("2번");
        System.out.println();

        for (int i = 15; i >= 3; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("3번");
        System.out.println();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        System.out.println();
        System.out.println("4번");
        System.out.println("수를 입력하세요.");
        System.out.println("> ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("5번");
        System.out.println("수를  2개 입력하세요.");
        System.out.println("첫번째 수");
        System.out.println("> ");
        int firstNum = sc.nextInt();
        System.out.println("두번째 수");
        System.out.println("> ");
        int secondNum = sc.nextInt();

        if (firstNum >= secondNum) {
            for (int i = secondNum; i <= firstNum; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = firstNum; i <= secondNum; i++) {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("6번");

        // 합을 저장할 int 변수
        int result = 0;

        System.out.println("수를 입력하세요.");
        System.out.println("> ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            result += i;
        }
        System.out.printf("1부터 [%d]까지의 합: [%d]\n", num, result);

        System.out.println();
        System.out.println("7번");

        // 곱을 저장할 result를 1로 초기화 한다.
        result = 1;

        System.out.println("수를 입력하세요.");
        System.out.println("> ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.printf("1부터 [%d]까지의 곱: [%d]\n", num, result);

        sc.close();
    }

}
