package com.v5analytics.webster;

public class TestParameterObjectExtended extends TestParameterObject {
    public TestParameterObjectExtended(String value) {
        super(value);
    }

    public static TestParameterObjectExtended parse(String value) {
        return new TestParameterObjectExtended(value);
    }
}
