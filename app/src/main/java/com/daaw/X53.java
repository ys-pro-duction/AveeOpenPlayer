package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class X53 extends AbstractC4449f43 implements V43 {
    private static final X53 zzb;
    private InterfaceC8095s43 zzd = AbstractC4449f43.x();

    static {
        X53 x53 = new X53();
        zzb = x53;
        AbstractC4449f43.D(X53.class, x53);
    }

    public static W53 M() {
        return (W53) zzb.j();
    }

    public static /* synthetic */ void O(X53 x53, V53 v53) {
        v53.getClass();
        InterfaceC8095s43 interfaceC8095s43 = x53.zzd;
        if (!interfaceC8095s43.zzc()) {
            x53.zzd = AbstractC4449f43.y(interfaceC8095s43);
        }
        x53.zzd.add(v53);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", V53.class});
        }
        if (i2 == 3) {
            return new X53();
        }
        T53 t53 = null;
        if (i2 == 4) {
            return new W53(t53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
