package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2755Xj extends AbstractC2745Xg1 {
    public ArrayList k;
    public int l;

    public C2755Xj(C5510ir c5510ir, int i) {
        super(c5510ir);
        this.k = new ArrayList();
        this.f = i;
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01e1 A[PHI: r2 r23 r24 r25
  0x01e1: PHI (r2v29 int) = (r2v25 int), (r2v34 int) binds: [B:120:0x01df, B:111:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r23v1 int) = (r23v0 int), (r23v4 int) binds: [B:120:0x01df, B:111:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r24v1 int) = (r24v0 int), (r24v4 int) binds: [B:120:0x01df, B:111:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r25v2 int) = (r25v1 int), (r25v4 int) binds: [B:120:0x01df, B:111:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e5 A[PHI: r23 r24 r25
  0x01e5: PHI (r23v3 int) = (r23v0 int), (r23v4 int) binds: [B:120:0x01df, B:111:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01e5: PHI (r24v3 int) = (r24v0 int), (r24v4 int) binds: [B:120:0x01df, B:111:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01e5: PHI (r25v3 int) = (r25v1 int), (r25v4 int) binds: [B:120:0x01df, B:111:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0162  */
    @Override // com.daaw.AbstractC2745Xg1, com.daaw.InterfaceC6393lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.daaw.InterfaceC6393lz r27) {
        /*
            Method dump skipped, instruction units count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2755Xj.a(com.daaw.lz):void");
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void d() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((AbstractC2745Xg1) it.next()).d();
        }
        int size = this.k.size();
        if (size < 1) {
            return;
        }
        C5510ir c5510ir = ((AbstractC2745Xg1) this.k.get(0)).b;
        C5510ir c5510ir2 = ((AbstractC2745Xg1) this.k.get(size - 1)).b;
        if (this.f == 0) {
            C4106dr c4106dr = c5510ir.B;
            C4106dr c4106dr2 = c5510ir2.D;
            C8066rz c8066rzI = i(c4106dr, 0);
            int iC = c4106dr.c();
            C5510ir c5510irR = r();
            if (c5510irR != null) {
                iC = c5510irR.B.c();
            }
            if (c8066rzI != null) {
                b(this.h, c8066rzI, iC);
            }
            C8066rz c8066rzI2 = i(c4106dr2, 0);
            int iC2 = c4106dr2.c();
            C5510ir c5510irS = s();
            if (c5510irS != null) {
                iC2 = c5510irS.D.c();
            }
            if (c8066rzI2 != null) {
                b(this.i, c8066rzI2, -iC2);
            }
        } else {
            C4106dr c4106dr3 = c5510ir.C;
            C4106dr c4106dr4 = c5510ir2.E;
            C8066rz c8066rzI3 = i(c4106dr3, 1);
            int iC3 = c4106dr3.c();
            C5510ir c5510irR2 = r();
            if (c5510irR2 != null) {
                iC3 = c5510irR2.C.c();
            }
            if (c8066rzI3 != null) {
                b(this.h, c8066rzI3, iC3);
            }
            C8066rz c8066rzI4 = i(c4106dr4, 1);
            int iC4 = c4106dr4.c();
            C5510ir c5510irS2 = s();
            if (c5510irS2 != null) {
                iC4 = c5510irS2.E.c();
            }
            if (c8066rzI4 != null) {
                b(this.i, c8066rzI4, -iC4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            ((AbstractC2745Xg1) this.k.get(i)).e();
        }
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((AbstractC2745Xg1) it.next()).f();
        }
    }

    @Override // com.daaw.AbstractC2745Xg1
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC2745Xg1 abstractC2745Xg1 = (AbstractC2745Xg1) this.k.get(i);
            j = j + ((long) abstractC2745Xg1.h.f) + abstractC2745Xg1.j() + ((long) abstractC2745Xg1.i.f);
        }
        return j;
    }

    @Override // com.daaw.AbstractC2745Xg1
    public boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC2745Xg1) this.k.get(i)).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        C5510ir c5510ir;
        C5510ir c5510ir2 = this.b;
        C5510ir c5510irH = c5510ir2.H(this.f);
        while (true) {
            C5510ir c5510ir3 = c5510irH;
            c5510ir = c5510ir2;
            c5510ir2 = c5510ir3;
            if (c5510ir2 == null) {
                break;
            } else {
                c5510irH = c5510ir2.H(this.f);
            }
        }
        this.b = c5510ir;
        this.k.add(c5510ir.J(this.f));
        C5510ir c5510irF = c5510ir.F(this.f);
        while (c5510irF != null) {
            this.k.add(c5510irF.J(this.f));
            c5510irF = c5510irF.F(this.f);
        }
        for (AbstractC2745Xg1 abstractC2745Xg1 : this.k) {
            int i = this.f;
            if (i == 0) {
                abstractC2745Xg1.b.c = this;
            } else if (i == 1) {
                abstractC2745Xg1.b.d = this;
            }
        }
        if (this.f == 0 && ((C5791jr) this.b.G()).a1() && this.k.size() > 1) {
            ArrayList arrayList = this.k;
            this.b = ((AbstractC2745Xg1) arrayList.get(arrayList.size() - 1)).b;
        }
        this.l = this.f == 0 ? this.b.x() : this.b.L();
    }

    public final C5510ir r() {
        for (int i = 0; i < this.k.size(); i++) {
            AbstractC2745Xg1 abstractC2745Xg1 = (AbstractC2745Xg1) this.k.get(i);
            if (abstractC2745Xg1.b.O() != 8) {
                return abstractC2745Xg1.b;
            }
        }
        return null;
    }

    public final C5510ir s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            AbstractC2745Xg1 abstractC2745Xg1 = (AbstractC2745Xg1) this.k.get(size);
            if (abstractC2745Xg1.b.O() != 8) {
                return abstractC2745Xg1.b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + ((AbstractC2745Xg1) it.next())) + "> ";
        }
        return string;
    }
}
