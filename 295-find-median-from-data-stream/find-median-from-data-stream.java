class MedianFinder {
    Queue<Integer> minheap;
    Queue<Integer> maxheap;
    public MedianFinder() {
       minheap = new PriorityQueue<>();
       maxheap  = new PriorityQueue<>((a,b) -> b-a);
    }
    
    public void addNum(int num) {
        maxheap.add(num);
        minheap.add(maxheap.poll());
        if(minheap.size()>maxheap.size()){
            maxheap.add(minheap.poll());
        }
    }
    
    public double findMedian() {
        if(minheap.size() == maxheap.size()){
            return (double) (maxheap.peek() + minheap.peek()) * 0.5;
        }
       
            return (double) maxheap.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */