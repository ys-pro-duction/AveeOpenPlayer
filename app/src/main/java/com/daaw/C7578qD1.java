package com.daaw;

/* JADX INFO: renamed from: com.daaw.qD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7578qD1 extends AbstractC4449f43 implements V43 {
    private static final C7578qD1 zzb;
    private int zzd;
    private int zze = 1000;
    private int zzf = 1000;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private C8135sD1 zzo;

    static {
        C7578qD1 c7578qD1 = new C7578qD1();
        zzb = c7578qD1;
        AbstractC4449f43.D(C7578qD1.class, c7578qD1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            InterfaceC6701n43 interfaceC6701n43 = C5332iC1.a;
            return AbstractC4449f43.A(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzd", "zze", interfaceC6701n43, "zzf", interfaceC6701n43, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i2 == 3) {
            return new C7578qD1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C7299pD1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
