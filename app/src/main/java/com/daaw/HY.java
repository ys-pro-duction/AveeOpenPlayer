package com.daaw;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class HY implements androidx.lifecycle.j {
    public static final c C = new c(null);
    public static final O90 D = AbstractC3192ab0.a(b.B);
    public final Activity B;

    public static abstract class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public abstract boolean a(InputMethodManager inputMethodManager);

        public abstract Object b(InputMethodManager inputMethodManager);

        public abstract View c(InputMethodManager inputMethodManager);

        public a() {
        }
    }

    public static final class b extends AbstractC4192e90 implements LQ {
        public static final b B = new b();

        public b() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                declaredField3.setAccessible(true);
                G10.f(declaredField3, "hField");
                G10.f(declaredField, "servedViewField");
                G10.f(declaredField2, "nextServedViewField");
                return new e(declaredField3, declaredField, declaredField2);
            } catch (NoSuchFieldException unused) {
                return d.a;
            }
        }
    }

    public static final class c {
        public /* synthetic */ c(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final a a() {
            return (a) HY.D.getValue();
        }

        public c() {
        }
    }

    public static final class d extends a {
        public static final d a = new d();

        public d() {
            super(null);
        }

        @Override // com.daaw.HY.a
        public boolean a(InputMethodManager inputMethodManager) {
            G10.g(inputMethodManager, "<this>");
            return false;
        }

        @Override // com.daaw.HY.a
        public Object b(InputMethodManager inputMethodManager) {
            G10.g(inputMethodManager, "<this>");
            return null;
        }

        @Override // com.daaw.HY.a
        public View c(InputMethodManager inputMethodManager) {
            G10.g(inputMethodManager, "<this>");
            return null;
        }
    }

    public static final class e extends a {
        public final Field a;
        public final Field b;
        public final Field c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Field field, Field field2, Field field3) {
            super(null);
            G10.g(field, "hField");
            G10.g(field2, "servedViewField");
            G10.g(field3, "nextServedViewField");
            this.a = field;
            this.b = field2;
            this.c = field3;
        }

        @Override // com.daaw.HY.a
        public boolean a(InputMethodManager inputMethodManager) {
            G10.g(inputMethodManager, "<this>");
            try {
                this.c.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // com.daaw.HY.a
        public Object b(InputMethodManager inputMethodManager) {
            G10.g(inputMethodManager, "<this>");
            try {
                return this.a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.daaw.HY.a
        public View c(InputMethodManager inputMethodManager) {
            G10.g(inputMethodManager, "<this>");
            try {
                return (View) this.b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public HY(Activity activity) {
        G10.g(activity, "activity");
        this.B = activity;
    }

    @Override // androidx.lifecycle.j
    public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        G10.g(interfaceC1764Ob0, "source");
        G10.g(aVar, "event");
        if (aVar != g.a.ON_DESTROY) {
            return;
        }
        Object systemService = this.B.getSystemService("input_method");
        G10.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        a aVarA = C.a();
        Object objB = aVarA.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = aVarA.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = aVarA.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
