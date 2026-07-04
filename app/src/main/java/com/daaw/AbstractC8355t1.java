package com.daaw;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: com.daaw.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8355t1 {

    /* JADX INFO: renamed from: com.daaw.t1$a */
    public interface a {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* JADX INFO: renamed from: com.daaw.t1$b */
    public static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.a.onTouchExplorationStateChanged(z);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
