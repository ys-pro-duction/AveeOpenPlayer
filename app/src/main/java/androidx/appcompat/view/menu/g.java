package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.j;
import com.daaw.AbstractC8360t2;
import com.daaw.G9;
import com.daaw.HZ0;
import com.daaw.OD0;
import com.daaw.SD;

/* JADX INFO: loaded from: classes.dex */
public final class g implements HZ0 {
    public View A;
    public AbstractC8360t2 B;
    public MenuItem.OnActionExpandListener C;
    public ContextMenu.ContextMenuInfo E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public char j;
    public Drawable l;
    public e n;
    public l o;
    public Runnable p;
    public MenuItem.OnMenuItemClickListener q;
    public CharSequence r;
    public CharSequence s;
    public int z;
    public int i = 4096;
    public int k = 4096;
    public int m = 0;
    public ColorStateList t = null;
    public PorterDuff.Mode u = null;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public int y = 16;
    public boolean D = false;

    public class a implements AbstractC8360t2.b {
        public a() {
        }

        @Override // com.daaw.AbstractC8360t2.b
        public void onActionProviderVisibilityChanged(boolean z) {
            g gVar = g.this;
            gVar.n.M(gVar);
        }
    }

    public g(e eVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.n = eVar;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.z = i5;
    }

    public static void d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public boolean A() {
        return this.n.K() && g() != 0;
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    @Override // com.daaw.HZ0
    public AbstractC8360t2 a() {
        return this.B;
    }

    @Override // com.daaw.HZ0
    public HZ0 b(AbstractC8360t2 abstractC8360t2) {
        AbstractC8360t2 abstractC8360t22 = this.B;
        if (abstractC8360t22 != null) {
            abstractC8360t22.g();
        }
        this.A = null;
        this.B = abstractC8360t2;
        this.n.N(true);
        AbstractC8360t2 abstractC8360t23 = this.B;
        if (abstractC8360t23 != null) {
            abstractC8360t23.i(new a());
        }
        return this;
    }

    public void c() {
        this.n.L(this);
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = SD.r(drawable).mutate();
            if (this.v) {
                SD.o(drawable, this.t);
            }
            if (this.w) {
                SD.p(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.m(this);
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    public char g() {
        return this.n.J() ? this.j : this.h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        AbstractC8360t2 abstractC8360t2 = this.B;
        if (abstractC8360t2 == null) {
            return null;
        }
        View viewC = abstractC8360t2.c(this);
        this.A = viewC;
        return viewC;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.m == 0) {
            return null;
        }
        Drawable drawableB = G9.b(this.n.w(), this.m);
        this.m = 0;
        this.l = drawableB;
        return e(drawableB);
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }

    public String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.n.w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(OD0.m));
        }
        int i = this.n.J() ? this.k : this.i;
        d(sb, i, 65536, resources.getString(OD0.i));
        d(sb, i, 4096, resources.getString(OD0.e));
        d(sb, i, 2, resources.getString(OD0.d));
        d(sb, i, 1, resources.getString(OD0.j));
        d(sb, i, 4, resources.getString(OD0.l));
        d(sb, i, 8, resources.getString(OD0.h));
        if (cG == '\b') {
            sb.append(resources.getString(OD0.f));
        } else if (cG == '\n') {
            sb.append(resources.getString(OD0.g));
        } else if (cG != ' ') {
            sb.append(cG);
        } else {
            sb.append(resources.getString(OD0.k));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    public CharSequence i(j.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC8360t2 abstractC8360t2 = this.B;
        return (abstractC8360t2 == null || !abstractC8360t2.f()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        AbstractC8360t2 abstractC8360t2;
        if ((this.z & 8) != 0) {
            if (this.A == null && (abstractC8360t2 = this.B) != null) {
                this.A = abstractC8360t2.c(this);
            }
            if (this.A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.g != null) {
            try {
                this.n.w().startActivity(this.g);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        AbstractC8360t2 abstractC8360t2 = this.B;
        return abstractC8360t2 != null && abstractC8360t2.d();
    }

    public boolean l() {
        return (this.y & 32) == 32;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public HZ0 setActionView(int i) {
        Context contextW = this.n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HZ0 setActionView(View view) {
        int i;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        this.n.L(this);
        return this;
    }

    public void r(boolean z) {
        this.D = z;
        this.n.N(false);
    }

    public void s(boolean z) {
        int i = this.y;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.y = i2;
        if (i != i2) {
            this.n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.y = i2;
        if (i != i2) {
            this.n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.n.Y(this);
            return this;
        }
        s(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.x = true;
        this.n.N(false);
        return this;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.N(false);
        return this;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.j = Character.toLowerCase(c2);
        this.n.N(false);
        return this;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = i;
        this.n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.N(false);
        l lVar = this.o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (y(z)) {
            this.n.M(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z) {
        if (z) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public HZ0 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public void x(l lVar) {
        this.o = lVar;
        lVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z) {
        int i = this.y;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.y = i2;
        return i != i2;
    }

    public boolean z() {
        return this.n.C();
    }

    @Override // android.view.MenuItem
    public HZ0 setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public HZ0 setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.N(false);
        return this;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(i);
        this.n.N(false);
        return this;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.n.N(false);
        return this;
    }

    @Override // com.daaw.HZ0, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.x = true;
        this.n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.n.w().getString(i));
    }
}
