package lang;

// NotExistIDException, ngPasswordException
public class LoginEx {
    public static void main(String[] args) {

        try {
            login("white", "12345");
            login("blue", "54321");
        } catch (NotExistIDException | WrongPasswordException e) {
            e.printStackTrace();
        }

    }

    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
        // if (id != "blue") {
        // throw new NotExistIDException("아이디 아님");
        // }
        // if (password != "12345") {
        // throw new NotExistIDException("비밀번호 아님");
        // }
        // -> != 가 아닌 id.equals 사용한 이유 : String id, String password로 변수를 선언했기 때문에
        // String은 ==, != 보다는 equals로 비교하는 게 맞음

        // id가 blue가 아니라면 NotExistIDException 발생
        if (!id.equals("blue")) {
            throw new NotExistIDException("아이디 아님");
        }

        // password가 "12345" 가 아니라면 WrongPasswordException 발생
        if (!password.equals("12345")) {
            throw new WrongPasswordException("비밀번호 아님");
        }

    }

}
