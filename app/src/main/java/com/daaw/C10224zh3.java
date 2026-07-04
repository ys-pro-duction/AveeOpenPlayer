package com.daaw;

import android.app.Activity;
import android.app.Application;
import com.daaw.C2157Rq;

/* JADX INFO: renamed from: com.daaw.zh3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10224zh3 {
    public final Application a;
    public final C7730qm1 b;
    public final C0814Ex1 c;

    public C10224zh3(Application application, C7730qm1 c7730qm1, C0814Ex1 c0814Ex1) {
        this.a = application;
        this.b = c7730qm1;
        this.c = c0814Ex1;
    }

    public final QY1 d(Activity activity, C2471Uq c2471Uq) {
        C2157Rq c2157RqA = c2471Uq.a();
        if (c2157RqA == null) {
            c2157RqA = new C2157Rq.a(this.a).a();
        }
        return Qk3.a(new Qk3(this, activity, c2157RqA, c2471Uq, null));
    }
}
