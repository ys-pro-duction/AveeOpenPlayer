package com.daaw;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.daaw.C0488Bw0;
import com.daaw.InterfaceC9736xw0;
import com.daaw.V3;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public class HS0 implements WI {
    public final VH0[] a;
    public final WI b;
    public final Handler c;
    public final b d;
    public final CopyOnWriteArraySet e;
    public final CopyOnWriteArraySet f;
    public final CopyOnWriteArraySet g;
    public final CopyOnWriteArraySet h;
    public final CopyOnWriteArraySet i;
    public final V3 j;
    public Format k;
    public Format l;
    public Surface m;
    public boolean n;
    public int o;
    public SurfaceHolder p;
    public TextureView q;
    public C0912Fw r;
    public C0912Fw s;
    public int t;
    public C2097Rb u;
    public float v;
    public InterfaceC1792Oi0 w;
    public List x;

    public interface c extends InterfaceC1254Jd1 {
    }

    public HS0(ZH0 zh0, AbstractC3895d51 abstractC3895d51, InterfaceC0625Dc0 interfaceC0625Dc0, InterfaceC7580qE interfaceC7580qE) {
        this(zh0, abstractC3895d51, interfaceC0625Dc0, interfaceC7580qE, new V3.a());
    }

    public void C(InterfaceC4166e4 interfaceC4166e4) {
        this.j.G(interfaceC4166e4);
    }

    public void D(InterfaceC5198hk0 interfaceC5198hk0) {
        this.g.add(interfaceC5198hk0);
    }

    public void E(InterfaceC1254Jd1 interfaceC1254Jd1) {
        this.e.add(interfaceC1254Jd1);
    }

    public WI F(VH0[] vh0Arr, AbstractC3895d51 abstractC3895d51, InterfaceC0625Dc0 interfaceC0625Dc0, InterfaceC5207hm interfaceC5207hm) {
        return new YI(vh0Arr, abstractC3895d51, interfaceC0625Dc0, interfaceC5207hm);
    }

    public void G(InterfaceC1792Oi0 interfaceC1792Oi0) {
        l(interfaceC1792Oi0, true, true);
    }

    public final void H() {
        TextureView textureView = this.q;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() == this.d) {
                this.q.setSurfaceTextureListener(null);
            }
            this.q = null;
        }
        SurfaceHolder surfaceHolder = this.p;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.d);
            this.p = null;
        }
    }

    public void I(c cVar) {
        this.e.clear();
        if (cVar != null) {
            E(cVar);
        }
    }

    public void J(Surface surface) {
        H();
        K(surface, false);
    }

    public final void K(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (VH0 vh0 : this.a) {
            if (vh0.h() == 2) {
                arrayList.add(this.b.d(vh0).n(1).m(surface).l());
            }
        }
        Surface surface2 = this.m;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0488Bw0) it.next()).a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.n) {
                this.m.release();
            }
        }
        this.m = surface;
        this.n = z;
    }

    public void L(float f) {
        this.v = f;
        for (VH0 vh0 : this.a) {
            if (vh0.h() == 1) {
                this.b.d(vh0).n(2).m(Float.valueOf(f)).l();
            }
        }
    }

    @Override // com.daaw.InterfaceC9736xw0
    public void a() {
        this.b.a();
        H();
        Surface surface = this.m;
        if (surface != null) {
            if (this.n) {
                surface.release();
            }
            this.m = null;
        }
        InterfaceC1792Oi0 interfaceC1792Oi0 = this.w;
        if (interfaceC1792Oi0 != null) {
            interfaceC1792Oi0.i(this.j);
        }
        this.x = Collections.EMPTY_LIST;
    }

    @Override // com.daaw.InterfaceC9736xw0
    public void b(InterfaceC9736xw0.a aVar) {
        this.b.b(aVar);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public boolean c() {
        return this.b.c();
    }

    @Override // com.daaw.WI
    public C0488Bw0 d(C0488Bw0.b bVar) {
        return this.b.d(bVar);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public int e() {
        return this.b.e();
    }

    @Override // com.daaw.InterfaceC9736xw0
    public void f(long j) {
        this.j.N();
        this.b.f(j);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public int g() {
        return this.b.g();
    }

    @Override // com.daaw.InterfaceC9736xw0
    public long getDuration() {
        return this.b.getDuration();
    }

    @Override // com.daaw.InterfaceC9736xw0
    public void h(boolean z) {
        this.b.h(z);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public long i() {
        return this.b.i();
    }

    @Override // com.daaw.InterfaceC9736xw0
    public long j() {
        return this.b.j();
    }

    @Override // com.daaw.InterfaceC9736xw0
    public int k() {
        return this.b.k();
    }

    @Override // com.daaw.WI
    public void l(InterfaceC1792Oi0 interfaceC1792Oi0, boolean z, boolean z2) {
        InterfaceC1792Oi0 interfaceC1792Oi02 = this.w;
        if (interfaceC1792Oi02 != interfaceC1792Oi0) {
            if (interfaceC1792Oi02 != null) {
                interfaceC1792Oi02.i(this.j);
                this.j.O();
            }
            interfaceC1792Oi0.c(this.c, this.j);
            this.w = interfaceC1792Oi0;
        }
        this.b.l(interfaceC1792Oi0, z, z2);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public int m() {
        return this.b.m();
    }

    @Override // com.daaw.InterfaceC9736xw0
    public L31 n() {
        return this.b.n();
    }

    @Override // com.daaw.InterfaceC9736xw0
    public long o() {
        return this.b.o();
    }

    public HS0(ZH0 zh0, AbstractC3895d51 abstractC3895d51, InterfaceC0625Dc0 interfaceC0625Dc0, InterfaceC7580qE interfaceC7580qE, V3.a aVar) {
        this(zh0, abstractC3895d51, interfaceC0625Dc0, interfaceC7580qE, aVar, InterfaceC5207hm.a);
    }

    public HS0(ZH0 zh0, AbstractC3895d51 abstractC3895d51, InterfaceC0625Dc0 interfaceC0625Dc0, InterfaceC7580qE interfaceC7580qE, V3.a aVar, InterfaceC5207hm interfaceC5207hm) {
        b bVar = new b();
        this.d = bVar;
        this.e = new CopyOnWriteArraySet();
        this.f = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.h = copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
        this.i = copyOnWriteArraySet2;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.c = handler;
        VH0[] vh0ArrA = zh0.a(handler, bVar, bVar, bVar, bVar, interfaceC7580qE);
        this.a = vh0ArrA;
        this.v = 1.0f;
        this.t = 0;
        this.u = C2097Rb.e;
        this.o = 1;
        this.x = Collections.EMPTY_LIST;
        WI wiF = F(vh0ArrA, abstractC3895d51, interfaceC0625Dc0, interfaceC5207hm);
        this.b = wiF;
        V3 v3A = aVar.a(wiF, interfaceC5207hm);
        this.j = v3A;
        b(v3A);
        copyOnWriteArraySet.add(v3A);
        copyOnWriteArraySet2.add(v3A);
        D(v3A);
    }

    public final class b implements InterfaceC1358Kd1, InterfaceC2931Zb, B21, InterfaceC5198hk0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        public b() {
        }

        @Override // com.daaw.InterfaceC2931Zb
        public void B(int i, long j, long j2) {
            Iterator it = HS0.this.i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2931Zb) it.next()).B(i, j, j2);
            }
        }

        @Override // com.daaw.InterfaceC2931Zb
        public void D(C0912Fw c0912Fw) {
            HS0.this.s = c0912Fw;
            Iterator it = HS0.this.i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2931Zb) it.next()).D(c0912Fw);
            }
        }

        @Override // com.daaw.InterfaceC2931Zb
        public void a(int i) {
            HS0.this.t = i;
            Iterator it = HS0.this.i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2931Zb) it.next()).a(i);
            }
        }

        @Override // com.daaw.InterfaceC1358Kd1
        public void b(int i, int i2, int i3, float f) {
            Iterator it = HS0.this.e.iterator();
            while (it.hasNext()) {
                ((InterfaceC1254Jd1) it.next()).b(i, i2, i3, f);
            }
            Iterator it2 = HS0.this.h.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1358Kd1) it2.next()).b(i, i2, i3, f);
            }
        }

        @Override // com.daaw.InterfaceC1358Kd1
        public void f(String str, long j, long j2) {
            Iterator it = HS0.this.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC1358Kd1) it.next()).f(str, j, j2);
            }
        }

        @Override // com.daaw.B21
        public void h(List list) {
            HS0.this.x = list;
            Iterator it = HS0.this.f.iterator();
            while (it.hasNext()) {
                ((B21) it.next()).h(list);
            }
        }

        @Override // com.daaw.InterfaceC1358Kd1
        public void i(Surface surface) {
            if (HS0.this.m == surface) {
                Iterator it = HS0.this.e.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1254Jd1) it.next()).f();
                }
            }
            Iterator it2 = HS0.this.h.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1358Kd1) it2.next()).i(surface);
            }
        }

        @Override // com.daaw.InterfaceC2931Zb
        public void j(C0912Fw c0912Fw) {
            Iterator it = HS0.this.i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2931Zb) it.next()).j(c0912Fw);
            }
            HS0.this.l = null;
            HS0.this.s = null;
            HS0.this.t = 0;
        }

        @Override // com.daaw.InterfaceC2931Zb
        public void n(String str, long j, long j2) {
            Iterator it = HS0.this.i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2931Zb) it.next()).n(str, j, j2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            HS0.this.K(new Surface(surfaceTexture), true);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            HS0.this.K(null, true);
            return true;
        }

        @Override // com.daaw.InterfaceC5198hk0
        public void p(Metadata metadata) {
            Iterator it = HS0.this.g.iterator();
            while (it.hasNext()) {
                ((InterfaceC5198hk0) it.next()).p(metadata);
            }
        }

        @Override // com.daaw.InterfaceC1358Kd1
        public void q(int i, long j) {
            Iterator it = HS0.this.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC1358Kd1) it.next()).q(i, j);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            HS0.this.K(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            HS0.this.K(null, false);
        }

        @Override // com.daaw.InterfaceC1358Kd1
        public void u(C0912Fw c0912Fw) {
            Iterator it = HS0.this.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC1358Kd1) it.next()).u(c0912Fw);
            }
            HS0.this.k = null;
            HS0.this.r = null;
        }

        @Override // com.daaw.InterfaceC1358Kd1
        public void x(Format format) {
            HS0.this.k = format;
            Iterator it = HS0.this.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC1358Kd1) it.next()).x(format);
            }
        }

        @Override // com.daaw.InterfaceC1358Kd1
        public void y(C0912Fw c0912Fw) {
            HS0.this.r = c0912Fw;
            Iterator it = HS0.this.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC1358Kd1) it.next()).y(c0912Fw);
            }
        }

        @Override // com.daaw.InterfaceC2931Zb
        public void z(Format format) {
            HS0.this.l = format;
            Iterator it = HS0.this.i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2931Zb) it.next()).z(format);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }
    }
}
