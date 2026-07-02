package com.daaw;

/* JADX INFO: renamed from: com.daaw.on3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7179on3 implements InterfaceC6621mn3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;
    public static final AbstractC6556ma3 d;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).b().a();
        a = u93A.f("measurement.collection.enable_session_stitching_token.client.dev", true);
        b = u93A.f("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        c = u93A.f("measurement.session_stitching_token_enabled", false);
        d = u93A.f("measurement.link_sst_to_sid", true);
    }

    @Override // com.daaw.InterfaceC6621mn3
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.InterfaceC6621mn3
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // com.daaw.InterfaceC6621mn3
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // com.daaw.InterfaceC6621mn3
    public final boolean zzd() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // com.daaw.InterfaceC6621mn3
    public final boolean zze() {
        return ((Boolean) d.b()).booleanValue();
    }
}
