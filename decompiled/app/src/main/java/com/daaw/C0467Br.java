package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC4157e20;
import com.daaw.NU0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0467Br extends AbstractC1943Pu {
    public AbstractC7524q2[] E;

    /* JADX INFO: renamed from: com.daaw.Br$a */
    public class a extends AbstractC4157e20.g.a {
        public a() {
        }

        @Override // com.daaw.AbstractC4157e20.g.a
        public void c(Object obj, List list) {
            C0467Br.Y(C0467Br.this, "" + ((g) obj).a, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Br$b */
    public class b extends AbstractC4157e20.f.a {
        public b() {
        }

        @Override // com.daaw.AbstractC4157e20.f.a
        public void c(Object obj, List list) {
            C0467Br.Y(C0467Br.this, "" + ((g) obj).a, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Br$c */
    public class c extends AbstractC4157e20.b.a {
        public c() {
        }

        @Override // com.daaw.AbstractC4157e20.b.a
        public void c(Object obj, List list) {
            C0467Br.Y(C0467Br.this, "" + ((g) obj).a, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Br$d */
    public class d extends AbstractC4157e20.c.a {
        public d() {
        }

        @Override // com.daaw.AbstractC4157e20.c.a
        public void c(Object obj, List list) {
            C0467Br.Y(C0467Br.this, "" + ((g) obj).a, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Br$e */
    public class e extends AbstractC4157e20.h.a {
        public e() {
        }

        @Override // com.daaw.AbstractC4157e20.h.a
        public void c(Object obj, List list) {
            C0467Br.Y(C0467Br.this, "" + ((g) obj).a, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Br$f */
    public static class f implements FQ {
        public String a;

        public f(String str) {
            this.a = str;
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2138Rl0 a(AbstractC9991yr abstractC9991yr) {
            return C2138Rl0.w(C0467Br.Y(abstractC9991yr, this.a, null), null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Br$g */
    public static class g {
        public long a;

        public g(long j) {
            this.a = j;
        }

        public boolean equals(Object obj) {
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public int hashCode() {
            return (int) this.a;
        }
    }

    public C0467Br(Context context, String str, String str2, int i, int i2) {
        super(context, str, str2, i, i2);
        this.E = new AbstractC7524q2[]{new a(), new b(), new c(), new d(), new e()};
        V(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List Y(AbstractC9991yr abstractC9991yr, String str, List list) {
        Context contextH = com.daaw.avee.a.h();
        if (contextH == null) {
            return new ArrayList();
        }
        String strC = AbstractC2022Qi0.c((NU0.h) AbstractC9991yr.s.a(Integer.valueOf(abstractC9991yr.I()), abstractC9991yr.J(), null), 0);
        Cursor cursorE = AbstractC2022Qi0.e(contextH.getContentResolver(), MediaStore.Audio.Genres.Members.getContentUri("external", AbstractC0405Bb1.y(str)), new String[]{"_id", "audio_id", "_data"}, "genre_id=?", new String[]{str}, strC);
        if (cursorE == null) {
            return new ArrayList();
        }
        List listF = AbstractC1454Lb1.f(cursorE, list);
        cursorE.close();
        return listF;
    }

    public static B61 a0(Context context, InterfaceC5694jX interfaceC5694jX, int i) {
        String str;
        String[] strArr;
        ContentResolver contentResolver = context.getContentResolver();
        String str2 = (String) AbstractC9991yr.r.a(Integer.valueOf(i), interfaceC5694jX, "");
        if (str2 == null || str2.isEmpty()) {
            str = null;
            strArr = null;
            str2 = "";
        } else {
            strArr = new String[]{"%" + str2 + "%"};
            str = "name LIKE ?";
        }
        return new B61(AbstractC2022Qi0.f(contentResolver, MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI, new String[]{"_id", "name"}, str, strArr, null), str2);
    }

    public static String b0(Context context, String str) {
        return (str == null || str.isEmpty()) ? context.getString(JD0.S6) : str;
    }

    @Override // com.daaw.AbstractC9991yr
    public C1773Od1 E(Context context, int i) {
        return new C1773Od1(new MU(this, this, 9, 1), this);
    }

    @Override // com.daaw.AbstractC9991yr
    public String H(int i) {
        return U(i).getString(0);
    }

    @Override // com.daaw.AbstractC1943Pu
    public B61 P(Context context) {
        return a0(context, J(), this.l);
    }

    @Override // com.daaw.AbstractC1943Pu
    public B61 Q(Context context, String str) {
        return a0(context, J(), this.l);
    }

    public void Z(Cursor cursor, int i, C6363ls c6363ls) {
        c6363ls.d0(this, new g(cursor.getLong(0)), J());
        c6363ls.x.setSelected(((Boolean) AbstractC9991yr.x.a(c6363ls.u, Boolean.FALSE)).booleanValue());
        c6363ls.Z(this.E, -1, this);
        c6363ls.y.setVisibility(8);
        c6363ls.W(null);
        c6363ls.z.setVisibility(8);
        TextView textView = c6363ls.A;
        textView.setText(b0(textView.getContext(), cursor.getString(1)));
        c6363ls.A.setTextColor(this.g);
        c6363ls.f0(8);
        c6363ls.C.setText("");
    }

    @Override // com.daaw.NW
    public C1773Od1 d(Context context, String str) {
        String strA;
        Cursor cursorE = AbstractC2022Qi0.e(context.getContentResolver(), MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI, new String[]{"_id", "name"}, "_id=?", new String[]{str}, null);
        if (cursorE != null) {
            cursorE.moveToFirst();
            strA = AbstractC2022Qi0.a(cursorE, 1);
            cursorE.close();
        } else {
            strA = "";
        }
        C2267Sr c2267Sr = new C2267Sr(context, new f(str), p(str), strA, 0, this.l, false);
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
        Z(cursorU, i, c6363ls);
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void x(Context context, String[] strArr, InterfaceC5694jX[] interfaceC5694jXArr) {
        strArr[0] = context.getResources().getString(JD0.C2);
        interfaceC5694jXArr[0] = J();
    }
}
