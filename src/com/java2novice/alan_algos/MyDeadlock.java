/*
 * Deadlock describes a situation where two or more threads are
 *  blocked forever, waiting for each other. Deadlocks can occur 
 *  in Java when the synchronized keyword causes the executing thread 
 *  to block while waiting to get the lock, associated with the specified 
 *  object. Since the thread might already hold locks associated with 
 *  other objects, two threads could each be waiting for the other to 
 *  release a lock. In such case, they will end up waiting forever.
 */
package com.java2novice.alan_algos;

public class MyDeadlock {
	
//	String str1 = "obj1";
//	String str2 = "obj2";
	
	DEAD_LOCK_OBJ_1 str1 = new DEAD_LOCK_OBJ_1();
	DEAD_LOCK_OBJ_2 str2 = new DEAD_LOCK_OBJ_2();
	
	Thread t1 = new Thread("my thread 1"){
		public void run() {
			while (true){
				synchronized(str1){
					synchronized(str2){
						System.out.println("got str2 lock");
					}
				}
			}
		}
	};
	Thread t2 = new Thread("my thread 2"){
		public void run() {
			while (true){
				synchronized(str2){
					synchronized(str1){
						System.out.println("got str1 lock");
					}
				}
			}
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDeadlock dl = new MyDeadlock();
		dl.t1.start();
		dl.t2.start();

	}

}
