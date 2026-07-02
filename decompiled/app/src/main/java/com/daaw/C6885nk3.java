package com.daaw;

/* JADX INFO: renamed from: com.daaw.nk3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6885nk3 implements InterfaceC6327lk3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).b().a();
        a = u93A.f("measurement.collection.event_safelist", true);
        b = u93A.f("measurement.service.store_null_safelist", true);
        c = u93A.f("measurement.service.store_safelist", true);
    }

    @Override // com.daaw.InterfaceC6327lk3
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.InterfaceC6327lk3
    public final boolean zzb() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // com.daaw.InterfaceC6327lk3
    public final boolean zzc() {
        return ((Boolean) c.b()).booleanValue();
    }
}
