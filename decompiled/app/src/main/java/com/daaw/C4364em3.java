package com.daaw;

/* JADX INFO: renamed from: com.daaw.em3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4364em3 implements InterfaceC3807cm3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).a();
        a = u93A.d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        b = u93A.f("measurement.lifecycle.app_backgrounded_tracking", true);
        c = u93A.f("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override // com.daaw.InterfaceC3807cm3
    public final boolean zza() {
        return ((Boolean) c.b()).booleanValue();
    }
}
