package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeRose = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeRose + " 하나"); // 아메리카노 하나
        System.out.println("주세요");

        // 배열 선언 첫 번째 방법
        //String[] coffees = new String[4];

        // 배열 선언 두 번째 방법
        //String coffees[] = new String[4];
//        coffees[0] = "아메리카노"; // 0 부터 시작
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 배열 선언 3 번째 방법
        //String[] coffees = new String[] { "아메리카노", "카페모카", "라떼", "카푸치노"};

        // 배열 선언 4 번째 방법
        String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println("-----------------------");

        //커피 주문
        System.out.println(coffees[0] + " 하나"); // 아메리카노 하나
        coffees[1] = "라떼"; // 값 변경
        System.out.println(coffees[1] + " 하나"); // 카페모카 하나뒤 라떼로변경
        System.out.println("주세요");

        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        double[] d = new double[] {10.0, 11.2, 13.5};

    }
}
