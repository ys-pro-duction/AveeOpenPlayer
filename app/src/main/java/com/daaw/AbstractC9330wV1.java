package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.wV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9330wV1 {
    public final Context B;
    public final String C;
    public final WeakReference D;

    public AbstractC9330wV1(FU1 fu1) {
        Context context = fu1.getContext();
        this.B = context;
        this.C = zzt.zzp().zzc(context, fu1.zzn().B);
        this.D = new WeakReference(fu1);
    }

    public static /* bridge */ /* synthetic */ void j(AbstractC9330wV1 abstractC9330wV1, String str, Map map) {
        FU1 fu1 = (FU1) abstractC9330wV1.D.get();
        if (fu1 != null) {
            fu1.U("onPrecacheEvent", map);
        }
    }

    public abstract void k();

    public final void m(String str, String str2, String str3, String str4) {
        XS1.b.post(new RunnableC9051vV1(this, str, str2, str3, str4));
    }

    public final void n(String str, String str2, int i) {
        XS1.b.post(new RunnableC8486tV1(this, str, str2, i));
    }

    public final void o(String str, String str2, long j) {
        XS1.b.post(new RunnableC8765uV1(this, str, str2, j));
    }

    public final void p(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        XS1.b.post(new RunnableC8207sV1(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void q(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        XS1.b.post(new RunnableC7928rV1(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    public abstract boolean v(String str);

    public boolean w(String str, String[] strArr) {
        return v(str);
    }

    public boolean x(String str, String[] strArr, C7092oV1 c7092oV1) {
        return v(str);
    }

    public void i() {
    }

    public void r(int i) {
    }

    public void s(int i) {
    }

    public void t(int i) {
    }

    public void u(int i) {
    }
}
