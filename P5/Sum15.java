package P5;

public class Sum15 {
    double keuntungan15[];

    Sum15(int el15) {
        keuntungan15 = new double[el15];
    }

    double totalBF15() {
        double total15 = 0;
        for (int i = 0; i < keuntungan15.length; i++) {
            total15 = total15 + keuntungan15[i];
        }
        return total15;
    }

    double totalDC15(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid15 = (l + r) / 2;
        double lsum15 = totalDC15(arr, l, mid15);
        double rsum15 = totalDC15(arr, mid15 + 1, r);
        return lsum15 + rsum15;
    }
}
