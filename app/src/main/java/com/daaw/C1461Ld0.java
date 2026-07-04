package com.daaw;

import java.io.Writer;

/* JADX INFO: renamed from: com.daaw.Ld0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1461Ld0 extends Writer implements AutoCloseable {
    public final String B;
    public StringBuilder C = new StringBuilder(128);

    public C1461Ld0(String str) {
        this.B = str;
    }

    public final void a() {
        if (this.C.length() > 0) {
            this.C.toString();
            StringBuilder sb = this.C;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.C.append(c);
            }
        }
    }
}
