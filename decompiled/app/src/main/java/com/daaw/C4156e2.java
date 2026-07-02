package com.daaw;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4156e2 {
    public final Object a;

    /* JADX INFO: renamed from: com.daaw.e2$a */
    public static class a extends AccessibilityNodeProvider {
        public final C4156e2 a;

        public a(C4156e2 c4156e2) {
            this.a = c4156e2;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            Z1 z1B = this.a.b(i);
            if (z1B == null) {
                return null;
            }
            return z1B.Y0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i) {
            List listC = this.a.c(str, i);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((Z1) listC.get(i2)).Y0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            Z1 z1D = this.a.d(i);
            if (z1D == null) {
                return null;
            }
            return z1D.Y0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: com.daaw.e2$b */
    public static class b extends a {
        public b(C4156e2 c4156e2) {
            super(c4156e2);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, Z1.Z0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C4156e2() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new b(this);
        } else {
            this.a = new a(this);
        }
    }

    public Z1 b(int i) {
        return null;
    }

    public List c(String str, int i) {
        return null;
    }

    public Z1 d(int i) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }

    public C4156e2(Object obj) {
        this.a = obj;
    }

    public void a(int i, Z1 z1, String str, Bundle bundle) {
    }
}
