package com.daaw;

import android.opengl.GLES20;

/* JADX INFO: renamed from: com.daaw.bc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3477bc1 extends AbstractC7070oQ {
    public C6102kw d;

    public C3477bc1(C5718jc1 c5718jc1, boolean z) {
        super(c5718jc1, z);
        this.d = new C6102kw();
    }

    public static C3477bc1 g(int i, int i2, int i3, int i4, boolean z) {
        C5718jc1 c5718jc1M = new C5718jc1(i, i2, i3, i4, z).m();
        if (c5718jc1M == null) {
            return null;
        }
        try {
            return new C3477bc1(c5718jc1M, true);
        } catch (Exception e) {
            AbstractC0441Bk1.c("exception " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean i() {
        return Boolean.valueOf(!h());
    }

    @Override // com.daaw.AbstractC7070oQ
    public void c() {
        if (h()) {
            GLES20.glViewport(0, 0, getWidth(), getHeight());
            GLES20.glBindFramebuffer(36160, this.a);
        }
    }

    public C3477bc1 f() {
        if (h()) {
            return this;
        }
        a();
        AbstractC0441Bk1.c("FrameBuffer is not valid");
        return null;
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.d.a(new KQ() { // from class: com.daaw.ac1
            @Override // com.daaw.KQ
            public final Object a() {
                return this.a.i();
            }
        });
    }

    public boolean h() {
        return this.a != 0;
    }
}
