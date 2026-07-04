package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1851Ox extends AbstractC9297wN0 {
    public static final C1851Ox J = new C1851Ox();

    public C1851Ox() {
        super(B11.c, B11.d, B11.e, B11.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.daaw.AbstractC5801jt
    public String toString() {
        return "Dispatchers.Default";
    }
}
