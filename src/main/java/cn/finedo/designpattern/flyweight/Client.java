package cn.finedo.designpattern.flyweight;

public class Client {
	
	public static void main(String[] args) {
		
		WebSiteFactory factory = new WebSiteFactory();
		
		//客户要一个以新闻形式发布的网站
		WebSite webSite01 = factory.getWebSiteCategory("新闻");
		webSite01.use(new User("Tom"));
		
		//客户要一个以博客形式发布的网站
		WebSite webSite02 = factory.getWebSiteCategory("博客");
		webSite02.use(new User("Jack"));
		
		//客户要一个以博客形式发布的网站
		WebSite webSite03 = factory.getWebSiteCategory("博客");
		webSite03.use(new User("Smith"));
		
		System.out.println("网站的分类总数为："+factory.getWebSiteCount());
	
	}
	
}
