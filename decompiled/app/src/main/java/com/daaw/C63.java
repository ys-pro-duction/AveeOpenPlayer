package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class C63 extends AbstractC4449f43 implements V43 {
    private static final C63 zzb;
    private int zzd;
    private B63 zze;
    private AbstractC9213w33 zzg;
    private AbstractC9213w33 zzh;
    private int zzi;
    private byte zzj = 2;
    private InterfaceC8095s43 zzf = AbstractC4449f43.x();

    static {
        C63 c63 = new C63();
        zzb = c63;
        AbstractC4449f43.D(C63.class, c63);
    }

    public C63() {
        AbstractC9213w33 abstractC9213w33 = AbstractC9213w33.C;
        this.zzg = abstractC9213w33;
        this.zzh = abstractC9213w33;
    }

    public static C10065z63 M() {
        return (C10065z63) zzb.j();
    }

    public static /* synthetic */ void O(C63 c63, C9786y63 c9786y63) {
        c9786y63.getClass();
        InterfaceC8095s43 interfaceC8095s43 = c63.zzf;
        if (!interfaceC8095s43.zzc()) {
            c63.zzf = AbstractC4449f43.y(interfaceC8095s43);
        }
        c63.zzf.add(c9786y63);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", C9786y63.class, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C10065z63(y53);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
