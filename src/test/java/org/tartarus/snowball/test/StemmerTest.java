package org.tartarus.snowball.test;

import org.junit.Assert;
import org.junit.Test;
import org.tartarus.snowball.SnowballStemmer;
import org.tartarus.snowball.ext.englishStemmer;

public class StemmerTest {

    @Test
    public void englishSanityCheck() {

        SnowballStemmer snowballStemmer = new englishStemmer();
        snowballStemmer.setCurrent("Jumps");
        snowballStemmer.stem();
        String result = snowballStemmer.getCurrent();

        Assert.assertEquals("Jump", result);
    }
}
