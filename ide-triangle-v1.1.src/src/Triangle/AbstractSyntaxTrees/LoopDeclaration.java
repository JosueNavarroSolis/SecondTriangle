/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author Esteven Fernandez
 */
public class LoopDeclaration extends Declaration {

    public LoopDeclaration(SourcePosition thePosition ) {
        super (thePosition);
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitLoopDeclaration(this, o);
    }
    
}
