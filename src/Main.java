
public class App {
    public static void main(String[] args) throws Exception {
        
    int[] grade1 = new int[3];
    grade1[1] = 65;
    grade1[2] = 90;
    grade1[0] = 85;
    for (int i = 0; i < grade1.length; i++) {

        System.out.print(grade1[i] + " "); // 인덱스를 이용한 배열로의 접근
        
    }
    }
}
