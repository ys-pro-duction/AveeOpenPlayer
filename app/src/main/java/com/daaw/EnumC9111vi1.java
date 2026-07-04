package com.daaw;

/* JADX INFO: renamed from: com.daaw.vi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC9111vi1 {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
