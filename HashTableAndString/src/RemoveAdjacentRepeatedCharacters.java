public class RemoveAdjacentRepeatedCharacters {


    public String deDup(String input) {

        if (input.isEmpty() || input == null) {
            return input;
        }

        char[] array = input.toCharArray();
        if (array.length == 1) {
            return input;
        }
        int end = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] != array [end - 1]) {
                array[end++] = array[i];
            }

        }

        return new String(array, 0, end);


    }


    public static void main(String[] args) {
        String input = "aaabbbbbbccccd";

        RemoveAdjacentRepeatedCharacters sol = new RemoveAdjacentRepeatedCharacters();

        String res = sol.deDup(input);

        System.out.println(res);
    }



}
