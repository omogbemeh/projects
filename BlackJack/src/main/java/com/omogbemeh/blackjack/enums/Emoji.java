package com.omogbemeh.blackjack.enums;

public enum Emoji {
    DICE_EMOJI("\uD83C\uDFB2"),
    CASINO_EMOJI("\uD83C\uDFB0"),
    CRYSTAL_BALL_EMOJI("\uD83D\uDD2E");

    private String emoji;
    Emoji(String emojiUnicode) {
        this.emoji = emojiUnicode;
    }

    @Override
    public String toString() {
        return this.emoji;
    }
}
