package raylras.zen.ast.expr;

import raylras.zen.ast.BaseNode;
import raylras.zen.ast.Node;
import raylras.zen.ast.type.Types;
import raylras.zen.ast.visit.NodeVisitor;

import java.util.List;

public final class StringLiteral extends BaseNode implements Expression {

    private final String literal;

    public StringLiteral(String literal) {
        this.literal = literal;
        super.setType(Types.STRING);
    }

    public String getLiteral() {
        return literal;
    }

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
        return literal;
    }

}
