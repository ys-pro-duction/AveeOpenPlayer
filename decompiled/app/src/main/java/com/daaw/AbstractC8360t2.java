package com.daaw;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8360t2 {
    public final Context a;
    public a b;
    public b c;

    /* JADX INFO: renamed from: com.daaw.t2$a */
    public interface a {
    }

    /* JADX INFO: renamed from: com.daaw.t2$b */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC8360t2(Context context) {
        this.a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.c = null;
        this.b = null;
    }

    public void h(a aVar) {
        this.b = aVar;
    }

    public abstract void i(b bVar);
}
