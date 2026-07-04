package com.daaw;

import android.view.ViewGroup;

/* JADX INFO: renamed from: com.daaw.hQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5107hQ extends AbstractC6300lf1 {
    public final ViewGroup C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5107hQ(androidx.fragment.app.c cVar, ViewGroup viewGroup) {
        super(cVar, "Attempting to use <fragment> tag to add fragment " + cVar + " to container " + viewGroup);
        G10.g(cVar, "fragment");
        this.C = viewGroup;
    }
}
