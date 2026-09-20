import java.util.Scanner;

// 학생 정보를 저장하는 클래스
class Student {
    private int studentId;       // 학번
    private String name;         // 이름
    private String major;        // 전공
    private long phoneNumber;    // 전화번호

    // 생성자
    public Student(int studentId, String name, String major, long phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    // 학번 getter / setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // 이름 getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 전공 getter / setter
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // 전화번호 getter / setter
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // 전화번호를 010-xxxx-xxxx 형태로 변환
    public String getFormattedPhoneNumber() {
        String phone = Long.toString(phoneNumber);

        // 앞자리 0 복구
        phone = "0" + phone;

        return phone.substring(0, 3) + "-"
                + phone.substring(3, 7) + "-"
                + phone.substring(7);
    }
}

public class Homework2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        // 학생 3명의 정보 입력
        for (int i = 0; i < 3; i++) {

            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            int studentId = scanner.nextInt();
            String name = scanner.next();
            String major = scanner.next();
            long phoneNumber = scanner.nextLong();

            students[i] = new Student(
                    studentId,
                    name,
                    major,
                    phoneNumber
            );
        }

        // 학생 정보 출력
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < 3; i++) {

            Student student = students[i];

            System.out.println(
                    (i + 1) + "번째 학생: "
                            + student.getStudentId() + " "
                            + student.getName() + " "
                            + student.getMajor() + " "
                            + student.getFormattedPhoneNumber()
            );
        }

        scanner.close();
    }
}
