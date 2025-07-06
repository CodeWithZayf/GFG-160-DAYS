import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int ele1 = -1, ele2 = -1, cnt1 = 0, cnt2 = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (ele1 == arr[i]) {
                cnt1++;
            } else if (ele2 == arr[i]) {
                cnt2++;
            } else if (cnt1 == 0) {
                ele1 = arr[i];
                cnt1 = 1;
            } else if (cnt2 == 0) {
                ele2 = arr[i];
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for (int num : arr) {
            if (num == ele1) cnt1++;
            else if (num == ele2) cnt2++;
        }

        int threshold = len / 3;

        if (cnt1 > threshold) result.add(ele1);
        if (cnt2 > threshold) result.add(ele2);

        result.sort(null);

        return result;
    }
}