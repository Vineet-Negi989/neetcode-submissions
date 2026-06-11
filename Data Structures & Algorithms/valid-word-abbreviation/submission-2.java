class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0; // pointer for word
        int j = 0; // pointer for abbr

        while (i < word.length() && j < abbr.length()) {

            if (Character.isDigit(abbr.charAt(j))) {

                // leading zero is invalid
                if (abbr.charAt(j) == '0') {
                    return false;
                }

                int num = 0;

                // read the entire number
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    num = num * 10 + (abbr.charAt(j) - '0');
                    j++;
                }

                i += num; // skip characters in word

            } else {

                // letters must match
                if (word.charAt(i) != abbr.charAt(j)) {
                    return false;
                }

                i++;
                j++;
            }
        }

        return i == word.length() && j == abbr.length();
    }
}