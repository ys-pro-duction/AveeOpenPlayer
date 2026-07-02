package com.daaw;

/* JADX INFO: renamed from: com.daaw.nD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6741nD1 implements InterfaceC6143l43 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    public static final InterfaceC6422m43 I = new InterfaceC6422m43() { // from class: com.daaw.lD1
    };
    public final int B;

    EnumC6741nD1(int i) {
        this.B = i;
    }

    public static EnumC6741nD1 a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.B);
    }

    public final int zza() {
        return this.B;
    }
}
