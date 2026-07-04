package com.daaw;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.gW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4852gW implements InterfaceC3962dL {
    public final String a;
    public final List b;

    public AbstractC4852gW(String str, List list) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
    }
}
