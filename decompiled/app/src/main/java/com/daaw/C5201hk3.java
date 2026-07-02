package com.daaw;

/* JADX INFO: renamed from: com.daaw.hk3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5201hk3 implements InterfaceC4643fk3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;
    public static final AbstractC6556ma3 d;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).a();
        a = u93A.f("measurement.client.consent_state_v1", true);
        b = u93A.f("measurement.client.3p_consent_state_v1", true);
        c = u93A.f("measurement.service.consent_state_v1_W36", true);
        d = u93A.d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.daaw.InterfaceC4643fk3
    public final long zza() {
        return ((Long) d.b()).longValue();
    }
}
