package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class H73 extends AbstractC4449f43 implements V43 {
    private static final H73 zzb;
    private int zzd;
    private boolean zzk;
    private double zzl;
    private int zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private String zze = "";
    private String zzf = "";
    private int zzg = 4;
    private InterfaceC8095s43 zzh = AbstractC4449f43.x();
    private String zzi = "";
    private String zzj = "";
    private InterfaceC8095s43 zzm = AbstractC4449f43.x();

    static {
        H73 h73 = new H73();
        zzb = h73;
        AbstractC4449f43.D(H73.class, h73);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzd", "zze", "zzg", G73.a, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", F73.class, "zzf", "zzn", D73.a, "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new H73();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C73(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
