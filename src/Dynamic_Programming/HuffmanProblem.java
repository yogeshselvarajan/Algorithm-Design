package Dynamic_Programming;

class Node
{
    private String data;
    private int frequency;
    private Node left;
    private Node right;

    public Node(String element, int freq){
        data = element;
        frequency = freq;
        left = null;
        right = null;
    }

    public void setRightChild(Node n)
    {
        right = n;
    }

    public void setLeftChild(Node n){
        left = n;
    }

    public Node getRightChild(){
        return right;
    }

    public Node getLeftChild(){
        return left;
    }

    public String getData(){
        return data;
    }

    public int getFrequency(){
        return frequency;
    }

    public static int getLeftChildIndex(int index) {
        if(((2*index) <= MinHeap.heapSize) && (index >= 1)) {
            return 2*index;
        }
        return -1;
    }

    public static int getRightChildIndex(int index) {
        if((((2*index)+1) <= MinHeap.heapSize) && (index >= 1)) {
            return (2*index)+1;
        }
        return -1;
    }

    public static int getParentIndex(int index){
        if((index > 1 && (index <= MinHeap.heapSize))) {
            return index/2;
        }
        return -1;
    }

    public static void inorder(Node root) {
        if(root != null) {
            inorder(root.getLeftChild());
            System.out.print(" "+root.getFrequency()+" ");
            inorder(root.getRightChild());
        }
    }
}

class MinHeap
{
    public static int heapSize = 0;
    public static final int heapArraySize = 100;
    public static final int INF = 100000;

    public static void minHeapify(Node A[], int index) {
        int leftChildIndex = Node.getLeftChildIndex(index);
        int rightChildIndex = Node.getRightChildIndex(index);

        int smallest = index;

        if ((leftChildIndex <= MinHeap.heapSize) && (leftChildIndex>0)) {
            if (A[leftChildIndex].getFrequency() < A[smallest].getFrequency()) {
                smallest = leftChildIndex;
            }
        }

        if ((rightChildIndex <= MinHeap.heapSize) && (rightChildIndex>0)) {
            if (A[rightChildIndex].getFrequency() < A[smallest].getFrequency()) {
                smallest = rightChildIndex;
            }
        }

        // smallest is not the node, node is not a heap
        if (smallest != index) {
            Node temp;
            temp = A[index];
            A[index] = A[smallest];
            A[smallest] = temp;
            minHeapify(A, smallest);
        }
    }
}

class MinQueue {

    public static void insert(Node A[], Node a, int key) {
        MinHeap.heapSize++;
        A[MinHeap.heapSize] = a;
        int index = MinHeap.heapSize;
        while((index>1) && (A[Node.getParentIndex(index)].getFrequency() > a.getFrequency())) {
            Node temp;
            temp = A[index];
            A[index] = A[Node.getParentIndex(index)];
            A[Node.getParentIndex(index)] = temp;
            index = Node.getParentIndex(index);
        }
    }

    public static Node[] buildQueue(Node c[], int size) {
        Node[] a = new Node[MinHeap.heapArraySize];
        for(int i=0; i<size; i++) {
            MinQueue.insert(a, c[i], c[i].getFrequency());
        }
        return a;
    }

    public static Node extractMin(Node A[]) {
        Node minm = A[1];
        A[1] = A[MinHeap.heapSize];
        MinHeap.heapSize--;
        MinHeap.minHeapify(A, 1);
        return minm;
    }
}

class Huffman {
    public static Node greedyHuffmanCode(Node C[]) {
        Node[] minQueue = MinQueue.buildQueue(C, 6);

        while(MinHeap.heapSize > 1) {
            Node h = MinQueue.extractMin(minQueue);
            Node i = MinQueue.extractMin(minQueue);
            Node z = new Node("NONE", h.getFrequency()+i.getFrequency());
            z.setLeftChild(h);
            z.setRightChild(i);
            MinQueue.insert(minQueue, z, z.getFrequency());
        }
        return MinQueue.extractMin(minQueue);
    }

    public static void main(String[] args) {
        Node a = new Node("a", 42);
        Node b = new Node("b", 20);
        Node c = new Node("c", 5);
        Node d = new Node("d", 10);
        Node e = new Node("e", 11);
        Node f = new Node("f", 12);

        Node[] C = {a, b, c, d, e ,f};

        Node z = Huffman.greedyHuffmanCode(C);
        Node.inorder(z);
        System.out.println("");
    }
}