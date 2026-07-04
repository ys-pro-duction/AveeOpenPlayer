package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC3322b20;
import com.daaw.AbstractC4157e20;
import com.revenuecat.purchases.common.Constants;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0363Ar extends AbstractC1943Pu {
    public AbstractC7524q2[] E;
    public AbstractC7524q2[] F;

    /* JADX INFO: renamed from: com.daaw.Ar$a */
    public class a extends AbstractC4157e20.g.a {
        public a() {
        }

        @Override // com.daaw.AbstractC4157e20.g.a
        public void c(Object obj, List list) {
            C0363Ar.this.Y(((h) obj).b, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ar$b */
    public class b extends AbstractC4157e20.f.a {
        public b() {
        }

        @Override // com.daaw.AbstractC4157e20.f.a
        public void c(Object obj, List list) {
            C0363Ar.this.Y(((h) obj).b, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ar$c */
    public class c extends AbstractC4157e20.b.a {
        public c() {
        }

        @Override // com.daaw.AbstractC4157e20.b.a
        public void c(Object obj, List list) {
            C0363Ar.this.Y(((h) obj).b, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ar$d */
    public class d extends AbstractC4157e20.c.a {
        public d() {
        }

        @Override // com.daaw.AbstractC4157e20.c.a
        public void c(Object obj, List list) {
            C0363Ar.this.Y(((h) obj).b, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ar$e */
    public class e extends AbstractC4157e20.h.a {
        public e() {
        }

        @Override // com.daaw.AbstractC4157e20.h.a
        public void c(Object obj, List list) {
            C0363Ar.this.Y(((h) obj).b, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ar$f */
    public class f extends AbstractC3322b20.b.a {
        public f() {
        }

        @Override // com.daaw.AbstractC3322b20.b.a
        public void c(Object obj, C2138Rl0 c2138Rl0) {
            h hVar = (h) obj;
            c2138Rl0.p(hVar.a, hVar.b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ar$g */
    public class g extends BroadcastReceiver {
        public g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().d();
            C0363Ar.this.W((Cursor) C0363Ar.b0(context, null).a, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ar$h */
    public static class h {
        public final String a;
        public final String b;

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

    public C0363Ar(Context context, String str, String str2, int i, int i2) {
        super(context, str, str2, i, i2);
        AbstractC7524q2[] abstractC7524q2Arr = {new a(), new b(), new c(), new d(), new e(), new f()};
        this.E = abstractC7524q2Arr;
        this.F = (AbstractC7524q2[]) Arrays.copyOf(abstractC7524q2Arr, abstractC7524q2Arr.length - 1);
        V(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addDataScheme("file");
        context.registerReceiver(new g(), intentFilter);
    }

    public static int Z(String str) {
        if (str != null) {
            if (str.equals("-01")) {
                return AbstractC3374bD0.Y;
            }
            if (str.equals("-03")) {
                return AbstractC3374bD0.O;
            }
            if (str.startsWith("-02")) {
                return AbstractC3374bD0.T;
            }
        }
        return AbstractC3374bD0.C;
    }

    public static B61 b0(Context context, InterfaceC5694jX interfaceC5694jX) {
        C2138Rl0<B61> c2138Rl0G = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().G(context);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "path", "icon", "name"});
        for (B61 b61 : c2138Rl0G) {
            String[] strArrSplit = ((String) b61.b).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            matrixCursor.addRow(new String[]{(String) b61.a, strArrSplit[0], "" + Z((String) b61.a), strArrSplit.length > 1 ? strArrSplit[1] : null});
        }
        return new B61(matrixCursor, "");
    }

    @Override // com.daaw.AbstractC9991yr
    public C1773Od1 E(Context context, int i) {
        return new C1773Od1(new MU(this, this, 5, 1), this);
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

    public List Y(String str, List list) {
        return C10270zr.c0(this.l, J(), str, list);
    }

    public void a0(Cursor cursor, int i, C6363ls c6363ls) {
        c6363ls.d0(this, new h(U(i).getString(0), U(i).getString(1)), J());
        String string = cursor.getString(0);
        boolean zStartsWith = string.startsWith("-");
        c6363ls.x.setSelected(((Boolean) AbstractC9991yr.x.a(c6363ls.u, Boolean.FALSE)).booleanValue());
        c6363ls.Z(zStartsWith ? this.F : this.E, -1, this);
        c6363ls.y.setVisibility(0);
        c6363ls.X(this.i);
        c6363ls.Y(cursor.getInt(2));
        c6363ls.z.setVisibility(8);
        String string2 = cursor.getString(1);
        c6363ls.A.setText(cursor.isNull(3) ? AbstractC0896Fs.c(string, string2, c6363ls.a.getContext()) : cursor.getString(3));
        c6363ls.A.setTextColor(this.g);
        c6363ls.f0(0);
        c6363ls.e0(string2);
        c6363ls.C.setText("");
    }

    @Override // com.daaw.NW
    public C1773Od1 d(Context context, String str) {
        int iS = S("_id", str);
        String string = iS >= 0 ? U(iS).getString(1) : "";
        if (string.length() <= 0) {
            return null;
        }
        C10270zr c10270zr = new C10270zr(context, new File(string), p(str), this.l);
        c10270zr.q(this.c);
        return c10270zr.F(context);
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
}
