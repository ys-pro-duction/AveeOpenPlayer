package com.daaw;

/* JADX INFO: renamed from: com.daaw.gW2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4855gW2 extends AbstractC3772cf3 implements Mg3 {
    private static final C4855gW2 zza;
    private int zzd;
    private int zze = 1;
    private InterfaceC9377wf3 zzf = AbstractC3772cf3.p();

    static {
        C4855gW2 c4855gW2 = new C4855gW2();
        zza = c4855gW2;
        AbstractC3772cf3.w(C4855gW2.class, c4855gW2);
    }

    public static YU2 B() {
        return (YU2) zza.i();
    }

    public static /* synthetic */ void D(C4855gW2 c4855gW2, C8184sP2 c8184sP2) {
        c8184sP2.getClass();
        InterfaceC9377wf3 interfaceC9377wf3 = c4855gW2.zzf;
        if (!interfaceC9377wf3.zzc()) {
            c4855gW2.zzf = AbstractC3772cf3.q(interfaceC9377wf3);
        }
        c4855gW2.zzf.add(c8184sP2);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", CV2.a, "zzf", C8184sP2.class});
        }
        if (i2 == 3) {
            return new C4855gW2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new YU2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
