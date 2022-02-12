package com.test.cases;

import com.linked.list.problems.INode;
import com.linked.list.problems.MyLinkedList;
import com.linked.list.problems.MyNode;

public class MyQueue {
	private MyLinkedList MyLinkedList;
	public MyQueue() {
		this.MyLinkedList = new MyLinkedList();
	}

	public void enqueu(INode myNode) {
		MyLinkedList.append(myNode);
		
	}
	public void printQueue() {
		MyLinkedList.printMyNodes();
		
	}
	public INode dequeue() {
		
		return	MyLinkedList.pop();
		
	}
	


}
