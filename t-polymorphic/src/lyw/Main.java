package lyw;

public class Main {
	
	 public static void main(String[] args) {
	        Person p = new Student();  //实际类型为Student，引用类型为Person的变量
	        p.run(); // 应该打印Person.run还是Student.run?
	        //打印的是Student.run
	    }
}

class Person {
    public void run() {
        System.out.println("Person.run");
    }
}

class Student extends Person {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}
