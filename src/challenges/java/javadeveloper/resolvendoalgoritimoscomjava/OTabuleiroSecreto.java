package challenges.java.javadeveloper.resolvendoalgoritimoscomjava;

import java.util.*;

public class OTabuleiroSecreto {

    int type, X, R;

    public OTabuleiroSecreto(int type, int X, int R) {
        this.type = type;
        this.X = X;
        this.R = R;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        ArrayList<OTabuleiroSecreto> boardOps = new ArrayList<>();
        ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>(N/* , boardElements */);

        for (int i = 0; i < N; i++) {
            board.add(new ArrayList<Integer>(Collections.nCopies(N, 0)));
        }

        scanner.nextLine();

        for (int i = 0; i < Q; i++) {
            String[] lineArgs = scanner.nextLine().split(" ");
            OTabuleiroSecreto op = null;
            int type = Integer.parseInt(lineArgs[0]);
            int X = Integer.parseInt(lineArgs[1]);

            if (lineArgs.length == 2) {
                if (X < 1 || X > N) {
                    System.exit(1);
                }
                op = new OTabuleiroSecreto(type, X - 1, -1);
            } else {
                int R = Integer.parseInt(lineArgs[2]);
                if ((X < 1 && X > N) || (R < 0 && N > 50)) {
                    System.exit(1);
                }
                op = new OTabuleiroSecreto(type, X - 1, R);
            }

            boardOps.add(op);
        }

        HashMap<Integer, Integer> valueFrequencyMap = null;

        for (var op : boardOps) {
            if (op.type == 1) {
                for (int i = 0; i < board.get(op.X).size(); i++) {
                    board.get(op.X).set(i, op.R);
                }
            } else if (op.type == 2) {
                board.forEach(row -> row.set(op.X, op.R));
            } else if (op.type == 3) {
                valueFrequencyMap = new HashMap<>();

                for (var elem : board.get(op.X)) {
                    changeValueFrequency(elem, valueFrequencyMap);
                }

                System.out.println(getMostFrequentValue(valueFrequencyMap));
            } else if (op.type == 4) {
                valueFrequencyMap = new HashMap<>();

                for (var row : board) {
                    int elem = row.get(op.X);
                    changeValueFrequency(elem, valueFrequencyMap);
                }

                System.out.println(getMostFrequentValue(valueFrequencyMap));
            }
        }

        scanner.close();
    }

    static void changeValueFrequency(Integer elem, HashMap<Integer, Integer> valueFrequencyMap) {
        if (valueFrequencyMap.containsKey(elem)) {
            valueFrequencyMap.put(elem, valueFrequencyMap.get(elem) + 1);
        } else {
            valueFrequencyMap.put(elem, 1);
        }
    }

    static int getMostFrequentValue(HashMap<Integer, Integer> valueFrequencyMap) {
        int mostFrequentValue = -1;
        int valueFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : valueFrequencyMap.entrySet()) {
            if (entry.getValue() > valueFrequency) {
                valueFrequency = entry.getValue();
                mostFrequentValue = entry.getKey();
            } else if (entry.getValue() == valueFrequency && entry.getKey() > mostFrequentValue) {
                valueFrequency = entry.getValue();
                mostFrequentValue = entry.getKey();
            }
        }
        return mostFrequentValue;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", X: " + X + ", R: " + R;
    }
}