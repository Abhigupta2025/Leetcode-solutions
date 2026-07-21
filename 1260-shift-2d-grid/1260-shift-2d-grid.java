class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            res.add(row);
        }
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int val = ((r * n + c) + k) % (m * n);
                int rc = val / n;
                int cl = val % n;

                res.get(rc).set(cl, grid[r][c]);
            }
        }
        return res;
    }
}