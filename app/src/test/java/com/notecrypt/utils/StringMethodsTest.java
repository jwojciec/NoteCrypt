package com.notecrypt.utils;

import static com.notecrypt.utils.StringMethods.containsIgnoreCase;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StringMethodsTest {

    private final static String TEST_PATH = "test_path";
    private final StringMethods stringMethods = StringMethods.getInstance();

    @Test
    public void When_CheckExtensionIsCalled_Expect_CorrectStringReturned() {
        assertThat(stringMethods.checkExtension(TEST_PATH), is("test_path.ncf"));
    }

    @Test
    public void When_GetNameDBIsCalled_Expect_CorrectStringReturned() {
        assertThat(stringMethods.getNameDB(TEST_PATH), is("test_path"));
    }

    @Test
    public void When_ContainsIgnoreCaseIsCalled_Expect_CorrectResult() {
        assertThat(containsIgnoreCase("STRING1", "StRiNg1"), is(true));
        assertThat(containsIgnoreCase("STRING1", "StRiNg12"), is(false));
    }
}