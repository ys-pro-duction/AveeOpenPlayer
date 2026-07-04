package com.daaw;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8081s2 {
    public Object B;
    public boolean C;

    /* JADX INFO: renamed from: com.daaw.s2$a */
    public interface a {
        boolean a(AbstractC8081s2 abstractC8081s2, Menu menu);

        boolean b(AbstractC8081s2 abstractC8081s2, Menu menu);

        void c(AbstractC8081s2 abstractC8081s2);

        boolean d(AbstractC8081s2 abstractC8081s2, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.B;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.C;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.B = obj;
    }

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z) {
        this.C = z;
    }
}
