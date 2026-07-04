package com.daaw;

/* JADX INFO: renamed from: com.daaw.eJ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4235eJ2 extends AbstractC4449f43 implements V43 {
    private static final C4235eJ2 zzb;
    private InterfaceC8095s43 zzd = AbstractC4449f43.x();

    static {
        C4235eJ2 c4235eJ2 = new C4235eJ2();
        zzb = c4235eJ2;
        AbstractC4449f43.D(C4235eJ2.class, c4235eJ2);
    }

    public static C3400bJ2 N() {
        return (C3400bJ2) zzb.j();
    }

    public static /* synthetic */ void Q(C4235eJ2 c4235eJ2, C3957dJ2 c3957dJ2) {
        c3957dJ2.getClass();
        InterfaceC8095s43 interfaceC8095s43 = c4235eJ2.zzd;
        if (!interfaceC8095s43.zzc()) {
            c4235eJ2.zzd = AbstractC4449f43.y(interfaceC8095s43);
        }
        c4235eJ2.zzd.add(c3957dJ2);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C3957dJ2.class});
        }
        if (i2 == 3) {
            return new C4235eJ2();
        }
        AbstractC3121aJ2 abstractC3121aJ2 = null;
        if (i2 == 4) {
            return new C3400bJ2(abstractC3121aJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzd.size();
    }
}
