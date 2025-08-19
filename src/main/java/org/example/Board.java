package org.example;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<Integer, Integer> snakes;
    private Map<Integer, Integer> ladders;

    public Board() {
        snakes = new HashMap<>();
        ladders = new HashMap<>();
        initializeBoard();
    }

    private void initializeBoard() {
        snakes.put(36, 19);
        snakes.put(65, 35);
        snakes.put(87, 32);
        snakes.put(97, 21);
        ladders.put(7, 33);
        ladders.put(37, 85);
        ladders.put(51, 72);
        ladders.put(61, 99);
    }

    public int checkPosition(int position) {
        if (snakes.containsKey(position)) {
            System.out.println("Oops! Bitten by snake from " + position + " → " + snakes.get(position));
            return snakes.get(position);
        } else if (ladders.containsKey(position)) {
            System.out.println("Yay! Climbed a ladder from " + position + " → " + ladders.get(position));
            return ladders.get(position);
        }
        return position;
    }
}
