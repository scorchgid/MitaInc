package com.scorchgid.mita;

public class Enum {
    public enum Suit {
        HEART("H"), DIAMOND("D"), SPADE("S"), CLUB("C");
        private String key;

        Suit(String keyValue) {
            key = keyValue;
        }

        public String getKey() {
            return key;
        }

        public static Suit getEnumValue(String keyValue) {
            keyValue = keyValue.toUpperCase();
            for (Suit value : Suit.values()) {
                if (value.getKey().equals(keyValue)) {
                    return value;
                }
            }
            throw new RuntimeException("Could not find Suit for Key: " + keyValue);
        }
    }

    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }
}