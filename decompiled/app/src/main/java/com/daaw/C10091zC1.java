package com.daaw;

/* JADX INFO: renamed from: com.daaw.zC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10091zC1 extends AbstractC4449f43 implements V43 {
    private static final C10091zC1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C10091zC1 c10091zC1 = new C10091zC1();
        zzb = c10091zC1;
        AbstractC4449f43.D(C10091zC1.class, c10091zC1);
    }

    public static C8131sC1 M() {
        return (C8131sC1) zzb.j();
    }

    public static C10091zC1 O() {
        return zzb;
    }

    public static /* synthetic */ void T(C10091zC1 c10091zC1, int i) {
        c10091zC1.zze = i - 1;
        c10091zC1.zzd |= 1;
    }

    public static /* synthetic */ void U(C10091zC1 c10091zC1, int i) {
        c10091zC1.zzf = i - 1;
        c10091zC1.zzd |= 2;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", C9533xC1.a, "zzf", C8689uC1.a});
        }
        if (i2 == 3) {
            return new C10091zC1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C8131sC1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean P() {
        return (this.zzd & 2) != 0;
    }

    public final boolean Q() {
        return (this.zzd & 1) != 0;
    }

    public final int R() {
        int iA = AbstractC8975vC1.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int S() {
        int iA = AbstractC9812yC1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
