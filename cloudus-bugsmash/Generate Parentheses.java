import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        int[] cat = {1,1,2,5,14,42,132,429,1430}; // Catalan numbers
        List<String> res = new ArrayList<>(cat[n]); // Pre-allocate
        char[] buf = new char[n << 1]; // Buffer of size 2n
        dfs(res, buf, 0, 0, 0, n); // Start DFS
        return res;
    }

    private void dfs(List<String> r, char[] c, int i, int o, int cl, int m) {
        if (i == c.length) {
            r.add(new String(c));
            return;
        }
        if (o < m) {
            c[i] = '(';
            dfs(r, c, i + 1, o + 1, cl, m);
        }
        if (cl < o) {
            c[i] = ')';
            dfs(r, c, i + 1, o, cl + 1, m);
        }
    }
}
