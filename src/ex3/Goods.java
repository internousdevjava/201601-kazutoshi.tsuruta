package ex3;
public class Goods {
 String name;
 int cost;
 static double rate;
public Goods(String n) {
	this.name=n;
	this.cost=0;

}
public Goods(String n,int c) {
	this.name=n;
	this.cost=c;
}
String getName(){
return this.name;
}
static double getRate(){
return rate;
}
int getCost(){
return this.cost;
}
int getPrice(){
	 return (int) (this.cost * (1 + rate) / 1);
}
void setName(String n){
this.name=n;
}
void setCost(int c){
this.cost=c;
}
static void setRate(double r){
rate=r;
}
void show(){
System.out.println("商品名"+this.name+"\n"+"税抜価格"+this.cost+"\n"+"消費税率"+rate+"\n税込価格"+getPrice());
}
}
