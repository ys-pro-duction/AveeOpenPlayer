package com.daaw;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.h00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4994h00 {
    public final ArrayList a = new ArrayList();

    public C4994h00 a(Object obj) {
        this.a.add(String.valueOf(obj));
        return this;
    }

    public C4994h00 b(String str, Object obj) {
        this.a.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.a.toString();
    }
}
