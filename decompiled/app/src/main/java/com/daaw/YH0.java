package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public class YH0 implements GLSurfaceView.Renderer {
    public final TH0 a;
    public Context c;
    public InterfaceC8635u10 e;
    public UJ0 b = null;
    public boolean d = false;
    public long f = System.currentTimeMillis();

    public YH0(Context context, Resources resources, InterfaceC8635u10 interfaceC8635u10) {
        this.c = null;
        this.c = context;
        this.e = interfaceC8635u10;
        TH0 th0 = new TH0(interfaceC8635u10);
        this.a = th0;
        th0.P(resources);
        d();
    }

    public C7906rQ a() {
        return this.a.C();
    }

    public int b() {
        return this.a.D();
    }

    public void c(C2695Wu c2695Wu, InterfaceC4577fX interfaceC4577fX) {
        UJ0 uj0 = this.b;
        if (uj0 != null) {
            uj0.p0(c2695Wu, interfaceC4577fX);
        }
    }

    public void d() {
        C2695Wu c2695Wu = (C2695Wu) VisualizerViewCore.K.a(null);
        if (c2695Wu != null) {
            g(c2695Wu);
        }
    }

    public void e() {
        UJ0 uj0 = this.b;
        if (uj0 != null) {
            uj0.l();
        }
    }

    public void f(C2695Wu c2695Wu) {
        UJ0 uj0 = this.b;
        if (uj0 != null) {
            uj0.t0(c2695Wu);
        }
    }

    public void g(C2695Wu c2695Wu) {
        if (this.b == null) {
            this.b = C2637Wf1.i().e(0, false, "");
        }
        this.b.t0(c2695Wu);
        UJ0 uj0 = this.b;
        if (uj0 != null) {
            uj0.l();
        }
        this.e.f();
    }

    public void h(UJ0 uj0) {
        this.b = uj0;
        if (uj0 != null) {
            uj0.l();
        }
        this.e.f();
    }

    public void i(int i, int i2) {
        if (i2 <= 0) {
            this.a.U(i);
            return;
        }
        AbstractC8699uF abstractC8699uFE = this.b.e(i2);
        if (abstractC8699uFE != null) {
            abstractC8699uFE.U(i);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.d && this.a.u.z()) {
            UJ0 uj0 = this.b;
            C7349pQ c7349pQ = (C7349pQ) VisualizerViewCore.N.a(null);
            GLES20.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            this.a.T(1);
            if (c7349pQ != null) {
                this.a.N(c7349pQ.c, c7349pQ.a, c7349pQ.b);
            } else {
                this.a.N(-1, -1, -1);
            }
            VisualizerViewCore.M.a(Float.valueOf(this.a.d()), Float.valueOf(this.a.g()));
            if (uj0 != null) {
                uj0.y(this.a, null, null);
            }
            if (uj0 != null) {
                uj0.s0(c7349pQ != null, c7349pQ != null && c7349pQ.d, c7349pQ != null ? c7349pQ.e : null);
            }
            if (uj0 != null) {
                uj0.B(this.a, null);
            }
            this.a.M();
            this.a.i(null);
            if (uj0 == null || c7349pQ == null || uj0.l0() == null) {
                return;
            }
            int[] iArrL0 = uj0.l0();
            VisualizerViewCore.O.a(iArrL0, Integer.valueOf(uj0.n0()), Integer.valueOf(uj0.m0()), iArrL0);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        AbstractC0441Bk1.c("onSurfaceChanged: " + i + " ; " + i2);
        this.a.Q(com.daaw.avee.a.i(), i, i2);
        UJ0 uj0 = this.b;
        if (uj0 != null) {
            uj0.l();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.d = true;
        this.a.R();
        UJ0 uj0 = this.b;
        if (uj0 != null) {
            uj0.l();
        }
    }
}
