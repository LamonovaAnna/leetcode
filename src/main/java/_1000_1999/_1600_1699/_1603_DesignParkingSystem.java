package _1000_1999._1600_1699;

// 1603. Design Parking System
public class _1603_DesignParkingSystem {
    class ParkingSystem {
        int b = 0;
        int m = 0;
        int s = 0;

        public ParkingSystem(int big, int medium, int small) {
            b = big;
            m = medium;
            s = small;
        }

        public boolean addCar(int carType) {
            switch (carType) {
                case 1:
                    if (b == 0) {
                        return false;
                    }
                    b--;
                break;
                case 2:
                    if (m == 0) {
                        return false;
                    }
                    m--;
                break;
                case 3:
                    if (s == 0) {
                        return false;
                    }
                    s--;
                break;
            }
            return true;
        }
    }
}
