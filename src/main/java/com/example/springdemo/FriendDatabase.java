package com.example.springdemo;

import java.util.ArrayList;
import java.util.List;

public class FriendDatabase {

    public List<Friend> getAllFriends() {

        List<Friend> every_friend = new ArrayList<>();
        Friend f0 = new Friend(0, "Null", "Null", "0000");
        Friend f1 = new Friend(1, "Daniel", "hushålssgatans", "112");
        Friend f2 = new Friend(2, "Pär", "körsbärshotellet", "1312");
        Friend f3 = new Friend(3, "Jan-Pär-Åke", "Strandsjön", "911");
        Friend f4 = new Friend(4, "aboa-Luu", "granatannanas", "6969");

        every_friend.add(f0);
        every_friend.add(f1);
        every_friend.add(f2);
        every_friend.add(f3);
        every_friend.add(f4);

        return every_friend;
    }



}
