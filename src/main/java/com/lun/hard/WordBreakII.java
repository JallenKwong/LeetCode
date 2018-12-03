package com.lun.hard;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class WordBreakII {
	
	
	public List<String> wordBreak(String s, List<String> wordDict) {
	    return DFS(s, wordDict, new HashMap<String, LinkedList<String>>());
	}       

	// DFS function returns an array including all substrings derived from s.
	List<String> DFS(String s, List<String> wordDict, HashMap<String, LinkedList<String>>map) {
	    if (map.containsKey(s)) 
	        return map.get(s);
	        
	    LinkedList<String> res = new LinkedList<String>();     
	    if (s.length() == 0) { //递归结束条件
	        res.add("");
	        return res;
	    }
	    for (String word : wordDict) {
	        if (s.startsWith(word)) {
	            List<String>sublist = DFS(s.substring(word.length()), wordDict, map);
	            for (String sub : sublist) 
	                res.add(word + (sub.isEmpty() ? "" : " ") + sub);               
	        }
	    }       
	    map.put(s, res);
	    
	    return res;
	}
	
}

/*运行轨迹示例
输入：

s = "catsanddog"
wordDict = ["cat", "cats", "and", "sand", "dog"]
map = new HashMap = {};

DFS("catsanddog", wordDict, map)

res = []

for (String word : wordDict)
	word = "cat"
		sublist = DFS("sanddog", wordDict, map)
			res = []<--------------------#1 res
			for (String word : wordDict)
				...
				word = "sand"
					sublist = DFS("dog", wordDict, map)
						res = []
						for (String word : wordDict)
							...
							word = "dog"
								sublist = DFS("", wordDict, map) = []
								for (String sub : sublist)
									res.add("dog")//<--------------------------------
						res = ["dog"]
						map.put("dog", ["dog"])
						return res = ["dog"]
						
					for (String sub : sublist)
						res.add("sand dog")//<--------------------------------
				...
			map.put("sanddog",["sand dog"])
			return res = ["sand dog"]
			
		for (String sub : sublist)
			res.add("cat sand dog")<--------------------#1 res
			
	word = "cats"
		sublist = DFS("anddog", wordDict, map)
			res = []
			for (String word : wordDict)
				...
				word = "and"
					sublist = DFS("dog", wordDict, map)
						res = []
						for (String word : wordDict)
							...
							word = "dog"
								sublist = DFS("", wordDict, map) = []
								for (String sub : sublist)
									res.add("dog")//<--------------------------------
						res = ["dog"]
						map.put("dog", ["dog"])
						return res = ["dog"]
						
					for (String sub : sublist)
						res.add("and dog")//<--------------------------------		
				...
			map.put("anddog", ["and dog"]);
			return res = ["and dog"]
			
		for (String sub : sublist)
			res.add("cats and dog");<--------------------#1 res
	...
map.put("catsanddog", ["cat sand dog", "cats and dog"]); //{anddog=[and dog], sanddog=[sand dog], dog=[dog], catsanddog=[cat sand dog, cats and dog]}

输出：return  res = ["cat sand dog", "cats and dog"]


*/

