package raylras.zen.ast.stmt;

import org.jetbrains.annotations.NotNull;
import raylras.zen.ast.BaseNode;
import raylras.zen.ast.BlockNode;
import raylras.zen.ast.Node;
import raylras.zen.ast.expr.Expression;
import raylras.zen.ast.visit.NodeVisitor;

import java.util.List;

public final class WhileStatement extends BaseNode implements Statement {

    @NotNull
    private final Expression condition;
    @NotNull
    private final BlockNode block;

    public WhileStatement(@NotNull Expression condition, @NotNull BlockNode block) {
        this.condition = condition;
        this.block = block;
    }

    @NotNull
    public Expression getCondition() {
        return condition;
    }

    @NotNull
    public BlockNode getBlock() {
        return block;
    }

    @Override
    public <T> T accept(NodeVisitor<? extends T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<? extends Node> getChildren() {
        return List.of(condition, block);
    }

    @Override
    public String toString() {
        return "while " + condition + " {...}";
    }

}
