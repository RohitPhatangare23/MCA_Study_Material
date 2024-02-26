
import java.util.*;

public class WebPageClicks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> webGraph = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            int numLinks = scanner.nextInt();
            List<Integer> links = new ArrayList<>(numLinks);
            for (int j = 0; j < numLinks; j++) {
                links.add(scanner.nextInt());
            }
            webGraph.add(links);
        }

        int startPage = scanner.nextInt();
        int endPage = scanner.nextInt();
        int result = minClicksToReachEnd(startPage, endPage, webGraph);

        if (result == Integer.MAX_VALUE) {
            System.out.println(-1); // Cannot reach the end page
        } else {
            System.out.println(result);
        }
    }

    public static int minClicksToReachEnd(int startPage, int endPage, List<List<Integer>> webGraph) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[webGraph.size()];
        int[] clicksToPage = new int[webGraph.size()];

        queue.add(startPage);
        visited[startPage - 1] = true;
        clicksToPage[startPage - 1] = 0;

        while (!queue.isEmpty()) {
            int currentPage = queue.poll();

            if (currentPage == endPage) {
                return clicksToPage[currentPage - 1];
            }

            for (int nextPage : webGraph.get(currentPage - 1)) {
                if (!visited[nextPage - 1]) {
                    queue.add(nextPage);
                    visited[nextPage - 1] = true;
                    clicksToPage[nextPage - 1] = clicksToPage[currentPage - 1] + 1;
                }
            }
        }

        return Integer.MAX_VALUE; // Cannot reach the end page
    }
}


