package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class K13 extends AbstractC4449f43 implements V43 {
    private static final K13 zzb;
    private int zzd;
    private InterfaceC8095s43 zze = AbstractC4449f43.x();

    static {
        K13 k13 = new K13();
        zzb = k13;
        AbstractC4449f43.D(K13.class, k13);
    }

    public static H13 M() {
        return (H13) zzb.j();
    }

    public static /* synthetic */ void P(K13 k13, J13 j13) {
        j13.getClass();
        InterfaceC8095s43 interfaceC8095s43 = k13.zze;
        if (!interfaceC8095s43.zzc()) {
            k13.zze = AbstractC4449f43.y(interfaceC8095s43);
        }
        k13.zze.add(j13);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", J13.class});
        }
        if (i2 == 3) {
            return new K13();
        }
        G13 g13 = null;
        if (i2 == 4) {
            return new H13(g13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
