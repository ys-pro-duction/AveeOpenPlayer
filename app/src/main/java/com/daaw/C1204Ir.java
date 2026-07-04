package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC3600c20;
import com.daaw.AbstractC4157e20;
import com.daaw.NU0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1204Ir extends AbstractC1943Pu {
    public static final int F = AbstractC3374bD0.P;
    public AbstractC7524q2[] E;

    /* JADX INFO: renamed from: com.daaw.Ir$a */
    public class a extends AbstractC4157e20.g.a {
        public a() {
        }

        @Override // com.daaw.AbstractC4157e20.g.a
        public void c(Object obj, List list) {
            C1204Ir.Y(C1204Ir.this, ((h) obj).b, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ir$b */
    public class b extends AbstractC4157e20.f.a {
        public b() {
        }

        @Override // com.daaw.AbstractC4157e20.f.a
        public void c(Object obj, List list) {
            C1204Ir.Y(C1204Ir.this, ((h) obj).b, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ir$c */
    public class c extends AbstractC4157e20.b.a {
        public c() {
        }

        @Override // com.daaw.AbstractC4157e20.b.a
        public void c(Object obj, List list) {
            C1204Ir.Y(C1204Ir.this, ((h) obj).b, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ir$d */
    public class d extends AbstractC4157e20.c.a {
        public d() {
        }

        @Override // com.daaw.AbstractC4157e20.c.a
        public void c(Object obj, List list) {
            C1204Ir.Y(C1204Ir.this, ((h) obj).b, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ir$e */
    public class e extends AbstractC4157e20.h.a {
        public e() {
        }

        @Override // com.daaw.AbstractC4157e20.h.a
        public void c(Object obj, List list) {
            C1204Ir.Y(C1204Ir.this, ((h) obj).b, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ir$f */
    public class f extends AbstractC3600c20.b.a {
        public f() {
        }

        @Override // com.daaw.AbstractC3600c20.b.a
        public void c(Object obj, C2138Rl0 c2138Rl0) {
            h hVar = (h) obj;
            c2138Rl0.p(hVar.a, hVar.b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ir$g */
    public static class g implements FQ {
        public String a;

        public g(String str) {
            this.a = str;
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2138Rl0 a(AbstractC9991yr abstractC9991yr) {
            return C2138Rl0.w(C1204Ir.Y(abstractC9991yr, this.a, null), null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ir$h */
    public static class h {
        public String a;
        public String b;

        public h(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof h) && this.a.equals(((h) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public C1204Ir(Context context, String str, int i) {
        super(context, str, context.getResources().getString(JD0.c5), F, i);
        this.E = new AbstractC7524q2[]{new a(), new b(), new c(), new d(), new e(), new f()};
        V(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List Y(AbstractC9991yr abstractC9991yr, String str, List list) {
        if (list == null) {
            list = new ArrayList();
        }
        List listE = C1225Iw0.h().e(str);
        if (listE != null) {
            c0(abstractC9991yr, listE);
            list.addAll(listE);
        }
        return list;
    }

    public static String Z(String str) {
        return AbstractC0934Gb1.l(str);
    }

    public static B61 b0(Context context, InterfaceC5694jX interfaceC5694jX) {
        C2138Rl0<B61> c2138Rl0H = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().H(context);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", ""});
        for (B61 b61 : c2138Rl0H) {
            matrixCursor.addRow(new String[]{(String) b61.a, (String) b61.b});
        }
        return new B61(matrixCursor, "");
    }

    public static void c0(AbstractC9991yr abstractC9991yr, List list) {
        if (((NU0.h) AbstractC9991yr.s.a(Integer.valueOf(abstractC9991yr.I()), abstractC9991yr.J(), null)).b) {
            Collections.reverse(list);
        }
    }

    @Override // com.daaw.AbstractC9991yr
    public C1773Od1 E(Context context, int i) {
        return new C1773Od1(new MU(this, this, 6, 1), this);
    }

    @Override // com.daaw.AbstractC9991yr
    public String H(int i) {
        return U(i).getString(0);
    }

    @Override // com.daaw.AbstractC1943Pu
    public B61 P(Context context) {
        return b0(context, J());
    }

    @Override // com.daaw.AbstractC1943Pu
    public B61 Q(Context context, String str) {
        return b0(context, J());
    }

    public void a0(Cursor cursor, int i, C6363ls c6363ls) {
        c6363ls.d0(this, new h(U(i).getString(0), U(i).getString(1)), J());
        c6363ls.x.setSelected(((Boolean) AbstractC9991yr.x.a(c6363ls.u, Boolean.FALSE)).booleanValue());
        c6363ls.Z(this.E, -1, this);
        c6363ls.y.setVisibility(0);
        c6363ls.X(this.i);
        c6363ls.Y(AbstractC3374bD0.Q);
        c6363ls.z.setVisibility(8);
        String string = cursor.getString(1);
        c6363ls.A.setText(Z(string));
        c6363ls.A.setTextColor(this.g);
        c6363ls.f0(0);
        c6363ls.e0(string);
        c6363ls.C.setText("");
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void c(boolean z) {
        AbstractC9991yr.v.a(Boolean.valueOf(z), C1204Ir.class);
    }

    @Override // com.daaw.NW
    public C1773Od1 d(Context context, String str) {
        int iS = S("_id", str);
        String string = iS >= 0 ? U(iS).getString(1) : "";
        if (string.length() <= 0) {
            return null;
        }
        C2267Sr c2267Sr = new C2267Sr(context, new g(string), p(str), Z(string), 0, this.l, false);
        c2267Sr.q(this.c);
        return c2267Sr.G(context, 0);
    }

    @Override // com.daaw.C1773Od1.a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.C1773Od1.a
    public void v(RecyclerView.D d2, int i) {
        Cursor cursorU = U(i);
        C6363ls c6363ls = (C6363ls) d2;
        c6363ls.w = i;
        a0(cursorU, i, c6363ls);
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public boolean z() {
        return ((Boolean) AbstractC9991yr.u.a(C1204Ir.class, Boolean.FALSE)).booleanValue();
    }
}
