package cn.finedo.designpattern.interpreter;

import java.util.HashMap;

/**
 * 加法解释器
 */
public class AddExpression extends SymbolExpression{

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}
	
	public int interpreter(HashMap<String, Integer> var) {
		//super.left.interpreter(var):返回left表达式对应的值 a = 10
		//super.right.interpreter(var):返回right表达式对应的值 b = 20
		return super.left.interpreter(var) + super.right.interpreter(var);
	}

}
