package LinkedLists;

import LinkedLists.Leetcode.FindMiddleNode;

public class Main {
    public static void main(String[] args) {

        FindMiddleNode myFindMiddleNode = new FindMiddleNode(1);
        myFindMiddleNode.append(2);
        myFindMiddleNode.append(3);
        myFindMiddleNode.append(4);
        myFindMiddleNode.append(5);


        System.out.println("Middle Node:");

        /*
            EXPECTED OUTPUT:
            ----------------
            Middle Node:
            3

        */

    }

}
