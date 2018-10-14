import java.util.*;
class ques1 {  
    public static void main(String[] args) {   
        List<String> fruitList = new ArrayList<>();  
          
        fruitList.add("Mango");  
        fruitList.add("Banana");  
        fruitList.add("Apple");  
        fruitList.add("Strawberry");  
        fruitList.add("Pineapple");  
        String[] item = fruitList.toArray(new String[fruitList.size()]);  
        for(String s : item){  
            System.out.print(s+"  ");  
        }  
        int a=item.length;
        System.out.print("\nSize of First Array: "+a);
        int b= (a*15)/10;
        String[] arr = Arrays.copyOf(item, b);
        System.out.print("\n");
        System.out.print("\n");        
        for(String s1 : arr){  
            System.out.print(s1+"  ");  
        }  
        System.out.print("\nNew array size : "+arr.length);   
    }  
}  