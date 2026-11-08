class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {

        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Long> levelSums = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            long sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode curr = queue.poll();

                sum += curr.val;

                if (curr.left != null) {
                    queue.add(curr.left);
                }

                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }

            levelSums.add(sum);
        }

        if (levelSums.size() < k) {
            return -1;
        }

        Collections.sort(levelSums, Collections.reverseOrder());

        return levelSums.get(k - 1);
    }
}