package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class V53 extends AbstractC4449f43 implements V43 {
    private static final V53 zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        V53 v53 = new V53();
        zzb = v53;
        AbstractC4449f43.D(V53.class, v53);
    }

    public static U53 M() {
        return (U53) zzb.j();
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new V53();
        }
        T53 t53 = null;
        if (i2 == 4) {
            return new U53(t53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
