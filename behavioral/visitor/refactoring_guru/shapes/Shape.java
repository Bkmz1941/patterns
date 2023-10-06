package behavioral.visitor.refactoring_guru.shapes;

import behavioral.visitor.refactoring_guru.visitor.Visitor;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
