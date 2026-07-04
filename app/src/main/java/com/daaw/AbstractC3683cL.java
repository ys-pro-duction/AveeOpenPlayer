package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import com.daaw.AsyncTaskC6505mO0;
import com.daaw.C1773Od1;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.cL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3683cL extends AbstractC5717jc0 implements C1773Od1.a {
    public List G;
    public List H;
    public String I;
    public AsyncTaskC6505mO0.b J;

    /* JADX INFO: renamed from: com.daaw.cL$a */
    public class a implements AsyncTaskC6505mO0.b {
        public a() {
        }

        @Override // com.daaw.AsyncTaskC6505mO0.b
        public void a(AsyncTask asyncTask, boolean z) {
            if (d(asyncTask)) {
                AbstractC3683cL abstractC3683cL = AbstractC3683cL.this;
                if (abstractC3683cL.H == null) {
                    return;
                }
                abstractC3683cL.N(false, true);
                AbstractC3683cL.this.A();
            }
        }

        @Override // com.daaw.AsyncTaskC6505mO0.b
        public void b(AsyncTask asyncTask) {
            if (d(asyncTask)) {
                AbstractC3683cL abstractC3683cL = AbstractC3683cL.this;
                if (abstractC3683cL.H == null) {
                    return;
                }
                abstractC3683cL.N(true, false);
                AbstractC3683cL.this.H.clear();
                AbstractC3683cL.this.A();
            }
        }

        @Override // com.daaw.AsyncTaskC6505mO0.b
        public void c(AsyncTask asyncTask, Object obj) {
            if (AbstractC3683cL.this.H != null && d(asyncTask)) {
                AbstractC3683cL.this.U(obj);
            }
        }

        public boolean d(AsyncTask asyncTask) {
            return ((Boolean) AbstractC9991yr.y.a(asyncTask, Integer.valueOf(AbstractC3683cL.this.l), Boolean.FALSE)).booleanValue();
        }
    }

    public AbstractC3683cL(Context context, FQ fq, KQ kq, String str, HX hx, int i, InterfaceC3126aL interfaceC3126aL, int i2) {
        super(context, fq, kq, str, hx, i, i2);
        this.I = null;
        this.J = new a();
        W(context, (String) AbstractC9991yr.r.a(Integer.valueOf(i2), J(), ""), interfaceC3126aL);
    }

    @Override // com.daaw.AbstractC5717jc0
    public B61 Q(boolean z) {
        List list = this.H;
        if (list == null) {
            return super.Q(z);
        }
        if (z) {
            list = null;
        }
        return new B61(list, this.I + this.H.size());
    }

    public void U(Object obj) {
        this.H.add(obj);
    }

    public final void V(String str, InterfaceC3126aL interfaceC3126aL, List list) {
        AsyncTaskC6505mO0 asyncTaskC6505mO0 = new AsyncTaskC6505mO0(list, interfaceC3126aL, new WeakReference(this.J));
        AbstractC9991yr.z.a(asyncTaskC6505mO0, Integer.valueOf(this.l), str);
        asyncTaskC6505mO0.execute(str);
    }

    public void W(Context context, String str, InterfaceC3126aL interfaceC3126aL) {
        if (str == null || str.isEmpty() || interfaceC3126aL == null) {
            this.H = null;
            this.I = null;
            this.G = null;
            N(false, true);
            A();
            return;
        }
        this.H = (List) this.E.a();
        this.I = str;
        N(true, false);
        if (this.G == null) {
            this.G = super.S();
        }
        A();
        V(str, interfaceC3126aL, this.G);
    }
}
