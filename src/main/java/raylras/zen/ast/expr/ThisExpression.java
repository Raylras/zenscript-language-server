package raylras.zen.ast.expr;

import raylras.zen.ast.BaseNode;
import raylras.zen.ast.Node;
import raylras.zen.ast.visit.NodeVisitor;

import java.util.List;

public final class ThisExpression extends BaseNode implements Expression {

    @Override
    public <T> T accept(NodeVisitor<? extends T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<? extends Node> getChildren() {
        return List.of();
    }

    @Override
    public String toString() {
        return "this";
    }

}
