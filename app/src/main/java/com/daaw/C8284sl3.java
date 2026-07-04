package com.daaw;

/* JADX INFO: renamed from: com.daaw.sl3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8284sl3 implements InterfaceC7727ql3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;
    public static final AbstractC6556ma3 d;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).b().a();
        a = u93A.f("measurement.client.global_params", true);
        b = u93A.f("measurement.service.global_params_in_payload", true);
        c = u93A.f("measurement.service.clear_global_params_on_uninstall", true);
        d = u93A.f("measurement.service.global_params", true);
    }

    @Override // com.daaw.InterfaceC7727ql3
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.InterfaceC7727ql3
    public final boolean zzb() {
        return ((Boolean) c.b()).booleanValue();
    }
}
