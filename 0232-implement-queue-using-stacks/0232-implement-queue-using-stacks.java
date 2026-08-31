class MyQueue {
    
    public Stack<Integer> Stack1;
    public Stack<Integer> Stack2;

    public MyQueue()
    {
        Stack1 = new Stack<>();
        Stack2 = new Stack<>();
    }
    
    public void push(int x)
    {
        Stack1.push(x);
    }

    public int pop()
    {
        shiftStacks();
        return Stack2.pop();
    }

    public int peek()
    {
        shiftStacks();
        return Stack2.peek();
    }
    
    public boolean empty()
    {
        return Stack1.isEmpty() && Stack2.isEmpty();
    }
    
    private void shiftStacks()
    {
        if (Stack2.isEmpty())
        {
            while (!Stack1.isEmpty())
            {
                Stack2.push(Stack1.pop());
            }
        }
    }
}