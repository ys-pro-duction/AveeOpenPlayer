package com.daaw;

/* JADX INFO: renamed from: com.daaw.dn3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4091dn3 implements InterfaceC3534bn3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).b().a();
        a = u93A.f("measurement.remove_app_background.client", false);
        b = u93A.d("measurement.id.remove_app_background.client", 0L);
    }

    @Override // com.daaw.InterfaceC3534bn3
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.InterfaceC3534bn3
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }
}
