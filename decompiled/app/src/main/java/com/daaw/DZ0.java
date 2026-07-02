package com.daaw;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.daaw.AbstractC8081s2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class DZ0 extends ActionMode {
    public final Context a;
    public final AbstractC8081s2 b;

    public static class a implements AbstractC8081s2.a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList c = new ArrayList();
        public final BS0 d = new BS0();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // com.daaw.AbstractC8081s2.a
        public boolean a(AbstractC8081s2 abstractC8081s2, Menu menu) {
            return this.a.onPrepareActionMode(e(abstractC8081s2), f(menu));
        }

        @Override // com.daaw.AbstractC8081s2.a
        public boolean b(AbstractC8081s2 abstractC8081s2, Menu menu) {
            return this.a.onCreateActionMode(e(abstractC8081s2), f(menu));
        }

        @Override // com.daaw.AbstractC8081s2.a
        public void c(AbstractC8081s2 abstractC8081s2) {
            this.a.onDestroyActionMode(e(abstractC8081s2));
        }

        @Override // com.daaw.AbstractC8081s2.a
        public boolean d(AbstractC8081s2 abstractC8081s2, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(abstractC8081s2), new MenuItemC0540Cj0(this.b, (HZ0) menuItem));
        }

        public ActionMode e(AbstractC8081s2 abstractC8081s2) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                DZ0 dz0 = (DZ0) this.c.get(i);
                if (dz0 != null && dz0.b == abstractC8081s2) {
                    return dz0;
                }
            }
            DZ0 dz02 = new DZ0(this.b, abstractC8081s2);
            this.c.add(dz02);
            return dz02;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = (Menu) this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC0965Gj0 menuC0965Gj0 = new MenuC0965Gj0(this.b, (FZ0) menu);
            this.d.put(menu, menuC0965Gj0);
            return menuC0965Gj0;
        }
    }

    public DZ0(Context context, AbstractC8081s2 abstractC8081s2) {
        this.a = context;
        this.b = abstractC8081s2;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC0965Gj0(this.a, (FZ0) this.b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.q(i);
    }
}
