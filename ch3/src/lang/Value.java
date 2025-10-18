package lang;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // Value v = (Value) obj; -> 그냥 사용할 경우, 에러 있을 수 O
        // obj가 Value의 instance 여부 확인 후 형변환
        if (obj instanceof Value) {
            Value v = (Value) obj;
            if (this.value == v.value) {
                return true;
            }
        }
        return false;

    }

    @Override
    public String toString() {
        return "Value [value=" + value + "]";
    }

    // String => int 로 바꾸는 방법 : Integer.parseInt("65")
    // int => String으로 바꾸는 방법 : "";
    // @Override
    // public String toString() {
    // return this.value + "";
    // }

}
