package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Uk3 implements Dk3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;
    public static final AbstractC6556ma3 d;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).a();
        a = u93A.f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        b = u93A.f("measurement.audience.refresh_event_count_filters_timestamp", false);
        c = u93A.f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = u93A.f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.daaw.Dk3
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.Dk3
    public final boolean zzb() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // com.daaw.Dk3
    public final boolean zzc() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // com.daaw.Dk3
    public final boolean zzd() {
        return ((Boolean) d.b()).booleanValue();
    }
}
