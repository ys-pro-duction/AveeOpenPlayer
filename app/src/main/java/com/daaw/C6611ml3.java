package com.daaw;

/* JADX INFO: renamed from: com.daaw.ml3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6611ml3 implements InterfaceC6044kl3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).a();
        a = u93A.f("measurement.client.sessions.check_on_reset_and_enable2", true);
        b = u93A.f("measurement.client.sessions.check_on_startup", true);
        c = u93A.f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.daaw.InterfaceC6044kl3
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.InterfaceC6044kl3
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }
}
