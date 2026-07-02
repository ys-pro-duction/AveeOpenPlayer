package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Xm3 implements Vm3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;
    public static final AbstractC6556ma3 d;
    public static final AbstractC6556ma3 e;
    public static final AbstractC6556ma3 f;
    public static final AbstractC6556ma3 g;
    public static final AbstractC6556ma3 h;
    public static final AbstractC6556ma3 i;
    public static final AbstractC6556ma3 j;
    public static final AbstractC6556ma3 k;
    public static final AbstractC6556ma3 l;
    public static final AbstractC6556ma3 m;
    public static final AbstractC6556ma3 n;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).b().a();
        a = u93A.f("measurement.redaction.app_instance_id", true);
        b = u93A.f("measurement.redaction.client_ephemeral_aiid_generation", true);
        c = u93A.f("measurement.redaction.config_redacted_fields", true);
        d = u93A.f("measurement.redaction.device_info", true);
        e = u93A.f("measurement.redaction.e_tag", true);
        f = u93A.f("measurement.redaction.enhanced_uid", true);
        g = u93A.f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        h = u93A.f("measurement.redaction.google_signals", true);
        i = u93A.f("measurement.redaction.no_aiid_in_config_request", true);
        j = u93A.f("measurement.redaction.retain_major_os_version", true);
        k = u93A.f("measurement.redaction.scion_payload_generator", true);
        l = u93A.f("measurement.redaction.upload_redacted_fields", true);
        m = u93A.f("measurement.redaction.upload_subdomain_override", true);
        n = u93A.f("measurement.redaction.user_id", true);
    }

    @Override // com.daaw.Vm3
    public final boolean zza() {
        return ((Boolean) j.b()).booleanValue();
    }

    @Override // com.daaw.Vm3
    public final boolean zzb() {
        return ((Boolean) k.b()).booleanValue();
    }
}
