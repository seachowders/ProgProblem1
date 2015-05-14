public class HeapNode
{  
   private int value;
   private int lineNum;
   public HeapNode(int value, int lineNum)
   {
      this.value = value;
      this.lineNum = lineNum;
   }
   
   public void setValue(int value)
   {
      this.value = value;
   }
   public void setLineNum(int lineNum)
   {
      this.lineNum = lineNum;
   }
   public int getValue()
   {
      return this.value;
   }
   public int getLineNum()
   {
      return this.lineNum;
   }
   

}