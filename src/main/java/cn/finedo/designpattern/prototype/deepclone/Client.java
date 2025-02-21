package cn.finedo.designpattern.prototype.deepclone;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException, CloneNotSupportedException {
		
		DeepProtoType deepProtoType = new DeepProtoType();
		deepProtoType.setName("宋江");
		deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("大牛", 18));
		
		//方式1-完成深拷贝
		DeepProtoType deepProtoType2 = deepProtoType.clone();
		System.out.println("deepProtoType = " + deepProtoType.getName() + "deepProtoType.DeepCloneableTarget:"+ deepProtoType.getDeepCloneableTarget().hashCode());
		System.out.println("deepProtoType2 = " + deepProtoType2.getName() + "deepProtoType2.DeepCloneableTarget:"+deepProtoType2.getDeepCloneableTarget().hashCode());
		
		//方式2-完成深拷贝
		DeepProtoType deepProtoType3 = deepProtoType.deepClone();
		System.out.println("deepProtoType = " + deepProtoType.getName() + "deepProtoType.DeepCloneableTarget:"+ deepProtoType.getDeepCloneableTarget().hashCode());
		System.out.println("deepProtoType3 = " + deepProtoType3.getName() + "deepProtoType3.DeepCloneableTarget:"+deepProtoType3.getDeepCloneableTarget().hashCode());
		
	}

}
