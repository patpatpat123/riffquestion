package some.github.question.model;

public class Bar {

    private String someBar;

    public Bar() {}

    public Bar(String someBar) {
        this.someBar = someBar;
    }

    public String getSomeBar() {
        return someBar;
    }

    public void setSomeBar(String someBar) {
        this.someBar = someBar;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "someBar='" + someBar + '\'' +
                '}';
    }

}
