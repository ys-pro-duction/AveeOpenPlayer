package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.C9264wF;
import com.daaw.TH0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Zu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3007Zu extends AbstractC8699uF {
    public static final String[] Q = {"composition:0"};
    public C4880gc1 G;
    public boolean H;
    public String I;
    public String J;
    public C3151aR0 K;
    public C9264wF L;
    public LinkedHashMap M;
    public final C3755cc1 N;
    public G3 O;
    public InterfaceC6129l2 P;

    /* JADX INFO: renamed from: com.daaw.Zu$a */
    public class a implements InterfaceC6129l2 {
        public a() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C3007Zu.this.N.a());
            C6036kk0 c6036kk0A = th0.b().a();
            Map mapC = C3007Zu.this.K.c();
            C3007Zu.this.M.clear();
            int i = 1;
            for (Map.Entry entry : mapC.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof C1469Lf0) {
                    c4880gc1.s(str, ((C1469Lf0) value).i(c6036kk0A));
                }
                if (value instanceof Boolean) {
                    c4880gc1.s(str, ((Boolean) value).booleanValue() ? 1.0f : 0.0f);
                } else if ((value instanceof C9264wF) && !str.equals("u_texture")) {
                    C3007Zu.this.M.put(str, (C9264wF) value);
                    c4880gc1.x(str, i);
                    i++;
                }
            }
        }
    }

    public C3007Zu() {
        super(4, 1.0f, 1.0f);
        this.K = new C3151aR0();
        this.M = new LinkedHashMap();
        this.N = new C3755cc1();
        this.O = null;
        this.P = new a();
        d0();
        J(4);
        R(1.0f, 1.0f);
        this.L = b0();
    }

    private void h0(TH0 th0) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        th0.T(1);
    }

    @Override // com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        IW[] iwArrF0 = f0(th0, abstractC7070oQ);
        if (iwArrF0 == null) {
            super.B(th0, abstractC7070oQ);
            return;
        }
        C(th0);
        RectF rectFN = n(th0.b().a());
        b(th0, this.N, rectFN.centerX(), rectFN.centerY(), s(th0.b().a()));
        h0(th0);
        super.B(th0, abstractC7070oQ);
        TH0.c cVar = th0.u;
        C4880gc1 c4880gc1 = this.G;
        if (c4880gc1 == null || this.H) {
            this.H = false;
            this.G = cVar.E(c4880gc1);
            this.G = cVar.B(this.J, this.I);
        }
        th0.v(rectFN.left, rectFN.top, -1, C1458Lc1.s(), C1458Lc1.q(), new RH0(f(), iwArrF0, cVar.i(this.G), this.P));
    }

    public final C9264wF b0() {
        return new C9264wF(new C9264wF.b() { // from class: com.daaw.Xu
            @Override // com.daaw.C9264wF.b
            public final void a() {
                this.a.m();
            }
        }, new FQ() { // from class: com.daaw.Yu
            @Override // com.daaw.FQ
            public final Object a(Object obj) {
                return this.a.e0((InterfaceC9336wX) obj);
            }
        }, null, null);
    }

    public String c0() {
        return this.L.j();
    }

    public void d0() {
        Context contextI = com.daaw.avee.a.i();
        if (contextI == null) {
            return;
        }
        Resources resources = contextI.getResources();
        this.J = AbstractC0934Gb1.q(resources, GD0.l);
        this.I = AbstractC0934Gb1.q(resources, GD0.k);
    }

    public final /* synthetic */ G3 e0(InterfaceC9336wX interfaceC9336wX) {
        if (interfaceC9336wX != null) {
            this.O = interfaceC9336wX.b().b().k();
        }
        return this.O;
    }

    public IW[] f0(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        this.L.u(th0, abstractC7070oQ);
        ArrayList arrayList = new ArrayList();
        IW iwM = this.L.m(th0);
        if (iwM == null) {
            return null;
        }
        arrayList.add(iwM);
        Iterator it = this.M.values().iterator();
        while (it.hasNext()) {
            IW iwM2 = ((C9264wF) it.next()).m(th0);
            if (iwM2 == null) {
                return null;
            }
            arrayList.add(iwM2);
        }
        while (arrayList.size() < 2) {
            arrayList.add(null);
        }
        return (IW[]) arrayList.toArray(new IW[0]);
    }

    public void g0(String str) {
        this.L.C(str);
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "CustomShader";
    }

    @Override // com.daaw.AbstractC8699uF
    public void l() {
        super.l();
        C9264wF c9264wF = this.L;
        if (c9264wF != null) {
            c9264wF.p();
        }
        Iterator it = this.M.values().iterator();
        while (it.hasNext()) {
            ((C9264wF) it.next()).p();
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.t(c2591Vu);
        super.u(c2591Vu);
        g0(c2591Vu.x("TargetImage", "composition:1"));
        this.J = c2591Vu.x("shaderVertex", this.J);
        this.I = c2591Vu.x("shaderFragment", this.I);
        this.K.a(c2591Vu);
        this.H = true;
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        super.v(th0);
        RectF rectFQ = q(th0.u.b);
        this.L.q(th0, rectFQ, 0);
        Iterator it = this.M.values().iterator();
        while (it.hasNext()) {
            ((C9264wF) it.next()).q(th0, rectFQ, 0);
        }
        return false;
    }

    @Override // com.daaw.AbstractC8699uF
    public void w(TH0 th0, int i) {
        super.w(th0, i);
        this.L.r(th0, i);
        Iterator it = this.M.values().iterator();
        while (it.hasNext()) {
            ((C9264wF) it.next()).r(th0, i);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        C9264wF c9264wF = this.L;
        if (c9264wF != null) {
            c9264wF.s(th0);
        }
        Iterator it = this.M.values().iterator();
        while (it.hasNext()) {
            ((C9264wF) it.next()).s(th0);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        super.y(interfaceC9336wX, abstractC7070oQ, mw);
        this.L.t(interfaceC9336wX, abstractC7070oQ, mw);
        Iterator it = this.M.values().iterator();
        while (it.hasNext()) {
            ((C9264wF) it.next()).t(interfaceC9336wX, abstractC7070oQ, mw);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.z(c2591Vu, interfaceC4577fX);
        super.A(c2591Vu);
        c2591Vu.s0(h());
        interfaceC4577fX.a(c0());
        c2591Vu.h0("TargetImage", c0(), "1_appearance", Q);
        c2591Vu.j0("shaderFragment", this.I, "shader");
        c2591Vu.j0("shaderVertex", this.J, "shader");
        this.K.q(c2591Vu);
    }
}
