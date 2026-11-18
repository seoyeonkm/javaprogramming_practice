// 추상 클래스 Printer
abstract class Printer {
    String model;          // 프린터 모델명
    int printedCount;      // 현재까지 출력한 매수
    int availableCount;    // 출력 가능한 매수

    // 생성자
    public Printer(String model, int printedCount, int availableCount) {
        this.model = model;
        this.printedCount = printedCount;
        this.availableCount = availableCount;
    }

    // 추상 메서드
    public abstract boolean print();
}


// 잉크젯 프린터 클래스
class InkjetPrinter extends Printer {

    // 생성자
    public InkjetPrinter(String model, int printedCount, int availableCount) {
        super(model, printedCount, availableCount);
    }

    // print() 메서드 오버라이딩
    @Override
    public boolean print() {

        // 출력 가능한 매수가 없는 경우
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount + 1)
                    + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        }

        // 출력 가능한 매수가 있는 경우
        printedCount++;
        availableCount--;

        return true;
    }
}


// 레이저 프린터 클래스
class LaserPrinter extends Printer {

    // 생성자
    public LaserPrinter(String model, int printedCount, int availableCount) {
        super(model, printedCount, availableCount);
    }

    // print() 메서드 오버라이딩
    @Override
    public boolean print() {

        // 출력 가능한 매수가 없는 경우
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount + 1)
                    + "매째 인쇄 실패 - 토너 부족.");
            return false;
        }

        // 출력 가능한 매수가 있는 경우
        printedCount++;
        availableCount--;

        return true;
    }
}


// 메인 클래스
public class Homework7 {

    public static void main(String[] args) {

        // 잉크젯 프린터 객체 생성
        InkjetPrinter inkjet = new InkjetPrinter(
                "Brother DCP-T730DW", 7500, 0);

        // 레이저 프린터 객체 생성
        LaserPrinter laser = new LaserPrinter(
                "Canon MFC643Cdw", 1500, 0);

        // 프린터 출력 실행
        inkjet.print();
        laser.print();
    }
}
