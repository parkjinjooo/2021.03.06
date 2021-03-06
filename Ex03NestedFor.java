package day0306;
// 중첩 for 문

// 중첩 for 문의 특징은
// 바깥 쪽 for 문이 1반 실행될 동안
// 안쪽의 for문은 지정된 횟수만큼 전부 반복이 된다는 것이 특징이다.

public class Ex03NestedFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 101; j <= 104; j++) {
                System.out.printf("i의 현재값: [%d], j의 현재값: [%d]\n", i, j);
            }
            System.out.println("===============================================");
        }
    }
}
