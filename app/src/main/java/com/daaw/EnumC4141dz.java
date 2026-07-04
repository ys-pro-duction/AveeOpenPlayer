package com.daaw;

/* JADX INFO: renamed from: com.daaw.dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4141dz {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    public final int B;

    EnumC4141dz(int i) {
        this.B = i;
    }

    public static EnumC4141dz a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int c() {
        return this.B;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.B);
    }
}
