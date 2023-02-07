package com.creditscoreservice.application.creditscore.util;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class CalculateCreditScore {
    private static final long MULTIPLIER = 6364136223846793005L;
    private static final AtomicLong streamUniquifier
            = new AtomicLong(System.identityHashCode(CalculateCreditScore.class));
    private long state;
    private long inc;
    private static long streamUniquifier() {
        for (;;) {
            long current = streamUniquifier.get();
            long next = current * 181783497276652981L;
            if (streamUniquifier.compareAndSet(current, next))
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
        seed(System.nanoTime(), streamUniquifier());
    }
    public CalculateCreditScore() {
        seed();
    }
    public int nextInt() {
        long oldState = state;

        state = oldState * MULTIPLIER + inc;
        int xorShifted = (int) (((oldState >>> 18) ^ oldState) >>> 27);
        int rot = (int) (oldState >>> 59);
        return Integer.rotateRight(xorShifted, rot);
    }
    public int nextBits(int bits) {
        return nextInt() >>> (32 - bits);
    }
    public float nextFloat() {
        float score = nextBits(32) / ((float)(1 << 24));
        if (score < 0)
            return nextFloat();
    return score * 10;
    }
}
