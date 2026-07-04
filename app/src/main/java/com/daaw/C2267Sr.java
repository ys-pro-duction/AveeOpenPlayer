package com.daaw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC3879d20;
import com.daaw.AbstractC4157e20;
import com.daaw.C2078Qw0;
import com.daaw.C2138Rl0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2267Sr extends AbstractC3683cL {
    public static C8536tg1 O = new C8536tg1();
    public static Handler P = new Handler(Looper.getMainLooper());
    public final boolean K;
    public AbstractC7524q2[] L;
    public AbstractC7524q2[] M;
    public AbstractC7524q2[] N;

    /* JADX INFO: renamed from: com.daaw.Sr$a */
    public class a extends AbstractC3879d20.a.AbstractC0162a {
        public a() {
        }

        @Override // com.daaw.AbstractC3879d20.a.AbstractC0162a
        public InterfaceC6540mX c(Object obj) {
            s sVar = (s) obj;
            if (sVar.c == null) {
                AbstractC0441Bk1.c("ThisItemIdentifier is null, in Queue");
            }
            return sVar.c;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$b */
    public class b extends AbstractC4157e20.f.a {
        public b() {
        }

        @Override // com.daaw.AbstractC4157e20.f.a
        public void c(Object obj, List list) {
            list.add(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$c */
    public class c extends AbstractC4157e20.b.a {
        public c() {
        }

        @Override // com.daaw.AbstractC4157e20.b.a
        public void c(Object obj, List list) {
            list.add(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$d */
    public class d extends AbstractC4157e20.c.a {
        public d() {
        }

        @Override // com.daaw.AbstractC4157e20.c.a
        public void c(Object obj, List list) {
            list.add(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$e */
    public class e extends AbstractC4157e20.h.a {
        public e() {
        }

        @Override // com.daaw.AbstractC4157e20.h.a
        public void c(Object obj, List list) {
            list.add(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$f */
    public class f extends AbstractC3879d20.b.a {
        public f() {
        }

        @Override // com.daaw.AbstractC3879d20.b.a
        public void c(Object obj, List list, List list2) {
            s sVar = (s) obj;
            list.add(Integer.valueOf(sVar.a));
            list2.add(sVar.c);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$g */
    public class g extends AbstractC3879d20.c.a {
        public g() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$h */
    public class h extends AbstractC4157e20.j.a {
        public h() {
        }

        @Override // com.daaw.AbstractC4157e20.j.a
        public AbstractC4157e20.d c(Object obj) {
            return new AbstractC4157e20.d(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$i */
    public class i extends AbstractC4157e20.i.a {
        public i() {
        }

        @Override // com.daaw.AbstractC4157e20.i.a
        public void c(Object obj, List list) {
            list.add(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$j */
    public class j extends AbstractC4157e20.e.a {
        public j() {
        }

        @Override // com.daaw.AbstractC4157e20.e.a
        public C61 c(Object obj, List list, InterfaceC8771uX interfaceC8771uX, C2138Rl0 c2138Rl0) {
            s sVar = (s) obj;
            InterfaceC8771uX interfaceC8771uX2 = (InterfaceC8771uX) C2267Sr.this.J();
            if (interfaceC8771uX != null && interfaceC8771uX.equals(C2267Sr.this.J())) {
                int i = sVar.a;
                C2078Qw0 c2078Qw0 = null;
                C2078Qw0 c2078Qw02 = (i < 0 || i >= ((C2138Rl0) C2267Sr.this.S()).size()) ? null : (C2078Qw0) ((C2138Rl0) C2267Sr.this.S()).D(sVar.a);
                int i2 = sVar.a;
                if (i2 >= 0 && i2 < c2138Rl0.size()) {
                    c2078Qw0 = (C2078Qw0) c2138Rl0.D(sVar.a);
                }
                if (c2078Qw02 != null && c2078Qw02.equals(c2078Qw0)) {
                    return new C61(Integer.valueOf(sVar.a), interfaceC8771uX2, Boolean.TRUE);
                }
            }
            Iterator it = ((C2138Rl0) C2267Sr.this.S()).iterator();
            while (it.hasNext()) {
                list.add((C2078Qw0) ((B61) it.next()).a);
            }
            return new C61(Integer.valueOf(sVar.a), interfaceC8771uX2, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$k */
    public class k extends AbstractC4157e20.f.a {
        public k() {
        }

        @Override // com.daaw.AbstractC4157e20.f.a
        public void c(Object obj, List list) {
            list.add(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$l */
    public class l extends AbstractC4157e20.b.a {
        public l() {
        }

        @Override // com.daaw.AbstractC4157e20.b.a
        public void c(Object obj, List list) {
            list.add(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$m */
    public class m extends AbstractC4157e20.c.a {
        public m() {
        }

        @Override // com.daaw.AbstractC4157e20.c.a
        public void c(Object obj, List list) {
            list.add(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$n */
    public class n extends AbstractC4157e20.h.a {
        public n() {
        }

        @Override // com.daaw.AbstractC4157e20.h.a
        public void c(Object obj, List list) {
            list.add(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$o */
    public class o extends AbstractC4157e20.j.a {
        public o() {
        }

        @Override // com.daaw.AbstractC4157e20.j.a
        public AbstractC4157e20.d c(Object obj) {
            return new AbstractC4157e20.d(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$p */
    public class p extends AbstractC4157e20.i.a {
        public p() {
        }

        @Override // com.daaw.AbstractC4157e20.i.a
        public void c(Object obj, List list) {
            list.add(((s) obj).b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$q */
    public class q extends AbstractC4157e20.e.a {
        public q() {
        }

        @Override // com.daaw.AbstractC4157e20.e.a
        public C61 c(Object obj, List list, InterfaceC8771uX interfaceC8771uX, C2138Rl0 c2138Rl0) {
            InterfaceC8771uX interfaceC8771uX2 = (InterfaceC8771uX) C2267Sr.this.J();
            Iterator it = ((C2138Rl0) C2267Sr.this.S()).iterator();
            while (it.hasNext()) {
                list.add((C2078Qw0) ((B61) it.next()).a);
            }
            return new C61(0, interfaceC8771uX2, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$r */
    public class r extends AbstractC4157e20.a.AbstractC0167a {
        public r() {
        }

        @Override // com.daaw.AbstractC4157e20.a.AbstractC0167a
        public void c(Object obj, List list) {
            Iterator it = ((C2138Rl0) C2267Sr.this.S()).iterator();
            while (it.hasNext()) {
                list.add((C2078Qw0) ((B61) it.next()).a);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sr$s */
    public static class s {
        public final int a;
        public final C2078Qw0 b;
        public InterfaceC6540mX c;

        public s(C2078Qw0 c2078Qw0, InterfaceC6540mX interfaceC6540mX, int i) {
            this.b = c2078Qw0;
            this.c = interfaceC6540mX;
            this.a = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof s) && this.a == ((s) obj).a;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public C2267Sr(Context context, FQ fq, String str, String str2, boolean z, int i2) {
        super(context, fq, new C2138Rl0.a(), str, new C5159hc1(str2), 0, new C5379iO0(context), i2);
        this.L = new AbstractC7524q2[]{new j(), new k(), new l(), new m(), new n(), new o(), new p()};
        this.M = new AbstractC7524q2[]{new q(), new r()};
        this.N = new AbstractC7524q2[]{new a(), new b(), new c(), new d(), new e(), new f(), new g(), new h(), new i()};
        this.K = z;
    }

    public static /* synthetic */ void X(boolean z, C6363ls c6363ls, InterfaceC6540mX interfaceC6540mX, C2078Qw0 c2078Qw0, C6363ls c6363ls2) {
        if (!z) {
            c6363ls.x.setActivated(C9732xv0.b.d(c2078Qw0));
        } else {
            InterfaceC6540mX interfaceC6540mX2 = C9732xv0.c;
            c6363ls.x.setActivated(interfaceC6540mX2 != null && interfaceC6540mX2.equals(interfaceC6540mX));
        }
    }

    public static /* synthetic */ void Y(C6363ls c6363ls, C2078Qw0.b bVar, Object obj, Object obj2) {
        Boolean bool = (Boolean) AbstractC9991yr.q.a(Boolean.FALSE);
        bool.booleanValue();
        C6363ls c6363ls2 = (C6363ls) obj;
        Object obj3 = c6363ls.v;
        if (obj3 == null || !obj3.equals(obj2)) {
            return;
        }
        O.a(c6363ls2, bVar, bool);
    }

    public static void f0(AbstractC9991yr abstractC9991yr, Object obj, C2078Qw0 c2078Qw0, InterfaceC6540mX interfaceC6540mX, int i2, C6363ls c6363ls, AbstractC7524q2[] abstractC7524q2Arr, int i3) {
        g0(abstractC9991yr, obj, c2078Qw0, interfaceC6540mX, i2, c6363ls, abstractC7524q2Arr, i3, false, false);
    }

    public static void g0(AbstractC9991yr abstractC9991yr, Object obj, final C2078Qw0 c2078Qw0, final InterfaceC6540mX interfaceC6540mX, int i2, final C6363ls c6363ls, AbstractC7524q2[] abstractC7524q2Arr, int i3, final boolean z, boolean z2) {
        C0746Eg1 c0746Eg1 = AbstractC9991yr.q;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) c0746Eg1.a(bool);
        boolean zBooleanValue = bool2.booleanValue();
        c6363ls.d0(abstractC9991yr, obj, abstractC9991yr.J());
        c6363ls.v = c2078Qw0.g();
        c6363ls.x.setSelected(((Boolean) AbstractC9991yr.x.a(c6363ls.u, bool)).booleanValue());
        c6363ls.a0(abstractC7524q2Arr, i3, abstractC9991yr, z, z2, new InterfaceC5559j2() { // from class: com.daaw.Qr
            @Override // com.daaw.InterfaceC5559j2
            public final void a(Object obj2) {
                C2267Sr.X(z, c6363ls, interfaceC6540mX, c2078Qw0, (C6363ls) obj2);
            }
        });
        if (z2) {
            c6363ls.V(AbstractC3374bD0.B);
        }
        if (zBooleanValue) {
            c6363ls.z.setVisibility(8);
        } else {
            c6363ls.z.setVisibility(0);
            c6363ls.z.setText(String.format("%d.", Integer.valueOf(i2 + 1)));
        }
        c6363ls.T();
        C2078Qw0.b bVarI = c2078Qw0.i(P, new C2078Qw0.d() { // from class: com.daaw.Rr
            @Override // com.daaw.C2078Qw0.d
            public final void a(C2078Qw0.b bVar, Object obj2, Object obj3) {
                C2267Sr.Y(c6363ls, bVar, obj2, obj3);
            }
        }, c6363ls, c6363ls.v);
        if (bVarI != C2078Qw0.h) {
            O.a(c6363ls, bVarI, bool2);
            return;
        }
        if (zBooleanValue) {
            c6363ls.y.setVisibility(0);
            c6363ls.X(-1);
            c6363ls.Y(AbstractC3374bD0.q0);
        } else {
            c6363ls.y.setVisibility(8);
            c6363ls.W(null);
        }
        c6363ls.A.setText("...");
        c6363ls.f0(8);
        c6363ls.C.setText("");
    }

    @Override // com.daaw.AbstractC9991yr
    public C1773Od1 E(Context context, int i2) {
        if (i2 == 0) {
            return new C1773Od1(new MU(this, this, 10, 1), this);
        }
        if (i2 == 1) {
            return new C1773Od1(new MU(this, this, 4, 13), this);
        }
        AbstractC6278lb.j();
        return null;
    }

    @Override // com.daaw.AbstractC9991yr
    public String H(int i2) {
        return "";
    }

    @Override // com.daaw.NW
    public C1773Od1 d(Context context, String str) {
        return null;
    }

    public int e0(InterfaceC6540mX interfaceC6540mX) {
        C2138Rl0 c2138Rl0 = (C2138Rl0) S();
        for (int i2 = 0; i2 < c2138Rl0.size(); i2++) {
            if (((InterfaceC6540mX) c2138Rl0.E(i2)).equals(interfaceC6540mX)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.daaw.C1773Od1.a
    public int getItemViewType(int i2) {
        return 0;
    }

    @Override // com.daaw.AbstractC5717jc0, com.daaw.C1773Od1.a
    public void i(int i2, int i3, List list) {
        AbstractC9991yr.w.a(Integer.valueOf(i2), Integer.valueOf(i3), list);
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void l(int i2) {
        AbstractC7524q2[] abstractC7524q2Arr = this.M;
        if (i2 < abstractC7524q2Arr.length) {
            abstractC7524q2Arr[i2].a(null);
        }
    }

    @Override // com.daaw.NW
    public void o(Context context, String str) {
        W(context, str, new C5379iO0(context));
    }

    @Override // com.daaw.C1773Od1.a
    public void v(RecyclerView.D d2, int i2) {
        B61 b61 = ((C2138Rl0) S()).get(i2);
        C6363ls c6363ls = (C6363ls) d2;
        c6363ls.w = i2;
        if (this.K) {
            g0(this, new s((C2078Qw0) b61.a, (InterfaceC6540mX) b61.b, i2), (C2078Qw0) b61.a, (InterfaceC6540mX) b61.b, ((InterfaceC6540mX) ((C2138Rl0) S()).E(i2)).a(), c6363ls, this.N, 0, true, ((InterfaceC6540mX) ((C2138Rl0) S()).E(i2)).c() == -1);
        } else {
            g0(this, new s((C2078Qw0) b61.a, (InterfaceC6540mX) b61.b, i2), (C2078Qw0) b61.a, null, i2, c6363ls, this.L, 0, false, false);
        }
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void x(Context context, String[] strArr, InterfaceC5694jX[] interfaceC5694jXArr) {
        if (this.K) {
            strArr[0] = context.getResources().getString(JD0.G2);
        } else {
            strArr[0] = context.getResources().getString(JD0.I2);
        }
        interfaceC5694jXArr[0] = J();
    }

    public C2267Sr(Context context, FQ fq, String str, String str2, int i2, int i3, boolean z) {
        super(context, fq, new C2138Rl0.a(), str, new C5159hc1(str2), i2, new C5379iO0(context), i3);
        this.L = new AbstractC7524q2[]{new j(), new k(), new l(), new m(), new n(), new o(), new p()};
        this.M = new AbstractC7524q2[]{new q(), new r()};
        this.N = new AbstractC7524q2[]{new a(), new b(), new c(), new d(), new e(), new f(), new g(), new h(), new i()};
        this.K = z;
    }
}
