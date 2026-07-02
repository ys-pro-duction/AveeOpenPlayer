package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Pl3 implements Nl3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;
    public static final AbstractC6556ma3 d;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).a();
        a = u93A.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = u93A.f("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = u93A.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = u93A.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.daaw.Nl3
    public final boolean zza() {
        return ((Boolean) c.b()).booleanValue();
    }
}
