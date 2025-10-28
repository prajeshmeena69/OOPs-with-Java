package Unit_2;

final class Manish extends Human {

}

final class Vartika extends Human {

}

final class Anjali extends Human {

}

public sealed class Human permits Manish, Vartika, Anjali {
    void printName() {
        System.out.println("Default");
    }
}
