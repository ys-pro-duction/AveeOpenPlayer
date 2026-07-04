package com.daaw;

import android.view.ViewGroup;

/* JADX INFO: renamed from: com.daaw.ce1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3765ce1 {

    /* JADX INFO: renamed from: com.daaw.ce1$a */
    public static class a {
        public static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        public static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        public static void c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }
}
