
public class BoundedCounter {

    // copy here the class BoundedCounter from last weeks assignment 78
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;

    }

    public void next() {
        // write code here
        if (this.value >= this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public String toString() {
        // write code here
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue() {
        // write here code that returns the value
        return this.value;

    }

    public void setValue(int value) {
        if (value >= 0 && value <= this.upperLimit) {
            this.value = value;
        } else {
            this.value = this.value;
        }

    }
}
