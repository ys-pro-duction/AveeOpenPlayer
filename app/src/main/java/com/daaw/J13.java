package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class J13 extends AbstractC4449f43 implements V43 {
    private static final J13 zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        J13 j13 = new J13();
        zzb = j13;
        AbstractC4449f43.D(J13.class, j13);
    }

    public static I13 M() {
        return (I13) zzb.j();
    }

    public static /* synthetic */ void O(J13 j13, String str) {
        str.getClass();
        j13.zzd = str;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new J13();
        }
        G13 g13 = null;
        if (i2 == 4) {
            return new I13(g13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
