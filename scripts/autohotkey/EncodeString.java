// sorted [2,3,55,65]
// [4, 5, 1, 2, 3]
// 3,2,1,5,4
class Solution2 {
  public static int find(int[] arr, int target) {
    if (arr == null || arr.length == 0) return -1;
    int n = arr.length;
    int st = 0, ed = n - 1;
    //[1, 2] 2
    while (st + 1 < ed) {
      int mid = st + (ed - st) / 2;
      if (arr[mid] == target) return mid;
      if (arr[mid] <= arr[ed]) {
        // mid to ed is sorted.
        if (target > arr[mid] && target <= arr[ed]) {
          st = mid + 1;
        } else {
          ed = mid - 1;
        }
      } else {
        // st to mid is sorted.
        if (target >= arr[st] && target < arr[mid]) {
          ed = mid - 1;
        } else {
          st = mid + 1;
        }
      }
    }

    if (arr[st] == target) return st;
    if (arr[ed] == target) return ed;
    return -1;
  }

  public static int binarySearch(int[] arr, int st, int ed) {
    while (st <= ed) {
      int mid = st + (ed - st) / 2;
      if (arr[mid] == target) return mid;
      if (arr[mid] < target) {
        st = mid + 1;
      } else {
        ed = mid - 1;
      }
    }
    return -1;
  }

  public static int findTopIdx(int[] arr) {
    int st = 0, ed = arr.length - 1;
    while (st + 1 < ed) {
      int mid = st + (ed - st) / 2;
      if (arr[mid] > arr[0]) {
        st = mid;
      } else {
        ed = mid;
      }
    }
    if (arr[st] >= arr[ed]) {
      return st;
    }
    return ed;
  }
}
