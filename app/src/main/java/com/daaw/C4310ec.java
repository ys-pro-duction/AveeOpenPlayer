package com.daaw;

import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.daaw.C2619Wb;
import java.io.File;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.daaw.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4310ec {
    public File b;
    public RunnableC2723Xb c;
    public RunnableC3606c31 d;
    public C8824ui0 f;
    public C2619Wb g;
    public C1046Hd1 h;
    public BQ i;
    public int j;
    public int k;
    public C3033a00 m;
    public YX0 a = null;
    public int l = 30;
    public VR0 n = new VR0(3);
    public Rect e = new Rect();

    public static long c(long j, int i) {
        return (j * 1000000) / ((long) i);
    }

    public static int d(long j, long j2) {
        return (int) ((j * j2) / 1000000);
    }

    public static int h(int i) {
        return n(i);
    }

    public static int i(int i) {
        return n(i);
    }

    public static String j() {
        return ".mp4";
    }

    public static String k() {
        return "video/mp4";
    }

    public static int n(int i) {
        int i2 = i % 16;
        return i2 == 0 ? i : (16 - i2) + i;
    }

    public boolean a(AbstractC3328b31 abstractC3328b31, long j, int i) {
        if (this.h != null && this.d != null) {
            EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
            EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
            EGLSurface eGLSurfaceEglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
            EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
            if (eGLContextEglGetCurrentContext == null) {
                AbstractC0441Bk1.c("oldEGLContext is null");
                return false;
            }
            if (this.m == null) {
                try {
                    this.m = new C3033a00(this.h.b(), eGLContextEglGetCurrentContext);
                } catch (Exception unused) {
                    return false;
                }
            }
            if (!abstractC3328b31.k()) {
                return false;
            }
            try {
                this.m.c();
                this.m.e(j * 1000);
                if (this.i == null) {
                    this.i = new BQ();
                }
                GLES20.glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
                this.e.set(0, 0, abstractC3328b31.getWidth(), abstractC3328b31.getHeight());
                Rect rect = this.e;
                GLES20.glViewport(rect.left, rect.top, rect.width(), this.e.height());
                abstractC3328b31.c();
                this.i.d();
                this.m.f();
                if (EGL14.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface2, eGLSurfaceEglGetCurrentSurface, eGLContextEglGetCurrentContext)) {
                    return true;
                }
                AbstractC0441Bk1.c("EGL14.eglMakeCurrent failed");
                return false;
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public void b(FX fx, long j) {
        if (fx.size() <= 0 || this.c == null || this.g == null) {
            return;
        }
        C2619Wb.a aVar = new C2619Wb.a();
        aVar.a = this.n.a(fx.size(), 10L);
        int i = 0;
        while (true) {
            short[] sArr = aVar.a.a;
            if (i >= sArr.length) {
                aVar.b = sArr.length;
                aVar.c = j;
                this.c.d(aVar);
                return;
            }
            sArr[i] = fx.get(i);
            i++;
        }
    }

    public boolean e(C7378pX0 c7378pX0) {
        AbstractC0441Bk1.c("### finish");
        this.d = null;
        C3033a00 c3033a00 = this.m;
        if (c3033a00 != null) {
            c3033a00.d();
            this.m = null;
        }
        YX0 yx0 = this.a;
        boolean zA = yx0 != null ? yx0.a(c7378pX0) : true;
        this.a = null;
        return zA;
    }

    public void f() {
        RunnableC3606c31 runnableC3606c31 = this.d;
        if (runnableC3606c31 != null) {
            runnableC3606c31.c();
        }
    }

    public int g() {
        C2619Wb c2619Wb = this.g;
        if (c2619Wb == null) {
            return 2;
        }
        return c2619Wb.c();
    }

    public String l(File file, OutputStream outputStream, int i, int i2, int i3, float f, boolean z, float f2, int i4, int i5, String str, String str2, int i6) {
        if (outputStream != null) {
            this.a = new YX0(file, outputStream);
        }
        this.b = file;
        return o(z, i2, i3, Math.min(90.0f, Math.max(0.1f, f)), i, 5, f2, i4, i5, str, str2, i6);
    }

    public void m() {
        BQ bq = this.i;
        if (bq != null) {
            bq.b();
        }
        this.i = null;
    }

    public final String o(boolean z, int i, int i2, float f, int i3, int i4, float f2, int i5, int i6, String str, String str2, int i7) {
        float f3 = f < 0.0f ? 4.0f : f;
        int i8 = i3 < 0 ? 30 : i3;
        int i9 = i4 < 0 ? 5 : i4;
        this.l = i8;
        this.k = i;
        this.j = i2;
        AbstractC0441Bk1.a("starting to record " + this.k + "x" + this.j);
        int i10 = (int) (f3 * 1000000.0f);
        int i11 = (int) (1000.0f * f2);
        try {
            this.f = new C8824ui0(this.b, z ? 2 : 1);
            long jCeil = (long) Math.ceil(1000000.0d / ((double) i8));
            if (z) {
                try {
                    this.g = new C2619Wb(this.f, i6, i5, i11, d(jCeil, i6) + 8);
                } catch (Exception e) {
                    return "AudioEncoder: " + e.toString();
                }
            }
            if (z) {
                try {
                    this.c = new RunnableC2723Xb(this.g);
                } catch (Exception e2) {
                    return "AudioEncoderManager: " + e2.toString();
                }
            }
            try {
                C1046Hd1 c1046Hd1 = new C1046Hd1(this.f, this.k, this.j, i10, i8, i9, str, str2, i7);
                this.h = c1046Hd1;
                try {
                    this.d = new RunnableC3606c31(c1046Hd1);
                    return null;
                } catch (Exception e3) {
                    return "TextureEncoder: " + e3.toString();
                }
            } catch (Exception e4) {
                return "VideoEncoder: " + e4.toString();
            }
        } catch (Exception e5) {
            return "MediaMuxer: " + e5.toString();
        }
    }

    public boolean p(C7378pX0 c7378pX0) {
        RunnableC3606c31 runnableC3606c31;
        if (this.d != null) {
            AbstractC0441Bk1.a("stopping video recorder, videoEncoder=" + this.d);
            if (this.d.f()) {
                this.d.g();
            }
        }
        if (this.c != null) {
            AbstractC0441Bk1.a("stopping audio recorder, videoEncoder=" + this.d);
            if (this.c.g()) {
                this.c.i();
            }
        }
        int i = 0;
        while (true) {
            RunnableC2723Xb runnableC2723Xb = this.c;
            if ((runnableC2723Xb == null || !runnableC2723Xb.g()) && ((runnableC3606c31 = this.d) == null || !runnableC3606c31.f())) {
                break;
            }
            i++;
            if (i % 1000 == 0) {
                AbstractC0441Bk1.b(new RuntimeException("Waiting on .isRecording for " + (i / 100) + " seconds already"), "");
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                AbstractC0441Bk1.b(e, null);
            }
        }
        C8824ui0 c8824ui0 = this.f;
        if (c8824ui0 != null) {
            c8824ui0.c();
        }
        RunnableC2723Xb runnableC2723Xb2 = this.c;
        if (runnableC2723Xb2 != null) {
            runnableC2723Xb2.h(c7378pX0);
        }
        return true;
    }
}
