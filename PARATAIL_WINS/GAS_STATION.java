// THIS QUESTION WAS INTERESTING AS I WAS ABLE TO GET TO THE 50% OF THE TEST CASES ON JUST MY OWN UNDERSTADING OF THE ISSUE , THE GOOD THING WA STHAT THE REAL SOLUTION HAS SAM EAAPROACH AS MINE AND WAS NOT TOO FAR OFF 

//  BTW TGS IS A MEDIUM LEVEL PROBLEM.


class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalGas < totalCost) {
            return -1;
        }

        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return start;        
    }
}




