package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparable {
public static void main(String[] args) {
	List<Player>list=new ArrayList<Player>();
	list.add(new Player("Satyam", 20));
	list.add(new Player("vijay", 18));
	list.add(new Player("ThelaPathy", 22));
	System.out.println(list);
	Comparator<Player> byAge=(Player player1,Player player2)->Integer.compare(player1.getAge(), player2.getAge());
	//Comparable<Player> byAge1=Comparable.comparing(Player::getAge);
	//Collections.sort(list,byAge1);
	System.out.println(list);
	
	
	
	
}
}
class Player {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + "]";
	}
	
}