package LeetCode;

public class Main {
    public static void main(String[] args) {

        FindMiddleNode myFindMiddleNode = new FindMiddleNode(1);
        myFindMiddleNode.append(2);
        myFindMiddleNode.append(3);
        myFindMiddleNode.append(4);
        myFindMiddleNode.append(5);


        System.out.println("Middle Node:");
        System.out.println(myFindMiddleNode.findMiddleNode().value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Middle Node:
            3

        */

    }

}
