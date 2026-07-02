package com.daaw;

import com.daaw.C5510ir;

/* JADX INFO: renamed from: com.daaw.Xq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2784Xq0 {
    public static boolean[] a = new boolean[3];

    public static void a(C5791jr c5791jr, C4311ec0 c4311ec0, C5510ir c5510ir) {
        c5510ir.j = -1;
        c5510ir.k = -1;
        C5510ir.b bVar = c5791jr.M[0];
        C5510ir.b bVar2 = C5510ir.b.WRAP_CONTENT;
        if (bVar != bVar2 && c5510ir.M[0] == C5510ir.b.MATCH_PARENT) {
            int i = c5510ir.B.e;
            int iP = c5791jr.P() - c5510ir.D.e;
            C4106dr c4106dr = c5510ir.B;
            c4106dr.g = c4311ec0.q(c4106dr);
            C4106dr c4106dr2 = c5510ir.D;
            c4106dr2.g = c4311ec0.q(c4106dr2);
            c4311ec0.f(c5510ir.B.g, i);
            c4311ec0.f(c5510ir.D.g, iP);
            c5510ir.j = 2;
            c5510ir.k0(i, iP);
        }
        if (c5791jr.M[1] == bVar2 || c5510ir.M[1] != C5510ir.b.MATCH_PARENT) {
            return;
        }
        int i2 = c5510ir.C.e;
        int iV = c5791jr.v() - c5510ir.E.e;
        C4106dr c4106dr3 = c5510ir.C;
        c4106dr3.g = c4311ec0.q(c4106dr3);
        C4106dr c4106dr4 = c5510ir.E;
        c4106dr4.g = c4311ec0.q(c4106dr4);
        c4311ec0.f(c5510ir.C.g, i2);
        c4311ec0.f(c5510ir.E.g, iV);
        if (c5510ir.Y > 0 || c5510ir.O() == 8) {
            C4106dr c4106dr5 = c5510ir.F;
            c4106dr5.g = c4311ec0.q(c4106dr5);
            c4311ec0.f(c5510ir.F.g, c5510ir.Y + i2);
        }
        c5510ir.k = 2;
        c5510ir.z0(i2, iV);
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
