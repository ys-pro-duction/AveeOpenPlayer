package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.mH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6476mH {
    public final C81 a;
    public final Set b;
    public final YS0 c;

    public AbstractC6476mH(C81 c81, Set set, YS0 ys0) {
        G10.g(c81, "howThisTypeIsUsed");
        this.a = c81;
        this.b = set;
        this.c = ys0;
    }

    public abstract YS0 a();

    public abstract C81 b();

    public abstract Set c();

    public abstract AbstractC6476mH d(Z71 z71);

    public abstract int hashCode();
}
