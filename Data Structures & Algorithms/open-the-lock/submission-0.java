class Solution {
    public int openLock(String[] deadends, String target) {

        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        if (dead.contains("0000")) {
            return -1;
        }

        queue.offer("0000");
        visited.add("0000");

        int moves = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int j = 0; j < size; j++) {

                String current = queue.poll();

                if (current.equals(target)) {
                    return moves;
                }

                for (int i = 0; i < 4; i++) {

                    char[] arr = current.toCharArray();

                    arr[i] = (char) ('0' + (arr[i] - '0' + 1) %10);

                    String next = new String(arr);

                    if (!visited.contains(next) &&                  !dead.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }

                    arr = current.toCharArray();

                    arr[i] = (char) ('0' + (arr[i] - '0' + 9) %10);

                    next = new String(arr);

                    if (!visited.contains(next)                 &&!dead.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}