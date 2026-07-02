package com.daaw;

/* JADX INFO: renamed from: com.daaw.o63, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6990o63 extends AbstractC4449f43 implements V43 {
    private static final C6990o63 zzb;
    private int zzd;
    private String zze = "";

    static {
        C6990o63 c6990o63 = new C6990o63();
        zzb = c6990o63;
        AbstractC4449f43.D(C6990o63.class, c6990o63);
    }

    public static C6711n63 M() {
        return (C6711n63) zzb.j();
    }

    public static /* synthetic */ void O(C6990o63 c6990o63, String str) {
        c6990o63.zzd |= 1;
        c6990o63.zze = str;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C6990o63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C6711n63(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
