package com.daaw;

import android.content.Context;
import android.util.SparseIntArray;
import com.daaw.C5033h8;

/* JADX INFO: renamed from: com.daaw.Wl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2661Wl1 {
    public final SparseIntArray a = new SparseIntArray();
    public C9599xT b;

    public C2661Wl1(C9599xT c9599xT) {
        AbstractC7506py0.l(c9599xT);
        this.b = c9599xT;
    }

    public final int a(Context context, int i) {
        return this.a.get(i, -1);
    }

    public final int b(Context context, C5033h8.f fVar) {
        AbstractC7506py0.l(context);
        AbstractC7506py0.l(fVar);
        int iH = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int iA = a(context, minApkVersion);
        if (iA != -1) {
            return iA;
        }
        int i = 0;
        while (true) {
            if (i >= this.a.size()) {
                iH = -1;
                break;
            }
            int iKeyAt = this.a.keyAt(i);
            if (iKeyAt > minApkVersion && this.a.get(iKeyAt) == 0) {
                break;
            }
            i++;
        }
        if (iH == -1) {
            iH = this.b.h(context, minApkVersion);
        }
        this.a.put(minApkVersion, iH);
        return iH;
    }

    public final void c() {
        this.a.clear();
    }
}
