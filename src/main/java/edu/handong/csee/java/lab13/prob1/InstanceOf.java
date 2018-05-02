package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {
	public static void WhatFriend(Friend friend)
	{
		if(friend instanceof ClassFriend)
			((ClassFriend)friend).classFriend();
		else if(friend instanceof SchoolFriend)
			((SchoolFriend)friend).schoolFriend();
		else
			friend.JustFriend();
			
	}
		
	public static void main(String[] args) {
		Friend friend1 = new Friend();
		SchoolFriend friend2 = new SchoolFriend();
		ClassFriend friend3 = new ClassFriend();
		
		InstanceOf.WhatFriend(friend1);
		InstanceOf.WhatFriend(friend2);
		InstanceOf.WhatFriend(friend3);
	}
}