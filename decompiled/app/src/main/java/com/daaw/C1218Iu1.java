package com.daaw;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Iu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1218Iu1 {
    public final int a;
    public final List b;
    public final int c;
    public final InputStream d;

    public C1218Iu1(int i, List list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final InputStream c() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List d() {
        return DesugarCollections.unmodifiableList(this.b);
    }
}
