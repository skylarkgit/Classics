public class EggDroppingProblem {
    static int eggDrop(int n, int k) 
	{
	    // Your code here
        // Base case:: 
        // x egg 1 floor attempts = 1
        // 1 egg x floor attempts = x
        
        // x eggs and k floors
        // find f such that 
        // 1 + min(max((x,k-f), (x-1, f-1)))   f C (1 - k)
        
        int[][] drops = new int[11][51];
        
        for (int f = 1; f <= k; f++) {
            drops[1][f] = f;
            drops[0][f] = Integer.MAX_VALUE;
        }
        for (int e = 1; e <= n; e++) {
            drops[e][0] = 0;
        }
        drops[0][0] = 1;
        
        for (int e = 2; e <= n; e++) {
            for (int j = 1; j <= k; j++) {
                int minAttempts = Integer.MAX_VALUE;
                for (int f = 1; f <= j; f++) {
                    minAttempts = Math.min(minAttempts, Math.max(drops[e][j-f], drops[e-1][f-1]));
                }
                drops[e][j] = minAttempts + 1;
            }
        }
        
        return drops[n][k];
	}
}
