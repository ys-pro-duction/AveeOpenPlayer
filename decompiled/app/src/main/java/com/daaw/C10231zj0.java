package com.daaw;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.daaw.zj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10231zj0 {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Map c = new HashMap();

    public C10231zj0(Runnable runnable) {
        this.a = runnable;
    }

    public void a(InterfaceC0861Fj0 interfaceC0861Fj0) {
        this.b.add(interfaceC0861Fj0);
        this.a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0861Fj0) it.next()).c(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0861Fj0) it.next()).b(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0861Fj0) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0861Fj0) it.next()).d(menu);
        }
    }

    public void f(InterfaceC0861Fj0 interfaceC0861Fj0) {
        this.b.remove(interfaceC0861Fj0);
        AbstractC6314li0.a(this.c.remove(interfaceC0861Fj0));
        this.a.run();
    }
}
