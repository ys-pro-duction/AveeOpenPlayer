package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C1773Od1;
import com.daaw.C6627mp;
import com.daaw.C8021rp;
import com.daaw.NW;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class Lr extends AbstractC1943Pu {
    public static final int E;
    public static final int F;

    public class a implements C8021rp.a {
        public final /* synthetic */ C1100Hr a;
        public final /* synthetic */ C1204Ir b;

        public a(C1100Hr c1100Hr, C1204Ir c1204Ir) {
            this.a = c1100Hr;
            this.b = c1204Ir;
        }

        @Override // com.daaw.C8021rp.a
        public C1773Od1 a(Context context, int i, NW nw) {
            C6627mp.b[] bVarArr = {new C6627mp.b(12), new C6627mp.b(12)};
            C1100Hr c1100Hr = this.a;
            C1204Ir c1204Ir = this.b;
            return new C1773Od1(new MU(new C6627mp(bVarArr, new C1773Od1.a[]{c1100Hr, c1204Ir}, new NW[]{c1100Hr, c1204Ir}), nw, 6, 1), nw);
        }
    }

    static {
        int i = AbstractC3374bD0.W;
        E = i;
        F = i;
    }

    public Lr(Context context, int i, WeakReference weakReference) {
        super(context, "/", context.getString(JD0.K3), AbstractC3374bD0.H, i, weakReference);
        V(context);
    }

    public static Cursor Y(NW.b bVar) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "", "", ""});
        matrixCursor.addRow(new String[]{"-1", "" + JD0.y2, "", "" + AbstractC3374bD0.P});
        matrixCursor.addRow(new String[]{"0", "" + JD0.H2, "", "" + AbstractC3374bD0.R});
        matrixCursor.addRow(new String[]{"1", "" + JD0.u2, "", "" + AbstractC3374bD0.t});
        matrixCursor.addRow(new String[]{"2", "" + JD0.w2, "", "" + AbstractC3374bD0.u});
        matrixCursor.addRow(new String[]{"3", "" + JD0.B2, "", "" + AbstractC3374bD0.K});
        matrixCursor.addRow(new String[]{"4", "" + JD0.E2, "", "" + AbstractC3374bD0.P});
        matrixCursor.addRow(new String[]{"5", "" + JD0.z2, "", "" + AbstractC3374bD0.C});
        if (bVar != null && bVar.d() == 0) {
            matrixCursor.addRow(new String[]{"6", "" + JD0.D2, "", "" + AbstractC3374bD0.A});
            return matrixCursor;
        }
        matrixCursor.addRow(new String[]{"7", "" + JD0.h2, "dir.xiph.org", "" + E});
        matrixCursor.addRow(new String[]{"8", "" + JD0.s5, "www.shoutcast.com", "" + F});
        return matrixCursor;
    }

    @Override // com.daaw.AbstractC1943Pu, com.daaw.AbstractC9991yr
    public boolean A() {
        Context contextI = com.daaw.avee.a.i();
        if (contextI == null) {
            return true;
        }
        W((Cursor) P(contextI).a, null);
        return true;
    }

    @Override // com.daaw.AbstractC9991yr
    public C1773Od1 E(Context context, int i) {
        return new C1773Od1(new MU(this, this, 3, 16), this);
    }

    @Override // com.daaw.AbstractC9991yr
    public String H(int i) {
        return U(i).getString(0);
    }

    @Override // com.daaw.AbstractC1943Pu
    public B61 P(Context context) {
        return new B61(Y((NW.b) this.c.get()), null);
    }

    public void X(Cursor cursor, int i, C6363ls c6363ls) {
        c6363ls.c0(this, J());
        c6363ls.Y(cursor.getInt(3));
        c6363ls.X(this.i);
        c6363ls.z.setVisibility(8);
        c6363ls.A.setText(cursor.getInt(1));
        c6363ls.A.setTextColor(this.g);
        c6363ls.f0(8);
        c6363ls.C.setText("");
        if (cursor.getString(0).equals("6")) {
            c6363ls.Y(cursor.getInt(3));
            c6363ls.X(this.h);
            c6363ls.A.setTextColor(this.h);
        } else if (cursor.getString(0).equals("7") || cursor.getString(0).equals("8")) {
            c6363ls.f0(0);
            c6363ls.e0(cursor.getString(2));
        }
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void c(boolean z) {
        AbstractC9991yr.v.a(Boolean.valueOf(z), Lr.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // com.daaw.NW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.daaw.C1773Od1 d(android.content.Context r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Lr.d(android.content.Context, java.lang.String):com.daaw.Od1");
    }

    @Override // com.daaw.C1773Od1.a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.C1773Od1.a
    public void v(RecyclerView.D d, int i) {
        Cursor cursorU = U(i);
        C6363ls c6363ls = (C6363ls) d;
        c6363ls.w = i;
        X(cursorU, i, c6363ls);
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public boolean z() {
        return ((Boolean) AbstractC9991yr.u.a(Lr.class, Boolean.FALSE)).booleanValue();
    }
}
