/* Generated By:JJTree: Do not edit this line. ASTCompilationExpression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=net.sourceforge.pmd.lang.ast.AbstractNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTCompilationExpression extends SimpleNode {
  public ASTCompilationExpression(int id) {
    super(id);
  }

  public ASTCompilationExpression(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4245dbd3bae25afd60e23bb57bb2423c (do not edit this line) */