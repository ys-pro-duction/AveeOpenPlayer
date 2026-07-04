package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import com.daaw.C0529Cg1;
import com.daaw.C0746Eg1;
import com.daaw.C10217zg1;
import com.daaw.C2078Qw0;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.fg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4620fg0 {
    public List a = new LinkedList();
    public int b = 0;
    public int c = 0;

    /* JADX INFO: renamed from: com.daaw.fg0$a */
    public class a implements C0425Bg1.a {
        public a() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Integer num2, Boolean bool) {
            if (num.intValue() == SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.J) {
                C4620fg0.this.h(num2.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.fg0$b */
    public class b implements C0746Eg1.a {
        public b() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke() {
            int i = C4620fg0.this.b;
            if (i != 0) {
                return Boolean.valueOf(i != 0);
            }
            return Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.J) != 0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.fg0$c */
    public class c implements C0321Ag1.a {
        public c() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(List list, Integer num) {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                c8974vC0C.J(list, num.intValue(), null);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.fg0$d */
    public class d implements C9938yg1.a {
        public d() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            MainActivity mainActivityE1 = MainActivity.e1();
            if (mainActivityE1 != null) {
                mainActivityE1.Z0();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.fg0$e */
    public class e implements C0321Ag1.a {
        public e() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Activity activity) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.G, num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.fg0$f */
    public class f implements C10217zg1.a {
        public f() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Context context) {
            FP fpB1 = MainActivity.b1();
            if (fpB1 != null) {
                fpB1.r();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.fg0$g */
    public class g implements C0321Ag1.a {
        public g() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Float f, Context context) {
            FP fpB1 = MainActivity.b1();
            if (fpB1 != null) {
                fpB1.s(f.floatValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.fg0$h */
    public class h implements C0746Eg1.a {
        public h() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2078Qw0.b invoke() {
            return C8899uw0.g;
        }
    }

    public C4620fg0() {
        MainActivity.U0.b(new C0529Cg1.a() { // from class: com.daaw.dg0
            @Override // com.daaw.C0529Cg1.a
            public final void b(Object obj, Object obj2, Object obj3, Object obj4) {
                G3 g3 = (G3) obj;
                new E3().q(false, g3.a, g3.b, g3.c, (InterfaceC7381pY) obj2, ((Integer) obj3).intValue(), ((Integer) obj4).intValue(), 0, -1, true, null, null);
            }
        }, this.a);
        MainActivity.T0.b(new C10217zg1.a() { // from class: com.daaw.eg0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                this.a.e((Integer) obj);
            }
        }, this.a);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.g.b(new a(), this.a);
        MainActivity.W0.b(new b(), this.a);
        MainActivity.b1.b(new c(), this.a);
        AbstractC4796gI.a.b(new d(), this.a);
        MainActivity.R0.b(new e(), this.a);
        MainActivity.d1.b(new f(), this.a);
        MainActivity.e1.b(new g(), this.a);
        MainActivity.i1.b(new h(), this.a);
    }

    public int d(MainActivity mainActivity) {
        int rotation = ((WindowManager) mainActivity.getSystemService("window")).getDefaultDisplay().getRotation();
        if (mainActivity.getResources().getConfiguration().orientation == 1) {
            if (rotation == 0) {
                return 1;
            }
            if (rotation == 1 || rotation == 2) {
                return 3;
            }
            return rotation != 3 ? 0 : 1;
        }
        if (mainActivity.getResources().getConfiguration().orientation != 2) {
            return 0;
        }
        if (rotation == 0 || rotation == 1) {
            return 2;
        }
        return (rotation == 2 || rotation == 3) ? 4 : 0;
    }

    public final /* synthetic */ void e(Integer num) {
        if (num.intValue() == 2) {
            if (SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.J) == 0) {
                g(true);
                SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.J, this.b);
                MainActivity mainActivityE1 = MainActivity.e1();
                if (mainActivityE1 != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().T(mainActivityE1);
                    return;
                }
                return;
            }
            g(false);
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.J, 0);
            MainActivity mainActivityE12 = MainActivity.e1();
            if (mainActivityE12 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().T(mainActivityE12);
            }
        }
    }

    public void f(MainActivity mainActivity, int i) {
        if (i == 1) {
            mainActivity.setRequestedOrientation(1);
            return;
        }
        if (i == 2) {
            mainActivity.setRequestedOrientation(0);
            return;
        }
        if (i == 3) {
            mainActivity.setRequestedOrientation(9);
        } else if (i != 4) {
            mainActivity.setRequestedOrientation(-1);
        } else {
            mainActivity.setRequestedOrientation(8);
        }
    }

    public void g(boolean z) {
        if (!z) {
            this.b = 0;
            h(this.c);
            return;
        }
        this.b = 0;
        MainActivity mainActivityE1 = MainActivity.e1();
        if (mainActivityE1 != null) {
            this.b = d(mainActivityE1);
        }
        this.c = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.J);
        h(this.b);
    }

    public final void h(int i) {
        MainActivity mainActivityE1 = MainActivity.e1();
        if (mainActivityE1 != null) {
            mainActivityE1.I1(i != 0, false);
            if (i == 0) {
                mainActivityE1.setRequestedOrientation(-1);
            } else if (mainActivityE1.getRequestedOrientation() == -1) {
                f(mainActivityE1, i);
            }
        }
    }
}
