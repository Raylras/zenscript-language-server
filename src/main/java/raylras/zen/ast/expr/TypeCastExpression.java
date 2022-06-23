package raylras.zen.ast.expr;

import org.jetbrains.annotations.NotNull;
import raylras.zen.ast.BaseNode;
import raylras.zen.ast.Node;
import raylras.zen.ast.visit.NodeVisitor;

import java.util.Collections;
import java.util.List;

public final class TypeCastExpression extends BaseNode implements Expression {

    @NotNull
    private final Expression expr;

    public TypeCastExpression(@NotNull Expression expr) {
        this.expr = expr;
    }

    @NotNull
    public Expression getExpr() {
        return expr;
    }

    @Override
    public <T> T accept(NodeVisitor<? extends T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<? extends Node> getChildren() {
        return Collections.singletonList(expr);
    }

    @Override
    public String toString() {
        return expr + " as " + getType();
    }

}
