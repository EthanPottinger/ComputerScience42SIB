package testing.stacksqueues;

import collections.Queue;
import collections.Stack;
import testing.advancedclasses.Athlete;
import tools.Randomizer;

/**
 *
 * @author e.pottinger
 */
public class StacksQueuesTest {
    
    public StacksQueuesTest() {
        System.out.println("Stacks and Queues started.........");
        
        Stack<Boolean> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Double> stack3 = new Stack<>();
        Stack<Character> stack4 = new Stack<>();
        Stack<String> stack5 = new Stack<>();
        Stack<Athlete> stack6 = new Stack<>();
        
        Queue<Boolean> queue1 = new Queue<>();
        Queue<Integer> queue2 = new Queue<>();
        Queue<Double> queue3 = new Queue<>();
        Queue<Character> queue4 = new Queue<>();
        Queue<String> queue5 = new Queue<>();
        Queue<Athlete> queue6 = new Queue<>();
        
        output(stack1, stack2, stack3, stack4, stack5, stack6, 
                queue1, queue2, queue3, queue4, queue5, queue6);
        
        final int MAX = 10;
        
        for(int i = 0; i < MAX; i++) {
            stack1.push(Randomizer.generate());
            stack2.push(Randomizer.generate(Integer.MIN_VALUE, Integer.MAX_VALUE));
            stack3.push(Randomizer.generate(Double.MIN_VALUE, Double.MAX_VALUE));
            stack4.push(Randomizer.generate('a', 'z'));
            stack5.push(Randomizer.generate(5, 'a', 'z'));
            stack6.push(Randomizer.generateAthlete());
            
            queue1.enqueue(Randomizer.generate());
            queue2.enqueue(Randomizer.generate(Integer.MIN_VALUE, Integer.MAX_VALUE));
            queue3.enqueue(Randomizer.generate(Double.MIN_VALUE, Double.MAX_VALUE));
            queue4.enqueue(Randomizer.generate('a', 'z'));
            queue5.enqueue(Randomizer.generate(5, 'a', 'z'));
            queue6.enqueue(Randomizer.generateAthlete());
        }
        
        output(stack1, stack2, stack3, stack4, stack5, stack6,
                queue1, queue2, queue3, queue4, queue5, queue6);
            
        for(int i = 0; i < MAX; i++) {
            System.out.println(stack1.size());
            System.out.println(stack2.size());
            System.out.println(stack3.size());
            System.out.println(stack4.size());
            System.out.println(stack5.size());
            System.out.println(stack6.size());
            
            System.out.println(queue1.size());
            System.out.println(queue2.size());
            System.out.println(queue3.size());
            System.out.println(queue4.size());
            System.out.println(queue5.size());
            System.out.println(queue6.size());
            
            System.out.println(stack1.isEmpty());
            System.out.println(stack2.isEmpty());
            System.out.println(stack3.isEmpty());
            System.out.println(stack4.isEmpty());
            System.out.println(stack5.isEmpty());
            System.out.println(stack6.isEmpty());
            
            System.out.println(queue1.isEmpty());
            System.out.println(queue2.isEmpty());
            System.out.println(queue3.isEmpty());
            System.out.println(queue4.isEmpty());
            System.out.println(queue5.isEmpty());
            System.out.println(queue6.isEmpty());
        }
        
        for(int i = 0; i < MAX; i++) {
            System.out.println(stack1.peek());
            System.out.println(stack2.peek());
            System.out.println(stack3.peek());
            System.out.println(stack4.peek());
            System.out.println(stack5.peek());
            System.out.println(stack6.peek());
            
            System.out.println(queue1.peek());
            System.out.println(queue2.peek());
            System.out.println(queue3.peek());
            System.out.println(queue4.peek());
            System.out.println(queue5.peek());
            System.out.println(queue6.peek());
        }
        
        for(int i = 0; i < MAX; i++) {
            System.out.println(stack1.pop());
            System.out.println(stack2.pop());
            System.out.println(stack3.pop());
            System.out.println(stack4.pop());
            System.out.println(stack5.pop());
            System.out.println(stack6.pop());
            
            System.out.println(queue1.dequeue());
            System.out.println(queue2.dequeue());
            System.out.println(queue3.dequeue());
            System.out.println(queue4.dequeue());
            System.out.println(queue5.dequeue());
            System.out.println(queue6.dequeue());
            
            output(stack1, stack2, stack3, stack4, stack5, stack6,
                queue1, queue2, queue3, queue4, queue5, queue6);
        }
        
        output(stack1, stack2, stack3, stack4, stack5, stack6,
                queue1, queue2, queue3, queue4, queue5, queue6);
        
        System.out.println("Stacks and Queues Completed.......");
    }

    private void output(Stack<Boolean> stack1, Stack<Integer> stack2, Stack<Double> stack3, Stack<Character> stack4, Stack<String> stack5, Stack<Athlete> stack6, Queue<Boolean> queue1, Queue<Integer> queue2, Queue<Double> queue3, Queue<Character> queue4, Queue<String> queue5, Queue<Athlete> queue6) {
        System.out.println(stack1.toString());
        System.out.println(stack2.toString());
        System.out.println(stack3.toString());
        System.out.println(stack4.toString());
        System.out.println(stack5.toString());
        System.out.println(stack6.toString());
        
        System.out.println(queue1.toString());
        System.out.println(queue2.toString());
        System.out.println(queue3.toString());
        System.out.println(queue4.toString());
        System.out.println(queue5.toString());
        System.out.println(queue6.toString());
    }
    
}
