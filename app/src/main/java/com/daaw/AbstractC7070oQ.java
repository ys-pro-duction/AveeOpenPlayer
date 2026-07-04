package com.daaw;

import android.opengl.GLES20;

/* JADX INFO: renamed from: com.daaw.oQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7070oQ implements GX {
    public int a;
    public AbstractC3328b31 b;
    public boolean c;

    public AbstractC7070oQ(AbstractC3328b31 abstractC3328b31, boolean z) throws C3357b90 {
        this.b = abstractC3328b31;
        this.c = z;
        if (!d()) {
            throw new C3357b90("FBO extension not supported in hardware");
        }
        abstractC3328b31.c();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i = iArr[0];
        this.a = i;
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glFramebufferTexture2D(36160, 36064, abstractC3328b31.e(), abstractC3328b31.d(), 0);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            GLES20.glBindFramebuffer(36160, 0);
            return;
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteFramebuffers(1, new int[]{this.a}, 0);
        throw new C3357b90("exception " + iGlCheckFramebufferStatus + " when checking FBO status");
    }

    public static boolean d() {
        return true;
    }

    @Override // com.daaw.GX
    public void a() {
        if (this.a == 0) {
            return;
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteFramebuffers(1, new int[]{this.a}, 0);
        if (this.c) {
            this.b.a();
        }
        this.a = 0;
    }

    @Override // com.daaw.GX
    public AbstractC3328b31 b() {
        return this.b;
    }

    public abstract void c();

    @Override // com.daaw.GX
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // com.daaw.GX
    public int getWidth() {
        return this.b.getWidth();
    }
}
