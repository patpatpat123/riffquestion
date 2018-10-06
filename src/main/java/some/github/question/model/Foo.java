package some.github.question.model;

public class Foo {

    private String someFoo;

    public Foo() {}

    public Foo(String someFoo) {
        this.someFoo = someFoo;
    }

    public String getSomeFoo() {
        return someFoo;
    }

    public void setSomeFoo(String someFoo) {
        this.someFoo = someFoo;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "someFoo='" + someFoo + '\'' +
                '}';
    }

}
