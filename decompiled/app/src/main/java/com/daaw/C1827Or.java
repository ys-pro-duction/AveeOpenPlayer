package com.daaw;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AsyncTaskC2517Vb1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Or, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1827Or extends AbstractC3683cL {
    public AbstractC7524q2[] K;
    public AbstractC7524q2[] L;

    /* JADX INFO: renamed from: com.daaw.Or$c */
    public static class c {
        public C7914rS a;

        public c(C7914rS c7914rS) {
            this.a = c7914rS;
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && this.a.b.equals(((c) obj).a.b);
        }

        public int hashCode() {
            return this.a.b.hashCode();
        }
    }

    public C1827Or(Context context, FQ fq, String str, HX hx, int i, int i2) {
        super(context, fq, new C2303Ta(), str, hx, i, new C5659jO0(context), i2);
        this.K = new AbstractC7524q2[0];
        this.L = new AbstractC7524q2[0];
    }

    public static C1827Or X(Context context, String str, HX hx, int i, int i2) {
        return new C1827Or(context, new b(), str, hx, i, i2);
    }

    public static String Z(Context context, String str) {
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

    public void Y(C7914rS c7914rS, int i, C6363ls c6363ls) {
        c6363ls.d0(this, new c(c7914rS), J());
        c6363ls.x.setSelected(((Boolean) AbstractC9991yr.x.a(c6363ls.u, Boolean.FALSE)).booleanValue());
        c6363ls.Z(this.K, 0, this);
        c6363ls.y.setVisibility(8);
        c6363ls.W(null);
        c6363ls.z.setVisibility(8);
        TextView textView = c6363ls.A;
        textView.setText(Z(textView.getContext(), c7914rS.a));
        c6363ls.A.setTextColor(this.g);
        c6363ls.f0(8);
        c6363ls.C.setText("");
    }

    @Override // com.daaw.NW
    public C1773Od1 d(Context context, String str) {
        C1931Pr c1931Pr = new C1931Pr(context, str, new a(str), p(str), AbstractC3712cS0.d("", str), 0, this.l);
        c1931Pr.q(this.c);
        return c1931Pr.G(context, 0);
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
        Y(c7914rS, i, c6363ls);
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW
    public void x(Context context, String[] strArr, InterfaceC5694jX[] interfaceC5694jXArr) {
        strArr[0] = context.getResources().getString(JD0.J2);
        interfaceC5694jXArr[0] = J();
    }

    /* JADX INFO: renamed from: com.daaw.Or$a */
    public static class a implements FQ {
        public String a;
        public List b = null;
        public C9480x11 c = new C9480x11();

        /* JADX INFO: renamed from: com.daaw.Or$a$a, reason: collision with other inner class name */
        public class C0106a implements AsyncTaskC2517Vb1.b {
            public final /* synthetic */ AbstractC9991yr a;

            public C0106a(AbstractC9991yr abstractC9991yr) {
                this.a = abstractC9991yr;
            }

            @Override // com.daaw.AsyncTaskC2517Vb1.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(B61 b61, boolean z) {
                if (z) {
                    return;
                }
                List arrayList = null;
                if (b61 != null) {
                    List list = (List) b61.a;
                    if (((C7378pX0) b61.b).f()) {
                        this.a.O(((C7378pX0) b61.b).e());
                    } else {
                        this.a.O(null);
                    }
                    arrayList = list;
                } else {
                    this.a.O(null);
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                a.this.b = arrayList;
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
                d(abstractC9991yr, this.b);
                return DesugarCollections.unmodifiableList(this.b);
            }
            abstractC9991yr.L(true);
            this.c.c();
            this.c.d(null, AbstractC3712cS0.c(this.a), new C0106a(abstractC9991yr));
            return null;
        }

        private void d(AbstractC9991yr abstractC9991yr, List list) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Or$b */
    public static class b implements FQ {
        public List a = null;
        public boolean b = false;
        public C9480x11 c = new C9480x11();
        public C3155aS0 d = AbstractC3712cS0.e();

        /* JADX INFO: renamed from: com.daaw.Or$b$a */
        public class a implements AsyncTaskC2517Vb1.b {
            public final /* synthetic */ AbstractC9991yr a;

            public a(AbstractC9991yr abstractC9991yr) {
                this.a = abstractC9991yr;
            }

            @Override // com.daaw.AsyncTaskC2517Vb1.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(B61 b61, boolean z) {
                if (z) {
                    return;
                }
                List arrayList = null;
                if (b61 != null) {
                    List list = (List) b61.a;
                    if (((C7378pX0) b61.b).f()) {
                        this.a.O(((C7378pX0) b61.b).e());
                    } else {
                        this.a.O(null);
                    }
                    arrayList = list;
                } else {
                    this.a.O(null);
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                b.this.a = arrayList;
                this.a.A();
            }
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a(AbstractC9991yr abstractC9991yr) {
            if (this.a != null || this.c.e(null)) {
                if (this.a == null) {
                    return null;
                }
                abstractC9991yr.L(false);
                c(abstractC9991yr, this.a);
                return DesugarCollections.unmodifiableList(this.a);
            }
            abstractC9991yr.L(true);
            this.c.c();
            this.c.d(null, AbstractC3712cS0.c(null), new a(abstractC9991yr));
            return null;
        }

        public void c(AbstractC9991yr abstractC9991yr, List list) {
        }
    }
}
