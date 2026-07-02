package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public enum PK {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    public final long B;

    PK(long j) {
        this.B = j;
    }

    public long c() {
        return this.B;
    }
}
