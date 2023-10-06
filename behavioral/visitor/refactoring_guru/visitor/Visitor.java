package behavioral.visitor.refactoring_guru.visitor;

import behavioral.visitor.refactoring_guru.shapes.CompoundShape;
import behavioral.visitor.refactoring_guru.shapes.Dot;
import behavioral.visitor.refactoring_guru.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    //    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
