package cn.finedo.designpattern.command;

public class TVOnCommand implements Command{
	
	//聚合TVReceiver
	TVReceiver tv;
	
	public TVOnCommand(TVReceiver tv) {
		this.tv =tv;
	}

	@Override
	public void execute() {
		tv.on();
	}

	@Override
	public void undo() {
		tv.off();
	}

}
