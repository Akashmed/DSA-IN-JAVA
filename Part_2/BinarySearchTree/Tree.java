package Part_2.BinarySearchTree;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return ("Node=" + value);
        }
    }

    private Node root;

    public void insert(int value) {
        var newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        var current = root;
        while (true) {
            if (value > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            } else {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            }
        }
    }

    public boolean find(int value) {
        return lookup(value) != null;
    }

    private Node lookup(int value) {
        Node current = root;

        while (current != null) {
            if (value > current.value) {
                current = current.rightChild;
            } else {
                current = current.leftChild;
            }
        }

        return current;
    }
}
