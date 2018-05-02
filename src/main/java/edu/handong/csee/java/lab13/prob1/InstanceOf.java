package edu.handong.csee.java.lab13.prob1;

// class InstanceOf
public class InstanceOf {
	
	// method that identifies the given friends.
	public static void WhatFriend(Friend friend)
	{
		if(friend instanceof ClassFriend) // Check a type of objects if Class Friend
			((ClassFriend)friend).classFriend(); // call the classfriend's method!
		else if(friend instanceof SchoolFriend) // Check a type of objects if School Friend
			((SchoolFriend)friend).schoolFriend();  // call the schoolfriend's method!
		else // Check a type of objects if Just Friend
			friend.JustFriend(); // call the friend's method!
			
	}
		
	public static void main(String[] args) {
		
		// instantiate Friend, SchoolFriend, ClassFriend
		Friend friend1 = new Friend();
		SchoolFriend friend2 = new SchoolFriend();
		ClassFriend friend3 = new ClassFriend();
		
		// check the type of object(which type of friend) and print the friend type. 
		InstanceOf.WhatFriend(friend1);
		InstanceOf.WhatFriend(friend2);
		InstanceOf.WhatFriend(friend3);
	}
}
