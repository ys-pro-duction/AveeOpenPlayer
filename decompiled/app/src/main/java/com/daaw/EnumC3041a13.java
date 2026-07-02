package com.daaw;

/* JADX INFO: renamed from: com.daaw.a13, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3041a13 implements InterfaceC6143l43 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final InterfaceC6422m43 J = new InterfaceC6422m43() { // from class: com.daaw.Z03
    };
    public final int B;

    EnumC3041a13(int i) {
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
