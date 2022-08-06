package com.jaydenxiao.androidfire.ui.news.event;

public class ChannelItemMoveEvent {
    private final int fromPosition;
    private final int toPosition;

    public ChannelItemMoveEvent(int fromPosition, int toPosition) {
        this.fromPosition = fromPosition;
        this.toPosition = toPosition;

    }

    public int getFromPosition() {
        return fromPosition;
    }

    public int getToPosition() {
        return toPosition;
    }
}
