package com.daaw;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: com.daaw.xT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9600xT0 extends Closeable, Flushable {
    void O0(C4057dh c4057dh, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
