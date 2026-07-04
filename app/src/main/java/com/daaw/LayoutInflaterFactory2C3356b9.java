package com.daaw;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.g;
import com.daaw.AbstractC8081s2;
import com.daaw.DZ0;
import com.daaw.J70;
import com.daaw.XI0;
import com.revenuecat.purchases.common.UtilsKt;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.daaw.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C3356b9 extends Z8 implements e.a, LayoutInflater.Factory2 {
    public static final BS0 K0 = new BS0();
    public static final boolean L0 = false;
    public static final int[] M0 = {R.attr.windowBackground};
    public static final boolean N0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A0;
    public int B0;
    public final Runnable C0;
    public boolean D0;
    public Rect E0;
    public Rect F0;
    public T9 G0;
    public C8961v90 H0;
    public OnBackInvokedDispatcher I0;
    public OnBackInvokedCallback J0;
    public final Object K;
    public final Context L;
    public Window M;
    public m N;
    public final T8 O;
    public AbstractC6687n2 P;
    public MenuInflater Q;
    public CharSequence R;
    public InterfaceC1328Jw S;
    public g T;
    public s U;
    public AbstractC8081s2 V;
    public ActionBarContextView W;
    public PopupWindow X;
    public Runnable Y;
    public C1154Ie1 Z;
    public boolean a0;
    public boolean b0;
    public ViewGroup c0;
    public TextView d0;
    public View e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public r[] n0;
    public r o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public Configuration t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public o y0;
    public o z0;

    /* JADX INFO: renamed from: com.daaw.b9$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b9 = LayoutInflaterFactory2C3356b9.this;
            if ((layoutInflaterFactory2C3356b9.B0 & 1) != 0) {
                layoutInflaterFactory2C3356b9.n0(0);
            }
            LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b92 = LayoutInflaterFactory2C3356b9.this;
            if ((layoutInflaterFactory2C3356b92.B0 & 4096) != 0) {
                layoutInflaterFactory2C3356b92.n0(108);
            }
            LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b93 = LayoutInflaterFactory2C3356b9.this;
            layoutInflaterFactory2C3356b93.A0 = false;
            layoutInflaterFactory2C3356b93.B0 = 0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$b */
    public class b implements InterfaceC2780Xp0 {
        public b() {
        }

        @Override // com.daaw.InterfaceC2780Xp0
        public C8820uh1 a(View view, C8820uh1 c8820uh1) {
            int iM = c8820uh1.m();
            int iJ1 = LayoutInflaterFactory2C3356b9.this.j1(c8820uh1, null);
            if (iM != iJ1) {
                c8820uh1 = c8820uh1.s(c8820uh1.k(), iJ1, c8820uh1.l(), c8820uh1.j());
            }
            return AbstractC2317Td1.b0(view, c8820uh1);
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: com.daaw.b9$d$a */
        public class a extends AbstractC1466Le1 {
            public a() {
            }

            @Override // com.daaw.InterfaceC1362Ke1
            public void b(View view) {
                LayoutInflaterFactory2C3356b9.this.W.setAlpha(1.0f);
                LayoutInflaterFactory2C3356b9.this.Z.g(null);
                LayoutInflaterFactory2C3356b9.this.Z = null;
            }

            @Override // com.daaw.AbstractC1466Le1, com.daaw.InterfaceC1362Ke1
            public void c(View view) {
                LayoutInflaterFactory2C3356b9.this.W.setVisibility(0);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b9 = LayoutInflaterFactory2C3356b9.this;
            layoutInflaterFactory2C3356b9.X.showAtLocation(layoutInflaterFactory2C3356b9.W, 55, 0, 0);
            LayoutInflaterFactory2C3356b9.this.o0();
            if (!LayoutInflaterFactory2C3356b9.this.Z0()) {
                LayoutInflaterFactory2C3356b9.this.W.setAlpha(1.0f);
                LayoutInflaterFactory2C3356b9.this.W.setVisibility(0);
            } else {
                LayoutInflaterFactory2C3356b9.this.W.setAlpha(0.0f);
                LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b92 = LayoutInflaterFactory2C3356b9.this;
                layoutInflaterFactory2C3356b92.Z = AbstractC2317Td1.e(layoutInflaterFactory2C3356b92.W).b(1.0f);
                LayoutInflaterFactory2C3356b9.this.Z.g(new a());
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$e */
    public class e extends AbstractC1466Le1 {
        public e() {
        }

        @Override // com.daaw.InterfaceC1362Ke1
        public void b(View view) {
            LayoutInflaterFactory2C3356b9.this.W.setAlpha(1.0f);
            LayoutInflaterFactory2C3356b9.this.Z.g(null);
            LayoutInflaterFactory2C3356b9.this.Z = null;
        }

        @Override // com.daaw.AbstractC1466Le1, com.daaw.InterfaceC1362Ke1
        public void c(View view) {
            LayoutInflaterFactory2C3356b9.this.W.setVisibility(0);
            if (LayoutInflaterFactory2C3356b9.this.W.getParent() instanceof View) {
                AbstractC2317Td1.m0((View) LayoutInflaterFactory2C3356b9.this.W.getParent());
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$f */
    public interface f {
        boolean a(int i);

        View onCreatePanelView(int i);
    }

    /* JADX INFO: renamed from: com.daaw.b9$g */
    public final class g implements i.a {
        public g() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            LayoutInflaterFactory2C3356b9.this.e0(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackA0 = LayoutInflaterFactory2C3356b9.this.A0();
            if (callbackA0 == null) {
                return true;
            }
            callbackA0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$h */
    public class h implements AbstractC8081s2.a {
        public AbstractC8081s2.a a;

        /* JADX INFO: renamed from: com.daaw.b9$h$a */
        public class a extends AbstractC1466Le1 {
            public a() {
            }

            @Override // com.daaw.InterfaceC1362Ke1
            public void b(View view) {
                LayoutInflaterFactory2C3356b9.this.W.setVisibility(8);
                LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b9 = LayoutInflaterFactory2C3356b9.this;
                PopupWindow popupWindow = layoutInflaterFactory2C3356b9.X;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C3356b9.W.getParent() instanceof View) {
                    AbstractC2317Td1.m0((View) LayoutInflaterFactory2C3356b9.this.W.getParent());
                }
                LayoutInflaterFactory2C3356b9.this.W.k();
                LayoutInflaterFactory2C3356b9.this.Z.g(null);
                LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b92 = LayoutInflaterFactory2C3356b9.this;
                layoutInflaterFactory2C3356b92.Z = null;
                AbstractC2317Td1.m0(layoutInflaterFactory2C3356b92.c0);
            }
        }

        public h(AbstractC8081s2.a aVar) {
            this.a = aVar;
        }

        @Override // com.daaw.AbstractC8081s2.a
        public boolean a(AbstractC8081s2 abstractC8081s2, Menu menu) {
            AbstractC2317Td1.m0(LayoutInflaterFactory2C3356b9.this.c0);
            return this.a.a(abstractC8081s2, menu);
        }

        @Override // com.daaw.AbstractC8081s2.a
        public boolean b(AbstractC8081s2 abstractC8081s2, Menu menu) {
            return this.a.b(abstractC8081s2, menu);
        }

        @Override // com.daaw.AbstractC8081s2.a
        public void c(AbstractC8081s2 abstractC8081s2) {
            this.a.c(abstractC8081s2);
            LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b9 = LayoutInflaterFactory2C3356b9.this;
            if (layoutInflaterFactory2C3356b9.X != null) {
                layoutInflaterFactory2C3356b9.M.getDecorView().removeCallbacks(LayoutInflaterFactory2C3356b9.this.Y);
            }
            LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b92 = LayoutInflaterFactory2C3356b9.this;
            if (layoutInflaterFactory2C3356b92.W != null) {
                layoutInflaterFactory2C3356b92.o0();
                LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b93 = LayoutInflaterFactory2C3356b9.this;
                layoutInflaterFactory2C3356b93.Z = AbstractC2317Td1.e(layoutInflaterFactory2C3356b93.W).b(0.0f);
                LayoutInflaterFactory2C3356b9.this.Z.g(new a());
            }
            LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b94 = LayoutInflaterFactory2C3356b9.this;
            T8 t8 = layoutInflaterFactory2C3356b94.O;
            if (t8 != null) {
                t8.o(layoutInflaterFactory2C3356b94.V);
            }
            LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b95 = LayoutInflaterFactory2C3356b9.this;
            layoutInflaterFactory2C3356b95.V = null;
            AbstractC2317Td1.m0(layoutInflaterFactory2C3356b95.c0);
            LayoutInflaterFactory2C3356b9.this.h1();
        }

        @Override // com.daaw.AbstractC8081s2.a
        public boolean d(AbstractC8081s2 abstractC8081s2, MenuItem menuItem) {
            return this.a.d(abstractC8081s2, menuItem);
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$i */
    public static class i {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$j */
    public static class j {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static C5163hd0 b(Configuration configuration) {
            return C5163hd0.c(configuration.getLocales().toLanguageTags());
        }

        public static void c(C5163hd0 c5163hd0) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c5163hd0.h()));
        }

        public static void d(Configuration configuration, C5163hd0 c5163hd0) {
            configuration.setLocales(LocaleList.forLanguageTags(c5163hd0.h()));
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$k */
    public static class k {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$l */
    public static class l {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b9) {
            Objects.requireNonNull(layoutInflaterFactory2C3356b9);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: com.daaw.p9
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    layoutInflaterFactory2C3356b9.I0();
                }
            };
            AbstractC6164l9.a(obj).registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            AbstractC6164l9.a(obj).unregisterOnBackInvokedCallback(AbstractC5876k9.a(obj2));
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$n */
    public class n extends o {
        public final PowerManager c;

        public n(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // com.daaw.LayoutInflaterFactory2C3356b9.o
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // com.daaw.LayoutInflaterFactory2C3356b9.o
        public int c() {
            return i.a(this.c) ? 2 : 1;
        }

        @Override // com.daaw.LayoutInflaterFactory2C3356b9.o
        public void d() {
            LayoutInflaterFactory2C3356b9.this.Y();
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$o */
    public abstract class o {
        public BroadcastReceiver a;

        /* JADX INFO: renamed from: com.daaw.b9$o$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                o.this.d();
            }
        }

        public o() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C3356b9.this.L.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            LayoutInflaterFactory2C3356b9.this.L.registerReceiver(this.a, intentFilterB);
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$p */
    public class p extends o {
        public final C3069a71 c;

        public p(C3069a71 c3069a71) {
            super();
            this.c = c3069a71;
        }

        @Override // com.daaw.LayoutInflaterFactory2C3356b9.o
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // com.daaw.LayoutInflaterFactory2C3356b9.o
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // com.daaw.LayoutInflaterFactory2C3356b9.o
        public void d() {
            LayoutInflaterFactory2C3356b9.this.Y();
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$q */
    public class q extends ContentFrameLayout {
        public q(Context context) {
            super(context);
        }

        public final boolean b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C3356b9.this.m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C3356b9.this.g0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(G9.b(getContext(), i));
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$r */
    public static final class r {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ViewGroup g;
        public View h;
        public View i;
        public androidx.appcompat.view.menu.e j;
        public androidx.appcompat.view.menu.c k;
        public Context l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public Bundle s;

        public r(int i) {
            this.a = i;
        }

        public androidx.appcompat.view.menu.j a(i.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.l, DD0.j);
                this.k = cVar;
                cVar.g(aVar);
                this.j.b(this.k);
            }
            return this.k.h(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.R(this.k);
            }
            this.j = eVar;
            if (eVar == null || (cVar = this.k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(KC0.a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(KC0.D, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            } else {
                themeNewTheme.applyStyle(TD0.b, true);
            }
            C0688Ds c0688Ds = new C0688Ds(context, 0);
            c0688Ds.getTheme().setTo(themeNewTheme);
            this.l = c0688Ds;
            TypedArray typedArrayObtainStyledAttributes = c0688Ds.obtainStyledAttributes(AbstractC5060hE0.y0);
            this.b = typedArrayObtainStyledAttributes.getResourceId(AbstractC5060hE0.B0, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(AbstractC5060hE0.A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$s */
    public final class s implements i.a {
        public s() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            androidx.appcompat.view.menu.e eVarF = eVar.F();
            boolean z2 = eVarF != eVar;
            LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b9 = LayoutInflaterFactory2C3356b9.this;
            if (z2) {
                eVar = eVarF;
            }
            r rVarR0 = layoutInflaterFactory2C3356b9.r0(eVar);
            if (rVarR0 != null) {
                if (!z2) {
                    LayoutInflaterFactory2C3356b9.this.h0(rVarR0, z);
                } else {
                    LayoutInflaterFactory2C3356b9.this.d0(rVarR0.a, rVarR0, eVarF);
                    LayoutInflaterFactory2C3356b9.this.h0(rVarR0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackA0;
            if (eVar != eVar.F()) {
                return true;
            }
            LayoutInflaterFactory2C3356b9 layoutInflaterFactory2C3356b9 = LayoutInflaterFactory2C3356b9.this;
            if (!layoutInflaterFactory2C3356b9.h0 || (callbackA0 = layoutInflaterFactory2C3356b9.A0()) == null || LayoutInflaterFactory2C3356b9.this.s0) {
                return true;
            }
            callbackA0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public LayoutInflaterFactory2C3356b9(Activity activity, T8 t8) {
        this(activity, null, t8, activity);
    }

    public static Configuration s0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                j.a(configuration, configuration2, configuration3);
            } else if (!AbstractC8580tp0.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                k.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            int i37 = configuration.densityDpi;
            int i38 = configuration2.densityDpi;
            if (i37 != i38) {
                configuration3.densityDpi = i38;
            }
        }
        return configuration3;
    }

    @Override // com.daaw.Z8
    public void A(Configuration configuration) {
        AbstractC6687n2 abstractC6687n2W;
        if (this.h0 && this.b0 && (abstractC6687n2W = w()) != null) {
            abstractC6687n2W.m(configuration);
        }
        C8116s9.b().g(this.L);
        this.t0 = new Configuration(this.L.getResources().getConfiguration());
        X(false, false);
    }

    public final Window.Callback A0() {
        return this.M.getCallback();
    }

    @Override // com.daaw.Z8
    public void B(Bundle bundle) {
        String strC;
        this.q0 = true;
        W(false);
        q0();
        Object obj = this.K;
        if (obj instanceof Activity) {
            try {
                strC = AbstractC6339ln0.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                AbstractC6687n2 abstractC6687n2S0 = S0();
                if (abstractC6687n2S0 == null) {
                    this.D0 = true;
                } else {
                    abstractC6687n2S0.r(true);
                }
            }
            Z8.e(this);
        }
        this.t0 = new Configuration(this.L.getResources().getConfiguration());
        this.r0 = true;
    }

    public final void B0() {
        p0();
        if (this.h0 && this.P == null) {
            Object obj = this.K;
            if (obj instanceof Activity) {
                this.P = new C3502bh1((Activity) this.K, this.i0);
            } else if (obj instanceof Dialog) {
                this.P = new C3502bh1((Dialog) this.K);
            }
            AbstractC6687n2 abstractC6687n2 = this.P;
            if (abstractC6687n2 != null) {
                abstractC6687n2.r(this.D0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // com.daaw.Z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.K
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            com.daaw.Z8.I(r3)
        L9:
            boolean r0 = r3.A0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.M
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.C0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.s0 = r0
            int r0 = r3.u0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.K
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            com.daaw.BS0 r0 = com.daaw.LayoutInflaterFactory2C3356b9.K0
            java.lang.Object r1 = r3.K
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.u0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            com.daaw.BS0 r0 = com.daaw.LayoutInflaterFactory2C3356b9.K0
            java.lang.Object r1 = r3.K
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            com.daaw.n2 r0 = r3.P
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.f0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.LayoutInflaterFactory2C3356b9.C():void");
    }

    public final boolean C0(r rVar) {
        View view = rVar.i;
        if (view != null) {
            rVar.h = view;
            return true;
        }
        if (rVar.j == null) {
            return false;
        }
        if (this.U == null) {
            this.U = new s();
        }
        View view2 = (View) rVar.a(this.U);
        rVar.h = view2;
        return view2 != null;
    }

    @Override // com.daaw.Z8
    public void D(Bundle bundle) {
        p0();
    }

    public final boolean D0(r rVar) {
        rVar.d(t0());
        rVar.g = new q(rVar.l);
        rVar.c = 81;
        return true;
    }

    @Override // com.daaw.Z8
    public void E() {
        AbstractC6687n2 abstractC6687n2W = w();
        if (abstractC6687n2W != null) {
            abstractC6687n2W.v(true);
        }
    }

    public final boolean E0(r rVar) {
        Resources.Theme themeNewTheme;
        Context context = this.L;
        int i2 = rVar.a;
        if ((i2 == 0 || i2 == 108) && this.S != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(KC0.d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(KC0.e, typedValue, true);
            } else {
                theme.resolveAttribute(KC0.e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                C0688Ds c0688Ds = new C0688Ds(context, 0);
                c0688Ds.getTheme().setTo(themeNewTheme);
                context = c0688Ds;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.W(this);
        rVar.c(eVar);
        return true;
    }

    public final void F0(int i2) {
        this.B0 = (1 << i2) | this.B0;
        if (this.A0) {
            return;
        }
        AbstractC2317Td1.h0(this.M.getDecorView(), this.C0);
        this.A0 = true;
    }

    @Override // com.daaw.Z8
    public void G() {
        X(true, false);
    }

    public boolean G0() {
        return this.a0;
    }

    @Override // com.daaw.Z8
    public void H() {
        AbstractC6687n2 abstractC6687n2W = w();
        if (abstractC6687n2W != null) {
            abstractC6687n2W.v(false);
        }
    }

    public int H0(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return w0(context).c();
                }
                return -1;
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return v0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    public boolean I0() {
        boolean z = this.p0;
        this.p0 = false;
        r rVarY0 = y0(0, false);
        if (rVarY0 != null && rVarY0.o) {
            if (!z) {
                h0(rVarY0, true);
            }
            return true;
        }
        AbstractC8081s2 abstractC8081s2 = this.V;
        if (abstractC8081s2 != null) {
            abstractC8081s2.c();
            return true;
        }
        AbstractC6687n2 abstractC6687n2W = w();
        return abstractC6687n2W != null && abstractC6687n2W.g();
    }

    public boolean J0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.p0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            K0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // com.daaw.Z8
    public boolean K(int i2) {
        int iW0 = W0(i2);
        if (this.l0 && iW0 == 108) {
            return false;
        }
        if (this.h0 && iW0 == 1) {
            this.h0 = false;
        }
        if (iW0 == 1) {
            d1();
            this.l0 = true;
            return true;
        }
        if (iW0 == 2) {
            d1();
            this.f0 = true;
            return true;
        }
        if (iW0 == 5) {
            d1();
            this.g0 = true;
            return true;
        }
        if (iW0 == 10) {
            d1();
            this.j0 = true;
            return true;
        }
        if (iW0 == 108) {
            d1();
            this.h0 = true;
            return true;
        }
        if (iW0 != 109) {
            return this.M.requestFeature(iW0);
        }
        d1();
        this.i0 = true;
        return true;
    }

    public final boolean K0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        r rVarY0 = y0(i2, true);
        if (rVarY0.o) {
            return false;
        }
        return U0(rVarY0, keyEvent);
    }

    public boolean L0(int i2, KeyEvent keyEvent) {
        AbstractC6687n2 abstractC6687n2W = w();
        if (abstractC6687n2W != null && abstractC6687n2W.o(i2, keyEvent)) {
            return true;
        }
        r rVar = this.o0;
        if (rVar != null && T0(rVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            r rVar2 = this.o0;
            if (rVar2 != null) {
                rVar2.n = true;
            }
            return true;
        }
        if (this.o0 == null) {
            r rVarY0 = y0(0, true);
            U0(rVarY0, keyEvent);
            boolean zT0 = T0(rVarY0, keyEvent.getKeyCode(), keyEvent, 1);
            rVarY0.m = false;
            if (zT0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.Z8
    public void M(int i2) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.c0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.L).inflate(i2, viewGroup);
        this.N.c(this.M.getCallback());
    }

    public boolean M0(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            if (i2 == 82) {
                N0(0, keyEvent);
                return true;
            }
        } else if (I0()) {
            return true;
        }
        return false;
    }

    @Override // com.daaw.Z8
    public void N(View view) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.c0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.N.c(this.M.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            com.daaw.s2 r0 = r4.V
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            com.daaw.b9$r r2 = r4.y0(r5, r0)
            if (r5 != 0) goto L43
            com.daaw.Jw r5 = r4.S
            if (r5 == 0) goto L43
            boolean r5 = r5.d()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.L
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            com.daaw.Jw r5 = r4.S
            boolean r5 = r5.b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.s0
            if (r5 != 0) goto L62
            boolean r5 = r4.U0(r2, r6)
            if (r5 == 0) goto L62
            com.daaw.Jw r5 = r4.S
            boolean r0 = r5.g()
            goto L68
        L3c:
            com.daaw.Jw r5 = r4.S
            boolean r0 = r5.f()
            goto L68
        L43:
            boolean r5 = r2.o
            if (r5 != 0) goto L64
            boolean r3 = r2.n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.m
            if (r5 == 0) goto L62
            boolean r5 = r2.r
            if (r5 == 0) goto L5b
            r2.m = r1
            boolean r5 = r4.U0(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.R0(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.h0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L7d
            android.content.Context r5 = r4.L
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7d
            r5.playSoundEffect(r1)
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.LayoutInflaterFactory2C3356b9.N0(int, android.view.KeyEvent):boolean");
    }

    @Override // com.daaw.Z8
    public void O(View view, ViewGroup.LayoutParams layoutParams) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.c0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.N.c(this.M.getCallback());
    }

    public void O0(int i2) {
        AbstractC6687n2 abstractC6687n2W;
        if (i2 != 108 || (abstractC6687n2W = w()) == null) {
            return;
        }
        abstractC6687n2W.h(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // com.daaw.Z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void P(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.P(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.I0
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.J0
            if (r1 == 0) goto L11
            com.daaw.LayoutInflaterFactory2C3356b9.l.c(r0, r1)
            r0 = 0
            r2.J0 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.K
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.K
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = com.daaw.LayoutInflaterFactory2C3356b9.l.a(r3)
            r2.I0 = r3
            goto L2e
        L2c:
            r2.I0 = r3
        L2e:
            r2.h1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.LayoutInflaterFactory2C3356b9.P(android.window.OnBackInvokedDispatcher):void");
    }

    public void P0(int i2) {
        if (i2 == 108) {
            AbstractC6687n2 abstractC6687n2W = w();
            if (abstractC6687n2W != null) {
                abstractC6687n2W.h(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            r rVarY0 = y0(i2, true);
            if (rVarY0.o) {
                h0(rVarY0, false);
            }
        }
    }

    @Override // com.daaw.Z8
    public void Q(Toolbar toolbar) {
        if (this.K instanceof Activity) {
            AbstractC6687n2 abstractC6687n2W = w();
            if (abstractC6687n2W instanceof C3502bh1) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.Q = null;
            if (abstractC6687n2W != null) {
                abstractC6687n2W.n();
            }
            this.P = null;
            if (toolbar != null) {
                C6420m41 c6420m41 = new C6420m41(toolbar, z0(), this.N);
                this.P = c6420m41;
                this.N.e(c6420m41.c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.N.e(null);
            }
            y();
        }
    }

    @Override // com.daaw.Z8
    public void R(int i2) {
        this.v0 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R0(com.daaw.LayoutInflaterFactory2C3356b9.r r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.LayoutInflaterFactory2C3356b9.R0(com.daaw.b9$r, android.view.KeyEvent):void");
    }

    @Override // com.daaw.Z8
    public final void S(CharSequence charSequence) {
        this.R = charSequence;
        InterfaceC1328Jw interfaceC1328Jw = this.S;
        if (interfaceC1328Jw != null) {
            interfaceC1328Jw.setWindowTitle(charSequence);
            return;
        }
        if (S0() != null) {
            S0().y(charSequence);
            return;
        }
        TextView textView = this.d0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final AbstractC6687n2 S0() {
        return this.P;
    }

    @Override // com.daaw.Z8
    public AbstractC8081s2 T(AbstractC8081s2.a aVar) {
        T8 t8;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC8081s2 abstractC8081s2 = this.V;
        if (abstractC8081s2 != null) {
            abstractC8081s2.c();
        }
        h hVar = new h(aVar);
        AbstractC6687n2 abstractC6687n2W = w();
        if (abstractC6687n2W != null) {
            AbstractC8081s2 abstractC8081s2Z = abstractC6687n2W.z(hVar);
            this.V = abstractC8081s2Z;
            if (abstractC8081s2Z != null && (t8 = this.O) != null) {
                t8.r(abstractC8081s2Z);
            }
        }
        if (this.V == null) {
            this.V = c1(hVar);
        }
        h1();
        return this.V;
    }

    public final boolean T0(r rVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rVar.m || U0(rVar, keyEvent)) && (eVar = rVar.j) != null) {
            zPerformShortcut = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.S == null) {
            h0(rVar, true);
        }
        return zPerformShortcut;
    }

    public final boolean U0(r rVar, KeyEvent keyEvent) {
        InterfaceC1328Jw interfaceC1328Jw;
        InterfaceC1328Jw interfaceC1328Jw2;
        InterfaceC1328Jw interfaceC1328Jw3;
        if (this.s0) {
            return false;
        }
        if (rVar.m) {
            return true;
        }
        r rVar2 = this.o0;
        if (rVar2 != null && rVar2 != rVar) {
            h0(rVar2, false);
        }
        Window.Callback callbackA0 = A0();
        if (callbackA0 != null) {
            rVar.i = callbackA0.onCreatePanelView(rVar.a);
        }
        int i2 = rVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (interfaceC1328Jw3 = this.S) != null) {
            interfaceC1328Jw3.c();
        }
        if (rVar.i == null && (!z || !(S0() instanceof C6420m41))) {
            androidx.appcompat.view.menu.e eVar = rVar.j;
            if (eVar == null || rVar.r) {
                if (eVar == null && (!E0(rVar) || rVar.j == null)) {
                    return false;
                }
                if (z && this.S != null) {
                    if (this.T == null) {
                        this.T = new g();
                    }
                    this.S.a(rVar.j, this.T);
                }
                rVar.j.i0();
                if (!callbackA0.onCreatePanelMenu(rVar.a, rVar.j)) {
                    rVar.c(null);
                    if (z && (interfaceC1328Jw = this.S) != null) {
                        interfaceC1328Jw.a(null, this.T);
                    }
                    return false;
                }
                rVar.r = false;
            }
            rVar.j.i0();
            Bundle bundle = rVar.s;
            if (bundle != null) {
                rVar.j.S(bundle);
                rVar.s = null;
            }
            if (!callbackA0.onPreparePanel(0, rVar.i, rVar.j)) {
                if (z && (interfaceC1328Jw2 = this.S) != null) {
                    interfaceC1328Jw2.a(null, this.T);
                }
                rVar.j.h0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            rVar.p = z2;
            rVar.j.setQwertyMode(z2);
            rVar.j.h0();
        }
        rVar.m = true;
        rVar.n = false;
        this.o0 = rVar;
        return true;
    }

    public final void V0(boolean z) {
        InterfaceC1328Jw interfaceC1328Jw = this.S;
        if (interfaceC1328Jw == null || !interfaceC1328Jw.d() || (ViewConfiguration.get(this.L).hasPermanentMenuKey() && !this.S.e())) {
            r rVarY0 = y0(0, true);
            rVarY0.q = true;
            h0(rVarY0, false);
            R0(rVarY0, null);
            return;
        }
        Window.Callback callbackA0 = A0();
        if (this.S.b() && z) {
            this.S.f();
            if (this.s0) {
                return;
            }
            callbackA0.onPanelClosed(108, y0(0, true).j);
            return;
        }
        if (callbackA0 == null || this.s0) {
            return;
        }
        if (this.A0 && (this.B0 & 1) != 0) {
            this.M.getDecorView().removeCallbacks(this.C0);
            this.C0.run();
        }
        r rVarY02 = y0(0, true);
        androidx.appcompat.view.menu.e eVar = rVarY02.j;
        if (eVar == null || rVarY02.r || !callbackA0.onPreparePanel(0, rVarY02.i, eVar)) {
            return;
        }
        callbackA0.onMenuOpened(108, rVarY02.j);
        this.S.g();
    }

    public final boolean W(boolean z) {
        return X(z, true);
    }

    public final int W0(int i2) {
        if (i2 == 8) {
            return 108;
        }
        if (i2 == 9) {
            return 109;
        }
        return i2;
    }

    public final boolean X(boolean z, boolean z2) {
        if (this.s0) {
            return false;
        }
        int iC0 = c0();
        int iH0 = H0(this.L, iC0);
        C5163hd0 c5163hd0B0 = Build.VERSION.SDK_INT < 33 ? b0(this.L) : null;
        if (!z2 && c5163hd0B0 != null) {
            c5163hd0B0 = x0(this.L.getResources().getConfiguration());
        }
        boolean zG1 = g1(iH0, c5163hd0B0, z);
        if (iC0 == 0) {
            w0(this.L).e();
        } else {
            o oVar = this.y0;
            if (oVar != null) {
                oVar.a();
            }
        }
        if (iC0 == 3) {
            v0(this.L).e();
            return zG1;
        }
        o oVar2 = this.z0;
        if (oVar2 != null) {
            oVar2.a();
        }
        return zG1;
    }

    public void X0(Configuration configuration, C5163hd0 c5163hd0) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.d(configuration, c5163hd0);
        } else {
            configuration.setLocale(c5163hd0.d(0));
            configuration.setLayoutDirection(c5163hd0.d(0));
        }
    }

    public boolean Y() {
        return W(true);
    }

    public void Y0(C5163hd0 c5163hd0) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.c(c5163hd0);
        } else {
            Locale.setDefault(c5163hd0.d(0));
        }
    }

    public final void Z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.c0.findViewById(R.id.content);
        View decorView = this.M.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.L.obtainStyledAttributes(AbstractC5060hE0.y0);
        typedArrayObtainStyledAttributes.getValue(AbstractC5060hE0.K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(AbstractC5060hE0.L0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5060hE0.I0)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC5060hE0.I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5060hE0.J0)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC5060hE0.J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5060hE0.G0)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC5060hE0.G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5060hE0.H0)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC5060hE0.H0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean Z0() {
        ViewGroup viewGroup;
        return this.b0 && (viewGroup = this.c0) != null && viewGroup.isLaidOut();
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        r rVarR0;
        Window.Callback callbackA0 = A0();
        if (callbackA0 == null || this.s0 || (rVarR0 = r0(eVar.F())) == null) {
            return false;
        }
        return callbackA0.onMenuItemSelected(rVarR0.a, menuItem);
    }

    public final void a0(Window window) {
        if (this.M != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof m) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        m mVar = new m(callback);
        this.N = mVar;
        window.setCallback(mVar);
        Z31 z31U = Z31.u(this.L, null, M0);
        Drawable drawableH = z31U.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        z31U.x();
        this.M = window;
        if (Build.VERSION.SDK_INT < 33 || this.I0 != null) {
            return;
        }
        P(null);
    }

    public final boolean a1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.M.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        V0(true);
    }

    public C5163hd0 b0(Context context) {
        C5163hd0 c5163hd0U;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 || (c5163hd0U = Z8.u()) == null) {
            return null;
        }
        C5163hd0 c5163hd0X0 = x0(context.getApplicationContext().getResources().getConfiguration());
        C5163hd0 c5163hd0B = i2 >= 24 ? AbstractC8520td0.b(c5163hd0U, c5163hd0X0) : c5163hd0U.f() ? C5163hd0.e() : C5163hd0.c(i.b(c5163hd0U.d(0)));
        return c5163hd0B.f() ? c5163hd0X0 : c5163hd0B;
    }

    public boolean b1() {
        if (this.I0 == null) {
            return false;
        }
        r rVarY0 = y0(0, false);
        return (rVarY0 != null && rVarY0.o) || this.V != null;
    }

    public final int c0() {
        int i2 = this.u0;
        return i2 != -100 ? i2 : Z8.q();
    }

    public AbstractC8081s2 c1(AbstractC8081s2.a aVar) {
        AbstractC8081s2 abstractC8081s2T;
        Context c0688Ds;
        T8 t8;
        o0();
        AbstractC8081s2 abstractC8081s2 = this.V;
        if (abstractC8081s2 != null) {
            abstractC8081s2.c();
        }
        if (!(aVar instanceof h)) {
            aVar = new h(aVar);
        }
        T8 t82 = this.O;
        if (t82 == null || this.s0) {
            abstractC8081s2T = null;
        } else {
            try {
                abstractC8081s2T = t82.t(aVar);
            } catch (AbstractMethodError unused) {
                abstractC8081s2T = null;
            }
        }
        if (abstractC8081s2T != null) {
            this.V = abstractC8081s2T;
        } else {
            if (this.W == null) {
                if (this.k0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.L.getTheme();
                    theme.resolveAttribute(KC0.d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.L.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        c0688Ds = new C0688Ds(this.L, 0);
                        c0688Ds.getTheme().setTo(themeNewTheme);
                    } else {
                        c0688Ds = this.L;
                    }
                    this.W = new ActionBarContextView(c0688Ds);
                    PopupWindow popupWindow = new PopupWindow(c0688Ds, (AttributeSet) null, KC0.f);
                    this.X = popupWindow;
                    AbstractC1852Ox0.b(popupWindow, 2);
                    this.X.setContentView(this.W);
                    this.X.setWidth(-1);
                    c0688Ds.getTheme().resolveAttribute(KC0.b, typedValue, true);
                    this.W.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c0688Ds.getResources().getDisplayMetrics()));
                    this.X.setHeight(-2);
                    this.Y = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.c0.findViewById(AbstractC6461mD0.h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(t0()));
                        this.W = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.W != null) {
                o0();
                this.W.k();
                TV0 tv0 = new TV0(this.W.getContext(), this.W, aVar, this.X == null);
                if (aVar.b(tv0, tv0.e())) {
                    tv0.k();
                    this.W.h(tv0);
                    this.V = tv0;
                    if (Z0()) {
                        this.W.setAlpha(0.0f);
                        C1154Ie1 c1154Ie1B = AbstractC2317Td1.e(this.W).b(1.0f);
                        this.Z = c1154Ie1B;
                        c1154Ie1B.g(new e());
                    } else {
                        this.W.setAlpha(1.0f);
                        this.W.setVisibility(0);
                        if (this.W.getParent() instanceof View) {
                            AbstractC2317Td1.m0((View) this.W.getParent());
                        }
                    }
                    if (this.X != null) {
                        this.M.getDecorView().post(this.Y);
                    }
                } else {
                    this.V = null;
                }
            }
        }
        AbstractC8081s2 abstractC8081s22 = this.V;
        if (abstractC8081s22 != null && (t8 = this.O) != null) {
            t8.r(abstractC8081s22);
        }
        h1();
        return this.V;
    }

    public void d0(int i2, r rVar, Menu menu) {
        if (menu == null) {
            if (rVar == null && i2 >= 0) {
                r[] rVarArr = this.n0;
                if (i2 < rVarArr.length) {
                    rVar = rVarArr[i2];
                }
            }
            if (rVar != null) {
                menu = rVar.j;
            }
        }
        if ((rVar == null || rVar.o) && !this.s0) {
            this.N.d(this.M.getCallback(), i2, menu);
        }
    }

    public final void d1() {
        if (this.b0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public void e0(androidx.appcompat.view.menu.e eVar) {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        this.S.i();
        Window.Callback callbackA0 = A0();
        if (callbackA0 != null && !this.s0) {
            callbackA0.onPanelClosed(108, eVar);
        }
        this.m0 = false;
    }

    public final P8 e1() {
        for (Context baseContext = this.L; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof P8) {
                return (P8) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    @Override // com.daaw.Z8
    public void f(View view, ViewGroup.LayoutParams layoutParams) {
        p0();
        ((ViewGroup) this.c0.findViewById(R.id.content)).addView(view, layoutParams);
        this.N.c(this.M.getCallback());
    }

    public final void f0() {
        o oVar = this.y0;
        if (oVar != null) {
            oVar.a();
        }
        o oVar2 = this.z0;
        if (oVar2 != null) {
            oVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f1(Configuration configuration) {
        Activity activity = (Activity) this.K;
        if (activity instanceof InterfaceC1764Ob0) {
            if (((InterfaceC1764Ob0) activity).w().b().c(g.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.r0 || this.s0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    @Override // com.daaw.Z8
    public boolean g() {
        if (Z8.z(this.L) && Z8.u() != null && !Z8.u().equals(Z8.v())) {
            i(this.L);
        }
        return W(true);
    }

    public void g0(int i2) {
        h0(y0(i2, true), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g1(int r11, com.daaw.C5163hd0 r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.LayoutInflaterFactory2C3356b9.g1(int, com.daaw.hd0, boolean):boolean");
    }

    public void h0(r rVar, boolean z) {
        ViewGroup viewGroup;
        InterfaceC1328Jw interfaceC1328Jw;
        if (z && rVar.a == 0 && (interfaceC1328Jw = this.S) != null && interfaceC1328Jw.b()) {
            e0(rVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.L.getSystemService("window");
        if (windowManager != null && rVar.o && (viewGroup = rVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                d0(rVar.a, rVar, null);
            }
        }
        rVar.m = false;
        rVar.n = false;
        rVar.o = false;
        rVar.h = null;
        rVar.q = true;
        if (this.o0 == rVar) {
            this.o0 = null;
        }
        if (rVar.a == 0) {
            h1();
        }
    }

    public void h1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zB1 = b1();
            if (zB1 && this.J0 == null) {
                this.J0 = l.b(this.I0, this);
            } else {
                if (zB1 || (onBackInvokedCallback = this.J0) == null) {
                    return;
                }
                l.c(this.I0, onBackInvokedCallback);
                this.J0 = null;
            }
        }
    }

    public final Configuration i0(Context context, int i2, C5163hd0 c5163hd0, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (c5163hd0 != null) {
            X0(configuration2, c5163hd0);
        }
        return configuration2;
    }

    public final void i1(int i2, C5163hd0 c5163hd0, boolean z, Configuration configuration) {
        Resources resources = this.L.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        if (c5163hd0 != null) {
            X0(configuration2, c5163hd0);
        }
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            AbstractC3119aJ0.a(resources);
        }
        int i4 = this.v0;
        if (i4 != 0) {
            this.L.setTheme(i4);
            if (i3 >= 23) {
                this.L.getTheme().applyStyle(this.v0, true);
            }
        }
        if (z && (this.K instanceof Activity)) {
            f1(configuration2);
        }
    }

    public final ViewGroup j0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.L.obtainStyledAttributes(AbstractC5060hE0.y0);
        if (!typedArrayObtainStyledAttributes.hasValue(AbstractC5060hE0.D0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5060hE0.M0, false)) {
            K(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5060hE0.D0, false)) {
            K(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5060hE0.E0, false)) {
            K(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5060hE0.F0, false)) {
            K(10);
        }
        this.k0 = typedArrayObtainStyledAttributes.getBoolean(AbstractC5060hE0.z0, false);
        typedArrayObtainStyledAttributes.recycle();
        q0();
        this.M.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.L);
        if (this.l0) {
            viewGroup = this.j0 ? (ViewGroup) layoutInflaterFrom.inflate(DD0.o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(DD0.n, (ViewGroup) null);
        } else if (this.k0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(DD0.f, (ViewGroup) null);
            this.i0 = false;
            this.h0 = false;
        } else if (this.h0) {
            TypedValue typedValue = new TypedValue();
            this.L.getTheme().resolveAttribute(KC0.d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0688Ds(this.L, typedValue.resourceId) : this.L).inflate(DD0.p, (ViewGroup) null);
            InterfaceC1328Jw interfaceC1328Jw = (InterfaceC1328Jw) viewGroup.findViewById(AbstractC6461mD0.p);
            this.S = interfaceC1328Jw;
            interfaceC1328Jw.setWindowCallback(A0());
            if (this.i0) {
                this.S.h(109);
            }
            if (this.f0) {
                this.S.h(2);
            }
            if (this.g0) {
                this.S.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.h0 + ", windowActionBarOverlay: " + this.i0 + ", android:windowIsFloating: " + this.k0 + ", windowActionModeOverlay: " + this.j0 + ", windowNoTitle: " + this.l0 + " }");
        }
        AbstractC2317Td1.D0(viewGroup, new b());
        if (this.S == null) {
            this.d0 = (TextView) viewGroup.findViewById(AbstractC6461mD0.C);
        }
        AbstractC2737Xe1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AbstractC6461mD0.b);
        ViewGroup viewGroup2 = (ViewGroup) this.M.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.M.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    public final int j1(C8820uh1 c8820uh1, Rect rect) {
        boolean z;
        boolean z2;
        int iM = c8820uh1 != null ? c8820uh1.m() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.W;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.W.getLayoutParams();
            if (this.W.isShown()) {
                if (this.E0 == null) {
                    this.E0 = new Rect();
                    this.F0 = new Rect();
                }
                Rect rect2 = this.E0;
                Rect rect3 = this.F0;
                if (c8820uh1 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c8820uh1.k(), c8820uh1.m(), c8820uh1.l(), c8820uh1.j());
                }
                AbstractC2737Xe1.a(this.c0, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                C8820uh1 c8820uh1K = AbstractC2317Td1.K(this.c0);
                int iK = c8820uh1K == null ? 0 : c8820uh1K.k();
                int iL = c8820uh1K == null ? 0 : c8820uh1K.l();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.e0 != null) {
                    View view = this.e0;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iK || marginLayoutParams2.rightMargin != iL) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iK;
                            marginLayoutParams2.rightMargin = iL;
                            this.e0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.L);
                    this.e0 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iK;
                    layoutParams.rightMargin = iL;
                    this.c0.addView(this.e0, -1, layoutParams);
                }
                View view3 = this.e0;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    k1(this.e0);
                }
                if (!this.j0 && z) {
                    iM = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                this.W.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.e0;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return iM;
    }

    @Override // com.daaw.Z8
    public Context k(Context context) {
        Context context2;
        this.q0 = true;
        int iH0 = H0(context, c0());
        if (Z8.z(context)) {
            Z8.V(context);
        }
        C5163hd0 c5163hd0B0 = b0(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(i0(context2, iH0, c5163hd0B0, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof C0688Ds) {
            try {
                ((C0688Ds) context2).a(i0(context2, iH0, c5163hd0B0, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!N0) {
            return super.k(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationI0 = i0(context2, iH0, c5163hd0B0, !configuration2.equals(configuration3) ? s0(configuration2, configuration3) : null, true);
        C0688Ds c0688Ds = new C0688Ds(context2, TD0.c);
        c0688Ds.a(configurationI0);
        try {
            if (context2.getTheme() != null) {
                XI0.f.a(c0688Ds.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.k(c0688Ds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View k0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.G0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.L.obtainStyledAttributes(AbstractC5060hE0.y0);
            String string = typedArrayObtainStyledAttributes.getString(AbstractC5060hE0.C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.G0 = new T9();
            } else {
                try {
                    this.G0 = (T9) this.L.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.G0 = new T9();
                }
            }
        }
        boolean z2 = L0;
        boolean zA1 = false;
        if (z2) {
            if (this.H0 == null) {
                this.H0 = new C8961v90();
            }
            if (this.H0.a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zA1 = a1((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zA1 = true;
                }
                z = zA1;
            }
        } else {
            z = false;
        }
        return this.G0.r(view, str, context, attributeSet, z, z2, true, C2833Yc1.c());
    }

    public final void k1(View view) {
        view.setBackgroundColor((AbstractC2317Td1.N(view) & 8192) != 0 ? AbstractC9438ws.c(this.L, SC0.b) : AbstractC9438ws.c(this.L, SC0.a));
    }

    public void l0() {
        androidx.appcompat.view.menu.e eVar;
        InterfaceC1328Jw interfaceC1328Jw = this.S;
        if (interfaceC1328Jw != null) {
            interfaceC1328Jw.i();
        }
        if (this.X != null) {
            this.M.getDecorView().removeCallbacks(this.Y);
            if (this.X.isShowing()) {
                try {
                    this.X.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.X = null;
        }
        o0();
        r rVarY0 = y0(0, false);
        if (rVarY0 == null || (eVar = rVarY0.j) == null) {
            return;
        }
        eVar.close();
    }

    public boolean m0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.K;
        if (((obj instanceof J70.a) || (obj instanceof AbstractDialogC7837r9)) && (decorView = this.M.getDecorView()) != null && J70.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.N.b(this.M.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? J0(keyCode, keyEvent) : M0(keyCode, keyEvent);
    }

    @Override // com.daaw.Z8
    public View n(int i2) {
        p0();
        return this.M.findViewById(i2);
    }

    public void n0(int i2) {
        r rVarY0;
        r rVarY02 = y0(i2, true);
        if (rVarY02.j != null) {
            Bundle bundle = new Bundle();
            rVarY02.j.U(bundle);
            if (bundle.size() > 0) {
                rVarY02.s = bundle;
            }
            rVarY02.j.i0();
            rVarY02.j.clear();
        }
        rVarY02.r = true;
        rVarY02.q = true;
        if ((i2 != 108 && i2 != 0) || this.S == null || (rVarY0 = y0(0, false)) == null) {
            return;
        }
        rVarY0.m = false;
        U0(rVarY0, null);
    }

    public void o0() {
        C1154Ie1 c1154Ie1 = this.Z;
        if (c1154Ie1 != null) {
            c1154Ie1.c();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return k0(view, str, context, attributeSet);
    }

    @Override // com.daaw.Z8
    public Context p() {
        return this.L;
    }

    public final void p0() {
        if (this.b0) {
            return;
        }
        this.c0 = j0();
        CharSequence charSequenceZ0 = z0();
        if (!TextUtils.isEmpty(charSequenceZ0)) {
            InterfaceC1328Jw interfaceC1328Jw = this.S;
            if (interfaceC1328Jw != null) {
                interfaceC1328Jw.setWindowTitle(charSequenceZ0);
            } else if (S0() != null) {
                S0().y(charSequenceZ0);
            } else {
                TextView textView = this.d0;
                if (textView != null) {
                    textView.setText(charSequenceZ0);
                }
            }
        }
        Z();
        Q0(this.c0);
        this.b0 = true;
        r rVarY0 = y0(0, false);
        if (this.s0) {
            return;
        }
        if (rVarY0 == null || rVarY0.j == null) {
            F0(108);
        }
    }

    public final void q0() {
        if (this.M == null) {
            Object obj = this.K;
            if (obj instanceof Activity) {
                a0(((Activity) obj).getWindow());
            }
        }
        if (this.M == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // com.daaw.Z8
    public int r() {
        return this.u0;
    }

    public r r0(Menu menu) {
        r[] rVarArr = this.n0;
        int length = rVarArr != null ? rVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            r rVar = rVarArr[i2];
            if (rVar != null && rVar.j == menu) {
                return rVar;
            }
        }
        return null;
    }

    @Override // com.daaw.Z8
    public MenuInflater t() {
        if (this.Q == null) {
            B0();
            AbstractC6687n2 abstractC6687n2 = this.P;
            this.Q = new GZ0(abstractC6687n2 != null ? abstractC6687n2.j() : this.L);
        }
        return this.Q;
    }

    public final Context t0() {
        AbstractC6687n2 abstractC6687n2W = w();
        Context contextJ = abstractC6687n2W != null ? abstractC6687n2W.j() : null;
        return contextJ == null ? this.L : contextJ;
    }

    public final int u0(Context context) {
        if (!this.x0 && (this.K instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.K.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.w0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.w0 = 0;
            }
        }
        this.x0 = true;
        return this.w0;
    }

    public final o v0(Context context) {
        if (this.z0 == null) {
            this.z0 = new n(context);
        }
        return this.z0;
    }

    @Override // com.daaw.Z8
    public AbstractC6687n2 w() {
        B0();
        return this.P;
    }

    public final o w0(Context context) {
        if (this.y0 == null) {
            this.y0 = new p(C3069a71.a(context));
        }
        return this.y0;
    }

    @Override // com.daaw.Z8
    public void x() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.L);
        if (layoutInflaterFrom.getFactory() == null) {
            AbstractC9240w90.a(layoutInflaterFrom, this);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C3356b9;
        }
    }

    public C5163hd0 x0(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? j.b(configuration) : C5163hd0.c(i.b(configuration.locale));
    }

    @Override // com.daaw.Z8
    public void y() {
        if (S0() == null || w().k()) {
            return;
        }
        F0(0);
    }

    public r y0(int i2, boolean z) {
        r[] rVarArr = this.n0;
        if (rVarArr == null || rVarArr.length <= i2) {
            r[] rVarArr2 = new r[i2 + 1];
            if (rVarArr != null) {
                System.arraycopy(rVarArr, 0, rVarArr2, 0, rVarArr.length);
            }
            this.n0 = rVarArr2;
            rVarArr = rVarArr2;
        }
        r rVar = rVarArr[i2];
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(i2);
        rVarArr[i2] = rVar2;
        return rVar2;
    }

    public final CharSequence z0() {
        Object obj = this.K;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.R;
    }

    public LayoutInflaterFactory2C3356b9(Dialog dialog, T8 t8) {
        this(dialog.getContext(), dialog.getWindow(), t8, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public LayoutInflaterFactory2C3356b9(Context context, Window window, T8 t8, Object obj) {
        P8 p8E1;
        this.Z = null;
        this.a0 = true;
        this.u0 = -100;
        this.C0 = new a();
        this.L = context;
        this.O = t8;
        this.K = obj;
        if (this.u0 == -100 && (obj instanceof Dialog) && (p8E1 = e1()) != null) {
            this.u0 = p8E1.l0().r();
        }
        if (this.u0 == -100) {
            BS0 bs0 = K0;
            Integer num = (Integer) bs0.get(obj.getClass().getName());
            if (num != null) {
                this.u0 = num.intValue();
                bs0.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            a0(window);
        }
        C8116s9.h();
    }

    /* JADX INFO: renamed from: com.daaw.b9$m */
    public class m extends AbstractWindowCallbackC2953Zg1 {
        public f C;
        public boolean D;
        public boolean E;
        public boolean F;

        public m(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.E = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.E = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.D = true;
                callback.onContentChanged();
            } finally {
                this.D = false;
            }
        }

        public void d(Window.Callback callback, int i, Menu menu) {
            try {
                this.F = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.F = false;
            }
        }

        @Override // com.daaw.AbstractWindowCallbackC2953Zg1, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.E ? a().dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C3356b9.this.m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // com.daaw.AbstractWindowCallbackC2953Zg1, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C3356b9.this.L0(keyEvent.getKeyCode(), keyEvent);
        }

        public void e(f fVar) {
            this.C = fVar;
        }

        public final ActionMode f(ActionMode.Callback callback) {
            DZ0.a aVar = new DZ0.a(LayoutInflaterFactory2C3356b9.this.L, callback);
            AbstractC8081s2 abstractC8081s2T = LayoutInflaterFactory2C3356b9.this.T(aVar);
            if (abstractC8081s2T != null) {
                return aVar.e(abstractC8081s2T);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.D) {
                a().onContentChanged();
            }
        }

        @Override // com.daaw.AbstractWindowCallbackC2953Zg1, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // com.daaw.AbstractWindowCallbackC2953Zg1, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View viewOnCreatePanelView;
            f fVar = this.C;
            return (fVar == null || (viewOnCreatePanelView = fVar.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : viewOnCreatePanelView;
        }

        @Override // com.daaw.AbstractWindowCallbackC2953Zg1, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflaterFactory2C3356b9.this.O0(i);
            return true;
        }

        @Override // com.daaw.AbstractWindowCallbackC2953Zg1, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.F) {
                a().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                LayoutInflaterFactory2C3356b9.this.P0(i);
            }
        }

        @Override // com.daaw.AbstractWindowCallbackC2953Zg1, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f0(true);
            }
            f fVar = this.C;
            boolean zOnPreparePanel = fVar != null && fVar.a(i);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // com.daaw.AbstractWindowCallbackC2953Zg1, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
            androidx.appcompat.view.menu.e eVar;
            r rVarY0 = LayoutInflaterFactory2C3356b9.this.y0(0, true);
            if (rVarY0 == null || (eVar = rVarY0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        @Override // com.daaw.AbstractWindowCallbackC2953Zg1, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflaterFactory2C3356b9.this.G0() ? f(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // com.daaw.AbstractWindowCallbackC2953Zg1, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (LayoutInflaterFactory2C3356b9.this.G0() && i == 0) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    /* JADX INFO: renamed from: com.daaw.b9$c */
    public class c implements ContentFrameLayout.a {
        public c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C3356b9.this.l0();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // com.daaw.Z8
    public void F(Bundle bundle) {
    }

    public void Q0(ViewGroup viewGroup) {
    }
}
