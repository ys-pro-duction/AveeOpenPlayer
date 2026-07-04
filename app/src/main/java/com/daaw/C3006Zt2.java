package com.daaw;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.Zt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3006Zt2 extends AD2 {
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public long h;
    public final long i;
    public List j;
    public String k;
    public int l;
    public String m;
    public String n;
    public String o;
    public long p;
    public String q;

    public C3006Zt2(C9327wU2 c9327wU2, long j) {
        super(c9327wU2);
        this.p = 0L;
        this.q = null;
        this.i = j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(1:4)(21:89|6|(1:10)(2:11|(1:13))|85|14|(4:16|(1:18)(1:20)|87|21)|26|(1:31)(1:30)|32|SW:33|43|(1:45)|91|46|(1:48)(1:49)|50|(3:52|(1:54)(1:55)|56)|(3:60|(1:62)(1:63)|64)|67|(2:70|(1:72)(4:73|(3:76|(1:94)(1:95)|74)|93|79))(1:79)|(2:81|82)(2:83|84))|5|26|(2:28|31)(0)|32|SW:33|43|(0)|91|46|(0)(0)|50|(0)|(0)|67|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01bb, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01de, code lost:
    
        r11.a.w().n().c("Fetching Google App Id failed with exception. appId", com.daaw.C6675mz2.z(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194 A[Catch: IllegalStateException -> 0x01bb, TryCatch #3 {IllegalStateException -> 0x01bb, blocks: (B:46:0x0172, B:50:0x018c, B:52:0x0194, B:56:0x01b2, B:55:0x01ae, B:60:0x01bf, B:62:0x01d5, B:64:0x01da, B:63:0x01d8), top: B:91:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bf A[Catch: IllegalStateException -> 0x01bb, TryCatch #3 {IllegalStateException -> 0x01bb, blocks: (B:46:0x0172, B:50:0x018c, B:52:0x0194, B:56:0x01b2, B:55:0x01ae, B:60:0x01bf, B:62:0x01d5, B:64:0x01da, B:63:0x01d8), top: B:91:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024e  */
    @Override // com.daaw.AD2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3006Zt2.h():void");
    }

    @Override // com.daaw.AD2
    public final boolean j() {
        return true;
    }

    public final int k() {
        e();
        return this.l;
    }

    public final int l() {
        e();
        return this.e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 com.google.android.gms.measurement.internal.zzq, still in use, count: 2, list:
          (r3v0 com.google.android.gms.measurement.internal.zzq) from 0x019e: MOVE (r22v0 com.google.android.gms.measurement.internal.zzq) = (r3v0 com.google.android.gms.measurement.internal.zzq) (LINE:415)
          (r3v0 com.google.android.gms.measurement.internal.zzq) from 0x0199: MOVE (r22v3 com.google.android.gms.measurement.internal.zzq) = (r3v0 com.google.android.gms.measurement.internal.zzq) (LINE:410)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final com.google.android.gms.measurement.internal.zzq m(java.lang.String r38) {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3006Zt2.m(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    public final String n() {
        e();
        return this.n;
    }

    public final String o() {
        e();
        AbstractC7506py0.l(this.c);
        return this.c;
    }

    public final String q() {
        d();
        e();
        AbstractC7506py0.l(this.m);
        return this.m;
    }

    public final List r() {
        return this.j;
    }

    public final void s() {
        String str;
        d();
        if (this.a.F().m().j(EnumC9512x73.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.a.N().r().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.a.w().m().a("Analytics Storage consent is not granted");
            str = null;
        }
        this.a.w().m().a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.o = str;
        this.p = this.a.p().a();
    }

    public final boolean t(String str) {
        String str2 = this.q;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.q = str;
        return z;
    }
}
