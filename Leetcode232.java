class MyQueue {
    static ArrayList <Integer> queue;
    public MyQueue() {
        queue = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        int a = queue.get(0);
        queue.remove(0);
        return a;
    }
    
    public int peek() {
        int a = queue.get(0);
        return a;
    }
    
    public boolean empty() {
        if(queue.isEmpty()) return true;
        else return false;
    }
}