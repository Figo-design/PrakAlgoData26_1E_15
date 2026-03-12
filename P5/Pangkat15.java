package P5;

public class Pangkat15 {
    int nilai15;
    int pangkat15;

    Pangkat15(int n15, int p15) {
        this.nilai15 = n15;
        this.pangkat15 = p15;
    }

    // int pangkatBF15(int a15, int n15) {
    //     int hasil15 = 1;
    //     for (int i = 0; i < n15; i++) {
    //         hasil15 = hasil15 * a15;
    //     }
    //     return hasil15;
    // }

    int pangkatBF15() {
        int hasil15 = 1;
        for (int i = 0; i < pangkat15; i++) {
            hasil15 = hasil15 * nilai15;
        }
        return hasil15;
    }

    int pangkatDC15(int a15, int n15) {
        if (n15 == 1) {
            return a15;
        } else {
            if (n15%2 == 1) {
                return (pangkatDC15(a15, n15/2) * pangkatDC15(a15, n15/2) * a15);
            } else {
                return (pangkatDC15(a15, n15/2) * pangkatDC15(a15, n15/2));
            }
        }
    }
}
