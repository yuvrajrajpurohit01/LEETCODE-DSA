class MyCircularQueue {
    int[] q;
    int cnt;
    int k1;
    int head;
    public MyCircularQueue(int k) {
        q = new int[k];
        k1 = k;
        cnt = 0;
        head=0;

    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        q[(head+cnt)%k1] = value;
        cnt++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        head = (head+1)%k1;
        cnt--;
        return true; 
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return q[head];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return(q[(head+cnt-1)%k1]);
    }
    
    public boolean isEmpty() {
        return cnt == 0;
    }
    
    public boolean isFull() {
        return cnt == k1;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */