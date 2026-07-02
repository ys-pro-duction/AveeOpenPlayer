package com.daaw;

/* JADX INFO: renamed from: com.daaw.mw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6662mw1 extends AbstractC4449f43 implements V43 {
    private static final C6662mw1 zzb;
    private int zzd;
    private InterfaceC8095s43 zze = AbstractC4449f43.x();
    private AbstractC9213w33 zzf = AbstractC9213w33.C;
    private int zzg = 1;
    private int zzh = 1;

    static {
        C6662mw1 c6662mw1 = new C6662mw1();
        zzb = c6662mw1;
        AbstractC4449f43.D(C6662mw1.class, c6662mw1);
    }

    public static C6383lw1 M() {
        return (C6383lw1) zzb.j();
    }

    public static /* synthetic */ void O(C6662mw1 c6662mw1, AbstractC9213w33 abstractC9213w33) {
        InterfaceC8095s43 interfaceC8095s43 = c6662mw1.zze;
        if (!interfaceC8095s43.zzc()) {
            c6662mw1.zze = AbstractC4449f43.y(interfaceC8095s43);
        }
        c6662mw1.zze.add(abstractC9213w33);
    }

    public static /* synthetic */ void P(C6662mw1 c6662mw1, AbstractC9213w33 abstractC9213w33) {
        c6662mw1.zzd |= 1;
        c6662mw1.zzf = abstractC9213w33;
    }

    public static /* synthetic */ void Q(C6662mw1 c6662mw1, int i) {
        c6662mw1.zzh = 4;
        c6662mw1.zzd = 4 | c6662mw1.zzd;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", C4978gw1.a, "zzh", C4410ew1.a});
        }
        if (i2 == 3) {
            return new C6662mw1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C6383lw1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
