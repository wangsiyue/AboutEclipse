package Tread4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//��������   ��������
public class MoreProducter {

	public static void main(String[] args) {
		
	}
}
//������Ʒ
class Clothes{
	private String name;
	private double price;
	//��Ų�Ʒ������
	private Clothes[]arr=new Clothes[100];
	//����һ����
	private Lock lock=new ReentrantLock();
	//���������󶨵�condition����   ���������߳�
	private Condition pro=lock.newCondition();
	//���������󶨵�condition����   ���������߳�
	private Condition con=lock.newCondition();
	//����ʹ�õ��±�
	private int propointer;
	//����ʹ�õ��±�
	private int conpointer;
	//��¼��Ʒ����
	private int count;
	public Clothes(){
		
	}
	public Clothes(String name,double price){
		this.name=name;
		this.price=price;
	}
	//��������
	public void produce(){
		lock.lock();
		//���ж��Ƿ��������  �����Ͳ�������
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