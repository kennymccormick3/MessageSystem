package com.sabri.messagesystem.controller;

import java.util.ArrayList;
import java.util.List;
//Decreasing by number of "a" in the words. Words that do not contain "a" are sorted by their lengths.
public class SortList {
	
	public static List<String> sortWords(List<String> words) {

        List<String> sortedList = new ArrayList<String>();
        
        //Until there are no words in the "words" list.
        while (!words.isEmpty()) {
            String bigger = "";
            int biggerCount = 0;

            for (String word : words) {
            	//Words that contains "a"
                int count = word.length() - word.replace("a", "").length();

                if (count > biggerCount) {
                    bigger = word;
                    biggerCount = count;
                }
                
                //Words that do not contain "a".
                if (count == biggerCount) {
                    if (word.length() > bigger.length()) {
                        bigger = word;
                        biggerCount = count;
                    }
                }
            }
            
            sortedList.add(bigger);
            words.remove(bigger);

        }
        return sortedList;
    }
	


}
