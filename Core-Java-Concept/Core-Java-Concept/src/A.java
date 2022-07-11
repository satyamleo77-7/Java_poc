Public Class A{
Public void m1(){
}
}
Class B extends A{
Public void m1(){
}
}
Public class Test{
public static void main(String[] args) {
	B b = new A();
	b.m1();//output: compile time error	
}

}
