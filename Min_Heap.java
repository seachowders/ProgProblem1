public class Min_Heap
{
   private HeapNode[] heap;
   private int size;
   private int maxSize;
   private static final int FRONT = 0;
   
   public Min_Heap(int maxSize)
   {  
      this.maxSize = maxSize;
      this.size = 0;
      heap = new HeapNode[this.maxSize];
   
   }

   private int parent(int index)
   {
      return index/2;
   }
   
   private int leftChild(int index)
   {
      return (index *2);
   }
   
   private int rightChild(int index)
   {
      return (index*2) +1;
   }
   
   private boolean isLeaf(int index)
   {
      if(index >= (size/2) && index <= size)
      {
         return true;
      }
      return false;
   }
   
   private void swap(int from, int to)
   {
      HeapNode temp;
      temp = heap[from];
      heap[from] = heap[to];
      heap[to] = temp;      
   }
   
   private void min_Heapify(int index)
   {
      if(!isLeaf(index))
      {
         if(heap[index].getValue() > heap[leftChild(index)].getValue() || heap[index].getValue() > heap[rightChild(index)].getValue())         {
            if(heap[leftChild(index)].getValue() < heap[rightChild(index)].getValue())
            {
               swap(index, leftChild(index));
               min_Heapify(leftChild(index));
            }
            else
            {
               swap(index, rightChild(index));
               min_Heapify(rightChild(index));
            }
         }
      }
   }
   
   public void insert(HeapNode element)//need to alter this 
   {
      this.size++;
      this.heap[(this.size)-1] = new HeapNode(-11111, -11111);
      minHeapIncreaseKey(this.heap, this.size-1, element);
   }
   
   private void minHeapIncreaseKey(HeapNode[] heap, int size, HeapNode element)
   {
      heap[size] = element;    
      while(heap[size].getValue() < heap[parent(size)].getValue() && size > 0)
      {
         swap(size, parent(size));
         size = parent(size);
      }
   
   }
}