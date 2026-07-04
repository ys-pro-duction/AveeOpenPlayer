package com.daaw;

/* JADX INFO: renamed from: com.daaw.g13, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4723g13 extends AbstractC4449f43 implements V43 {
    private static final C4723g13 zzb;
    private int zzd;
    private C5558j13 zze;
    private int zzf;
    private int zzg;

    static {
        C4723g13 c4723g13 = new C4723g13();
        zzb = c4723g13;
        AbstractC4449f43.D(C4723g13.class, c4723g13);
    }

    public static C4434f13 N() {
        return (C4434f13) zzb.j();
    }

    public static C4723g13 P() {
        return zzb;
    }

    public static C4723g13 Q(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C4723g13) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void S(C4723g13 c4723g13, C5558j13 c5558j13) {
        c5558j13.getClass();
        c4723g13.zze = c5558j13;
        c4723g13.zzd |= 1;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C4723g13();
        }
        AbstractC4155e13 abstractC4155e13 = null;
        if (i2 == 4) {
            return new C4434f13(abstractC4155e13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzf;
    }

    public final C5558j13 R() {
        C5558j13 c5558j13 = this.zze;
        return c5558j13 == null ? C5558j13.Q() : c5558j13;
    }
}
