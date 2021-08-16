package challenges.java.javadeveloper.resolvendoalgoritimoscomjava;

import java.util.Scanner;
import java.util.Stack;

public class CoracaoDasCartas {

    Stack<Stack<Integer>> cardsStacks;

    public CoracaoDasCartas() {
        cardsStacks = new Stack<>();
    }

    public static void main(String[] args) {
        CoracaoDasCartas cardsInfo = new CoracaoDasCartas();

        Scanner inputScanner = new Scanner(System.in);

        int N = inputScanner.nextInt();
        int index = 0;

        while (N != 0) {
            cardsInfo.cardsStacks.add(new Stack<>());
            for (int i = 0; i < N; ++i) {
                cardsInfo.cardsStacks.get(index).add(inputScanner.nextInt());
                cardsInfo.cardsStacks.get(index).add(inputScanner.nextInt());
                cardsInfo.cardsStacks.get(index).add(inputScanner.nextInt());
            }
            N = inputScanner.nextInt();
            ++index;
        }

        cardsInfo.cardsStacks.forEach((stack) -> {
            int sum3 = 0;
            int countSums = 0;

            while (!stack.isEmpty()) {
                while (countSums < 3) {
                    if (!stack.isEmpty()) {
                        sum3 += stack.pop();
                        ++countSums;
                        if (sum3 % 3 == 0 && countSums == 3) {
                            countSums = 0;
                            if (stack.isEmpty()) {
                                System.out.println(1);
                            }
                            break;
                        }
                    } else {
                        System.out.println(0);
                        break;
                    }
                }

                if (countSums == 3) {
                    System.out.println(0);
                    break;
                }
            }
        });
    }
}