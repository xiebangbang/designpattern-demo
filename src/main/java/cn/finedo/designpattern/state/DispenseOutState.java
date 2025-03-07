package cn.finedo.designpattern.state;

/**
 * 奖品发放完毕状态
 * 当我们activity改变成 DispenseOutState，抽奖活动结束
 */
public class DispenseOutState extends State{
	
	//初始化时传入活动引用
	RaffleActivity activity;
	
	public DispenseOutState(RaffleActivity activity) {
		this.activity = activity;
	}

	@Override
	public void deductMoney() {
		System.out.println("奖品已经发送完了，请下次再参加！");
	}

	@Override
	public boolean raffle() {
		System.out.println("奖品已经发送完了，请下次再参加！");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("奖品已经发送完了，请下次再参加！");
	}

}
