class MinStack {
    Stack<Integer> stack;     
    Stack<Integer> minStack; // Har stage par jo absolute minimum number hoga use top par rakhega

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>(); // Memory runtime allocation initialization step
    }

    public void push(int value) {
        stack.push(value); 
        
        //Agar shadow locker khali h YA naya element purane chal rahe min se chota/barabar (<=) h
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value); // Toh shadow minStack ke top par bhi use dump kar do
        }
    }

    public void pop() {
        // Agar jo number drop ho raha h, wahi hamara shadow minimum anchor tha
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop(); // Toh use shadow backup memory table se bhi clear karo
        }
        stack.pop(); 
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek(); 
    }
}
