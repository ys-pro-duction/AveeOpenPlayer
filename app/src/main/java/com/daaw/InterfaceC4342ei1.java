package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.ei1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4342ei1 {
    public static final a a = a.a;

    /* JADX INFO: renamed from: com.daaw.ei1$a */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final InterfaceC4342ei1 b = C0169a.b;

        /* JADX INFO: renamed from: com.daaw.ei1$a$a, reason: collision with other inner class name */
        public static final class C0169a implements InterfaceC4342ei1 {
            public static final C0169a b = new C0169a();

            @Override // com.daaw.InterfaceC4342ei1
            public final WE0 a(View view) {
                G10.g(view, "rootView");
                return AbstractC4910gi1.c(view, null, null, 3, null);
            }
        }

        public final InterfaceC4342ei1 a() {
            return b;
        }
    }

    WE0 a(View view);
}
