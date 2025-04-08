class Solution {
	public String findLongestWord(String s, List<String> dictionary) {

		String ans = "";
		String temp = "";
		Collections.sort(dictionary);
        System.out.println(dictionary);
		for (String ch : dictionary) {
			int j = 0;
			int len= ch.length();
			ch.charAt(j);
			for (int i = 0; i < s.length(); i++) {
				if (ch.charAt(j) == s.charAt(i)) {
					j++;
				}
				if (j == len) {
					temp = ch;
					break;
				}
			}
			if (temp.length() > ans.length()) {
				ans = temp;
			}
		}
		return ans;
	}
}