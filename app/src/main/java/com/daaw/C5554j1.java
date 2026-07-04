package com.daaw;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.daaw.Z1;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5554j1 {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;
    public final View.AccessibilityDelegate b;

    /* JADX INFO: renamed from: com.daaw.j1$a */
    public static final class a extends View.AccessibilityDelegate {
        public final C5554j1 a;

        public a(C5554j1 c5554j1) {
            this.a = c5554j1;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C4156e2 c4156e2B = this.a.b(view);
            if (c4156e2B != null) {
                return (AccessibilityNodeProvider) c4156e2B.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Z1 z1Z0 = Z1.Z0(accessibilityNodeInfo);
            z1Z0.M0(AbstractC2317Td1.X(view));
            z1Z0.y0(AbstractC2317Td1.S(view));
            z1Z0.G0(AbstractC2317Td1.q(view));
            z1Z0.S0(AbstractC2317Td1.L(view));
            this.a.g(view, z1Z0);
            z1Z0.f(accessibilityNodeInfo.getText(), view);
            List listC = C5554j1.c(view);
            for (int i = 0; i < listC.size(); i++) {
                z1Z0.b((Z1.a) listC.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.a.j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.a.l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }

    public C5554j1() {
        this(c);
    }

    public static List c(View view) {
        List list = (List) view.getTag(AbstractC7298pD0.H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C4156e2 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C4156e2(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrR = Z1.r(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; clickableSpanArrR != null && i < clickableSpanArrR.length; i++) {
                if (clickableSpan.equals(clickableSpanArrR[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, Z1 z1) {
        this.a.onInitializeAccessibilityNodeInfo(view, z1.Y0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i, Bundle bundle) {
        List listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i2 = 0;
        while (true) {
            if (i2 >= listC.size()) {
                break;
            }
            Z1.a aVar = (Z1.a) listC.get(i2);
            if (aVar.b() == i) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
            i2++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.a.performAccessibilityAction(view, i, bundle);
        }
        return (zPerformAccessibilityAction || i != AbstractC7298pD0.a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC7298pD0.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i) {
        this.a.sendAccessibilityEvent(view, i);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C5554j1(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new a(this);
    }
}
