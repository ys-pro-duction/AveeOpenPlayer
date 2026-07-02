package com.daaw;

/* JADX INFO: renamed from: com.daaw.o13, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6965o13 extends AbstractC4449f43 implements V43 {
    private static final C6965o13 zzb;
    private String zzd = "";
    private AbstractC9213w33 zze = AbstractC9213w33.C;
    private int zzf;

    static {
        C6965o13 c6965o13 = new C6965o13();
        zzb = c6965o13;
        AbstractC4449f43.D(C6965o13.class, c6965o13);
    }

    public static C6128l13 M() {
        return (C6128l13) zzb.j();
    }

    public static C6965o13 P() {
        return zzb;
    }

    public static /* synthetic */ void S(C6965o13 c6965o13, String str) {
        str.getClass();
        c6965o13.zzd = str;
    }

    public static /* synthetic */ void T(C6965o13 c6965o13, AbstractC9213w33 abstractC9213w33) {
        abstractC9213w33.getClass();
        c6965o13.zze = abstractC9213w33;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C6965o13();
        }
        AbstractC5840k13 abstractC5840k13 = null;
        if (i2 == 4) {
            return new C6128l13(abstractC5840k13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final EnumC6686n13 N() {
        int i = this.zzf;
        EnumC6686n13 enumC6686n13 = EnumC6686n13.UNKNOWN_KEYMATERIAL;
        EnumC6686n13 enumC6686n132 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : EnumC6686n13.REMOTE : EnumC6686n13.ASYMMETRIC_PUBLIC : EnumC6686n13.ASYMMETRIC_PRIVATE : EnumC6686n13.SYMMETRIC : EnumC6686n13.UNKNOWN_KEYMATERIAL;
        return enumC6686n132 == null ? EnumC6686n13.UNRECOGNIZED : enumC6686n132;
    }

    public final AbstractC9213w33 Q() {
        return this.zze;
    }

    public final String R() {
        return this.zzd;
    }
}
