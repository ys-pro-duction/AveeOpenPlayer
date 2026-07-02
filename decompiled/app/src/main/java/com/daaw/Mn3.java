package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Mn3 implements Kn3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).b().a();
        a = u93A.f("measurement.sfmc.client", true);
        b = u93A.f("measurement.sfmc.service", true);
    }

    @Override // com.daaw.Kn3
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.Kn3
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // com.daaw.Kn3
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }
}
