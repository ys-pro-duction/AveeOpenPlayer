package com.daaw;

import android.os.AsyncTask;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import com.daaw.C0529Cg1;
import com.daaw.C0746Eg1;
import com.daaw.C0954Gg1;
import com.daaw.C10217zg1;
import com.daaw.avee.MainActivity;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0676Dp {
    public static C6784nO0 b = new C6784nO0();
    public List a = new LinkedList();

    /* JADX INFO: renamed from: com.daaw.Dp$a */
    public class a implements C0425Bg1.a {
        public a() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(AsyncTask asyncTask, Integer num, Object obj) {
            C0676Dp.b.d(asyncTask, num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dp$b */
    public class b implements C0529Cg1.a {
        public b() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Integer num, Integer num2, InterfaceC9894yX interfaceC9894yX, Boolean bool) {
            GP gpC1;
            if (interfaceC9894yX == null || interfaceC9894yX.b() == null || interfaceC9894yX.b().isEmpty()) {
                C0676Dp.b.b(num2.intValue());
            }
            MainActivity mainActivityE1 = MainActivity.e1();
            if (mainActivityE1 == null) {
                return;
            }
            if (num.equals(num2)) {
                mainActivityE1.L1(interfaceC9894yX);
            }
            if (!bool.booleanValue() || interfaceC9894yX == null) {
                return;
            }
            if (num2.intValue() == 0) {
                FP fpB1 = MainActivity.b1();
                if (fpB1 != null) {
                    fpB1.E(mainActivityE1, interfaceC9894yX.b());
                    return;
                }
                return;
            }
            if (num2.intValue() != 1 || (gpC1 = MainActivity.c1()) == null) {
                return;
            }
            gpC1.t(mainActivityE1, interfaceC9894yX.b());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dp$c */
    public class c implements C0321Ag1.a {
        public c() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, String str) {
            C6803nT c6803nTC = C6803nT.c();
            if (c6803nTC == null) {
                return;
            }
            c6803nTC.g(str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dp$d */
    public class d implements C0321Ag1.a {
        public d() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, String str) {
            C6803nT c6803nTC = C6803nT.c();
            if (c6803nTC == null) {
                return;
            }
            c6803nTC.f(num.intValue(), str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dp$e */
    public class e implements C10217zg1.a {
        public e() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Boolean bool) {
            C6803nT c6803nTC = C6803nT.c();
            if (c6803nTC == null) {
                return;
            }
            c6803nTC.g(null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dp$f */
    public class f implements C10217zg1.a {
        public f() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            GP gpC1;
            C6803nT c6803nTC = C6803nT.c();
            if (c6803nTC == null) {
                return;
            }
            C4821gO0 c4821gO0M = C4821gO0.d;
            if (num.intValue() == 0) {
                FP fpB1 = MainActivity.b1();
                if (fpB1 != null) {
                    c4821gO0M = fpB1.o();
                }
            } else if (num.intValue() == 1 && (gpC1 = MainActivity.c1()) != null) {
                c4821gO0M = gpC1.m();
            }
            if (c4821gO0M != C4821gO0.d) {
                if (c4821gO0M != null) {
                    c6803nTC.i(num.intValue(), c4821gO0M.a, c4821gO0M.b, c4821gO0M.c);
                } else {
                    c6803nTC.i(num.intValue(), false, "", null);
                }
            }
            c6803nTC.h(num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dp$g */
    public class g implements C0746Eg1.a {
        public g() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC9894yX invoke() {
            C6803nT c6803nTC = C6803nT.c();
            if (c6803nTC == null) {
                return null;
            }
            return c6803nTC.b();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dp$h */
    public class h implements C0954Gg1.a {
        public h() {
        }

        @Override // com.daaw.C0954Gg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String invoke(Integer num, InterfaceC5694jX interfaceC5694jX) {
            C4542fO0 c4542fO0D;
            C6803nT c6803nTC = C6803nT.c();
            if (c6803nTC == null || (c4542fO0D = c6803nTC.d(num.intValue())) == null || !AbstractC0405Bb1.g(c4542fO0D.c(), interfaceC5694jX)) {
                return null;
            }
            return c4542fO0D.b();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dp$i */
    public class i implements C0529Cg1.a {
        public i() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Integer num, Boolean bool, String str, InterfaceC5694jX interfaceC5694jX) {
            C6803nT c6803nTC = C6803nT.c();
            if (c6803nTC == null) {
                return;
            }
            c6803nTC.i(num.intValue(), bool.booleanValue(), str, interfaceC5694jX);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dp$j */
    public class j implements C0954Gg1.a {
        public j() {
        }

        @Override // com.daaw.C0954Gg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(AsyncTask asyncTask, Integer num) {
            return Boolean.valueOf(C0676Dp.b.c(asyncTask, num.intValue()));
        }
    }

    public C0676Dp() {
        C6803nT.c.b(new b(), this.a);
        MainActivity.X0.b(new c(), this.a);
        C6784nO0.c.b(new d(), this.a);
        MainActivity.Y0.b(new e(), this.a);
        MainActivity.Z0.b(new f(), this.a);
        MainActivity.a1.b(new g(), this.a);
        FragmentC10191zb0.k0.b(new h(), this.a);
        FragmentC10191zb0.D.b(new i(), this.a);
        FragmentC10191zb0.t0.b(new j(), this.a);
        FragmentC10191zb0.u0.b(new a(), this.a);
    }
}
