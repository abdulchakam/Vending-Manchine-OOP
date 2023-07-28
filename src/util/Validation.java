package util;

import java.util.stream.LongStream;

public class Validation {

    public static boolean nominalInputValidation(long nominalInput) {
        long[] nominalValid = {2000L, 5000L, 10000L, 20000L, 50000L};
        return LongStream.of(nominalValid).anyMatch(x -> x == nominalInput);
    }
}
