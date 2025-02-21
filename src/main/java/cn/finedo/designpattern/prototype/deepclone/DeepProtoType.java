package cn.finedo.designpattern.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable{
	
	private String name;
	private DeepCloneableTarget deepCloneableTarget;
	
	//深拷贝 - 方式1 使用clone方法
	@Override
	protected DeepProtoType clone() throws CloneNotSupportedException {
		DeepProtoType deepProtoType = null;
		//这里完成对基本数据类型（属性）和String的克隆
		deepProtoType = (DeepProtoType) super.clone();
		//对引用类型的属性，进行单独处理
		deepProtoType.deepCloneableTarget = deepCloneableTarget.clone();
		return deepProtoType;
	}
	
	//深拷贝 - 方式2 通过对象的序列化实现（推荐）
	public DeepProtoType deepClone() throws IOException {
		//创建流对象
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			//序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this); //当前这个对象以对象流的方式输出
			
			//反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType) ois.readObject();
			return copyObj;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			//关闭流
			bos.close();
			oos.close();
			bis.close();
			ois.close();
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeepCloneableTarget getDeepCloneableTarget() {
		return deepCloneableTarget;
	}

	public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
		this.deepCloneableTarget = deepCloneableTarget;
	}
	
}
