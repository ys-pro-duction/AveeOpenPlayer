package com.daaw;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC3322b20;
import com.daaw.AbstractC4157e20;
import com.daaw.AsyncTaskC5100hO0;
import com.daaw.C1773Od1;
import com.daaw.NU0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10270zr extends AbstractC9991yr implements C1773Od1.a {
    public static final String[] P = {"_id", "_display_name", C2078Qw0.e};
    public AbstractC7524q2[] C;
    public String D;
    public int E;
    public File F;
    public String G;
    public String H;
    public String I;
    public boolean J;
    public List K;
    public AbstractC7524q2[] L;
    public AbstractC7524q2[] M;
    public WeakReference N;
    public AsyncTaskC5100hO0.b O;

    /* JADX INFO: renamed from: com.daaw.zr$a */
    public class a extends AbstractC4157e20.c.a {
        public a() {
        }

        @Override // com.daaw.AbstractC4157e20.c.a
        public void c(Object obj, List list) {
            C2078Qw0 c2078Qw0N = ((t) obj).b.n();
            if (c2078Qw0N == null) {
                return;
            }
            list.add(c2078Qw0N);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$b */
    public class b extends AbstractC4157e20.h.a {
        public b() {
        }

        @Override // com.daaw.AbstractC4157e20.h.a
        public void c(Object obj, List list) {
            C2078Qw0 c2078Qw0N = ((t) obj).b.n();
            if (c2078Qw0N == null) {
                return;
            }
            list.add(c2078Qw0N);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$c */
    public class c extends AbstractC4157e20.j.a {
        public c() {
        }

        @Override // com.daaw.AbstractC4157e20.j.a
        public AbstractC4157e20.d c(Object obj) {
            C2078Qw0 c2078Qw0N = ((t) obj).b.n();
            return c2078Qw0N == null ? new AbstractC4157e20.d(null) : new AbstractC4157e20.d(c2078Qw0N);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$d */
    public class d extends AbstractC4157e20.i.a {
        public d() {
        }

        @Override // com.daaw.AbstractC4157e20.i.a
        public void c(Object obj, List list) {
            C2078Qw0 c2078Qw0N = ((t) obj).b.n();
            if (c2078Qw0N == null) {
                return;
            }
            list.add(c2078Qw0N);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$e */
    public class e extends AbstractC4157e20.e.a {
        public e() {
        }

        @Override // com.daaw.AbstractC4157e20.e.a
        public C61 c(Object obj, List list, InterfaceC8771uX interfaceC8771uX, C2138Rl0 c2138Rl0) {
            InterfaceC8771uX interfaceC8771uX2 = (InterfaceC8771uX) C10270zr.this.J();
            C10270zr.b0(C10270zr.this.K, list);
            return new C61(0, interfaceC8771uX2, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$f */
    public class f extends AbstractC4157e20.a.AbstractC0167a {
        public f() {
        }

        @Override // com.daaw.AbstractC4157e20.a.AbstractC0167a
        public void c(Object obj, List list) {
            C10270zr.b0(C10270zr.this.K, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$g */
    public class g implements AsyncTaskC5100hO0.b {
        public g() {
        }

        @Override // com.daaw.AsyncTaskC5100hO0.b
        public void a(AsyncTask asyncTask, boolean z) {
            if (d(asyncTask) && !C10270zr.this.C("")) {
                C10270zr.this.N(false, true);
                C10270zr.this.A();
            }
        }

        @Override // com.daaw.AsyncTaskC5100hO0.b
        public void b(AsyncTask asyncTask) {
            if (d(asyncTask) && !C10270zr.this.C("")) {
                C10270zr.this.N(true, false);
                C10270zr.this.K.clear();
                C10270zr.this.A();
            }
        }

        @Override // com.daaw.AsyncTaskC5100hO0.b
        public void c(AsyncTask asyncTask, s sVar) {
            if (d(asyncTask) && !C10270zr.this.C("")) {
                C10270zr.this.f0(sVar);
            }
        }

        public boolean d(AsyncTask asyncTask) {
            return ((Boolean) AbstractC9991yr.y.a(asyncTask, Integer.valueOf(C10270zr.this.E), Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$h */
    public class h implements r {
        public final /* synthetic */ int a;
        public final /* synthetic */ InterfaceC5694jX b;

        public h(int i, InterfaceC5694jX interfaceC5694jX) {
            this.a = i;
            this.b = interfaceC5694jX;
        }

        @Override // com.daaw.C10270zr.r
        public boolean a(File file) {
            return ((Boolean) AbstractC9991yr.t.a(Integer.valueOf(this.a), this.b, file, Boolean.TRUE)).booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$i */
    public class i extends AbstractC4157e20.g.a {
        public i() {
        }

        @Override // com.daaw.AbstractC4157e20.g.a
        public void c(Object obj, List list) {
            C10270zr.c0(C10270zr.this.E, C10270zr.this.J(), "" + ((t) obj).a(), list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$j */
    public class j extends AbstractC4157e20.f.a {
        public j() {
        }

        @Override // com.daaw.AbstractC4157e20.f.a
        public void c(Object obj, List list) {
            C10270zr.c0(C10270zr.this.E, C10270zr.this.J(), "" + ((t) obj).a(), list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$k */
    public class k extends AbstractC4157e20.b.a {
        public k() {
        }

        @Override // com.daaw.AbstractC4157e20.b.a
        public void c(Object obj, List list) {
            C10270zr.c0(C10270zr.this.E, C10270zr.this.J(), "" + ((t) obj).a(), list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$l */
    public class l extends AbstractC4157e20.c.a {
        public l() {
        }

        @Override // com.daaw.AbstractC4157e20.c.a
        public void c(Object obj, List list) {
            C10270zr.c0(C10270zr.this.E, C10270zr.this.J(), "" + ((t) obj).a(), list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$m */
    public class m extends AbstractC4157e20.h.a {
        public m() {
        }

        @Override // com.daaw.AbstractC4157e20.h.a
        public void c(Object obj, List list) {
            C10270zr.c0(C10270zr.this.E, C10270zr.this.J(), "" + ((t) obj).a(), list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$n */
    public class n extends AbstractC3322b20.a.AbstractC0155a {
        public n() {
        }

        @Override // com.daaw.AbstractC3322b20.a.AbstractC0155a
        public void c(Object obj, List list) {
            list.add(((t) obj).a());
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$o */
    public class o extends AbstractC4157e20.e.a {
        public o() {
        }

        @Override // com.daaw.AbstractC4157e20.e.a
        public C61 c(Object obj, List list, InterfaceC8771uX interfaceC8771uX, C2138Rl0 c2138Rl0) {
            int iA;
            t tVar = (t) obj;
            InterfaceC8771uX interfaceC8771uX2 = (InterfaceC8771uX) C10270zr.this.J();
            int i = 0;
            if (interfaceC8771uX != null && interfaceC8771uX.equals(C10270zr.this.J())) {
                C2078Qw0 c2078Qw0N = tVar.b.n();
                int iW = C10270zr.W(C10270zr.this.K, c2078Qw0N, 0);
                C2078Qw0 c2078Qw0 = (iW < 0 || iW >= c2138Rl0.size()) ? null : (C2078Qw0) c2138Rl0.D(iW);
                if (c2078Qw0N != null && c2078Qw0N.equals(c2078Qw0)) {
                    return new C61(Integer.valueOf(iW), interfaceC8771uX2, Boolean.TRUE);
                }
            }
            int size = list.size();
            C10270zr.b0(C10270zr.this.K, list);
            C2078Qw0 c2078Qw0N2 = tVar.b.n();
            if (c2078Qw0N2 != null && (iA = AbstractC1454Lb1.a(list, c2078Qw0N2, size)) >= 0) {
                i = iA;
            }
            return new C61(Integer.valueOf(i), interfaceC8771uX2, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$p */
    public class p extends AbstractC4157e20.f.a {
        public p() {
        }

        @Override // com.daaw.AbstractC4157e20.f.a
        public void c(Object obj, List list) {
            C2078Qw0 c2078Qw0N = ((t) obj).b.n();
            if (c2078Qw0N == null) {
                return;
            }
            list.add(c2078Qw0N);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$q */
    public class q extends AbstractC4157e20.b.a {
        public q() {
        }

        @Override // com.daaw.AbstractC4157e20.b.a
        public void c(Object obj, List list) {
            C2078Qw0 c2078Qw0N = ((t) obj).b.n();
            if (c2078Qw0N == null) {
                return;
            }
            list.add(c2078Qw0N);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$r */
    public interface r {
        boolean a(File file);
    }

    /* JADX INFO: renamed from: com.daaw.zr$s */
    public static class s implements Comparable {
        public int B;
        public final C2078Qw0 C;
        public final boolean D;
        public final String E;
        public final long F;
        public final String G;
        public final long H;

        public s(boolean z, String str, long j, String str2, long j2) {
            this(z, str, j, str2, j2, null);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(s sVar) {
            String str = this.E;
            if (str != null) {
                return str.toLowerCase().compareTo(sVar.l().toLowerCase());
            }
            throw new IllegalArgumentException();
        }

        public long h() {
            return this.F;
        }

        public long k() {
            return this.H;
        }

        public String l() {
            return this.E;
        }

        public String m() {
            return this.G;
        }

        public C2078Qw0 n() {
            return this.C;
        }

        public boolean o() {
            return this.D;
        }

        public void p(int i) {
            this.B = i;
        }

        public s(boolean z, String str, long j, String str2, long j2, C2078Qw0 c2078Qw0) {
            this.B = 0;
            this.D = z;
            this.E = str;
            this.F = j;
            this.G = str2;
            this.H = j2;
            this.C = c2078Qw0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.zr$t */
    public static class t {
        public int a;
        public s b;

        public t(s sVar, int i) {
            this.a = i;
            this.b = sVar;
        }

        public String a() {
            return this.b.m();
        }

        public boolean equals(Object obj) {
            return (obj instanceof t) && this.a == ((t) obj).a;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public C10270zr(Context context, File file, String str, int i2) {
        super(context, str, new C5159hc1(file.getName()), 0, i2);
        this.C = new AbstractC7524q2[]{new i(), new j(), new k(), new l(), new m(), new n()};
        this.D = null;
        this.L = new AbstractC7524q2[]{new o(), new p(), new q(), new a(), new b(), new c(), new d()};
        this.M = new AbstractC7524q2[]{new e(), new f()};
        this.N = new WeakReference(null);
        this.O = new g();
        this.E = i2;
        this.F = file;
        this.K = new ArrayList();
        this.G = this.F.getName();
        this.H = this.F.getAbsolutePath();
        this.I = this.F.getPath();
        this.J = this.F.isDirectory();
        if (this.F.isDirectory() && this.H.length() > 0) {
            if (this.H.charAt(r1.length() - 1) != '/') {
                this.H += "/";
            }
        }
        o(context, (String) AbstractC9991yr.r.a(Integer.valueOf(i2), J(), ""));
    }

    public static int W(List list, C2078Qw0 c2078Qw0, int i2) {
        int i3 = 0;
        while (i2 < list.size()) {
            C2078Qw0 c2078Qw0N = ((s) list.get(i2)).n();
            if (c2078Qw0N != null) {
                if (c2078Qw0N.d(c2078Qw0)) {
                    return i3;
                }
                i3++;
            }
            i2++;
        }
        return -1;
    }

    public static void a0(String str, List list, Uri uri) {
        Cursor cursorQuery = com.daaw.avee.a.i().getContentResolver().query(uri, P, "_data LIKE ? AND _data NOT LIKE ?", new String[]{str + "%", str + "/%/%"}, null);
        if (cursorQuery == null) {
            return;
        }
        int columnIndex = cursorQuery.getColumnIndex("_id");
        int columnIndex2 = cursorQuery.getColumnIndex("_display_name");
        int columnIndex3 = cursorQuery.getColumnIndex(C2078Qw0.e);
        while (cursorQuery.moveToNext()) {
            Uri uriWithAppendedId = ContentUris.withAppendedId(uri, cursorQuery.getLong(columnIndex));
            list.add(new s(false, cursorQuery.getString(columnIndex2), cursorQuery.getLong(columnIndex3), uriWithAppendedId.toString(), 0L, new C2078Qw0(uriWithAppendedId)));
        }
        cursorQuery.close();
    }

    public static List b0(List list, List list2) {
        if (list2 == null) {
            list2 = new ArrayList(list.size());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar.n() != null) {
                list2.add(sVar.n());
            }
        }
        return list2;
    }

    public static List c0(int i2, InterfaceC5694jX interfaceC5694jX, String str, List list) {
        return d0(i2, interfaceC5694jX, str, false, list);
    }

    public static List d0(int i2, InterfaceC5694jX interfaceC5694jX, String str, boolean z, List list) {
        return b0(g0(i2, interfaceC5694jX, new File(str), true), list);
    }

    public static List g0(int i2, InterfaceC5694jX interfaceC5694jX, File file, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        h0(arrayList, arrayList2, file, z, new h(i2, interfaceC5694jX));
        NU0.h hVar = (NU0.h) AbstractC9991yr.s.a(Integer.valueOf(i2), interfaceC5694jX, null);
        Collections.sort(arrayList);
        Comparator comparatorB = QK.b(hVar, 0);
        if (comparatorB != null) {
            Collections.sort(arrayList2, comparatorB);
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ((s) arrayList2.get(i3)).B = i3;
        }
        if (arrayList.size() <= 0) {
            return arrayList2;
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public static void h0(List list, List list2, File file, boolean z, r rVar) {
        File[] fileArrListFiles = file.listFiles();
        a0(file.getPath(), list2, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        a0(file.getPath(), list2, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        try {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory() && !z) {
                    if (rVar != null ? rVar.a(file2) : true) {
                        list.add(new s(true, file2.getName(), file2.listFiles() != null ? r6.length : 0, file2.getCanonicalPath(), file2.lastModified()));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.daaw.AbstractC9991yr
    public boolean A() {
        if (B((String) Y(true).b, false)) {
            return true;
        }
        B61 b61Y = Y(false);
        List list = (List) b61Y.a;
        if (list == null) {
            i0(new ArrayList(), null);
        } else {
            i0(list, (String) b61Y.b);
        }
        return true;
    }

    @Override // com.daaw.AbstractC9991yr
    public C1773Od1 E(Context context, int i2) {
        return new C1773Od1(new MU(this, this, 11, 1), this);
    }

    @Override // com.daaw.AbstractC9991yr
    public String H(int i2) {
        s sVarZ = Z(i2);
        return sVarZ.o() ? sVarZ.l() : "";
    }

    public GW X() {
        return (GW) this.N.get();
    }

    public B61 Y(boolean z) {
        if (this.D == null) {
            return z ? new B61(null, "") : new B61(g0(this.E, J(), this.F, false), "");
        }
        return new B61(z ? null : this.K, this.D + this.K.size());
    }

    public s Z(int i2) {
        return (s) this.K.get(i2);
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW, com.daaw.C1773Od1.a
    public int a() {
        return this.K.size();
    }

    @Override // com.daaw.NW
    public C1773Od1 d(Context context, String str) {
        if (str.length() <= 0) {
            return null;
        }
        C10270zr c10270zr = new C10270zr(context, new File(this.H + str), p(str), this.E);
        c10270zr.q(this.c);
        return c10270zr.F(context);
    }

    public void e0(s sVar, int i2, C6363ls c6363ls) {
        C2078Qw0 c2078Qw0N = sVar.n();
        if (c2078Qw0N != null) {
            C2267Sr.f0(this, new t(sVar, i2), c2078Qw0N, null, sVar.B, c6363ls, this.L, 0);
            return;
        }
        c6363ls.d0(this, new t(sVar, i2), J());
        c6363ls.x.setSelected(((Boolean) AbstractC9991yr.x.a(c6363ls.u, Boolean.FALSE)).booleanValue());
        c6363ls.Z(this.C, -1, this);
        c6363ls.y.setVisibility(0);
        c6363ls.X(this.i);
        c6363ls.Y(AbstractC3374bD0.C);
        c6363ls.z.setVisibility(8);
        c6363ls.A.setText(sVar.l());
        c6363ls.A.setTextColor(this.g);
        c6363ls.f0(8);
        c6363ls.C.setText("" + sVar.h());
    }

    @Override // com.daaw.C1773Od1.a
    public void f(GW gw) {
        this.N = new WeakReference(gw);
    }

    public void f0(s sVar) {
        this.K.add(sVar);
    }

    @Override // com.daaw.C1773Od1.a
    public long getItemId(int i2) {
        return i2;
    }

    @Override // com.daaw.C1773Od1.a
    public int getItemViewType(int i2) {
        return 0;
    }

    public void i0(List list, String str) {
        if (B(str, true)) {
            return;
        }
        this.K = list;
        GW gwX = X();
        if (gwX != null) {
            gwX.a();
        }
    }

    public void j0(Context context, String str) {
        AsyncTaskC5100hO0 asyncTaskC5100hO0 = new AsyncTaskC5100hO0(context, this.F, new C5938kO0(context), new WeakReference(this.O));
        AbstractC9991yr.z.a(asyncTaskC5100hO0, Integer.valueOf(this.E), str);
        asyncTaskC5100hO0.execute(str);
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
        if (str == null || str.isEmpty()) {
            this.D = null;
            N(false, true);
            A();
        } else {
            this.D = str;
            N(true, false);
            A();
            j0(context, str);
        }
    }

    @Override // com.daaw.C1773Od1.a
    public RecyclerView.D r(ViewGroup viewGroup, int i2) {
        return AbstractC5728je1.a(viewGroup.getContext(), viewGroup, i2, this);
    }

    @Override // com.daaw.C1773Od1.a
    public void v(RecyclerView.D d2, int i2) {
        s sVarZ = Z(i2);
        C6363ls c6363ls = (C6363ls) d2;
        c6363ls.w = i2;
        e0(sVarZ, i2, c6363ls);
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void x(Context context, String[] strArr, InterfaceC5694jX[] interfaceC5694jXArr) {
        strArr[0] = context.getResources().getString(JD0.A2);
        interfaceC5694jXArr[0] = J();
    }

    @Override // com.daaw.C1773Od1.a
    public void j() {
    }

    @Override // com.daaw.C1773Od1.a
    public int t(int i2) {
        return i2;
    }

    @Override // com.daaw.C1773Od1.a
    public void i(int i2, int i3, List list) {
    }
}
