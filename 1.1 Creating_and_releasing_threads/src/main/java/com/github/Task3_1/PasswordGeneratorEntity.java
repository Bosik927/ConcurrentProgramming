package com.github.Task3_1;

/**
 * @author Stanisław Fiuta
 * Date: 9/2/2018
 * Time: 1:41 PM
 */
public final class PasswordGeneratorEntity {

    public static final String LOWER_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPER_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String DIGITS = "0123456789";
    public static final String PUNCTUATION = "!@#$%&*()_+-=[]|,./?><";

    private final boolean useLower;
    private final boolean useUpper;
    private final boolean useDigits;
    private final boolean usePunctuation;

    public static String getLOWER() {
        return LOWER_LETTERS;
    }

    public static String getUPPER() {
        return UPPER_LETTERS;
    }

    public static String getDIGITS() {
        return DIGITS;
    }

    public static String getPUNCTUATION() {
        return PUNCTUATION;
    }

    public boolean isUseLower() {
        return useLower;
    }

    public boolean isUseUpper() {
        return useUpper;
    }

    public boolean isUseDigits() {
        return useDigits;
    }

    public boolean isUsePunctuation() {
        return usePunctuation;
    }

    private PasswordGeneratorEntity() {
        throw new UnsupportedOperationException("Empty constructor is not supported.");
    }
    private PasswordGeneratorEntity(Builder builder) {
        this.useLower = builder.useLower;
        this.useUpper = builder.useUpper;
        this.useDigits = builder.useDigits;
        this.usePunctuation = builder.usePunctuation;
    }

    public static class Builder {

        private boolean useLower;
        private boolean useUpper;
        private boolean useDigits;
        private boolean usePunctuation;

        public Builder() {
            this.useLower = false;
            this.useUpper = false;
            this.useDigits = false;
            this.usePunctuation = false;
        }

        public Builder useLower(boolean useLower) {
            this.useLower = useLower;
            return this;
        }

        public Builder useUpper(boolean useUpper) {
            this.useUpper = useUpper;
            return this;
        }

        public Builder useDigits(boolean useDigits) {
            this.useDigits = useDigits;
            return this;
        }

        public Builder usePunctuation(boolean usePunctuation) {
            this.usePunctuation = usePunctuation;
            return this;
        }

        public PasswordGeneratorEntity build() {
            return new PasswordGeneratorEntity(this);
        }
    }
}