package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.uo3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8857uo3 extends H93 {
    public long i;
    public int j;
    public int k;

    public C8857uo3() {
        super(2, 0);
        this.k = 32;
    }

    @Override // com.daaw.H93, com.daaw.AbstractC7284p93
    public final void b() {
        super.b();
        this.j = 0;
    }

    public final int m() {
        return this.j;
    }

    public final long n() {
        return this.i;
    }

    public final void o(int i) {
        this.k = i;
    }

    public final boolean p(H93 h93) {
        ByteBuffer byteBuffer;
        AbstractC6048km2.d(!h93.d(1073741824));
        AbstractC6048km2.d(!h93.d(268435456));
        AbstractC6048km2.d(!h93.d(4));
        if (q()) {
            if (this.j >= this.k) {
                return false;
            }
            ByteBuffer byteBuffer2 = h93.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.j;
        this.j = i + 1;
        if (i == 0) {
            this.f = h93.f;
            if (h93.d(1)) {
                c(1);
            }
        }
        ByteBuffer byteBuffer3 = h93.d;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.i = h93.f;
        return true;
    }

    public final boolean q() {
        return this.j > 0;
    }
}
