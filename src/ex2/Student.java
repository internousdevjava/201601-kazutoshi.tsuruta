package ex2;
public class Student {
 String name;
 int kokugo;
 int sansu;

 Student(String name,int kokugo,int sansu){
	 this.name=name;
	 this.kokugo=kokugo;
	 this.sansu=sansu;
 }

void show(){
	 System.out.println("氏名:"+this.name+"\n国語:"+this.kokugo+"\n算数:"+this.sansu);
 }
}
