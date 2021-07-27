package project.java;

import project.Games.Deck;
import project.datastructure.queue;
import project.datastructure.stack;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
    private static Deck deck;
    private static Deck.card[] arr;
    private static queue<Deck.card> queue1;
    private static queue<Deck.card> queue2;
    private static queue<Deck.card> queue3;
    private static project.datastructure.stack<Deck.card> stack1;


    public static void main(String[] args) {
        logger log=new logger();
        log.startLogger();
        queue1 = new queue<>();
        queue2 = new queue<>();
        queue3 = new queue<>();
        stack1 = new stack<>();
        deck = Deck.getInstace();
        arr = deck.pick(21);
        int choice;

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + "- " + arr[i]);
            log.logMessage(i + 1 + "- " + arr[i]);
        }
        System.out.println("\n\"choose one card from these  cards and click enter ...." +
                "\"");
        log.logMessage("\n\"choose one card from   cards and click enter ...." +
                "\"");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 21; i++) {
            stack1.push(arr[i]);
        }

        for (int i = 1; i <= 3; i++) {


            for (int j = 1; j <= 7; j++) {
                queue1.enqueue(stack1.pop());
                queue2.enqueue(stack1.pop());
                queue3.enqueue(stack1.pop());
            }

            Iterator<Deck.card> iterator = queue1.iterator();
            Iterator<Deck.card> iterator2 = queue2.iterator();
            Iterator<Deck.card> iterator3 = queue3.iterator();

            System.out.println("\tGroup 1             \t\tGroup2               \t\tGroup3\n");
            log.logMessage("\tGroup 1             \t\tGroup2               \t\tGroup3\n");
            Deck.card a1,a2,a3;
            while (iterator.hasNext()&&iterator2.hasNext()&&iterator3.hasNext()){
                a1=iterator.next();
                a2=iterator2.next();
                a3=iterator3.next();
                System.out.println("\t"+a1+"                    "+a2+"                   "+a3);
                log.logMessage("\t"+a1+"                    "+a2+"                   "+a3);
            }
            System.out.println("\n\nwhich group contain the card? (1 or 2 or 3)\n\n");
            log.logMessage("\n\nwhich group contain the card? (1 or 2 or 3)\n\n");
            choice=-1;
            choice=scanner.nextInt();
            log.logMessage(String.valueOf(choice));
            stack1.clear();
            switch (choice){
                case 1:
                    copyFromStackToQueue(stack1,queue2);
                    copyFromStackToQueue(stack1,queue1);
                    copyFromStackToQueue(stack1,queue3);
                    break;

                case 2:
                    copyFromStackToQueue(stack1,queue1);
                    copyFromStackToQueue(stack1,queue2);
                    copyFromStackToQueue(stack1,queue3);
                    break;
                case 3:
                    copyFromStackToQueue(stack1,queue2);
                    copyFromStackToQueue(stack1,queue3);
                    copyFromStackToQueue(stack1,queue1);
                    break;

                default:
                    System.out.println("invalid input");
                    System.exit(1);
                    break;

            }
        }
        System.out.println("....");
        log.logMessage("....");
        int counter=1;
        Deck.card result = null;
        Iterator<Deck.card> s=stack1.iterator();
        while (counter<11){
           s.next();
           counter++;
        }

        Deck.card res=s.next();
      System.out.println("your card is "+res);
        log.logMessage("your card is "+res);
        log.logMessage("----------------------------------------------------------------------------------------------------------------------");
        log.endLogger();
    }

    private static void copyFromStackToQueue(stack s,queue q){
        for (int i=1;i<=7;i++){
            s.push(q.dequeue());
        }
    }

}
