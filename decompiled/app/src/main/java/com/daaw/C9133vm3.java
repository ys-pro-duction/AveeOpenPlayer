package com.daaw;

/* JADX INFO: renamed from: com.daaw.vm3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9133vm3 implements InterfaceC8568tm3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).b().a();
        a = u93A.f("measurement.collection.client.log_target_api_version", true);
        b = u93A.f("measurement.collection.service.log_target_api_version", true);
    }

    @Override // com.daaw.InterfaceC8568tm3
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.InterfaceC8568tm3
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // com.daaw.InterfaceC8568tm3
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }
}
