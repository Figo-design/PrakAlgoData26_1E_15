package P5;

public class Faktorial15 {
    int faktorialBF15;
    int faktorialDC15;

    // int faktorialBF15(int n15) {
    //     int fakto15 = 1;
    //     for (int i = 1; i <= n15; i++) {
    //         fakto15 = fakto15 * i;
    //     }
    //     return fakto15;
    // }

    int faktorialBF15(int n15) {
        int fakto15 = 1;
        int i = 1;

        while (i <= n15) {
            fakto15 = fakto15 * i;
            i++;
        }
        return fakto15;
    }

    int faktoriaDC15(int n15) {
        if (n15 == 1) {
            return 1;
        } else {
            int fakto15 = n15 * faktoriaDC15(n15 - 1);
            return fakto15;
        }
    }
}
