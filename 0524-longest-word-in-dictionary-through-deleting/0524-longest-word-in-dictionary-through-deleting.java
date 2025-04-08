class Solution {
	public String findLongestWord(String s, List<String> dictionary) {

		String answer = "";
		String temAnwer = "";
		Collections.sort(dictionary);

		for (String vocabulary : dictionary) {
			int pointer = 0;
			int vocabularyLength = vocabulary.length();
			vocabulary.charAt(pointer);

			for (int i = 0; i < s.length(); i++) {

				if (vocabulary.charAt(pointer) == s.charAt(i)) {

					pointer++;

				}

				if (pointer == vocabularyLength) {
					temAnwer = vocabulary;
					break;
				}

			}

			if (temAnwer.length() > answer.length()) {
				answer = temAnwer;
			}

		}

		return answer;
	}
}