package com.daaw;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: com.daaw.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0736Ee {
    public final Context a;
    public BS0 b;
    public BS0 c;

    public AbstractC0736Ee(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof HZ0)) {
            return menuItem;
        }
        HZ0 hz0 = (HZ0) menuItem;
        if (this.b == null) {
            this.b = new BS0();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(hz0);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0540Cj0 menuItemC0540Cj0 = new MenuItemC0540Cj0(this.a, hz0);
        this.b.put(hz0, menuItemC0540Cj0);
        return menuItemC0540Cj0;
    }

    public final void e() {
        BS0 bs0 = this.b;
        if (bs0 != null) {
            bs0.clear();
        }
        BS0 bs02 = this.c;
        if (bs02 != null) {
            bs02.clear();
        }
    }

    public final void f(int i) {
        if (this.b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b.size()) {
            if (((HZ0) this.b.j(i2)).getGroupId() == i) {
                this.b.l(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void g(int i) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (((HZ0) this.b.j(i2)).getItemId() == i) {
                this.b.l(i2);
                return;
            }
        }
    }

    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
