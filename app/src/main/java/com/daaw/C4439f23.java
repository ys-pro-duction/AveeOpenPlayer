package com.daaw;

/* JADX INFO: renamed from: com.daaw.f23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4439f23 extends AbstractC4449f43 implements V43 {
    private static final C4439f23 zzb;
    private String zzd = "";
    private InterfaceC8095s43 zze = AbstractC4449f43.x();

    static {
        C4439f23 c4439f23 = new C4439f23();
        zzb = c4439f23;
        AbstractC4449f43.D(C4439f23.class, c4439f23);
    }

    public static C4439f23 N() {
        return zzb;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", A13.class});
        }
        if (i2 == 3) {
            return new C4439f23();
        }
        AbstractC3882d23 abstractC3882d23 = null;
        if (i2 == 4) {
            return new C4160e23(abstractC3882d23);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
