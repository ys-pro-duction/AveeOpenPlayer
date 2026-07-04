package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public enum M03 implements O42 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);

    public static final InterfaceC8099s52 G = new InterfaceC8099s52() { // from class: com.daaw.EZ2
    };
    public final int B;

    M03(int i) {
        this.B = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.B);
    }
}
