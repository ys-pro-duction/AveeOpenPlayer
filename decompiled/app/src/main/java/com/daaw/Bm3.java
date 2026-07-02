package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Bm3 implements InterfaceC10249zm3 {
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;
    public static final AbstractC6556ma3 d;
    public static final AbstractC6556ma3 e;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).a();
        a = u93A.f("measurement.test.boolean_flag", false);
        b = u93A.c("measurement.test.double_flag", -3.0d);
        c = u93A.d("measurement.test.int_flag", -2L);
        d = u93A.d("measurement.test.long_flag", -1L);
        e = u93A.e("measurement.test.string_flag", "---");
    }

    @Override // com.daaw.InterfaceC10249zm3
    public final double zza() {
        return ((Double) b.b()).doubleValue();
    }

    @Override // com.daaw.InterfaceC10249zm3
    public final long zzb() {
        return ((Long) c.b()).longValue();
    }

    @Override // com.daaw.InterfaceC10249zm3
    public final long zzc() {
        return ((Long) d.b()).longValue();
    }

    @Override // com.daaw.InterfaceC10249zm3
    public final String zzd() {
        return (String) e.b();
    }

    @Override // com.daaw.InterfaceC10249zm3
    public final boolean zze() {
        return ((Boolean) a.b()).booleanValue();
    }
}
