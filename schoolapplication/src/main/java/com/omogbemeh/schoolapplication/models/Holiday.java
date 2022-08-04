package com.omogbemeh.schoolapplication.models;

import lombok.Data;

@Data
public  class Holiday {
    private final String day;
    private final String reason;
    private final Type type;

    public enum Type {
        FEDERAL("Federal"),
        FESTIVAL("Festival");

        private final String name;
        Type(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

}
