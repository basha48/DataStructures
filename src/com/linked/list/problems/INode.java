package com.linked.list.problems;

public interface INode<T> {
	INode getNext();
	void setNext(INode next);
	T getKey();
}
