 package com.tencent.tws.burgeon.DesignPattern.Behavioral.Interpreter;

/**
 * Created by yongchen on 2016/1/8.
 */
abstract class Expression {
    public abstract Object interpreter(IContext ctx);
}
