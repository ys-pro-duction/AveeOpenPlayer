package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.daaw.Yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2827Yb {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: com.daaw.Yb$a */
    public static final class a extends Exception {
        public a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }

    boolean c();

    boolean d();

    ByteBuffer e();

    void f(ByteBuffer byteBuffer);

    void flush();

    int g();

    int h();

    int i();

    void j();

    boolean k(int i, int i2, int i3);

    void reset();
}
