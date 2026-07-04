package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.daaw.AbstractC4157e20;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import com.daaw.C0529Cg1;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C10217zg1;
import com.daaw.C1058Hg1;
import com.daaw.C1777Oe1;
import com.daaw.C2078Qw0;
import com.daaw.C2267Sr;
import com.daaw.C5004h20;
import com.daaw.C8536tg1;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Db0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0612Db0 {
    public B61 c;
    public B61 d;
    public List a = new LinkedList();
    public boolean b = true;
    public int e = 0;

    /* JADX INFO: renamed from: com.daaw.Db0$A */
    public class A implements C0850Fg1.a {
        public A() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(Integer num) {
            return Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$B */
    public class B implements C9938yg1.a {
        public B() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            DialogFragmentC3611c41.a();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$C */
    public class C implements C0321Ag1.a {
        public C() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Boolean bool, Class cls) {
            if (cls.equals(C1100Hr.class)) {
                SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().a0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.v, bool.booleanValue());
            } else if (cls.equals(C1204Ir.class)) {
                SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().a0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.w, bool.booleanValue());
            }
            C0612Db0.this.x();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$D */
    public class D implements C0746Eg1.a {
        public D() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2138Rl0 invoke() {
            C8974vC0 c8974vC0C = C8974vC0.c();
            return c8974vC0C != null ? c8974vC0C.l() : new C2138Rl0();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$E */
    public class E implements C0746Eg1.a {
        public E() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC8771uX invoke() {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                return c8974vC0C.p();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$F */
    public class F implements C0746Eg1.a {
        public F() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke() {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                return Integer.valueOf(c8974vC0C.o());
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$G */
    public class G implements C10217zg1.a {
        public G() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(String str) {
            C2078Qw0 c2078Qw0 = new C2078Qw0(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c2078Qw0);
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                c8974vC0C.E(arrayList, 0, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$H */
    public class H implements C0321Ag1.a {
        public H() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(String str, String str2) {
            if (str.equals("/") && "6".equals(str2)) {
                C0612Db0.this.e = 1;
                C0612Db0.this.x();
            } else {
                FP fpB1 = MainActivity.b1();
                if (fpB1 != null) {
                    fpB1.t(null, str2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$I */
    public class I implements C0321Ag1.a {
        public I() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, View view) {
            Context contextH = com.daaw.avee.a.h();
            if (contextH == null) {
                return;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 120) {
                DialogFragmentC3369bC.g("libraryAddFolder", JD0.J0, "");
                return;
            }
            if (iIntValue == 125) {
                if (view != null) {
                    C1777Oe1.b(view, "");
                    return;
                }
                return;
            }
            if (iIntValue == 1110) {
                C8974vC0 c8974vC0C = C8974vC0.c();
                if (c8974vC0C != null) {
                    c8974vC0C.E(new ArrayList(), -1, -1, null);
                    return;
                }
                return;
            }
            switch (iIntValue) {
                case 110:
                    X2.c();
                    break;
                case 111:
                    AbstractC5075hI.a.a(contextH.getResources().getString(JD0.e2));
                    break;
                case 112:
                    C8974vC0 c8974vC0C2 = C8974vC0.c();
                    if (c8974vC0C2 != null) {
                        DialogFragmentC1536Lw0.c(c8974vC0C2.l().L(), Boolean.TRUE);
                    }
                    break;
                case 113:
                    C0612Db0.this.t();
                    break;
                case 114:
                    SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.q);
                    break;
                case 115:
                    SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.s);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$a, reason: case insensitive filesystem */
    public class C0613a implements C0321Ag1.a {
        public C0613a() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(String str, String str2) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().I(str, str2);
            C0612Db0.this.x();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$b, reason: case insensitive filesystem */
    public class C0614b implements C10217zg1.a {
        public C0614b() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(List list) {
            C0612Db0.this.n(list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$c, reason: case insensitive filesystem */
    public class C0615c implements C0746Eg1.a {
        public C0615c() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke() {
            return Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.q));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$d, reason: case insensitive filesystem */
    public class C0616d implements C0529Cg1.a {
        public C0616d() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(G3 g3, ImageView imageView, Boolean bool, Boolean bool2) {
            new E3().o(g3.a, g3.b, g3.c, imageView, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$e, reason: case insensitive filesystem */
    public class C0617e implements C0529Cg1.a {
        public C0617e() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(G3 g3, ImageView imageView, Boolean bool, Boolean bool2) {
            C0612Db0.this.p(g3, imageView, bool);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$f, reason: case insensitive filesystem */
    public class C0618f implements C0746Eg1.a {
        public C0618f() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke() {
            return Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.s));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$g, reason: case insensitive filesystem */
    public class C0619g implements C10217zg1.a {
        public C0619g() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(List list) {
            C2078Qw0 c2078Qw0A;
            Context contextI;
            if (list.size() < 1 || (c2078Qw0A = ((AbstractC4157e20.d) list.get(list.size() - 1)).a()) == null || (contextI = com.daaw.avee.a.i()) == null) {
                return;
            }
            KU0.a(contextI, c2078Qw0A);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$h, reason: case insensitive filesystem */
    public class C0620h implements C0850Fg1.a {
        public C0620h() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public B61 invoke(NW nw) {
            return "/".equals(nw.e()) ? C0612Db0.this.q() : C0612Db0.this.r();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$i, reason: case insensitive filesystem */
    public class C0621i implements C0746Eg1.a {
        public C0621i() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke() {
            return Integer.valueOf(C0612Db0.this.e);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$j */
    public class j implements C0321Ag1.a {
        public j() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Boolean bool) {
            if (num.intValue() == SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.q) {
                FragmentC10191zb0.i(bool.booleanValue());
                return;
            }
            if (num.intValue() == SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.s) {
                FragmentC10191zb0.j(bool.booleanValue());
                C0612Db0.this.x();
                C0612Db0.this.y();
            } else if (num.intValue() == SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.C) {
                C0612Db0.this.x();
                C0612Db0.this.y();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$k */
    public class k implements C8536tg1.a {
        public k() {
        }

        @Override // com.daaw.C8536tg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(C6363ls c6363ls, C2078Qw0.b bVar, Boolean bool) {
            C0612Db0.this.w(c6363ls, bVar, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$l */
    public class l implements C0425Bg1.a {
        public l() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Integer num2, Boolean bool) {
            if (num.intValue() == SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.V) {
                B61 b61U = C0612Db0.this.u(num2);
                if (b61U != null) {
                    C0612Db0.this.d = b61U;
                }
                C0612Db0.this.x();
                C0612Db0.this.y();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$m */
    public class m implements C0321Ag1.a {
        public m() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(String str, String str2) {
            if (str2.equals("libraryAddFolder")) {
                C0612Db0.this.o(new String[]{str});
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$n */
    public class n implements C0321Ag1.a {
        public n() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(C5004h20.a aVar, Boolean bool) {
            C0612Db0.this.v(aVar.c());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$o */
    public class o implements C10217zg1.a {
        public o() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(InterfaceC5694jX interfaceC5694jX) {
            C0612Db0.this.v(interfaceC5694jX);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$p */
    public class p implements C0321Ag1.a {
        public p() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Collection collection, Integer num) {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                c8974vC0C.d(collection, num.intValue(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$q */
    public class q implements C0425Bg1.a {
        public q() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Integer num2, List list) {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                c8974vC0C.r(num.intValue(), num2.intValue(), list, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$r */
    public class r implements C0425Bg1.a {
        public r() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(List list, Integer num, InterfaceC8771uX interfaceC8771uX) {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                c8974vC0C.E(list, num.intValue(), -1, interfaceC8771uX);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$s */
    public class s implements C0425Bg1.a {
        public s() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(List list, Integer num, InterfaceC8771uX interfaceC8771uX) {
            C0612Db0.this.s(list, num, interfaceC8771uX);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$t */
    public class t implements C0425Bg1.a {
        public t() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(List list, Integer num, InterfaceC8771uX interfaceC8771uX) {
            C0612Db0.this.s(list, num, interfaceC8771uX);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$u */
    public class u implements C10217zg1.a {
        public u() {
        }

        @Override // com.daaw.C10217zg1.a
        public void invoke(Object obj) {
            if (obj instanceof C2267Sr.s) {
                C2267Sr.s sVar = (C2267Sr.s) obj;
                C8974vC0 c8974vC0C = C8974vC0.c();
                if (c8974vC0C != null) {
                    c8974vC0C.Q(sVar.c, 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$v */
    public class v implements C0850Fg1.a {
        public v() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(Class cls) {
            return cls.equals(C1100Hr.class) ? Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.v)) : cls.equals(C1204Ir.class) ? Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.w)) : Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$w */
    public class w implements C10217zg1.a {
        public w() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(List list) {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                c8974vC0C.M(list);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$x */
    public class x implements C10217zg1.a {
        public x() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                c8974vC0C.R(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$y */
    public class y implements C10217zg1.a {
        public y() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(InterfaceC6540mX interfaceC6540mX) {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                c8974vC0C.O(interfaceC6540mX);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db0$z */
    public class z implements C0321Ag1.a {
        public z() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(C2138Rl0 c2138Rl0, InterfaceC8771uX interfaceC8771uX) {
            GP gpC1 = MainActivity.c1();
            if (gpC1 != null) {
                gpC1.v(c2138Rl0);
            }
        }
    }

    public C0612Db0() {
        this.c = null;
        this.d = null;
        this.d = r();
        this.c = q();
        FragmentC10191zb0.x0.b(new k(), this.a);
        FragmentC10191zb0.n0.b(new v(), this.a);
        FragmentC10191zb0.o0.b(new C(), this.a);
        FragmentC10191zb0.H.b(new D(), this.a);
        FragmentC10191zb0.G.b(new E(), this.a);
        FragmentC10191zb0.B.b(new F(), this.a);
        X2.C.b(new G(), this.a);
        FragmentC10191zb0.C.b(new H(), this.a);
        FragmentC10191zb0.c0.b(new I(), this.a);
        FragmentC10191zb0.X.b(new C0613a(), this.a);
        FragmentC10191zb0.Y.b(new C0614b(), this.a);
        FragmentC10191zb0.f0.b(new C0615c(), this.a);
        KU0.B.b(new C0616d(), this.a);
        FragmentC10191zb0.q0.b(new C0617e(), this.a);
        FragmentC10191zb0.r0.b(new C0618f(), this.a);
        FragmentC10191zb0.M.b(new C0619g(), this.a);
        FragmentC10191zb0.w0.b(new C0620h(), this.a);
        FragmentC10191zb0.E.b(new C0621i(), this.a);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.h.b(new j(), this.a);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.g.b(new l(), this.a);
        DialogFragmentC3369bC.F.b(new m(), this.a);
        C1104Hs.f.b(new n(), this.a);
        C1104Hs.g.b(new o(), this.a);
        FragmentC10191zb0.K.b(new p(), this.a);
        FragmentC10191zb0.p0.b(new q(), this.a);
        FragmentC10191zb0.L.b(new r(), this.a);
        FragmentC10191zb0.S.b(new s(), this.a);
        FragmentC10191zb0.T.b(new t(), this.a);
        FragmentC10191zb0.b0.b(new u(), this.a);
        FragmentC10191zb0.P.b(new w(), this.a);
        FragmentC10191zb0.I.b(new x(), this.a);
        FragmentC10191zb0.O.b(new y(), this.a);
        C8974vC0.H.b(new z(), this.a);
        FragmentC10191zb0.Q.b(new A(), this.a);
        FragmentC10191zb0.R.b(new B(), this.a);
        C1777Oe1.c.b(new C1058Hg1.a() { // from class: com.daaw.Ab0
            @Override // com.daaw.C1058Hg1.a
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C0612Db0.a((Integer) obj, (InterfaceC5694jX) obj2, (String) obj3);
            }
        }, this.a);
        C1777Oe1.d.b(new C0425Bg1.a() { // from class: com.daaw.Bb0
            @Override // com.daaw.C0425Bg1.a
            public final void invoke(Object obj, Object obj2, Object obj3) {
                C0612Db0.c((Integer) obj, (InterfaceC5694jX) obj2, (C1777Oe1.c) obj3);
            }
        }, this.a);
        MainActivity.K0.b(new C10217zg1.a() { // from class: com.daaw.Cb0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C0612Db0.b((Activity) obj);
            }
        }, this.a);
    }

    public static /* synthetic */ C1777Oe1.c a(Integer num, InterfaceC5694jX interfaceC5694jX, String str) {
        C1777Oe1.c cVar = new C1777Oe1.c();
        cVar.a = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.V);
        cVar.b = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.s);
        return cVar;
    }

    public static /* synthetic */ void b(Activity activity) {
        Context contextI = com.daaw.avee.a.i();
        if (contextI != null && C3465ba.a(contextI, null) && C8974vC0.c().l().isEmpty()) {
            C8974vC0.c().D(C9154vr.h0(contextI, 0, null), -1, 2, null, null, 0, false);
        }
    }

    public static /* synthetic */ void c(Integer num, InterfaceC5694jX interfaceC5694jX, C1777Oe1.c cVar) {
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.V, cVar.a);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().a0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.s, cVar.b);
    }

    public final void n(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().D((String) it.next());
        }
        x();
    }

    public final void o(String[] strArr) {
        for (String str : strArr) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().D(str);
        }
        x();
    }

    public final void p(G3 g3, ImageView imageView, Boolean bool) {
        new E3().o(g3.a, g3.b, g3.c, imageView, bool.booleanValue());
    }

    public B61 q() {
        if (this.c == null) {
            this.c = u(-1);
        }
        if (this.c == null) {
            this.c = new B61(56, Boolean.TRUE);
        }
        return this.c;
    }

    public B61 r() {
        if (this.d == null) {
            this.d = u(-1);
        }
        if (this.d == null) {
            this.d = new B61(56, Boolean.TRUE);
        }
        return this.d;
    }

    public final void s(List list, Integer num, InterfaceC8771uX interfaceC8771uX) {
        if (list == null) {
            Context contextI = com.daaw.avee.a.i();
            if (contextI != null) {
                AbstractC5075hI.a.a(contextI.getResources().getString(JD0.u1));
                return;
            }
            return;
        }
        C8974vC0 c8974vC0C = C8974vC0.c();
        if (c8974vC0C != null) {
            c8974vC0C.L(-1);
            c8974vC0C.D(list, num.intValue(), 0, null, null, -1, false);
        }
    }

    public final void t() {
        C8974vC0 c8974vC0C = C8974vC0.c();
        int i = 0;
        int iO = c8974vC0C != null ? c8974vC0C.o() : 0;
        if (iO == 0) {
            i = 1;
        } else if (iO != 1) {
            i = iO;
        }
        if (c8974vC0C != null) {
            c8974vC0C.T(i, true);
        }
    }

    public final B61 u(Integer num) {
        int iIntValue = num.intValue();
        int i = iIntValue != 0 ? (iIntValue == 1 || iIntValue != 2) ? 56 : 112 : 28;
        Context contextI = com.daaw.avee.a.i();
        if (contextI == null) {
            return null;
        }
        return new B61(Integer.valueOf((int) TypedValue.applyDimension(1, i, contextI.getResources().getDisplayMetrics())), Boolean.valueOf(i >= 56));
    }

    public final void v(InterfaceC5694jX interfaceC5694jX) {
        FP fpB1 = MainActivity.b1();
        if (fpB1 != null) {
            fpB1.y(interfaceC5694jX);
        }
        GP gpC1 = MainActivity.c1();
        if (gpC1 != null) {
            gpC1.q(interfaceC5694jX);
        }
    }

    public void w(C6363ls c6363ls, C2078Qw0.b bVar, boolean z2) {
        if (z2) {
            c6363ls.y.setVisibility(0);
            c6363ls.X(-1);
            p(new G3(bVar.a, bVar.d(), bVar.b()), c6363ls.y, Boolean.TRUE);
        } else {
            c6363ls.y.setVisibility(8);
            c6363ls.W(null);
        }
        if (bVar.i()) {
            c6363ls.A.setText(bVar.e);
            c6363ls.f0(0);
            if (bVar.g()) {
                c6363ls.e0(bVar.h + "   |   " + bVar.f);
            } else {
                c6363ls.e0(bVar.h);
            }
        } else {
            c6363ls.A.setText(bVar.e);
            c6363ls.f0(8);
        }
        if (bVar.c) {
            c6363ls.C.setText("");
        } else {
            c6363ls.C.setText(AbstractC0405Bb1.o(bVar.j / 1000));
        }
    }

    public void x() {
        FP fpB1 = MainActivity.b1();
        if (fpB1 != null) {
            fpB1.B();
        }
    }

    public void y() {
        GP gpC1 = MainActivity.c1();
        if (gpC1 != null) {
            gpC1.r();
        }
    }
}
