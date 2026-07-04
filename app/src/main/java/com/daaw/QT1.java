package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class QT1 extends IOException {
    public final boolean B;
    public final int C;

    public QT1(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.B = z;
        this.C = i;
    }

    public static QT1 a(String str, Throwable th) {
        return new QT1(str, th, true, 1);
    }

    public static QT1 b(String str, Throwable th) {
        return new QT1(str, th, true, 0);
    }

    public static QT1 c(String str) {
        return new QT1(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.B + ", dataType=" + this.C + "}";
    }
}
