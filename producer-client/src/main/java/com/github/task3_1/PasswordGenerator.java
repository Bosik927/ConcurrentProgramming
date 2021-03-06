package com.github.task3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Stanisław Fiuta
 * Date: 9/2/2018
 * Time: 2:02 PM
 */
public class PasswordGenerator {

    private PasswordGeneratorEntity entity;
    private List<String> charCategories;

    private PasswordGenerator() {
        throw new UnsupportedOperationException("Empty constructor is not supported.");
    }

    public PasswordGenerator(PasswordGeneratorEntity entity) {
        this.entity = entity;
    }

    public PasswordGeneratorEntity getEntity() {
        return entity;
    }

    public List<String> getCharCategories() {
        return charCategories;
    }

    public String generatePassword(int length) {
        if (length <= 0) {
            return "";
        }

        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());

        charCategories = new ArrayList<>(4);

        if (entity.isUseLower()) {
            charCategories.add(PasswordGeneratorEntity.LOWER_LETTERS);
        }
        if (entity.isUseUpper()) {
            charCategories.add(PasswordGeneratorEntity.UPPER_LETTERS);
        }
        if (entity.isUseDigits()) {
            charCategories.add(PasswordGeneratorEntity.DIGITS);
        }
        if (entity.isUsePunctuation()) {
            charCategories.add(PasswordGeneratorEntity.PUNCTUATION);
        }

        for (int i = 0; i < length; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        return new String(password);
    }
}
