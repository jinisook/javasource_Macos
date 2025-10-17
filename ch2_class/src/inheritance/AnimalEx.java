package inheritance;
// 다형성(polymorphism)

// 여러가지 형태를 가질 수 있는 능력
// 부모 = new 자식() 을 허용한다는 것을 다형성이라고 함
// ----
// print(자식)
// void print(부모){};

public class AnimalEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        // Animal animal = new Animal();
        Carnivore carnivore = new Carnivore();
        carnivore.eat(); // 고기를
        carnivore.print();

        Herbivore herbivore = new Herbivore();
        // ClassCastException
        // 자식 = 부모 -> (X)
        // herbivore = (Herbivore) animal;
        herbivore.eat(); // 풀을

        Animal animal = new Carnivore();
        animal.eat();

        // animal.print(); -> X : animal(부모)에 없고 자식에만 있음
        ((Carnivore) animal).print(); // 위에 내용을 하고 싶을 때 항변환으로 작성 대신, 실행 오류 발생 가능도 있음
        // 부모 = 자식 -> (O)
        animal = new Herbivore();
        animal.eat();

        // Carnivore carnivore2 = new Herbivore(); -> X / 항변환도 안됨 - 자식간에는 안됨

    }

}
