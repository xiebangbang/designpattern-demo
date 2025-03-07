package cn.finedo.designpattern.mediator;

public class Client {

	public static void main(String[] args) {
		//创建一个中介者对象
		Mediator mediator = new ConcreteMediator();
		//创建Alarm,并且加入到 ConcreteMediator对象的hashmap
		Alarm alarm = new Alarm(mediator, "alarm");
		//创建CoffeeMachine对象，并且加入到ConcreteMediator对象的Hashmap中
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		//创建Curtains，并且加入到ConcreteMediator对象的hashmap
		Curtains curtains = new Curtains(mediator, "curtains");
		TV tv = new TV(mediator,"TV");
		
		//让闹钟发出消息
		alarm.sendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.sendAlarm(1);
		
	}

}
