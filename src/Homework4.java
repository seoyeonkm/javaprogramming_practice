import java.util.Scanner;

    public class Homework4 {

        // 재귀호출을 이용한 최대공약수 계산
        static int gcd(int m, int n) {
            if (n == 0) {
                return m;
            }

            if (m < n) {
                return gcd(m, n % m);
            } else {
                return gcd(n, m % n);
            }
        }

        // 반복문을 이용한 최대공약수 계산
        static int gcdLoop(int m, int n) {
            while (n != 0) {
                int r = m % n;
                m = n;
                n = r;
            }

            return m;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("두 수를 입력하세요: ");
            int m = sc.nextInt();
            int n = sc.nextInt();

            int result = gcd(m, n);

            System.out.println("두 수의 최대공약수는 " + result + "입니다.");

            sc.close();
        }
    }


