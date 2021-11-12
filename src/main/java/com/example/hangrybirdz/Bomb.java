package com.example.hangrybirdz;

public class Bomb  implements IBomb{
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void increment(int input) {
        count += input;
    }

    @Override
    public void decrement(int input) {
        count -= input;
    }


}
