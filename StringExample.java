public class StringExample {
    public static void main(String[] args){
        // String => 문자열 객체
        // 객체 => 힙 메모리 영역
        // 변수 => 힙 메모리 영역의 주소

        String str = "안녕하세요!"; // 문자열 리터럴
        String str_2 = new String("안녕하세요!"); // 생성자
        String str_3 = "안녕하세요!";

        // 같은 메모리 주소 참조하고 있는지
        if (str == str_2){
            System.out.println("str == str_2");
        }
        if(str == str_3){
            System.out.println("str == str_3");
        }
        if (str_2 == str_3){
            System.out.println("str_2 == str_3");
        }

        // 값 비교
        if (str.equals(str_2)){
            System.out.println("str.equals(str_2)");
        }
        if (str.equals(str_3)){
            System.out.println("str.equals(str_3)");
        }
        if (str_2.equals(str_3)){
            System.out.println("str_2.equals(str_3)");
        }

        // 문자열 병합
        // 1. '+' 연산자
        String str_4 = "Hello,";
        String str_5 = "World!";
        System.out.println(str_4 + " " + str_5);

        // 2. StringBuilder
        StringBuilder strBdr_1 = new StringBuilder("Hello,");
        strBdr_1.append(" ");
        strBdr_1.append("World!");
        String str_new=strBdr_1.toString();
        System.out.println(str_new);

        // 문자열 슬라이스
        String str_1 = "이름: 김자바";
        System.out.println(str_1.indexOf("이"));
        System.out.println(str_1.indexOf("름"));

        String str_name = str_1.substring(4, 7);
        System.out.println(str_name);

        // 문자열 대소문자 변환
        String str_7 = "abc";
        String str_8 = "ABC";

        str_7 = str_7.toUpperCase();
        str_8 = str_8.toLowerCase();

        System.out.println(str_7);
        System.out.println(str_8);

        if(str_7.equals(str_8)){
            System.out.println("str_7.equals(str_8)");
        }
        if(str_7.equalsIgnoreCase(str_8)){
            System.out.println("str_7.equalsIgnoreCase(str_8)");
        }

        // 공백 제거

        // 1. 양쪽 끝 공백
        String str_9 = "        Hello           ";
        str_9 = str_9.trim();
        System.out.println(str_9);

        // 2. 문자열 중간 공백
        String str_0 = "    Hel       lo       ";
        str_0 = str_0.trim();
        str_0 = str_0.replace(" ", "");
        System.out.println(str_0);

    }
}
