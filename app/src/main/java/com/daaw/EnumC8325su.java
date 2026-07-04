package com.daaw;

/* JADX INFO: renamed from: com.daaw.su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC8325su {
    SECOND(0),
    MINUTE(1),
    HOUR(2),
    DAY_OF_MONTH(3),
    MONTH(4),
    DAY_OF_WEEK(5),
    YEAR(6),
    DAY_OF_YEAR(7);

    public int B;

    EnumC8325su(int i) {
        this.B = i;
    }

    public int a() {
        return this.B;
    }
}
