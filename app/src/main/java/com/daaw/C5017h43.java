package com.daaw;

/* JADX INFO: renamed from: com.daaw.h43, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5017h43 extends F32 implements InterfaceC2366Tp2 {
    private static final C5017h43 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C5017h43 c5017h43 = new C5017h43();
        zzb = c5017h43;
        F32.q(C5017h43.class, c5017h43);
    }

    public static G33 A() {
        return (G33) zzb.e();
    }

    public static /* synthetic */ void x(C5017h43 c5017h43, String str) {
        str.getClass();
        c5017h43.zzd |= 1;
        c5017h43.zze = str;
    }

    public static /* synthetic */ void y(C5017h43 c5017h43, String str) {
        str.getClass();
        c5017h43.zzd |= 2;
        c5017h43.zzf = str;
    }

    public static /* synthetic */ void z(C5017h43 c5017h43, int i) {
        c5017h43.zzd |= 4;
        c5017h43.zzg = i;
    }

    @Override // com.daaw.F32
    public final Object u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return F32.n(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C5017h43();
        }
        AbstractC3608c33 abstractC3608c33 = null;
        if (i2 == 4) {
            return new G33(abstractC3608c33);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
