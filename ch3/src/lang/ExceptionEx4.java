package lang;

import java.net.InterfaceAddress;

public class ExceptionEx4 {
    public static void main(String[] args) {
        // 다중 catch
        try {
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (NumberFormatException e) {
            System.out.println("입력값 확인");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 확인");
        } catch (Exception e) { // 부모는 맨 밑에(Exception e)
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 재실행");
        }

        // 개별 catch
        try {
            String data2 = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        try {
            String data1 = "a100";
        } catch (NumberFormatException e) {

        }
    }

}
