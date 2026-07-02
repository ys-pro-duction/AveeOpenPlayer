package com.daaw;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC4157e20;
import com.daaw.AbstractC4436f20;
import com.daaw.AsyncTaskC2517Vb1;
import com.daaw.NU0;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0788Er extends AbstractC3683cL {
    public AbstractC7524q2[] K;

    /* JADX INFO: renamed from: com.daaw.Er$a */
    public class a extends AbstractC4436f20.a.AbstractC0171a {
        public a() {
        }

        @Override // com.daaw.AbstractC4436f20.a.AbstractC0171a
        public void c(Object obj, List list) {
            list.add(((h) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er$b */
    public class b extends AbstractC4157e20.f.a {
        public b() {
        }

        @Override // com.daaw.AbstractC4157e20.f.a
        public void c(Object obj, List list) {
            C2078Qw0 c2078Qw0 = ((h) obj).b;
            if (c2078Qw0 == null) {
                return;
            }
            list.add(c2078Qw0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er$c */
    public class c extends AbstractC4157e20.b.a {
        public c() {
        }

        @Override // com.daaw.AbstractC4157e20.b.a
        public void c(Object obj, List list) {
            C2078Qw0 c2078Qw0 = ((h) obj).b;
            if (c2078Qw0 == null) {
                return;
            }
            list.add(c2078Qw0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er$d */
    public class d extends AbstractC4157e20.c.a {
        public d() {
        }

        @Override // com.daaw.AbstractC4157e20.c.a
        public void c(Object obj, List list) {
            C2078Qw0 c2078Qw0 = ((h) obj).b;
            if (c2078Qw0 == null) {
                return;
            }
            list.add(c2078Qw0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er$e */
    public class e extends AbstractC4157e20.h.a {
        public e() {
        }

        @Override // com.daaw.AbstractC4157e20.h.a
        public void c(Object obj, List list) {
            C2078Qw0 c2078Qw0 = ((h) obj).b;
            if (c2078Qw0 == null) {
                return;
            }
            list.add(c2078Qw0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er$f */
    public class f extends AbstractC4157e20.j.a {
        public f() {
        }

        @Override // com.daaw.AbstractC4157e20.j.a
        public AbstractC4157e20.d c(Object obj) {
            C2078Qw0 c2078Qw0 = ((h) obj).b;
            return c2078Qw0 == null ? new AbstractC4157e20.d(null) : new AbstractC4157e20.d(c2078Qw0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er$g */
    public static class g implements FQ {
        public C2138Rl0 a = null;
        public C9480x11 b = new C9480x11();

        public final /* synthetic */ void c(AbstractC9991yr abstractC9991yr, B61 b61, boolean z) {
            if (z) {
                return;
            }
            C2138Rl0 c2138Rl0 = null;
            if (b61 != null) {
                C2138Rl0 c2138Rl02 = (C2138Rl0) b61.a;
                if (((C7378pX0) b61.b).f()) {
                    abstractC9991yr.O(((C7378pX0) b61.b).e());
                } else {
                    abstractC9991yr.O(null);
                }
                c2138Rl0 = c2138Rl02;
            } else {
                abstractC9991yr.O(null);
            }
            if (c2138Rl0 == null) {
                c2138Rl0 = new C2138Rl0();
            }
            this.a = c2138Rl0;
            abstractC9991yr.A();
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public List a(final AbstractC9991yr abstractC9991yr) {
            if (this.a != null || this.b.e(null)) {
                if (this.a == null) {
                    return null;
                }
                abstractC9991yr.L(false);
                e(abstractC9991yr, this.a);
                return this.a.L();
            }
            abstractC9991yr.L(true);
            this.b.c();
            this.b.d(null, KX.a().a(), new AsyncTaskC2517Vb1.b() { // from class: com.daaw.Fr
                @Override // com.daaw.AsyncTaskC2517Vb1.b
                public final void a(Object obj, boolean z) {
                    this.a.c(abstractC9991yr, (B61) obj, z);
                }
            });
            return null;
        }

        public final void e(AbstractC9991yr abstractC9991yr, C2138Rl0 c2138Rl0) {
            Comparator comparatorD = AbstractC5136hX0.d((NU0.h) AbstractC9991yr.s.a(Integer.valueOf(abstractC9991yr.I()), abstractC9991yr.J(), null), 10);
            if (comparatorD != null) {
                try {
                    Collections.sort(c2138Rl0, comparatorD);
                } catch (Exception e) {
                    AbstractC0441Bk1.c("Comparator<Tuple2<PlaylistSong, StationEntry>> exception");
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er$h */
    public static class h {
        public int a;
        public C2078Qw0 b;

        public h(C2078Qw0 c2078Qw0, int i) {
            this.a = i;
            this.b = c2078Qw0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public C0788Er(Context context, String str, String str2, int i, int i2) {
        super(context, new g(), new C2303Ta(), str, new C5159hc1(str2), i, new C5938kO0(context), i2);
        this.K = new AbstractC7524q2[]{new a(), new b(), new c(), new d(), new e(), new f()};
    }

    @Override // com.daaw.AbstractC9991yr
    public C1773Od1 E(Context context, int i) {
        return new C1773Od1(new MU(this, this, 14, 15), this);
    }

    @Override // com.daaw.AbstractC9991yr
    public String H(int i) {
        return "";
    }

    @Override // com.daaw.NW
    public C1773Od1 d(Context context, String str) {
        return null;
    }

    @Override // com.daaw.C1773Od1.a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.NW
    public void o(Context context, String str) {
        W(context, str, new C5938kO0(context));
    }

    @Override // com.daaw.C1773Od1.a
    public void v(RecyclerView.D d2, int i) {
        C2078Qw0 c2078Qw0 = (C2078Qw0) S().get(i);
        C6363ls c6363ls = (C6363ls) d2;
        c6363ls.w = i;
        C2267Sr.g0(this, new h(c2078Qw0, i), c2078Qw0, null, i, c6363ls, this.K, 0, false, false);
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void x(Context context, String[] strArr, InterfaceC5694jX[] interfaceC5694jXArr) {
        strArr[0] = context.getResources().getString(JD0.J2);
        interfaceC5694jXArr[0] = J();
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void l(int i) {
    }
}
