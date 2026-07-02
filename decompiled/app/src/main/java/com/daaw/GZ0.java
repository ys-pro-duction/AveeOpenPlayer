package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class GZ0 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public Context c;
    public Object d;

    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class[] c = {MenuItem.class};
        public Object a;
        public Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
                }
                this.b.invoke(this.a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class b {
        public AbstractC8360t2 A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;
        public Menu a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        public void a() {
            this.h = true;
            i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenuAddSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, GZ0.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = GZ0.this.c.obtainStyledAttributes(attributeSet, AbstractC5060hE0.o1);
            this.b = typedArrayObtainStyledAttributes.getResourceId(AbstractC5060hE0.q1, 0);
            this.c = typedArrayObtainStyledAttributes.getInt(AbstractC5060hE0.s1, 0);
            this.d = typedArrayObtainStyledAttributes.getInt(AbstractC5060hE0.t1, 0);
            this.e = typedArrayObtainStyledAttributes.getInt(AbstractC5060hE0.u1, 0);
            this.f = typedArrayObtainStyledAttributes.getBoolean(AbstractC5060hE0.r1, true);
            this.g = typedArrayObtainStyledAttributes.getBoolean(AbstractC5060hE0.p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            Z31 z31U = Z31.u(GZ0.this.c, attributeSet, AbstractC5060hE0.v1);
            this.i = z31U.n(AbstractC5060hE0.y1, 0);
            this.j = (z31U.k(AbstractC5060hE0.B1, this.c) & (-65536)) | (z31U.k(AbstractC5060hE0.C1, this.d) & 65535);
            this.k = z31U.p(AbstractC5060hE0.D1);
            this.l = z31U.p(AbstractC5060hE0.E1);
            this.m = z31U.n(AbstractC5060hE0.w1, 0);
            this.n = c(z31U.o(AbstractC5060hE0.F1));
            this.o = z31U.k(AbstractC5060hE0.M1, 4096);
            this.p = c(z31U.o(AbstractC5060hE0.G1));
            this.q = z31U.k(AbstractC5060hE0.Q1, 4096);
            if (z31U.s(AbstractC5060hE0.H1)) {
                this.r = z31U.a(AbstractC5060hE0.H1, false) ? 1 : 0;
            } else {
                this.r = this.e;
            }
            this.s = z31U.a(AbstractC5060hE0.z1, false);
            this.t = z31U.a(AbstractC5060hE0.A1, this.f);
            this.u = z31U.a(AbstractC5060hE0.x1, this.g);
            this.v = z31U.k(AbstractC5060hE0.R1, -1);
            this.z = z31U.o(AbstractC5060hE0.I1);
            this.w = z31U.n(AbstractC5060hE0.J1, 0);
            this.x = z31U.o(AbstractC5060hE0.L1);
            String strO = z31U.o(AbstractC5060hE0.K1);
            this.y = strO;
            if (strO != null && this.w == 0 && this.x == null) {
                this.A = (AbstractC8360t2) e(strO, GZ0.f, GZ0.this.b);
            } else {
                this.A = null;
            }
            this.B = z31U.p(AbstractC5060hE0.N1);
            this.C = z31U.p(AbstractC5060hE0.S1);
            if (z31U.s(AbstractC5060hE0.P1)) {
                this.E = AbstractC5059hE.e(z31U.k(AbstractC5060hE0.P1, -1), this.E);
            } else {
                this.E = null;
            }
            if (z31U.s(AbstractC5060hE0.O1)) {
                this.D = z31U.c(AbstractC5060hE0.O1);
            } else {
                this.D = null;
            }
            z31U.x();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (GZ0.this.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(GZ0.this.b(), this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof MenuItemC0540Cj0) {
                    ((MenuItemC0540Cj0) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, GZ0.e, GZ0.this.a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            AbstractC8360t2 abstractC8360t2 = this.A;
            if (abstractC8360t2 != null) {
                AbstractC0332Aj0.a(menuItem, abstractC8360t2);
            }
            AbstractC0332Aj0.c(menuItem, this.B);
            AbstractC0332Aj0.g(menuItem, this.C);
            AbstractC0332Aj0.b(menuItem, this.n, this.o);
            AbstractC0332Aj0.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                AbstractC0332Aj0.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                AbstractC0332Aj0.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public GZ0(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.d == null) {
            this.d = a(this.c);
        }
        return this.d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC8360t2 abstractC8360t2 = bVar.A;
                            if (abstractC8360t2 == null || !abstractC8360t2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof FZ0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.H()) {
                        eVar.i0();
                        z = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((androidx.appcompat.view.menu.e) menu).h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((androidx.appcompat.view.menu.e) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
