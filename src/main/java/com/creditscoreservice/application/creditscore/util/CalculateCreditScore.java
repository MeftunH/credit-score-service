package com.creditscoreservice.application.creditscore.util;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class CalculateCreditScore {
    private static final long MULTIPLIER = 6364136223846793005L;
    private static final AtomicLong streamUniquer
            = new AtomicLong(System.identityHashCode(CalculateCreditScore.class));
    private long state;
    private long inc;
    private static long streamUniquer() {
        for (;;) {
            long current = streamUniquer.get();
            long next = current * 181783497276652981L;
            if (streamUniquer.compareAndSet(current, next))
                return next;
        }
    }
    public void seed(long initState, long initSeq) {
        state = 0;
        inc = 2 * initSeq + 1;
        nextInt();
        state += initState;
        nextInt();
    }
    public void seed() {
        seed(System.nanoTime(), streamUniquer());
    }
    public CalculateCreditScore() {
        seed();
    }
    public int nextInt() {
        long oldState = state;

        state = oldState * MULTIPLIER + inc;
        int xorShifted = (int) (((oldState >>> 18) ^ oldState) >>> 27);
        int rot = (int) (oldState >>> 59);
        int score = ((xorShifted >>> rot) | (xorShifted << (-rot & 31))) % 1300;
        //positive integer
        if (score < 0)
            return nextInt();
        return score;
    }
    public int nextBits(int bits) {
        return nextInt() >>> (32 - bits);
    }
}
