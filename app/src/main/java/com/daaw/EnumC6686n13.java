package com.daaw;

/* JADX INFO: renamed from: com.daaw.n13, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6686n13 implements InterfaceC6143l43 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    public static final InterfaceC6422m43 I = new InterfaceC6422m43() { // from class: com.daaw.m13
    };
    public final int B;

    EnumC6686n13(int i) {
        this.B = i;
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
