package com.daaw;

/* JADX INFO: renamed from: com.daaw.i43, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5296i43 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ long E;
    public final /* synthetic */ K43 F;

    public RunnableC5296i43(K43 k43, String str, String str2, String str3, long j) {
        this.F = k43;
        this.B = str;
        this.C = str2;
        this.D = str3;
        this.E = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.B;
        if (str == null) {
            this.F.B.t(this.C, null);
        } else {
            this.F.B.t(this.C, new C5715jb3(this.D, str, this.E));
        }
    }
}
