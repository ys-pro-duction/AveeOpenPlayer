package com.daaw;

/* JADX INFO: renamed from: com.daaw.un3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8852un3 implements InterfaceC8294sn3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;
    public static final AbstractC6556ma3 d;
    public static final AbstractC6556ma3 e;
    public static final AbstractC6556ma3 f;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).b().a();
        a = u93A.f("measurement.client.sessions.background_sessions_enabled", true);
        b = u93A.f("measurement.client.sessions.enable_fix_background_engagement", false);
        c = u93A.f("measurement.client.sessions.immediate_start_enabled_foreground", true);
        d = u93A.f("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e = u93A.f("measurement.client.sessions.session_id_enabled", true);
        f = u93A.d("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.daaw.InterfaceC8294sn3
    public final boolean zza() {
        return ((Boolean) b.b()).booleanValue();
    }
}
