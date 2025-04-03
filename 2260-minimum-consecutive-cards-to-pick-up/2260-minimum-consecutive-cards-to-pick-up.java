class Solution {
    public int minimumCardPickup(int[] cards) {
           HashMap<Integer, Integer> lastSeen = new HashMap<>();
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < cards.length; i++) {
            if (lastSeen.containsKey(cards[i])) {
                minLength = Math.min(minLength, i - lastSeen.get(cards[i]) + 1);
            }
            lastSeen.put(cards[i], i);
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}