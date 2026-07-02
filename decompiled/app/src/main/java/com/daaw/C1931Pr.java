package com.daaw;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AsyncTaskC2517Vb1;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1931Pr extends AbstractC3683cL {
    public AbstractC7524q2[] K;
    public AbstractC7524q2[] L;
    public String M;

    /* JADX INFO: renamed from: com.daaw.Pr$a */
    public static class a implements FQ {
        public String a;
        public C2138Rl0 b = null;
        public C9480x11 c = new C9480x11();

        /* JADX INFO: renamed from: com.daaw.Pr$a$a, reason: collision with other inner class name */
        public class C0109a implements AsyncTaskC2517Vb1.b {
            public final /* synthetic */ AbstractC9991yr a;

            public C0109a(AbstractC9991yr abstractC9991yr) {
                this.a = abstractC9991yr;
            }

            @Override // com.daaw.AsyncTaskC2517Vb1.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(B61 b61, boolean z) {
                if (z) {
                    return;
                }
                C2138Rl0 c2138Rl0 = null;
                if (b61 != null) {
                    C2138Rl0 c2138Rl02 = (C2138Rl0) b61.a;
                    if (((C7378pX0) b61.b).f()) {
                        this.a.O(((C7378pX0) b61.b).e());
                    } else {
                        this.a.O(null);
                    }
                    c2138Rl0 = c2138Rl02;
                } else {
                    this.a.O(null);
                }
                if (c2138Rl0 == null) {
                    c2138Rl0 = new C2138Rl0();
                }
                a.this.b = c2138Rl0;
                this.a.A();
            }
        }

        public a(String str) {
            this.a = str;
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(AbstractC9991yr abstractC9991yr) {
            if (this.b != null || this.c.e(null)) {
                if (this.b == null) {
                    return null;
                }
                abstractC9991yr.L(false);
                C1723Nr.Y(abstractC9991yr, this.b);
                return this.b.M();
            }
            abstractC9991yr.L(true);
            this.c.c();
            this.c.d(null, AbstractC3712cS0.e().f(this.a), new C0109a(abstractC9991yr));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pr$b */
    public static class b {
        public C7914rS a;

        public b(C7914rS c7914rS) {
            this.a = c7914rS;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && this.a.b.equals(((b) obj).a.b);
        }

        public int hashCode() {
            return this.a.b.hashCode();
        }
    }

    public C1931Pr(Context context, String str, FQ fq, String str2, HX hx, int i, int i2) {
        super(context, fq, new C2303Ta(), str2, hx, i, new C5659jO0(context), i2);
        this.K = new AbstractC7524q2[0];
        this.L = new AbstractC7524q2[0];
        this.M = str;
    }

    public static String Y(Context context, String str) {
        return str.isEmpty() ? context.getString(JD0.S6) : str;
    }

    @Override // com.daaw.AbstractC9991yr
    public C1773Od1 E(Context context, int i) {
        return new C1773Od1(new MU(this, this, 9, 15), this);
    }

    @Override // com.daaw.AbstractC9991yr
    public String H(int i) {
        return ((C7914rS) R(i)).b;
    }

    public void X(C7914rS c7914rS, int i, C6363ls c6363ls) {
        c6363ls.d0(this, new b(c7914rS), J());
        c6363ls.x.setSelected(((Boolean) AbstractC9991yr.x.a(c6363ls.u, Boolean.FALSE)).booleanValue());
        c6363ls.Z(this.K, 0, this);
        c6363ls.y.setVisibility(8);
        c6363ls.W(null);
        c6363ls.z.setVisibility(8);
        TextView textView = c6363ls.A;
        textView.setText(Y(textView.getContext(), c7914rS.a));
        c6363ls.A.setTextColor(this.g);
        c6363ls.f0(8);
        c6363ls.C.setText("");
    }

    @Override // com.daaw.NW
    public C1773Od1 d(Context context, String str) {
        C1723Nr c1723Nr = new C1723Nr(context, new a(str), p(str), AbstractC3712cS0.d(this.M, str), 0, this.l);
        c1723Nr.q(this.c);
        return c1723Nr.G(context, 0);
    }

    @Override // com.daaw.C1773Od1.a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void l(int i) {
        AbstractC7524q2[] abstractC7524q2Arr = this.L;
        if (i < abstractC7524q2Arr.length) {
            abstractC7524q2Arr[i].a(null);
        }
    }

    @Override // com.daaw.NW
    public void o(Context context, String str) {
        W(context, str, new C5659jO0(context));
    }

    @Override // com.daaw.C1773Od1.a
    public void v(RecyclerView.D d, int i) {
        C7914rS c7914rS = (C7914rS) S().get(i);
        C6363ls c6363ls = (C6363ls) d;
        c6363ls.w = i;
        X(c7914rS, i, c6363ls);
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void x(Context context, String[] strArr, InterfaceC5694jX[] interfaceC5694jXArr) {
        strArr[0] = context.getResources().getString(JD0.J2);
        interfaceC5694jXArr[0] = J();
    }
}
