
// 부모 클래스: Course
// 모든 강의가 공통으로 가지는 강의 코드(code)와 강의명(name)을 정의한다.
class Course {
    String code;
    String name;

    // 생성자: 강의 코드와 강의명을 전달받아 멤버 변수에 저장한다.
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }
}

// 자식 클래스: OfflineCourse
// Course 클래스를 상속받아 오프라인 강의를 표현한다.
class OfflineCourse extends Course {

    // 부모 클래스의 생성자를 호출하여 강의 정보를 초기화한다.
    public OfflineCourse(String code, String name) {
        super(code, name);
    }

    // 부모 클래스의 toString()을 오버라이딩한다.
    // 오프라인 강의에 맞는 문자열을 반환한다.
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}

// 자식 클래스: OnlineCourse
// Course 클래스를 상속받아 온라인 강의를 표현한다.
class OnlineCourse extends Course {

    // 부모 클래스의 생성자를 호출하여 강의 정보를 초기화한다.
    public OnlineCourse(String code, String name) {
        super(code, name);
    }

    // 부모 클래스의 toString()을 오버라이딩한다.
    // 온라인 강의에 맞는 문자열을 반환한다.
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}

// 메인 클래스
public class Homework6 {
    public static void main(String[] args) {

        // OfflineCourse 객체 생성
        OfflineCourse course1 = new OfflineCourse(
                "HAEA9201", "Object Oriented Programming"
        );

        // OnlineCourse 객체 생성
        OnlineCourse course2 = new OnlineCourse(
                "HAFL0012", "C Programming 1"
        );

        // 객체를 출력하면 각 클래스의 toString() 메서드가 호출된다.
        System.out.println(course1);
        System.out.println(course2);
    }
}

