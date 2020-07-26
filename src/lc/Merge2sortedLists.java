package lc;

import java.util.LinkedList;

import leetcode.com.leetcode.edtunambar.ListNode;



public class Merge2sortedLists {
/*
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
	public static void main(String[] args) {
		LinkedList<ListNode> list = null;
		ListNode l1a = new ListNode(1);
		ListNode l1b = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1a.next = l2;
		l1b.next = l3;
		l2.next = l4;
		l3.next = l4;
		l4.next = null;
		
//		list.push(l1);
//		LinkedList<ListNode> list2 = null;
		
//		list2.push(l2);
		
		
		ListNode mergedList = mergeTwoLists(l1a, l1b);

		System.out.println(mergedList.val);
		while(mergedList.next != null) {
			System.out.println(mergedList.next.val);
			mergedList.next = mergedList.next.next;
		}
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
}
}
