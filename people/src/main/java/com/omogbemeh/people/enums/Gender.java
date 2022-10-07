package com.omogbemeh.people.enums;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Gender {
    BOY,
    GIRL;

    public List<Gender> getGenders() {
        return Arrays.asList(values());
    }

}
