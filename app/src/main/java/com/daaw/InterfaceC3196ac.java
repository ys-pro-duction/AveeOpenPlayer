package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3196ac {

    /* JADX INFO: renamed from: com.daaw.ac$a */
    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }

        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ac$b */
    public static final class b extends Exception {
        public final int B;

        public b(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
            this.B = i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ac$c */
    public interface c {
        void a(int i);

        void b(int i, long j, long j2);

        void c();
    }

    /* JADX INFO: renamed from: com.daaw.ac$d */
    public static final class d extends Exception {
        public final int B;

        public d(int i) {
            super("AudioTrack write failed: " + i);
            this.B = i;
        }
    }

    void a();

    void b();

    boolean c();

    C9457ww0 d(C9457ww0 c9457ww0);

    C9457ww0 g();

    void h(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6);

    void i();

    boolean j();

    long k(boolean z);

    void l();

    void m(C2097Rb c2097Rb);

    void n();

    void o(float f);

    boolean p(ByteBuffer byteBuffer, long j);

    void q(int i);

    void r();

    void reset();

    boolean s(int i);

    void t(c cVar);
}
