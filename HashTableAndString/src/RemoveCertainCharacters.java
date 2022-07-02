import java.util.HashSet;
import java.util.Set;

public class RemoveCertainCharacters {

    public String remove(String input, String target) {

        if (input == null || target == null) {
            return input;
        } else if (input.equals(target)) {
            return null;
        }

        char[] inputArr = input.toCharArray();
        Set<Character> targetSet = buildSet(target);

        int slow = 0;
        for (int fast = 0; fast < inputArr.length; fast++) {

            if (!targetSet.contains(inputArr[fast])) {
                inputArr[slow++] = inputArr[fast];
            }
        }

        return new String(inputArr, 0, slow);


    }

    private Set<Character> buildSet(String target) {

        Set<Character> targetSet = new HashSet<>();
        char[] targetArr = target.toCharArray();

        for (int i = 0; i < targetArr.length; i ++) {
            targetSet.add(targetArr[i]);
        }

        return targetSet;

    }

    public static void main(String[] args) {
        String input= "sucker";
        String target = "er";

        RemoveCertainCharacters sol = new RemoveCertainCharacters();
        String res = sol.remove(input,target);

        System.out.println(res);
    }


}
