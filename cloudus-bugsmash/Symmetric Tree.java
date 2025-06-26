LeetCode Logo
Problem List
Debugging...
Debugging...









0
DCC Badge
Solve today's Daily Challenge to refresh your streak!

avatar
Avatar
Mallesh T
Access all features with our Premium subscription!
myLists
My Lists
notebook
Notebook
submissions
Submissions
progress
Progress
points
Points
Try New Features
Orders
My Playgrounds
Settings
Appearance
Sign Out
Premium
Description
Description
Accepted
Editorial
Editorial
Solutions
Solutions
Submissions
Submissions
Code


Testcase
Test Result
Test Result
Java
Auto





12345678910111213141516171819202122232425262728
    boolean isMirror(TreeNode left , TreeNode right)
    {
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.val!=right.val) return false;
        return isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
}
Saved
All Submissions

Accepted
200 / 200 testcases passed
Mallesh T
Mallesh T
submitted at Jun 26, 2025 22:35

Editorial

Solution
Runtime
0
ms
Beats
100.00%
Analyze Complexity
Memory
42.24
MB
Beats
11.84%
Analyze Complexity
Code
Java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        return isMirror(root.left,root.right);
    }
    boolean isMirror(TreeNode left , TreeNode right)
    {
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.val!=right.val) return false;
        return isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
}
View more
More challenges
366. Find Leaves of Binary Tree
297. Serialize and Deserialize Binary Tree
563. Binary Tree Tilt
Write your notes here
Select related tags
0/5
Search questions


