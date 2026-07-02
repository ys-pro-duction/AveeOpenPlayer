package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Px1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1957Px1 {
    public List a = Collections.EMPTY_LIST;

    public final List a() {
        List list = this.a;
        this.a = Collections.EMPTY_LIST;
        return list;
    }

    public final void b(List list) {
        this.a = new ArrayList(list);
    }
}
