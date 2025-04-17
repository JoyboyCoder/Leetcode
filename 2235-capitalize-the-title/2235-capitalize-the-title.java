class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < 3) {
                arr[i] = arr[i].toLowerCase();
            } else {
                String word = "";
                char ch = arr[i].charAt(0);
                word += Character.toUpperCase(ch);
                for (int j = 1; j < arr[i].length(); j++) {
                    char ch2 = arr[i].charAt(j);
                    word += Character.toLowerCase(ch2);
                }
                arr[i] = word;
            }
        }
        String sentence = String.join(" ", arr);
        return sentence;
    }
}