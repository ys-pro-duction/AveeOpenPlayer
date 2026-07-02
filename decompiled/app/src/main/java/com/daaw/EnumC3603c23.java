package com.daaw;

/* JADX INFO: renamed from: com.daaw.c23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3603c23 implements InterfaceC6143l43 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public static final InterfaceC6422m43 I = new InterfaceC6422m43() { // from class: com.daaw.b23
    };
    public final int B;

    EnumC3603c23(int i) {
        this.B = i;
    }

    public static EnumC3603c23 a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.B;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
