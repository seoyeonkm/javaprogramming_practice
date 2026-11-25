import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        // ID와 비밀번호를 저장할 HashMap 생성
        HashMap<String, String> userInfo = new HashMap<>();

        // 미리 저장된 ID와 비밀번호 등록
        userInfo.put("myId", "myPass");
        userInfo.put("myId2", "myPass2");
        userInfo.put("myId3", "myPass3");

        Scanner scanner = new Scanner(System.in);

        // 로그인 성공 여부
        boolean loginSuccess = false;

        // 로그인에 성공할 때까지 반복
        while (!loginSuccess) {

            System.out.println("id와 password를 입력해주세요.");

            // ID 입력 및 공백 제거
            System.out.print("id : ");
            String id = scanner.nextLine().trim();

            // ID 존재 여부 확인
            if (!userInfo.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            // 비밀번호 입력 및 공백 제거
            System.out.print("password : ");
            String password = scanner.nextLine().trim();

            // ID에 해당하는 비밀번호 확인
            if (userInfo.get(id).equals(password)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                loginSuccess = true;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }

        scanner.close();
    }
}
