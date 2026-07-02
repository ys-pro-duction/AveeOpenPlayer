package com.daaw;

import android.view.ViewGroup;

/* JADX INFO: renamed from: com.daaw.yj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9953yj1 extends AbstractC6300lf1 {
    public final ViewGroup C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9953yj1(androidx.fragment.app.c cVar, ViewGroup viewGroup) {
        super(cVar, "Attempting to add fragment " + cVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        G10.g(cVar, "fragment");
        G10.g(viewGroup, "container");
        this.C = viewGroup;
    }
}
