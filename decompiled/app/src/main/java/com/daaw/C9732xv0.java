package com.daaw;

import com.daaw.C0642Dg1;
import com.daaw.C2078Qw0;
import com.daaw.avee.MainActivity;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9732xv0 {
    public static volatile C2078Qw0 b = C2078Qw0.k;
    public static volatile InterfaceC6540mX c = null;
    public static volatile C2078Qw0.b d = C2078Qw0.h;
    public static volatile int e = -1;
    public List a = new LinkedList();

    /* JADX INFO: renamed from: com.daaw.xv0$a */
    public class a implements C0642Dg1.a {
        public a() {
        }

        @Override // com.daaw.C0642Dg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(B61 b61, Integer num, Boolean bool, Boolean bool2, Object obj) {
            C2078Qw0 c2078Qw0;
            InterfaceC6540mX interfaceC6540mX;
            Object obj2;
            if (b61 != null) {
                c2078Qw0 = (C2078Qw0) b61.a;
                interfaceC6540mX = (InterfaceC6540mX) b61.b;
            } else {
                c2078Qw0 = null;
                interfaceC6540mX = null;
            }
            if (c2078Qw0 == null) {
                c2078Qw0 = C2078Qw0.k;
            }
            C2078Qw0.b bVarJ = c2078Qw0.j(com.daaw.avee.a.k());
            C9732xv0.c = interfaceC6540mX;
            C9732xv0.e = num.intValue();
            C9732xv0.b = c2078Qw0;
            C9732xv0.d = bVarJ;
            FP fpB1 = MainActivity.b1();
            if (fpB1 != null) {
                fpB1.F();
            }
            GP gpC1 = MainActivity.c1();
            if (gpC1 != null) {
                gpC1.u(C9732xv0.e, c2078Qw0, bVarJ, C9732xv0.c);
            }
            if (bool2.booleanValue()) {
                if (bool.booleanValue()) {
                    com.daaw.avee.comp.playback.c.f.a(3);
                } else {
                    com.daaw.avee.comp.playback.c.e.a((b61 == null || (obj2 = b61.a) == null) ? "" : ((C2078Qw0) obj2).g(), Boolean.TRUE, 0L, (Long) obj);
                }
            }
        }
    }

    public C9732xv0() {
        e = C8974vC0.c().m();
        B61 b61K = C8974vC0.c().k();
        if (b61K != null) {
            b = (C2078Qw0) b61K.a;
            c = (InterfaceC6540mX) b61K.b;
            d = b.j(com.daaw.avee.a.k());
        }
        C8974vC0.G.b(new a(), this.a);
    }
}
