package behavioral.visitor.refactoring_guru;

import behavioral.visitor.refactoring_guru.shapes.CompoundShape;
import behavioral.visitor.refactoring_guru.shapes.Dot;
import behavioral.visitor.refactoring_guru.shapes.Rectangle;
import behavioral.visitor.refactoring_guru.shapes.Shape;
import behavioral.visitor.refactoring_guru.visitor.XMLExportVisitor;


public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(rectangle);

        export(dot, rectangle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
