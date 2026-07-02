package com.daaw;

import com.daaw.AbstractC6977o40;

/* JADX INFO: renamed from: com.daaw.uE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8695uE {
    public static final AbstractC6977o40.a f = AbstractC6977o40.a.a("ef");
    public static final AbstractC6977o40.a g = AbstractC6977o40.a.a("nm", "v");
    public H6 a;
    public I6 b;
    public I6 c;
    public I6 d;
    public I6 e;

    public final void a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        abstractC6977o40.d();
        String strR = "";
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(g);
            if (iO0 == 0) {
                strR = abstractC6977o40.R();
            } else if (iO0 == 1) {
                strR.getClass();
                switch (strR) {
                    case "Distance":
                        this.d = Y6.e(abstractC6977o40, c0737Ee0);
                        break;
                    case "Opacity":
                        this.b = Y6.f(abstractC6977o40, c0737Ee0, false);
                        break;
                    case "Direction":
                        this.c = Y6.f(abstractC6977o40, c0737Ee0, false);
                        break;
                    case "Shadow Color":
                        this.a = Y6.c(abstractC6977o40, c0737Ee0);
                        break;
                    case "Softness":
                        this.e = Y6.e(abstractC6977o40, c0737Ee0);
                        break;
                    default:
                        abstractC6977o40.q0();
                        break;
                }
            } else {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            }
        }
        abstractC6977o40.l();
    }

    public C8416tE b(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        I6 i6;
        I6 i62;
        I6 i63;
        I6 i64;
        while (abstractC6977o40.o()) {
            if (abstractC6977o40.o0(f) != 0) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                abstractC6977o40.c();
                while (abstractC6977o40.o()) {
                    a(abstractC6977o40, c0737Ee0);
                }
                abstractC6977o40.j();
            }
        }
        H6 h6 = this.a;
        if (h6 == null || (i6 = this.b) == null || (i62 = this.c) == null || (i63 = this.d) == null || (i64 = this.e) == null) {
            return null;
        }
        return new C8416tE(h6, i6, i62, i63, i64);
    }
}
