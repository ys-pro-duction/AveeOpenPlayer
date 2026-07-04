package com.daaw;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: renamed from: com.daaw.fB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4481fB1 extends PushbackInputStream implements AutoCloseable {
    public final /* synthetic */ C4770gB1 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4481fB1(C4770gB1 c4770gB1, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.B = c4770gB1;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        C5328iB1.e(this.B.c);
        super.close();
    }
}
