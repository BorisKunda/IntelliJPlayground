package code_problems_j;


import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        print(howMuchILoveYou(1));

    }

    public static String howMuchILoveYou(int nb_petals) {


        HashMap<Integer, String> petalHashMap = new HashMap<>();
        petalHashMap.put(1, "I love you");
        petalHashMap.put(2, "a little");
        petalHashMap.put(3, "a lot");
        petalHashMap.put(4, "passionately");
        petalHashMap.put(5, "madly");
        petalHashMap.put(6, "not at all");

        int sextetIndex = nb_petals % 6;

        //your code here :)
        return petalHashMap.get(sextetIndex);


    }

    /**
     * DON'T REMOVE !!!!
     **/

    static void print(String someString) {
        System.out.println(someString);
    }


    /* --SOLUTION--

    //Read

    --Task--

    Get phrase according to petal number( num > 0)

    --Data--

    Input: petal number

    Phrases:
    *I love you 1
    *a little 2
    *a lot 3
    *passionately 4
    *madly 5
    *not at all 6

    //Play

        assertEquals("I love you", Sid.howMuchILoveYou(1));
        assertEquals("a little", Sid.howMuchILoveYou(2));
        assertEquals("not at all", Sid.howMuchILoveYou(6));

    //Manual

1-6|7-12(1-6)|13-18(1-6)

--Sub problem1--**SOLVED**
-- Solve this task with 1-6 numbers only--

-------------------------
1 ->  1
2 -> 2
3 -> 3
4 -> 4
5 -> 5
6 -> 6

"0"
-------------------------
7->1 ===> 7 - 6 = 1
8->2 ===> 8 - 6 = 2
9->3
10->4
11->5
12->6

"6"
-------------------------
13-> 1 -->      13 - 12
14-> 2  14- 12
15-> 3
16-> 4 16 - 12
17-> 5
18-> 6
"12"
---------------------

19 -> 1 --> 19 - 18
20 ->
21 ->
22 ->
23 ->
24 ->

"18
---------------------

Data:

0, 6, 12,18 .....

first,second,third,forth,... sextet


first sextet:

0<n<7

fun(n)->n

second sextet...

7 < n < 12

fun(n-6)->n

third sextet...

13 < n < 18

fun(n-12)->n

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Current data summary:

fun (a-(b * 6)) -> n
first sextet => fun(3) -> 3 - (0*6) -> returns 3
second sextet =>  fun(7) - > 7 - 1*6 => returns 1
-//- => fun(13) -> {  13- (2*6)  } => returns 1

Current data summary2:

a > 0

fun(a-(b*6)) -> n

a - > input

b - > sextet index

--Sub problem2--
-- get b from a--


1-6|0
7-12|1
13-18|2
19-24|3




Current data summary2:

a > 0

fun(a-(b*6)) -> n

a - > input

b - > sextet index

b -> result of division -> a/6
reminder -> n

sextet max - > 6,12,18,24 -> (new max -> max+6)
sextext min -> 1,7,13,19 -> (min-> min + 6)


7-6->1->7/6 reminder 1

8-6....... reminder 2

13/6 -> 2/reminder ->1

-----------------------------------------------------

Current data summary3:

a > 0

fun(a-(b*6)) -> n

a - > input

b - > sextet index

b -> result of division -> a/6
reminder -> n

sextet max - > 6,12,18,24 -> (new max -> max+6)
sextext min -> 1,7,13,19 -> (min-> min + 6)

------------------------------------------------

fun(2)-> {

2%6 -> b = 0

} n-> 2

fun(14) -> {

14%6 -> 2=> b=2

14- 2*6

----------------------------------------------

fun(int a) {

int b = a%6

palet num = a-(b*6)

hash.get(palet)=> phrase

}

}

    //Algorithm

    --Sub problem1--**SOLVED**
    --algorithm--
    number - 1-6? => String(phrase) - HashMap

    //Pseudocode

    //Code

     */


}


