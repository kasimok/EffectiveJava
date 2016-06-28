package com.evilisn.builder;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;

/**
 * Created by evilisn(kasimok@163.com)) on 2016/6/28.
 */
public class NutritionFactsTest {
    @org.junit.Test
    public void testBuilder() {
        NutritionFacts nutritionFacts = new NutritionFactsBuilder(10,11).setCalories(1).createNutritionFacts();
        MatcherAssert.assertThat(nutritionFacts.getCalories(),CoreMatchers.is(1));
        MatcherAssert.assertThat(nutritionFacts.getSodium(),CoreMatchers.is(0));
    }

}