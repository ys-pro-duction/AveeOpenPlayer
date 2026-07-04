package com.daaw;

import android.util.Log;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: renamed from: com.daaw.yx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10021yx2 implements Runnable {
    public final /* synthetic */ int B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ C6675mz2 G;

    public RunnableC10021yx2(C6675mz2 c6675mz2, int i, String str, Object obj, Object obj2, Object obj3) {
        this.G = c6675mz2;
        this.B = i;
        this.C = str;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5634jI2 c5634jI2F = this.G.a.F();
        if (!c5634jI2F.j()) {
            Log.println(6, this.G.D(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        C6675mz2 c6675mz2 = this.G;
        if (c6675mz2.c == 0) {
            if (c6675mz2.a.z().H()) {
                C6675mz2 c6675mz22 = this.G;
                c6675mz22.a.a();
                c6675mz22.c = 'C';
            } else {
                C6675mz2 c6675mz23 = this.G;
                c6675mz23.a.a();
                c6675mz23.c = 'c';
            }
        }
        C6675mz2 c6675mz24 = this.G;
        if (c6675mz24.d < 0) {
            c6675mz24.a.z().m();
            c6675mz24.d = 79000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.B);
        C6675mz2 c6675mz25 = this.G;
        String strSubstring = "2" + cCharAt + c6675mz25.c + c6675mz25.d + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + C6675mz2.A(true, this.C, this.D, this.E, this.F);
        if (strSubstring.length() > 1024) {
            strSubstring = this.C.substring(0, 1024);
        }
        C3392bH2 c3392bH2 = c5634jI2F.d;
        if (c3392bH2 != null) {
            c3392bH2.b(strSubstring, 1L);
        }
    }
}
