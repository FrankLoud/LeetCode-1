package com.leetcode.oj;


/**
 * Regular Expression Matching
 * 
 * Implement regular expression matching with support for '.' and '*'.
 * 
 * '.' Matches any single character. 
 * '*' Matches zero or more of the preceding element.
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * Some examples: 
 * isMatch("aa","a") → false 
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false 
 * isMatch("aa", "a*") → true 
 * isMatch("aa", ".*") → true 
 * isMatch("ab", ".*") → true 
 * isMatch("aab", "c*a*b") → true
 * 
 * @author rekinyz
 */
public class RegularExpressionMatching {

	public boolean isMatch(String s, String p) {
		if (p.contains(".")||p.contains("*")){
			int sLen = s.length(), pLen = p.length();
			if (pLen == 1 || p.charAt(1) != '*') {
				if (sLen < 1 || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0))){
					return false;
				}
				return isMatch(s.substring(1), p.substring(1));
			} else {
				int i = -1;
				while (i < sLen && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))) {
					if (isMatch(s.substring(i + 1), p.substring(2)))
						return true;
					i++;
				}
				return false;
			}
		}
		return s.equals(p);
	}
	
}
