package com.daaw;

/* JADX INFO: renamed from: com.daaw.i03, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5276i03 implements X52 {
    public static final X52 a = new C5276i03();

    @Override // com.daaw.X52
    public final boolean c(int i) {
        M03 m03 = M03.BROADCAST_ACTION_UNSPECIFIED;
        return (i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : M03.ALTERNATIVE_BILLING_ACTION : M03.LOCAL_PURCHASES_UPDATED_ACTION : M03.PURCHASES_UPDATED_ACTION : M03.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}
