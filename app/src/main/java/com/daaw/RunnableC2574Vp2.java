package com.daaw;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.Vp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2574Vp2 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] H = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler B;
    public final int[] C = new int[1];
    public EGLDisplay D;
    public EGLContext E;
    public EGLSurface F;
    public SurfaceTexture G;

    public RunnableC2574Vp2(Handler handler, InterfaceC8024rp2 interfaceC8024rp2) {
        this.B = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.G;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    public final void b(int i) throws C4677fr2 {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC0999Gr2.b(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        AbstractC0999Gr2.b(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.D = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, H, 0, eGLConfigArr, 0, 1, iArr2, 0);
        AbstractC0999Gr2.b(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.D, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC0999Gr2.b(eGLContextEglCreateContext != null, "eglCreateContext failed");
        this.E = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.D;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC0999Gr2.b(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        AbstractC0999Gr2.b(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
        this.F = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.C, 0);
        AbstractC0999Gr2.a();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.C[0]);
        this.G = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void c() {
        this.B.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.G;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.C, 0);
            }
            EGLDisplay eGLDisplay = this.D;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.D;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.F;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.D, this.F);
            }
            EGLContext eGLContext = this.E;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.D, eGLContext);
            }
            int i = AbstractC9004vJ2.a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.D;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.D);
            }
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.D;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.D;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.F;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.D, this.F);
            }
            EGLContext eGLContext2 = this.E;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.D, eGLContext2);
            }
            int i2 = AbstractC9004vJ2.a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.D;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.D);
            }
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.B.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.G;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
