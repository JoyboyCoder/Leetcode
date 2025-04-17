class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase(); 
            if (arr[i].length() > 2) {
                char firstChar = Character.toUpperCase(arr[i].charAt(0));
                arr[i] = firstChar + arr[i].substring(1);
            }
        }
        return String.join(" ", arr);
    }
}