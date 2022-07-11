package designPattern;

public class Singleton_Ex {
	public static void main(String[] args) {
		SingletonEager instance = SingletonEager.getInstance();
		System.out.println(instance);
		SingletonEager instance1 = SingletonEager.getInstance();
		System.out.println(instance1);
	}

}

class SingletonEager {
	private static SingletonEager instance = new SingletonEager();

	private SingletonEager() {
	}

	public static SingletonEager getInstance() {
		return instance;
	}

}

class SingletonLazy{
	private static SingletonLazy instance;

	private SingletonLazy() {
	}
	
	public static SingletonLazy getInstance() {
		if(instance==null) {
			return instance=new SingletonLazy();
		}
		return instance;
		
	}
}