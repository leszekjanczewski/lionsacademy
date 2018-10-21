public String[] wordsFront(String[] words, int n) {
  String[] newWords = new String[words.length-(words.length-n)];
  for (int i = 0; i < n; i++) {
    newWords[i] = words[i];
  }
  return newWords;
}
