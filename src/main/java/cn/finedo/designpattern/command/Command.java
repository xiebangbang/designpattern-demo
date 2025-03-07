package cn.finedo.designpattern.command;

//创建命令接口
public interface Command {

	//执行操作
	public void execute();
	//撤销操作
	public void undo();
	
}
