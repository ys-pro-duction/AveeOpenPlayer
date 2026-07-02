package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class CB1 extends AbstractC4449f43 implements V43 {
    private static final CB1 zzb;
    private int zzd;
    private int zze;
    private SB1 zzg;
    private UB1 zzh;
    private C3371bC1 zzj;
    private C7578qD1 zzk;
    private C4778gD1 zzl;
    private C7295pC1 zzm;
    private C7852rC1 zzn;
    private int zzf = 1000;
    private InterfaceC8095s43 zzi = AbstractC4449f43.x();
    private InterfaceC8095s43 zzo = AbstractC4449f43.x();

    static {
        CB1 cb1 = new CB1();
        zzb = cb1;
        AbstractC4449f43.D(CB1.class, cb1);
    }

    public static CB1 N() {
        return zzb;
    }

    public static /* synthetic */ void P(CB1 cb1, AB1 ab1) {
        cb1.zze = ab1.zza();
        cb1.zzd |= 1;
    }

    public static /* synthetic */ void Q(CB1 cb1, UB1 ub1) {
        ub1.getClass();
        cb1.zzh = ub1;
        cb1.zzd |= 8;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", C10087zB1.a, "zzf", C5332iC1.a, "zzg", "zzh", "zzi", QB1.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", CD1.class});
        }
        if (i2 == 3) {
            return new CB1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new BB1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final UB1 O() {
        UB1 ub1 = this.zzh;
        return ub1 == null ? UB1.N() : ub1;
    }
}
