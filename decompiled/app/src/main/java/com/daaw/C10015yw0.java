package com.daaw;

import android.view.View;
import com.daaw.C0425Bg1;
import com.daaw.C0746Eg1;
import com.daaw.C10217zg1;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import com.daaw.avee.MediaControlsView;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10015yw0 {
    public List a = new LinkedList();

    /* JADX INFO: renamed from: com.daaw.yw0$a */
    public class a implements C10217zg1.a {
        public a() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Boolean bool) {
            C7151oi0 c7151oi0Q = C7151oi0.q();
            if (bool.booleanValue()) {
                if (c7151oi0Q != null) {
                    c7151oi0Q.p(0);
                    return;
                }
                return;
            }
            MainActivity mainActivityE1 = MainActivity.e1();
            if ((mainActivityE1 != null ? mainActivityE1.currentFragmentPage : 0) == 0) {
                if (c7151oi0Q != null) {
                    c7151oi0Q.p(1);
                }
            } else if (c7151oi0Q != null) {
                c7151oi0Q.p(2);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.yw0$b */
    public class b implements C0425Bg1.a {
        public b() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(View view, View view2, View view3) {
            C7151oi0 c7151oi0Q = C7151oi0.q();
            if (c7151oi0Q != null) {
                c7151oi0Q.t(view, view2, view3);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.yw0$c */
    public class c implements C9938yg1.a {
        public c() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                c8974vC0C.H();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.yw0$d */
    public class d implements C9938yg1.a {
        public d() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                c8974vC0C.t();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.yw0$e */
    public class e implements C9938yg1.a {
        public e() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            com.daaw.avee.comp.playback.c.f.a(4);
        }
    }

    /* JADX INFO: renamed from: com.daaw.yw0$f */
    public class f implements C0746Eg1.a {
        public f() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long invoke() {
            return Long.valueOf(C8899uw0.i);
        }
    }

    /* JADX INFO: renamed from: com.daaw.yw0$g */
    public class g implements C10217zg1.a {
        public g() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Long l) {
            com.daaw.avee.comp.playback.c.i.a(l);
        }
    }

    /* JADX INFO: renamed from: com.daaw.yw0$h */
    public class h implements C0746Eg1.a {
        public h() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke() {
            MainActivity mainActivityE1 = MainActivity.e1();
            return Integer.valueOf(C10015yw0.this.a(true, mainActivityE1 != null ? mainActivityE1.currentFragmentPage : 0));
        }
    }

    /* JADX INFO: renamed from: com.daaw.yw0$i */
    public class i implements C0746Eg1.a {
        public i() {
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

    /* JADX INFO: renamed from: com.daaw.yw0$j */
    public class j implements C10217zg1.a {
        public j() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            C8974vC0 c8974vC0C = C8974vC0.c();
            if (c8974vC0C != null) {
                c8974vC0C.T(num.intValue(), true);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.yw0$k */
    public class k implements C10217zg1.a {
        public k() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            C7151oi0 c7151oi0Q = C7151oi0.q();
            if (c7151oi0Q != null) {
                c7151oi0Q.x(num.intValue());
            }
            FragmentC10191zb0.k(num.intValue());
        }
    }

    public C10015yw0() {
        C7151oi0.I.b(new c(), this.a);
        C7151oi0.J.b(new d(), this.a);
        C7151oi0.K.b(new e(), this.a);
        C7151oi0.L.b(new f(), this.a);
        C7151oi0.O.b(new g(), this.a);
        C7151oi0.H.b(new h(), this.a);
        C7151oi0.b0.b(new i(), this.a);
        C7151oi0.c0.b(new j(), this.a);
        C8974vC0.I.b(new k(), this.a);
        MainActivity.c1.b(new a(), this.a);
        MediaControlsView.INSTANCE.a().b(new b(), this.a);
    }

    public int a(boolean z, int i2) {
        if (com.daaw.avee.a.i() == null) {
            return 2;
        }
        if (z) {
            return i2 == 0 ? 1 : 2;
        }
        return 0;
    }
}
