package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Hl3 implements El3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).b().a();
        a = u93A.f("measurement.item_scoped_custom_parameters.client", true);
        b = u93A.f("measurement.item_scoped_custom_parameters.service", false);
        c = u93A.d("measurement.id.item_scoped_custom_parameters.service", 0L);
    }

    @Override // com.daaw.El3
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.El3
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // com.daaw.El3
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }
}
