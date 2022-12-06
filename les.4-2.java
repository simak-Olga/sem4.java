    1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка. 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
    import java.util.*;

    public class les.4-2 {
        public static void main(String[] args) {
            ArrayList<Integer> arrInt = new ArrayList<>(List.of(1,2,5,9,12,20));
            System.out.println("Задан массив: "+ arrInt);
            System.out.println("Stack:");
            arrPrintToStack(arrInt);
            System.out.println("Queue:");
            arrPrintToQueue(arrInt);
        }
    
        static void arrPrintToStack(ArrayList<Integer> arrInt){
            Stack<Integer> integerStack = new Stack<>();
            integerStack.addAll(arrInt);
    //        for (Integer el: arrInt) {
    //            integerStack.push(el);
    //        }
            while (!integerStack.isEmpty()){
                System.out.println(integerStack.pop());
            }
        }
    
        static void arrPrintToQueue(ArrayList<Integer> arrInt){
            Queue<Integer> integerQueue = new LinkedList<>(arrInt);
            // перебор коллекции
            while(integerQueue.peek()!=null){
                // извлечение c начала
                System.out.println(integerQueue.remove());
            }
        }
    } 

