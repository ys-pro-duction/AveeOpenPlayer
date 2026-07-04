package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.daaw.C5184hh1;
import com.daaw.C5554j1;
import com.daaw.C8820uh1;
import com.daaw.Z1;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.daaw.Td1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2317Td1 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static ThreadLocal d;
    public static final int[] e = {AbstractC7298pD0.b, AbstractC7298pD0.c, AbstractC7298pD0.n, AbstractC7298pD0.y, AbstractC7298pD0.B, AbstractC7298pD0.C, AbstractC7298pD0.D, AbstractC7298pD0.E, AbstractC7298pD0.F, AbstractC7298pD0.G, AbstractC7298pD0.d, AbstractC7298pD0.e, AbstractC7298pD0.f, AbstractC7298pD0.g, AbstractC7298pD0.h, AbstractC7298pD0.i, AbstractC7298pD0.j, AbstractC7298pD0.k, AbstractC7298pD0.l, AbstractC7298pD0.m, AbstractC7298pD0.o, AbstractC7298pD0.p, AbstractC7298pD0.q, AbstractC7298pD0.r, AbstractC7298pD0.s, AbstractC7298pD0.t, AbstractC7298pD0.u, AbstractC7298pD0.v, AbstractC7298pD0.w, AbstractC7298pD0.x, AbstractC7298pD0.z, AbstractC7298pD0.A};
    public static final InterfaceC10266zq0 f = new InterfaceC10266zq0() { // from class: com.daaw.Sd1
        @Override // com.daaw.InterfaceC10266zq0
        public final C3833cs a(C3833cs c3833cs) {
            return AbstractC2317Td1.a(c3833cs);
        }
    };
    public static final e g = new e();

    /* JADX INFO: renamed from: com.daaw.Td1$a */
    public class a extends f {
        public a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.d(view));
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.j(view, bool.booleanValue());
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$b */
    public class b extends f {
        public b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return k.b(view);
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            k.h(view, charSequence);
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$c */
    public class c extends f {
        public c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return m.b(view);
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            m.e(view, charSequence);
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$d */
    public class d extends f {
        public d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.g(view, bool.booleanValue());
        }

        @Override // com.daaw.AbstractC2317Td1.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$f */
    public static abstract class f {
        public final int a;
        public final Class b;
        public final int c;
        public final int d;

        public f(int i, Class cls, int i2) {
            this(i, cls, 0, i2);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        public abstract Object c(View view);

        public abstract void d(View view, Object obj);

        public Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.a);
            if (this.b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                AbstractC2317Td1.l(view);
                view.setTag(this.a, obj);
                AbstractC2317Td1.Y(view, this.d);
            }
        }

        public abstract boolean g(Object obj, Object obj2);

        public f(int i, Class cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$g */
    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$h */
    public static class h {

        /* JADX INFO: renamed from: com.daaw.Td1$h$a */
        public class a implements View.OnApplyWindowInsetsListener {
            public C8820uh1 a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ InterfaceC2780Xp0 c;

            public a(View view, InterfaceC2780Xp0 interfaceC2780Xp0) {
                this.b = view;
                this.c = interfaceC2780Xp0;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C8820uh1 c8820uh1Z = C8820uh1.z(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    h.a(windowInsets, this.b);
                    if (c8820uh1Z.equals(this.a)) {
                        return this.c.a(view, c8820uh1Z).x();
                    }
                }
                this.a = c8820uh1Z;
                C8820uh1 c8820uh1A = this.c.a(view, c8820uh1Z);
                if (i >= 30) {
                    return c8820uh1A.x();
                }
                AbstractC2317Td1.m0(view);
                return c8820uh1A.x();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC7298pD0.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static C8820uh1 b(View view, C8820uh1 c8820uh1, Rect rect) {
            WindowInsets windowInsetsX = c8820uh1.x();
            if (windowInsetsX != null) {
                return C8820uh1.z(view.computeSystemWindowInsets(windowInsetsX, rect), view);
            }
            rect.setEmpty();
            return c8820uh1;
        }

        public static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static C8820uh1 j(View view) {
            return C8820uh1.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, InterfaceC2780Xp0 interfaceC2780Xp0) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC7298pD0.L, interfaceC2780Xp0);
            }
            if (interfaceC2780Xp0 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC7298pD0.S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC2780Xp0));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$i */
    public static class i {
        public static C8820uh1 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C8820uh1 c8820uh1Y = C8820uh1.y(rootWindowInsets);
            c8820uh1Y.v(c8820uh1Y);
            c8820uh1Y.d(view.getRootView());
            return c8820uh1Y;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$j */
    public static class j {
        public static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void m(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void n(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void o(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$k */
    public static class k {
        public static void a(View view, final p pVar) {
            BS0 bs0 = (BS0) view.getTag(AbstractC7298pD0.R);
            if (bs0 == null) {
                bs0 = new BS0();
                view.setTag(AbstractC7298pD0.R, bs0);
            }
            Objects.requireNonNull(pVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(pVar) { // from class: com.daaw.Ud1
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            bs0.put(pVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, p pVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            BS0 bs0 = (BS0) view.getTag(AbstractC7298pD0.R);
            if (bs0 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) bs0.get(pVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, AbstractC1771Od abstractC1771Od) {
            view.setAutofillId(null);
        }

        public static void j(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$l */
    public static class l {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void e(View view, AbstractC2683Wr abstractC2683Wr) {
            view.setContentCaptureSession(null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$m */
    public static class m {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        public static void d(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$n */
    public static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C3833cs b(View view, C3833cs c3833cs) {
            ContentInfo contentInfoF = c3833cs.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? c3833cs : C3833cs.g(contentInfoPerformReceiveContent);
        }

        public static void c(View view, String[] strArr, InterfaceC9987yq0 interfaceC9987yq0) {
            if (interfaceC9987yq0 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new o(interfaceC9987yq0));
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$o */
    public static final class o implements OnReceiveContentListener {
        public final InterfaceC9987yq0 a;

        public o(InterfaceC9987yq0 interfaceC9987yq0) {
            this.a = interfaceC9987yq0;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C3833cs c3833csG = C3833cs.g(contentInfo);
            C3833cs c3833csA = this.a.a(view, c3833csG);
            if (c3833csA == null) {
                return null;
            }
            return c3833csA == c3833csG ? contentInfo : c3833csA.f();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Td1$p */
    public interface p {
    }

    /* JADX INFO: renamed from: com.daaw.Td1$q */
    public static class q {
        public static final ArrayList d = new ArrayList();
        public WeakHashMap a = null;
        public SparseArray b = null;
        public WeakReference c = null;

        public static q a(View view) {
            q qVar = (q) view.getTag(AbstractC7298pD0.Q);
            if (qVar != null) {
                return qVar;
            }
            q qVar2 = new q();
            view.setTag(AbstractC7298pD0.Q, qVar2);
            return qVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray d() {
            if (this.b == null) {
                this.b = new SparseArray();
            }
            return this.b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC7298pD0.R);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            AbstractC6314li0.a(arrayList.get(size));
            throw null;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.a == null) {
                        this.a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean A(View view) {
        return view.getFitsSystemWindows();
    }

    public static void A0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static int B(View view) {
        return view.getImportantForAccessibility();
    }

    public static void B0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            j.m(view, i2);
        }
    }

    public static int C(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j.c(view);
        }
        return 0;
    }

    public static void C0(View view, int i2) {
        view.setLabelFor(i2);
    }

    public static int D(View view) {
        return view.getLayoutDirection();
    }

    public static void D0(View view, InterfaceC2780Xp0 interfaceC2780Xp0) {
        h.u(view, interfaceC2780Xp0);
    }

    public static int E(View view) {
        return view.getMinimumHeight();
    }

    public static void E0(View view, int i2, int i3, int i4, int i5) {
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static int F(View view) {
        return view.getMinimumWidth();
    }

    public static void F0(View view, boolean z) {
        o0().f(view, Boolean.valueOf(z));
    }

    public static String[] G(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.a(view) : (String[]) view.getTag(AbstractC7298pD0.N);
    }

    public static void G0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            i.d(view, i2, i3);
        }
    }

    public static int H(View view) {
        return view.getPaddingEnd();
    }

    public static void H0(View view, CharSequence charSequence) {
        K0().f(view, charSequence);
    }

    public static int I(View view) {
        return view.getPaddingStart();
    }

    public static void I0(View view, String str) {
        h.v(view, str);
    }

    public static ViewParent J(View view) {
        return view.getParentForAccessibility();
    }

    public static void J0(View view, C5184hh1.b bVar) {
        C5184hh1.d(view, bVar);
    }

    public static C8820uh1 K(View view) {
        return Build.VERSION.SDK_INT >= 23 ? i.a(view) : h.j(view);
    }

    public static f K0() {
        return new c(AbstractC7298pD0.P, CharSequence.class, 64, 30);
    }

    public static CharSequence L(View view) {
        return (CharSequence) K0().e(view);
    }

    public static void L0(View view) {
        h.z(view);
    }

    public static String M(View view) {
        return h.k(view);
    }

    public static void M0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static int N(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float O(View view) {
        return h.m(view);
    }

    public static boolean P(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean Q(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean R(View view) {
        return view.hasTransientState();
    }

    public static boolean S(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean T(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean U(View view) {
        return view.isLaidOut();
    }

    public static boolean V(View view) {
        return h.p(view);
    }

    public static boolean W(View view) {
        return view.isPaddingRelative();
    }

    public static boolean X(View view) {
        Boolean bool = (Boolean) o0().e(view);
        return bool != null && bool.booleanValue();
    }

    public static void Y(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = q(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z) {
                    accessibilityEventObtain.getText().add(q(view));
                    A0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(q(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void Z(View view, int i2) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        Rect rectY = y();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectY.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectY.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        f(view, i2);
        if (z && rectY.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectY);
        }
    }

    public static /* synthetic */ C3833cs a(C3833cs c3833cs) {
        return c3833cs;
    }

    public static void a0(View view, int i2) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        Rect rectY = y();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectY.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectY.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        g(view, i2);
        if (z && rectY.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectY);
        }
    }

    public static f b() {
        return new d(AbstractC7298pD0.J, Boolean.class, 28);
    }

    public static C8820uh1 b0(View view, C8820uh1 c8820uh1) {
        WindowInsets windowInsetsX = c8820uh1.x();
        if (windowInsetsX != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsX);
            if (!windowInsetsB.equals(windowInsetsX)) {
                return C8820uh1.z(windowInsetsB, view);
            }
        }
        return c8820uh1;
    }

    public static int c(View view, CharSequence charSequence, InterfaceC4724g2 interfaceC4724g2) {
        int iS = s(view, charSequence);
        if (iS != -1) {
            d(view, new Z1.a(iS, charSequence, interfaceC4724g2));
        }
        return iS;
    }

    public static void c0(View view, Z1 z1) {
        view.onInitializeAccessibilityNodeInfo(z1.Y0());
    }

    public static void d(View view, Z1.a aVar) {
        l(view);
        k0(aVar.b(), view);
        r(view).add(aVar);
        Y(view, 0);
    }

    public static f d0() {
        return new b(AbstractC7298pD0.K, CharSequence.class, 8, 28);
    }

    public static C1154Ie1 e(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        C1154Ie1 c1154Ie1 = (C1154Ie1) a.get(view);
        if (c1154Ie1 != null) {
            return c1154Ie1;
        }
        C1154Ie1 c1154Ie12 = new C1154Ie1(view);
        a.put(view, c1154Ie12);
        return c1154Ie12;
    }

    public static boolean e0(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    public static void f(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            M0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                M0((View) parent);
            }
        }
    }

    public static C3833cs f0(View view, C3833cs c3833cs) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c3833cs);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, c3833cs);
        }
        InterfaceC9987yq0 interfaceC9987yq0 = (InterfaceC9987yq0) view.getTag(AbstractC7298pD0.M);
        if (interfaceC9987yq0 == null) {
            return z(view).a(c3833cs);
        }
        C3833cs c3833csA = interfaceC9987yq0.a(view, c3833cs);
        if (c3833csA == null) {
            return null;
        }
        return z(view).a(c3833csA);
    }

    public static void g(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            M0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                M0((View) parent);
            }
        }
    }

    public static void g0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static C8820uh1 h(View view, C8820uh1 c8820uh1, Rect rect) {
        return h.b(view, c8820uh1, rect);
    }

    public static void h0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static C8820uh1 i(View view, C8820uh1 c8820uh1) {
        WindowInsets windowInsetsX = c8820uh1.x();
        if (windowInsetsX != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsX);
            if (!windowInsetsA.equals(windowInsetsX)) {
                return C8820uh1.z(windowInsetsA, view);
            }
        }
        return c8820uh1;
    }

    public static void i0(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).b(view, keyEvent);
    }

    public static void j0(View view, int i2) {
        k0(i2, view);
        Y(view, 0);
    }

    public static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).f(keyEvent);
    }

    public static void k0(int i2, View view) {
        List listR = r(view);
        for (int i3 = 0; i3 < listR.size(); i3++) {
            if (((Z1.a) listR.get(i3)).b() == i2) {
                listR.remove(i3);
                return;
            }
        }
    }

    public static void l(View view) {
        C5554j1 c5554j1N = n(view);
        if (c5554j1N == null) {
            c5554j1N = new C5554j1();
        }
        p0(view, c5554j1N);
    }

    public static void l0(View view, Z1.a aVar, CharSequence charSequence, InterfaceC4724g2 interfaceC4724g2) {
        if (interfaceC4724g2 == null && charSequence == null) {
            j0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, interfaceC4724g2));
        }
    }

    public static int m() {
        return View.generateViewId();
    }

    public static void m0(View view) {
        g.c(view);
    }

    public static C5554j1 n(View view) {
        View.AccessibilityDelegate accessibilityDelegateO = o(view);
        if (accessibilityDelegateO == null) {
            return null;
        }
        return accessibilityDelegateO instanceof C5554j1.a ? ((C5554j1.a) accessibilityDelegateO).a : new C5554j1(accessibilityDelegateO);
    }

    public static void n0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.d(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static View.AccessibilityDelegate o(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : p(view);
    }

    public static f o0() {
        return new a(AbstractC7298pD0.O, Boolean.class, 28);
    }

    public static View.AccessibilityDelegate p(View view) {
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static void p0(View view, C5554j1 c5554j1) {
        if (c5554j1 == null && (o(view) instanceof C5554j1.a)) {
            c5554j1 = new C5554j1();
        }
        A0(view);
        view.setAccessibilityDelegate(c5554j1 == null ? null : c5554j1.d());
    }

    public static CharSequence q(View view) {
        return (CharSequence) d0().e(view);
    }

    public static void q0(View view, boolean z) {
        b().f(view, Boolean.valueOf(z));
    }

    public static List r(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(AbstractC7298pD0.H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(AbstractC7298pD0.H, arrayList2);
        return arrayList2;
    }

    public static void r0(View view, int i2) {
        view.setAccessibilityLiveRegion(i2);
    }

    public static int s(View view, CharSequence charSequence) {
        List listR = r(view);
        for (int i2 = 0; i2 < listR.size(); i2++) {
            if (TextUtils.equals(charSequence, ((Z1.a) listR.get(i2)).c())) {
                return ((Z1.a) listR.get(i2)).b();
            }
        }
        int i3 = 0;
        int i4 = -1;
        while (true) {
            int[] iArr = e;
            if (i3 >= iArr.length || i4 != -1) {
                break;
            }
            int i5 = iArr[i3];
            boolean z = true;
            for (int i6 = 0; i6 < listR.size(); i6++) {
                z &= ((Z1.a) listR.get(i6)).b() != i5;
            }
            if (z) {
                i4 = i5;
            }
            i3++;
        }
        return i4;
    }

    public static void s0(View view, CharSequence charSequence) {
        d0().f(view, charSequence);
        if (charSequence != null) {
            g.a(view);
        } else {
            g.d(view);
        }
    }

    public static ColorStateList t(View view) {
        return h.g(view);
    }

    public static void t0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static PorterDuff.Mode u(View view) {
        return h.h(view);
    }

    public static void u0(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        h.q(view, colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (h.g(view) == null && h.h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    public static Rect v(View view) {
        return view.getClipBounds();
    }

    public static void v0(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        h.r(view, mode);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (h.g(view) == null && h.h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    public static Display w(View view) {
        return view.getDisplay();
    }

    public static void w0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static float x(View view) {
        return h.i(view);
    }

    public static void x0(View view, float f2) {
        h.s(view, f2);
    }

    public static Rect y() {
        if (d == null) {
            d = new ThreadLocal();
        }
        Rect rect = (Rect) d.get();
        if (rect == null) {
            rect = new Rect();
            d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void y0(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC10266zq0 z(View view) {
        return view instanceof InterfaceC10266zq0 ? (InterfaceC10266zq0) view : f;
    }

    public static void z0(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    /* JADX INFO: renamed from: com.daaw.Td1$e */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap B = new WeakHashMap();

        public void a(View view) {
            this.B.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        public final void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z) {
                AbstractC2317Td1.Y(view, z ? 16 : 32);
                entry.setValue(Boolean.valueOf(z));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.B.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.B.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
