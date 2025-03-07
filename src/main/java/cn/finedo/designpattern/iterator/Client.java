package cn.finedo.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		//创建学院
		List<College> collegeList = new ArrayList<>();
		
		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();
		
		collegeList.add(computerCollege);
		collegeList.add(infoCollege);
		
		OutputImpl outputImpl = new OutputImpl(collegeList);
		outputImpl.printCollege();
	}

}
