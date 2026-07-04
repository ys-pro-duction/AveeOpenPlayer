package com.daaw;

import android.content.Context;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC4725g20;
import com.daaw.NU0;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.Nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1723Nr extends AbstractC3683cL {
    public static C8536tg1 L = new C8536tg1();
    public AbstractC7524q2[] K;

    /* JADX INFO: renamed from: com.daaw.Nr$a */
    public class a extends AbstractC4725g20.a.b {
        public a() {
        }

        @Override // com.daaw.AbstractC4725g20.a.b
        public AsyncTaskC2517Vb1 c(Object obj) {
            b bVar = (b) obj;
            return AbstractC3712cS0.e().i(bVar.b.c(), bVar.b.d());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Nr$b */
    public static class b {
        public int a;
        public C3434bS0 b;

        public b(C3434bS0 c3434bS0, int i) {
            this.a = i;
            this.b = c3434bS0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public C1723Nr(Context context, FQ fq, String str, HX hx, int i, int i2) {
        super(context, fq, new C2303Ta(), str, hx, i, new C6226lO0(context), i2);
        this.K = new AbstractC7524q2[]{new a()};
    }

    public static /* synthetic */ void X(C6363ls c6363ls) {
    }

    public static void Y(AbstractC9991yr abstractC9991yr, C2138Rl0 c2138Rl0) {
        Comparator comparatorD = AbstractC5136hX0.d((NU0.h) AbstractC9991yr.s.a(Integer.valueOf(abstractC9991yr.I()), abstractC9991yr.J(), null), 10);
        if (comparatorD != null) {
            try {
                Collections.sort(c2138Rl0, comparatorD);
            } catch (Exception unused) {
                AbstractC0441Bk1.c("Comparator<Tuple2<PlaylistSong, StationEntry>> exception");
            }
        }
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
        W(context, str, new C6226lO0(context));
    }

    @Override // com.daaw.C1773Od1.a
    public void v(RecyclerView.D d, int i) {
        C3434bS0 c3434bS0 = (C3434bS0) S().get(i);
        C6363ls c6363ls = (C6363ls) d;
        c6363ls.w = i;
        C0746Eg1 c0746Eg1 = AbstractC9991yr.q;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) c0746Eg1.a(bool);
        boolean zBooleanValue = bool2.booleanValue();
        c6363ls.d0(this, new b(c3434bS0, i), J());
        c6363ls.v = c3434bS0.b;
        c6363ls.x.setSelected(((Boolean) AbstractC9991yr.x.a(c6363ls.u, bool)).booleanValue());
        c6363ls.a0(this.K, 0, this, false, false, new InterfaceC5559j2() { // from class: com.daaw.Mr
            @Override // com.daaw.InterfaceC5559j2
            public final void a(Object obj) {
                C1723Nr.X((C6363ls) obj);
            }
        });
        if (zBooleanValue) {
            c6363ls.z.setVisibility(8);
        } else {
            c6363ls.z.setVisibility(0);
            c6363ls.z.setText(String.format(Locale.getDefault(), "%d.", Integer.valueOf(i + 1)));
        }
        c6363ls.y.setVisibility(0);
        c6363ls.X(-1);
        G3 g3 = new G3(Uri.parse(c3434bS0.b), "abc", c3434bS0.a);
        new E3().o(g3.a, g3.b, g3.c, c6363ls.y, true);
        c6363ls.A.setText(c3434bS0.a);
        c6363ls.f0(0);
        c6363ls.e0(c3434bS0.b());
        c6363ls.C.setText("");
        c6363ls.T();
        L.a(c6363ls, c3434bS0, bool2);
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
