/*
    https://leetcode.com/problems/richest-customer-wealth/description/
 * 1672. Richest Customer Wealth
 * 
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
 */
package Linear_search;

public class l_1672_richest_customer_wealth {
    public static void main(String[] args) {
            int[][] accounts = {{1,2,3},{3,2,1}};

            int maxMoney =  maximumWealth(accounts);
            System.out.println(maxMoney);

    }
        static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int wealthofcustomer = wealthOfACustomer(accounts[row]);
           if (maxWealth < wealthofcustomer) {
            maxWealth = wealthofcustomer;
           }
        }
        return maxWealth;
    }

    static int wealthOfACustomer(int[] moneyInBanks){
        int wealth = 0;
        for (int bank : moneyInBanks) {
            wealth = wealth + bank;
        }
        return wealth;
    }
    
}
