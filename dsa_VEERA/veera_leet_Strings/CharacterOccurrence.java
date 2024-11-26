package veera_leet_Strings;

import java.util.HashMap;
import java.util.Map;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online


class HelloWorld {
 public static void main(String[] args) {
     String input = "Hello automation world";
     countCharacterOccurance(input);
 }
 
 public static void countCharacterOccurance(String str){
     
 Map<Character,Integer> charCountMap = new HashMap<>();
 str = str.toLowerCase();
 for(char ch : str.toCharArray()){
     if(ch!=' '){
  charCountMap.put(ch,charCountMap.getOrDefault(ch,0)+1);       
     }
 }
 
 for(Map.Entry<Character,Integer> entry :charCountMap.entrySet() )
 System.out.println("Characters"+entry.getKey()+
          "occuarances" + entry.getValue()+ "times");
     
 }
}
