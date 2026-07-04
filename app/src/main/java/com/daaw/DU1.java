package com.daaw;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes3.dex */
public final class DU1 extends Thread implements SurfaceTexture.OnFrameAvailableListener, InterfaceC9047vU1 {
    public static final float[] c0 = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public final C9326wU1 B;
    public final float[] C;
    public final float[] D;
    public final float[] E;
    public final float[] F;
    public final float[] G;
    public final float[] H;
    public final float[] I;
    public float J;
    public float K;
    public float L;
    public int M;
    public int N;
    public SurfaceTexture O;
    public SurfaceTexture P;
    public int Q;
    public int R;
    public int S;
    public final FloatBuffer T;
    public final CountDownLatch U;
    public final Object V;
    public EGL10 W;
    public EGLDisplay X;
    public EGLContext Y;
    public EGLSurface Z;
    public volatile boolean a0;
    public volatile boolean b0;

    public DU1(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = c0;
        int length = fArr.length;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.T = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.C = new float[9];
        this.D = new float[9];
        this.E = new float[9];
        this.F = new float[9];
        this.G = new float[9];
        this.H = new float[9];
        this.I = new float[9];
        this.J = Float.NaN;
        C9326wU1 c9326wU1 = new C9326wU1(context);
        this.B = c9326wU1;
        c9326wU1.a(this);
        this.U = new CountDownLatch(1);
        this.V = new Object();
    }

    public static final void g(String str) {
        GLES20.glGetError();
    }

    public static final void h(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr3[3];
        float f4 = fArr2[2];
        float f5 = fArr3[6];
        fArr[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr2[0];
        float f7 = fArr3[1] * f6;
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr[1] = f7 + (f2 * f8) + (f4 * f9);
        float f10 = f6 * fArr3[2];
        float f11 = fArr2[1];
        float f12 = fArr3[5];
        float f13 = fArr3[8];
        fArr[2] = f10 + (f11 * f12) + (f4 * f13);
        float f14 = fArr2[3];
        float f15 = fArr3[0];
        float f16 = fArr2[4];
        float f17 = fArr2[5];
        fArr[3] = (f14 * f15) + (f3 * f16) + (f17 * f5);
        float f18 = fArr2[3];
        float f19 = fArr3[1];
        fArr[4] = (f18 * f19) + (f16 * f8) + (f17 * f9);
        float f20 = fArr3[2];
        fArr[5] = (f18 * f20) + (fArr2[4] * f12) + (f17 * f13);
        float f21 = fArr2[6] * f15;
        float f22 = fArr2[7];
        float f23 = fArr3[3] * f22;
        float f24 = fArr2[8];
        fArr[6] = f21 + f23 + (f5 * f24);
        float f25 = fArr2[6];
        fArr[7] = (f19 * f25) + (f22 * fArr3[4]) + (f9 * f24);
        fArr[8] = (f25 * f20) + (fArr2[7] * fArr3[5]) + (f24 * f13);
    }

    public static final void i(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    public static final void j(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int k(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        g("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            g("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            g("getShaderiv");
            if (iArr[0] == 0) {
                GLES20.glGetShaderInfoLog(iGlCreateShader);
                GLES20.glDeleteShader(iGlCreateShader);
                g("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public final SurfaceTexture a() {
        if (this.P == null) {
            return null;
        }
        try {
            this.U.await();
        } catch (InterruptedException unused) {
        }
        return this.O;
    }

    public final void b(int i, int i2) {
        synchronized (this.V) {
            this.N = i;
            this.M = i2;
            this.a0 = true;
            this.V.notifyAll();
        }
    }

    public final void c(SurfaceTexture surfaceTexture, int i, int i2) {
        this.N = i;
        this.M = i2;
        this.P = surfaceTexture;
    }

    public final void d() {
        synchronized (this.V) {
            this.b0 = true;
            this.P = null;
            this.V.notifyAll();
        }
    }

    public final void e(float f, float f2) {
        float f3 = f2 * 1.7453293f;
        float f4 = f * 1.7453293f;
        int i = this.N;
        int i2 = this.M;
        float f5 = i > i2 ? i : i2;
        float f6 = f3 / f5;
        this.K -= f4 / f5;
        float f7 = this.L - f6;
        this.L = f7;
        if (f7 < -1.5707964f) {
            this.L = -1.5707964f;
            f7 = -1.5707964f;
        }
        if (f7 > 1.5707964f) {
            this.L = 1.5707964f;
        }
    }

    public final boolean f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.Z;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.W.eglDestroySurface(this.X, this.Z) | this.W.eglMakeCurrent(this.X, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.Z = null;
        }
        EGLContext eGLContext = this.Y;
        if (eGLContext != null) {
            zEglDestroyContext |= this.W.eglDestroyContext(this.X, eGLContext);
            this.Y = null;
        }
        EGLDisplay eGLDisplay = this.X;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.W.eglTerminate(eGLDisplay) | zEglDestroyContext;
        this.X = null;
        return zEglTerminate;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.S++;
        synchronized (this.V) {
            this.V.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.DU1.run():void");
    }

    @Override // com.daaw.InterfaceC9047vU1
    public final void zza() {
        synchronized (this.V) {
            this.V.notifyAll();
        }
    }
}
