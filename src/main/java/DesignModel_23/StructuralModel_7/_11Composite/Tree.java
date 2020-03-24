package DesignModel_23.StructuralModel_7._11Composite;

public class Tree {

    TreeNode root;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("Build the tree finished~");//A->B->C

        TreeNode node = tree.root;
        while (node != null) {
            System.out.println(node.getName());
            if (node.getChildren() != null) {
                if (node.getChildren().hasMoreElements()) {
                    node = node.getChildren().nextElement();
                } else {
                    node = null;
                }

            }
        }
    }
}
