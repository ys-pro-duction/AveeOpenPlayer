package com.daaw;

/* JADX INFO: renamed from: com.daaw.zj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10232zj1 extends AbstractC6300lf1 {
    public final androidx.fragment.app.c C;
    public final int D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10232zj1(androidx.fragment.app.c cVar, androidx.fragment.app.c cVar2, int i) {
        super(cVar, "Attempting to nest fragment " + cVar + " within the view of parent fragment " + cVar2 + " via container with ID " + i + " without using parent's childFragmentManager");
        G10.g(cVar, "fragment");
        G10.g(cVar2, "expectedParentFragment");
        this.C = cVar2;
        this.D = i;
    }
}
