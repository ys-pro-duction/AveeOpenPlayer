package com.daaw;

/* JADX INFO: renamed from: com.daaw.tk3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8558tk3 implements InterfaceC8000rk3 {
    public static final AbstractC6556ma3 a = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).a().f("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.daaw.InterfaceC8000rk3
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.InterfaceC8000rk3
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }
}
