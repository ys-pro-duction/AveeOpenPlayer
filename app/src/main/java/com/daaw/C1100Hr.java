package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC3600c20;
import com.daaw.AbstractC4157e20;
import com.daaw.NU0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1100Hr extends AbstractC1943Pu {
    public static final int F = AbstractC3374bD0.P;
    public AbstractC7524q2[] E;

    /* JADX INFO: renamed from: com.daaw.Hr$a */
    public class a extends AbstractC4157e20.g.a {
        public a() {
        }

        @Override // com.daaw.AbstractC4157e20.g.a
        public void c(Object obj, List list) {
            C1100Hr.Y(C1100Hr.this, "" + ((i) obj).a, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hr$b */
    public class b extends AbstractC4157e20.f.a {
        public b() {
        }

        @Override // com.daaw.AbstractC4157e20.f.a
        public void c(Object obj, List list) {
            C1100Hr.Y(C1100Hr.this, "" + ((i) obj).a, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hr$c */
    public class c extends AbstractC4157e20.b.a {
        public c() {
        }

        @Override // com.daaw.AbstractC4157e20.b.a
        public void c(Object obj, List list) {
            C1100Hr.Y(C1100Hr.this, "" + ((i) obj).a, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hr$d */
    public class d extends AbstractC4157e20.c.a {
        public d() {
        }

        @Override // com.daaw.AbstractC4157e20.c.a
        public void c(Object obj, List list) {
            C1100Hr.Y(C1100Hr.this, "" + ((i) obj).a, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hr$e */
    public class e extends AbstractC4157e20.h.a {
        public e() {
        }

        @Override // com.daaw.AbstractC4157e20.h.a
        public void c(Object obj, List list) {
            C1100Hr.Y(C1100Hr.this, "" + ((i) obj).a, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hr$f */
    public class f extends AbstractC3600c20.c.a {
        public f() {
        }

        @Override // com.daaw.AbstractC3600c20.c.a
        public void c(Object obj, C2138Rl0 c2138Rl0) {
            i iVar = (i) obj;
            c2138Rl0.p(Long.valueOf(iVar.a), iVar.b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hr$g */
    public class g extends AbstractC3600c20.a.AbstractC0157a {
        public g() {
        }

        @Override // com.daaw.AbstractC3600c20.a.AbstractC0157a
        public void c(Object obj, C2138Rl0 c2138Rl0) {
            i iVar = (i) obj;
            c2138Rl0.p(Long.valueOf(iVar.a), iVar.b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hr$h */
    public static class h implements FQ {
        public String a;

        public h(String str) {
            this.a = str;
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2138Rl0 a(AbstractC9991yr abstractC9991yr) {
            return C2138Rl0.w(C1100Hr.Y(abstractC9991yr, this.a, null), null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hr$i */
    public static class i {
        public final long a;
        public final String b;

        public i(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public int hashCode() {
            return (int) this.a;
        }
    }

    public C1100Hr(Context context, String str, int i2) {
        super(context, str, context.getResources().getString(JD0.d5), F, i2);
        this.E = new AbstractC7524q2[]{new a(), new b(), new c(), new d(), new e(), new f(), new g()};
        V(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List Y(AbstractC9991yr abstractC9991yr, String str, List list) {
        Context contextH = com.daaw.avee.a.h();
        if (contextH == null) {
            return new ArrayList();
        }
        String strC = AbstractC2022Qi0.c((NU0.h) AbstractC9991yr.s.a(Integer.valueOf(abstractC9991yr.I()), abstractC9991yr.J(), null), 10);
        Cursor cursorE = AbstractC2022Qi0.e(contextH.getContentResolver(), MediaStore.Audio.Playlists.Members.getContentUri("external", AbstractC0405Bb1.y(str)), new String[]{"_id", "audio_id", "_data"}, "playlist_id=?", new String[]{str}, strC);
        if (cursorE == null) {
            return new ArrayList();
        }
        List listF = AbstractC1454Lb1.f(cursorE, list);
        cursorE.close();
        return listF;
    }

    public static B61 a0(Context context, InterfaceC5694jX interfaceC5694jX, int i2) {
        String str;
        String[] strArr;
        ContentResolver contentResolver = context.getContentResolver();
        String str2 = (String) AbstractC9991yr.r.a(Integer.valueOf(i2), interfaceC5694jX, "");
        if (str2 == null || str2.isEmpty()) {
            str = null;
            strArr = null;
            str2 = "";
        } else {
            strArr = new String[]{"%" + str2 + "%"};
            str = "name LIKE ?";
        }
        String[] strArr2 = {"_id", "name", "_data"};
        return new B61(AbstractC2022Qi0.f(contentResolver, MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, strArr2, str, strArr, strArr2[1]), str2);
    }

    @Override // com.daaw.AbstractC9991yr
    public C1773Od1 E(Context context, int i2) {
        return new C1773Od1(new MU(this, this, 6, 1), this);
    }

    @Override // com.daaw.AbstractC9991yr
    public String H(int i2) {
        return U(i2).getString(0);
    }

    @Override // com.daaw.AbstractC1943Pu
    public B61 P(Context context) {
        return a0(context, J(), this.l);
    }

    @Override // com.daaw.AbstractC1943Pu
    public B61 Q(Context context, String str) {
        return a0(context, J(), this.l);
    }

    public void Z(Cursor cursor, int i2, C6363ls c6363ls) {
        c6363ls.d0(this, new i(cursor.getLong(0), cursor.getString(1)), J());
        c6363ls.x.setSelected(((Boolean) AbstractC9991yr.x.a(c6363ls.u, Boolean.FALSE)).booleanValue());
        c6363ls.Z(this.E, -1, this);
        c6363ls.y.setVisibility(0);
        c6363ls.X(this.i);
        c6363ls.Y(AbstractC3374bD0.P);
        c6363ls.z.setVisibility(8);
        c6363ls.A.setText(cursor.getString(1));
        c6363ls.A.setTextColor(this.g);
        c6363ls.f0(8);
        c6363ls.e0("");
        c6363ls.C.setText("");
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void c(boolean z) {
        AbstractC9991yr.v.a(Boolean.valueOf(z), C1100Hr.class);
    }

    @Override // com.daaw.NW
    public C1773Od1 d(Context context, String str) {
        String strA;
        Cursor cursorE = AbstractC2022Qi0.e(context.getContentResolver(), MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"name"}, "_id=?", new String[]{str}, null);
        if (cursorE != null) {
            cursorE.moveToFirst();
            strA = AbstractC2022Qi0.a(cursorE, 0);
            cursorE.close();
        } else {
            strA = "";
        }
        C2267Sr c2267Sr = new C2267Sr(context, new h(str), p(str), strA, 0, this.l, false);
        c2267Sr.q(this.c);
        return c2267Sr.G(context, 0);
    }

    @Override // com.daaw.C1773Od1.a
    public int getItemViewType(int i2) {
        return 0;
    }

    @Override // com.daaw.C1773Od1.a
    public void v(RecyclerView.D d2, int i2) {
        Cursor cursorU = U(i2);
        C6363ls c6363ls = (C6363ls) d2;
        c6363ls.w = i2;
        Z(cursorU, i2, c6363ls);
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void x(Context context, String[] strArr, InterfaceC5694jX[] interfaceC5694jXArr) {
        strArr[0] = context.getResources().getString(JD0.F2);
        interfaceC5694jXArr[0] = J();
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public boolean z() {
        return ((Boolean) AbstractC9991yr.u.a(C1100Hr.class, Boolean.FALSE)).booleanValue();
    }
}
