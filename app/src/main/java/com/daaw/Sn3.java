package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Sn3 implements Qn3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).b().a();
        a = u93A.f("measurement.sgtm.client.dev", false);
        b = u93A.f("measurement.sgtm.service", false);
    }

    @Override // com.daaw.Qn3
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.Qn3
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // com.daaw.Qn3
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }
}
