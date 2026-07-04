package com.daaw;

/* JADX INFO: renamed from: com.daaw.tL2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8447tL2 extends AbstractC4449f43 implements V43 {
    private static final InterfaceC7259p43 zzb = new C7611qL2();
    private static final C8447tL2 zzd;
    private int zze;
    private InterfaceC6980o43 zzf = AbstractC4449f43.t();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C8447tL2 c8447tL2 = new C8447tL2();
        zzd = c8447tL2;
        AbstractC4449f43.D(C8447tL2.class, c8447tL2);
    }

    public static C8168sL2 M() {
        return (C8168sL2) zzd.j();
    }

    public static /* synthetic */ void O(C8447tL2 c8447tL2, String str) {
        str.getClass();
        c8447tL2.zze |= 1;
        c8447tL2.zzg = str;
    }

    public static /* synthetic */ void P(C8447tL2 c8447tL2, int i) {
        InterfaceC6980o43 interfaceC6980o43 = c8447tL2.zzf;
        if (!interfaceC6980o43.zzc()) {
            c8447tL2.zzf = AbstractC4449f43.u(interfaceC6980o43);
        }
        c8447tL2.zzf.g(2);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", C7889rL2.a, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C8447tL2();
        }
        C7611qL2 c7611qL2 = null;
        if (i2 == 4) {
            return new C8168sL2(c7611qL2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
