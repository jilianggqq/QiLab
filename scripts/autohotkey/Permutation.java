// String aabbbccc a2b3c3
// abc abc
// bbbeee b3e3
// aaabbb
import java.util.*;
public class Solution3 {
  public static List<String> permutation(String input) {
    // qiqiang
    List<String> res = new ArrayList<>();
    if (input == null || input.isEmpty()) return res;
    char[] arr = input.toCharArray();
    Arrays.sort(arr);
    // aaa
    dfs(res, new ArrayList<>(), arr, 0);
    return res;
  }

  public static void dfs(List<String> res, List<Integer> tmp, char[] arr, int idx) {
    if (tmp.size() == arr.length) {
      StringBuilder sb = new StringBuilder();
      for (int i : tmp ) sb.append(arr[i]);
      res.add(sb.toString());
      return;
    }

    for (int i = 0; i < arr.length; i++) {
      // qq
      if (tmp.contains(i)) continue;
      if (i != 0 && arr[i] == arr[i-1] && !tmp.contains(i - 1)) {
        continue;
      }
      tmp.add(i);
      dfs(res, tmp, arr, i + 1);
      tmp.remove(tmp.size() - 1);
    }
  }

  public static void main(String[] strs) {
      List<String> res = permutation("abcc");
      res.forEach(s -> System.out.println(s));
  }

}
