package com.daaw;

import android.app.Activity;

/* JADX INFO: renamed from: com.daaw.Jb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1245Jb0 {
    public final Object a;

    public C1245Jb0(Activity activity) {
        AbstractC7506py0.m(activity, "Activity must not be null");
        this.a = activity;
    }

    public final Activity a() {
        return (Activity) this.a;
    }

    public final MP b() {
        return (MP) this.a;
    }

    public final boolean c() {
        return this.a instanceof Activity;
    }

    public final boolean d() {
        return this.a instanceof MP;
    }
}
