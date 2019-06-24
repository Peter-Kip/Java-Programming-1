
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int centsAdded = this.cents + added.cents;
        int eurosAdded = this.euros + added.euros;

        if (centsAdded > 99) {
            eurosAdded += centsAdded / 100;
            centsAdded %= 100;
        }

        Money totalMoney = new Money(eurosAdded, centsAdded);
        return totalMoney;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {
        int centsMinus = 0;
        int eurosMinus = 0;
        if (this.cents < decremented.cents) {
            centsMinus = this.cents + 100 - decremented.cents;
            eurosMinus = this.euros - 1 - decremented.euros;
            if (eurosMinus < 0) {
                eurosMinus = 0;
                centsMinus = 0;
            }
        } else {
            centsMinus = this.cents - decremented.cents;
            eurosMinus = this.euros - decremented.euros;
            if (eurosMinus < 0) {
                eurosMinus = 0;
                centsMinus = 0;
            }
        }

        Money result = new Money(eurosMinus, centsMinus);

        return result;
    }

}
