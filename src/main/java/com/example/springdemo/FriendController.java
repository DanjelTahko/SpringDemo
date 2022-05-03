package com.example.springdemo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendController {

    FriendDatabase friend = new FriendDatabase();
    List<Friend> array = friend.getAllFriends();

    @RequestMapping("/friends")
    public List<Friend> index () {
        return array;
    }

    @RequestMapping("/friends/{id}")
    public Friend indexFriend(@PathVariable int id) {
        return array.get(id);
    }


    @RequestMapping("/friends/name/{name}")
    public Friend nameFriend(@PathVariable String name) {

        int index = -1; // finns inget id

        for (Friend first_name : array) {
            if (first_name.getName().equalsIgnoreCase(name)) {
                index = first_name.getId();
            }
        }
        return array.get(index);
    }

    @PostMapping("/friends/add")
    public Response addFriend(@RequestBody Friend f) {
        System.out.println(f.getId() + " " + f.getName() + " " + f.getAdress() + " " + f.getNumber());
        Response res = new Response("Friend added", Boolean.FALSE);
        array.add(f);
        res.setStatus(Boolean.TRUE);
        return res;

    }

    @DeleteMapping("/friends/delete/{id}")
    public Response deleteFriend(@PathVariable("id") int id) {
        Response res = new Response("Error detected", Boolean.FALSE);

        int index = -1;

        for (Friend name : array) {
            if (name.getId() == id) {
                index = id;
            }
        }

        if (index != -1) {
            array.remove(index);
            res.setMessage("ID deleted");
            res.setStatus(Boolean.TRUE);
        }
        return res;
    }

    @PostMapping("/friends/update")
    public Response updateFriend(@RequestBody Friend f) {
        Response res = new Response("Error detected", Boolean.FALSE);
        int new_friend_id = f.getId();
        int index = -1;

        for (Friend person : array) {
            if (person.getId() == new_friend_id) {
                person.setName(f.getName());
                person.setAdress(f.getAdress());
                person.setNumber(f.getNumber());
                res.setMessage("Existing friend updated");
                res.setStatus(Boolean.TRUE);
                index = 1312;
            }
        }

        if (index == -1) {
            array.add(f);
            res.setMessage("New friend added");
            res.setStatus(Boolean.TRUE);
        }

        return res;
    }

}

// VAd menas med html formulär?
