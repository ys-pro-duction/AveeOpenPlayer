package com.daaw;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class HE1 {
    public static final void a(GE1 ge1, EE1 ee1) {
        if (ee1.a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(ee1.b())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        ge1.d(ee1.a(), ee1.b(), ee1.c(), ee1.d());
    }
}
