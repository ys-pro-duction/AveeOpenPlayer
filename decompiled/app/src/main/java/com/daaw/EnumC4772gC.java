package com.daaw;

/* JADX INFO: renamed from: com.daaw.gC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4772gC {
    ALL(true, true),
    NONE(false, false),
    SOURCE(true, false),
    RESULT(false, true);

    public final boolean B;
    public final boolean C;

    EnumC4772gC(boolean z, boolean z2) {
        this.B = z;
        this.C = z2;
    }

    public boolean a() {
        return this.C;
    }

    public boolean c() {
        return this.B;
    }
}
