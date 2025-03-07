package cn.finedo.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

import cn.finedo.designpattern.adapter.interfaceadapter.interf4;

/**
 * 核心类
 * 1、包含最新的天气情况信息
 * 2、含有 观察者集合，使用ArrayList管理
 * 3、当数据有更新时，就主动的调用 ArrayList,通知所有的接入方，接入方就看到最新的信息了
 */
public class WeatherData implements Subject{
	
	private float temperature;
	private float pressure;
	private float humidity;
	
	//观察者集合
	private List<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	//注册一个观察者
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	//移除一个观察者
	@Override
	public void removeObserver(Observer o) {
		if(observers.contains(o)) {
			observers.remove(o);
		}
	}

	//遍历所有的观察者，并通知
	@Override
	public void notifyObservers() {
		for(int i =0; i < observers.size();i++) {
			observers.get(i).update(this.temperature, this.pressure, this.humidity);
		}
	}
	
	//当有数据更新时，就调用setData
	public void setData(float temperature,float pressure,float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//调用dataChange，将最新的信息推送给所有的接入方
		dataChange();
	}

	public void dataChange() {
		notifyObservers();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}
	
}
