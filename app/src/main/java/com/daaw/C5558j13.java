package com.daaw;

/* JADX INFO: renamed from: com.daaw.j13, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5558j13 extends AbstractC4449f43 implements V43 {
    private static final C5558j13 zzb;
    private int zzd;
    private int zze;

    static {
        C5558j13 c5558j13 = new C5558j13();
        zzb = c5558j13;
        AbstractC4449f43.D(C5558j13.class, c5558j13);
    }

    public static C5281i13 O() {
        return (C5281i13) zzb.j();
    }

    public static C5558j13 Q() {
        return zzb;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C5558j13();
        }
        AbstractC5002h13 abstractC5002h13 = null;
        if (i2 == 4) {
            return new C5281i13(abstractC5002h13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final EnumC3041a13 N() {
        int i = this.zzd;
        EnumC3041a13 enumC3041a13 = EnumC3041a13.UNKNOWN_HASH;
        EnumC3041a13 enumC3041a132 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : EnumC3041a13.SHA224 : EnumC3041a13.SHA512 : EnumC3041a13.SHA256 : EnumC3041a13.SHA384 : EnumC3041a13.SHA1 : EnumC3041a13.UNKNOWN_HASH;
        return enumC3041a132 == null ? EnumC3041a13.UNRECOGNIZED : enumC3041a132;
    }
}
