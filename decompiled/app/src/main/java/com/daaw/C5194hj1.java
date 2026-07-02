package com.daaw;

import android.view.ViewParent;

/* JADX INFO: renamed from: com.daaw.hj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5194hj1 {
    public static final C5194hj1 a = new C5194hj1();

    public final void a(C6423m5 c6423m5) {
        G10.g(c6423m5, "ownerView");
        ViewParent parent = c6423m5.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(c6423m5, c6423m5);
        }
    }
}
