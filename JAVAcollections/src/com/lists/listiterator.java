package com.lists;

import java.util.*;

public class listiterator {
public static void main(String[] args) {
//	List l=new ArrayList();
	List l=new LinkedList();
	l.add(1);
	l.add('a');
	l.add("lavanya");
	l.add(true);
	l.add(null);
	
	for (Object obj:l)
		System.out.println(obj);
	System.out.println("--------------------");
	
	
	for(int i=0;i<l.size();i++)
		System.out.println(l.get(i));
	System.out.println("--------------------");
	for(int i=l.size()-1;i>=0;i--)
		System.out.println(l.get(i));
		
	System.out.println("-----------------list iterator--------------------");
	ListIterator li=l.listIterator();
	for( ; li.hasNext();)
		System.out.println(li.next());
	System.out.println("--------------list iterator-----");
	
	for( ; li.hasPrevious();)
		System.out.println(li.previous());
	
	System.out.println("-------------------");
}
	
	
	
}
