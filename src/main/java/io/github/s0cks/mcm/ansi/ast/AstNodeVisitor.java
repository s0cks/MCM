package io.github.s0cks.mcm.ansi.ast;

public interface AstNodeVisitor{
  public void visitLiteralNode(LiteralNode node);
  public void visitReturnNode(ReturnNode node);
  public void visitSequenceNode(SequenceNode node);
  public void visitBinaryOpNode(BinaryOpNode node);
}