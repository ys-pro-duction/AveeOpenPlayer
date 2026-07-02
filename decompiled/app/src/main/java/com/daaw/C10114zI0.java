package com.daaw;

import com.daaw.InterfaceC2827Yb;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.zI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10114zI0 implements InterfaceC2827Yb {
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public ByteBuffer e;
    public ByteBuffer f;
    public boolean g;

    public C10114zI0() {
        ByteBuffer byteBuffer = InterfaceC2827Yb.a;
        this.e = byteBuffer;
        this.f = byteBuffer;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean c() {
        return this.g && this.f == InterfaceC2827Yb.a;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean d() {
        int i = this.d;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.f;
        this.f = InterfaceC2827Yb.a;
        return byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[ADDED_TO_REGION, LOOP:2: B:25:0x0083->B:26:0x0085, LOOP_START, PHI: r0
  0x0083: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0043, B:26:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.daaw.InterfaceC2827Yb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L23
            if (r3 == r6) goto L20
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L25
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 * 2
            goto L25
        L23:
            int r2 = r2 / r6
            goto L20
        L25:
            java.nio.ByteBuffer r3 = r7.e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3c
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.e = r2
            goto L41
        L3c:
            java.nio.ByteBuffer r2 = r7.e
            r2.clear()
        L41:
            int r2 = r7.d
            if (r2 == r5) goto L83
            if (r2 == r6) goto L6a
            if (r2 != r4) goto L64
        L49:
            if (r0 >= r1) goto L9e
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L49
        L64:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L6a:
            if (r0 >= r1) goto L9e
            java.nio.ByteBuffer r2 = r7.e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L6a
        L83:
            if (r0 >= r1) goto L9e
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L83
        L9e:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.e
            r7.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C10114zI0.f(java.nio.ByteBuffer):void");
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void flush() {
        this.f = InterfaceC2827Yb.a;
        this.g = false;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int g() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int h() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int i() {
        return 2;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void j() {
        this.g = true;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean k(int i, int i2, int i3) throws InterfaceC2827Yb.a {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new InterfaceC2827Yb.a(i, i2, i3);
        }
        if (this.b == i && this.c == i2 && this.d == i3) {
            return false;
        }
        this.b = i;
        this.c = i2;
        this.d = i3;
        return true;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void reset() {
        flush();
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = InterfaceC2827Yb.a;
    }
}
