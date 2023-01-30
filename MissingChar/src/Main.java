class MissingChar {
    public static void main(String[] args) {
        String word = "Robocop";
        int characterIndex = 3;

        if (args.length >= 2) {
            word = args[0];
            characterIndex = Integer.parseInt(args[1]);
        }

            String cut = word.substring(characterIndex,characterIndex+1);
        System.out.println(cut);


    }
}