class MissingChar {
    public static void main(String[] args) {
  
        String word = "Robocop";
        int characterIndex = 3;

        if (args.length >= 2) {
            word = args[0];
            characterIndex = Integer.parseInt(args[1]);
        }

        String result = word.substring(0,characterIndex);
        String result2 = word.substring(characterIndex+1,word.length());
        System.out.println(result + " " + result2);
    }
}
