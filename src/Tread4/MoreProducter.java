package Tread4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//多生产者   多消费者
public class MoreProducter {

	public static void main(String[] args) {
		
	}
}
//描述产品
class Clothes{
	private String name;
	private double price;
	//存放产品的容器
	private Clothes[]arr=new Clothes[100];
	//创建一把锁
	private Lock lock=new ReentrantLock();
	//创建和锁绑定的condition对象   控制生产线程
	private Condition pro=lock.newCondition();
	//创建和锁绑定的condition对象   控制消费线程
	private Condition con=lock.newCondition();
	//生产使用的下标
	private int propointer;
	//消费使用的下标
	private int conpointer;
	//记录产品数量
	private int count;
	public Clothes(){
		
	}
	public Clothes(String name,double price){
		this.name=name;
		this.price=price;
	}
	//生产功能
	public void produce(){
		lock.lock();
		//先判断是否可以生产  当满就不能生产
		try {
			while(count==arr.length){
					pro.await();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	//	arr[propointer]=new 
	}
	
	
	
	
	
	
}