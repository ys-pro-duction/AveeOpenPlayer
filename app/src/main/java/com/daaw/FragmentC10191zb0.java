package com.daaw;

import android.app.Fragment;
import android.content.Context;
import com.daaw.C10217zg1;
import com.daaw.NW;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC10191zb0 extends Fragment implements NW.b {
    public static C0746Eg1 B = new C0746Eg1();
    public static C0321Ag1 C = new C0321Ag1();
    public static C0529Cg1 D = new C0529Cg1();
    public static C0746Eg1 E = new C0746Eg1();
    public static C0321Ag1 F = new C0321Ag1();
    public static C0746Eg1 G = AbstractC4157e20.a;
    public static C0746Eg1 H = AbstractC4157e20.b;
    public static C10217zg1 I = AbstractC4157e20.e;
    public static C0321Ag1 J = AbstractC4157e20.h;
    public static C0321Ag1 K = AbstractC4157e20.f;
    public static C0425Bg1 L = AbstractC4157e20.g;
    public static C10217zg1 M = AbstractC4157e20.c;
    public static C10217zg1 N = AbstractC4157e20.d;
    public static C10217zg1 O = AbstractC3879d20.d;
    public static C10217zg1 P = AbstractC3879d20.c;
    public static C0850Fg1 Q = AbstractC3879d20.a;
    public static C9938yg1 R = AbstractC3879d20.b;
    public static C0425Bg1 S = AbstractC4436f20.a;
    public static C0425Bg1 T = AbstractC4725g20.a;
    public static C0321Ag1 U = AbstractC3600c20.a;
    public static C0321Ag1 V = AbstractC3600c20.b;
    public static C0321Ag1 W = AbstractC3600c20.c;
    public static C0321Ag1 X = AbstractC3322b20.a;
    public static C10217zg1 Y = AbstractC3322b20.b;
    public static C0425Bg1 Z = C6363ls.I;
    public static C0746Eg1 a0 = C6363ls.J;
    public static C10217zg1 b0 = C6363ls.K;
    public static C0321Ag1 c0 = AbstractC8524te.z;
    public static C9938yg1 d0 = AbstractC8524te.A;
    public static C0321Ag1 e0 = AbstractC8524te.B;
    public static C0746Eg1 f0 = AbstractC8524te.v;
    public static C10217zg1 g0 = AbstractC8524te.w;
    public static C10217zg1 h0 = AbstractC8524te.x;
    public static C10217zg1 i0 = AbstractC8524te.y;
    public static C1058Hg1 j0 = C6572me.c;
    public static C0954Gg1 k0 = AbstractC9991yr.r;
    public static C0954Gg1 l0 = AbstractC9991yr.s;
    public static C1058Hg1 m0 = AbstractC9991yr.t;
    public static C0850Fg1 n0 = AbstractC9991yr.u;
    public static C0321Ag1 o0 = AbstractC9991yr.v;
    public static C0425Bg1 p0 = AbstractC9991yr.w;
    public static C0529Cg1 q0 = AbstractC9991yr.p;
    public static C0746Eg1 r0 = AbstractC9991yr.q;
    public static C0850Fg1 s0 = AbstractC9991yr.x;
    public static C0954Gg1 t0 = AbstractC9991yr.y;
    public static C0425Bg1 u0 = AbstractC9991yr.z;
    public static C10217zg1 v0 = AbstractC9991yr.A;
    public static C0850Fg1 w0 = AbstractC9991yr.B;
    public static C8536tg1 x0 = C2267Sr.O;
    public static C10217zg1 y0 = new C10217zg1();
    public static C10217zg1 z0 = new C10217zg1();
    public static C10217zg1 A0 = new C10217zg1();

    public static C4821gO0 h(Context context, C1773Od1 c1773Od1) {
        if (c1773Od1 == null) {
            return C4821gO0.d;
        }
        String[] strArr = new String[1];
        InterfaceC5694jX[] interfaceC5694jXArr = new InterfaceC5694jX[1];
        c1773Od1.B().x(context, strArr, interfaceC5694jXArr);
        String str = strArr[0];
        if (str == null || str.isEmpty()) {
            C4821gO0 c4821gO0 = new C4821gO0();
            c4821gO0.a = false;
            c4821gO0.b = "";
            c4821gO0.c = null;
            return c4821gO0;
        }
        InterfaceC5694jX interfaceC5694jX = interfaceC5694jXArr[0];
        String str2 = strArr[0];
        C4821gO0 c4821gO02 = new C4821gO0();
        c4821gO02.a = true;
        c4821gO02.b = str2;
        c4821gO02.c = interfaceC5694jX;
        return c4821gO02;
    }

    public static void i(boolean z) {
        z0.a(Boolean.valueOf(z));
    }

    public static void j(boolean z) {
        A0.a(Boolean.valueOf(z));
    }

    public static void k(int i) {
        y0.a(Integer.valueOf(i));
    }

    @Override // com.daaw.NW.b
    public void a(String str, String str2) {
        C.a(str, str2);
    }

    @Override // com.daaw.NW.b
    public void b(C10217zg1.a aVar, List list) {
        y0.b(aVar, list);
    }

    @Override // com.daaw.NW.b
    public int c() {
        return ((Integer) B.a(0)).intValue();
    }

    @Override // com.daaw.NW.b
    public int d() {
        return ((Integer) E.a(0)).intValue();
    }

    @Override // com.daaw.NW.b
    public void e(C10217zg1.a aVar, List list) {
        z0.b(aVar, list);
    }

    @Override // com.daaw.NW.b
    public String f(String str, String str2) {
        String str3;
        if (str2.length() <= 0) {
            return str;
        }
        if (str.length() <= 0) {
            return str + str2;
        }
        if (str.charAt(str.length() - 1) == '/') {
            if (str2.charAt(0) != '/') {
                str3 = str + str2;
            } else {
                str3 = str + str2.substring(1);
            }
        } else if (str2.charAt(0) != '/') {
            str3 = str + "/" + str2;
        } else {
            str3 = str + str2;
        }
        int length = str3.length();
        if (length > 0 && str3.charAt(length - 1) == '/') {
            return str3;
        }
        return str3 + "/";
    }

    @Override // com.daaw.NW.b
    public void g(C10217zg1.a aVar, List list) {
        A0.b(aVar, list);
    }
}
