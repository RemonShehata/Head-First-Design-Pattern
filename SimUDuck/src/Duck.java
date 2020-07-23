import java.io.Console;

public abstract class Duck {

    protected void quack() {
        System.out.println("Duck is quacking...");
    }

    protected void swim() {
        System.out.println("Duck is swimming...");
    }

    protected abstract void display();
}
