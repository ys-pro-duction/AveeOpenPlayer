package com.daaw;

/* JADX INFO: renamed from: com.daaw.sv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8331sv1 extends AbstractC4449f43 implements V43 {
    private static final C8331sv1 zzb;
    private int zzd;
    private int zze = 2;

    static {
        C8331sv1 c8331sv1 = new C8331sv1();
        zzb = c8331sv1;
        AbstractC4449f43.D(C8331sv1.class, c8331sv1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzd", "zze", C8610tv1.a});
        }
        if (i2 == 3) {
            return new C8331sv1();
        }
        AbstractC7216ov1 abstractC7216ov1 = null;
        if (i2 == 4) {
            return new C8052rv1(abstractC7216ov1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
