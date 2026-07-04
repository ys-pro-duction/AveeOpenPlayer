package com.daaw;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: renamed from: com.daaw.jd3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceHolderCallbackC5725jd3 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, InterfaceC2249Sm1, Zk3, Ar3, InterfaceC7189op3, InterfaceC6277la3, Q93, Va3 {
    public final /* synthetic */ Cd3 B;

    public /* synthetic */ SurfaceHolderCallbackC5725jd3(Cd3 cd3, AbstractC4887gd3 abstractC4887gd3) {
        this.B = cd3;
    }

    @Override // com.daaw.Zk3
    public final void a(final boolean z) {
        Cd3 cd3 = this.B;
        if (cd3.V == z) {
            return;
        }
        cd3.V = z;
        C8057rw2 c8057rw2 = this.B.k;
        c8057rw2.d(23, new InterfaceC0803Eu2() { // from class: com.daaw.Xc3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((InterfaceC9067vZ1) obj).r(z);
            }
        });
        c8057rw2.c();
    }

    @Override // com.daaw.Zk3
    public final void b(C2485Ut1 c2485Ut1, C9631xa3 c9631xa3) {
        this.B.K = c2485Ut1;
        this.B.q.L(c2485Ut1, c9631xa3);
    }

    @Override // com.daaw.Zk3
    public final void c(Exception exc) {
        this.B.q.S(exc);
    }

    @Override // com.daaw.Zk3
    public final void d(String str, long j, long j2) {
        this.B.q.O(str, j, j2);
    }

    @Override // com.daaw.Zk3
    public final void e(Exception exc) {
        this.B.q.R(exc);
    }

    @Override // com.daaw.Zk3
    public final void f(C8787ua3 c8787ua3) {
        this.B.q.i(c8787ua3);
        this.B.K = null;
        this.B.R = null;
    }

    @Override // com.daaw.Zk3
    public final void g(int i, long j, long j2) {
        this.B.q.K(i, j, j2);
    }

    @Override // com.daaw.Zk3
    public final void h(C8787ua3 c8787ua3) {
        this.B.R = c8787ua3;
        this.B.q.m(c8787ua3);
    }

    @Override // com.daaw.Zk3
    public final void i(long j) {
        this.B.q.c(j);
    }

    @Override // com.daaw.Zk3
    public final void l(String str) {
        this.B.q.E(str);
    }

    @Override // com.daaw.InterfaceC2249Sm1
    public final void m(String str) {
        this.B.q.l(str);
    }

    @Override // com.daaw.InterfaceC2249Sm1
    public final void n(C8787ua3 c8787ua3) {
        this.B.Q = c8787ua3;
        this.B.q.F(c8787ua3);
    }

    @Override // com.daaw.InterfaceC2249Sm1
    public final void o(int i, long j) {
        this.B.q.D(i, j);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Cd3.w(this.B, surfaceTexture);
        this.B.N(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.B.Q(null);
        this.B.N(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.B.N(i, i2);
    }

    @Override // com.daaw.InterfaceC2249Sm1
    public final void p(long j, int i) {
        this.B.q.B(j, i);
    }

    @Override // com.daaw.InterfaceC2249Sm1
    public final void q(C8787ua3 c8787ua3) {
        this.B.q.q(c8787ua3);
        this.B.J = null;
        this.B.Q = null;
    }

    @Override // com.daaw.InterfaceC2249Sm1
    public final void r(final C2326Tf2 c2326Tf2) {
        this.B.a0 = c2326Tf2;
        C8057rw2 c8057rw2 = this.B.k;
        c8057rw2.d(25, new InterfaceC0803Eu2() { // from class: com.daaw.ad3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((InterfaceC9067vZ1) obj).h(c2326Tf2);
            }
        });
        c8057rw2.c();
    }

    @Override // com.daaw.InterfaceC2249Sm1
    public final void s(C2485Ut1 c2485Ut1, C9631xa3 c9631xa3) {
        this.B.J = c2485Ut1;
        this.B.q.f(c2485Ut1, c9631xa3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.B.N(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.B.N(0, 0);
    }

    @Override // com.daaw.InterfaceC2249Sm1
    public final void t(Exception exc) {
        this.B.q.w(exc);
    }

    @Override // com.daaw.InterfaceC2249Sm1
    public final void u(String str, long j, long j2) {
        this.B.q.s(str, j, j2);
    }

    @Override // com.daaw.InterfaceC2249Sm1
    public final void v(Object obj, long j) {
        this.B.q.u(obj, j);
        Cd3 cd3 = this.B;
        if (cd3.M == obj) {
            C8057rw2 c8057rw2 = cd3.k;
            c8057rw2.d(26, new InterfaceC0803Eu2() { // from class: com.daaw.dd3
                @Override // com.daaw.InterfaceC0803Eu2
                public final void zza(Object obj2) {
                }
            });
            c8057rw2.c();
        }
    }

    @Override // com.daaw.Va3
    public final void zza(boolean z) {
        this.B.U();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
