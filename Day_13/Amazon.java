package New_13;

public class Amazon {
    private int lipstick;

    public void setLipstick(int lipstick) {
        if (lipstick > 0) {
            this.lipstick = lipstick;
        } else {
            System.out.println("Product price cannot be negative");
        }
    }
        public int getLipstick () {
            return lipstick;
        }
    }
