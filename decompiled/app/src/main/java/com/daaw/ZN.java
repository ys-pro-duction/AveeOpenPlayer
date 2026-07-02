package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class ZN {
    public static final a b = new a(null);
    public static final int c = C8565tm0.E;
    public static final ZN d = new ZN();
    public final C8565tm0 a = new C8565tm0(new C3695cO[16], 0);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final ZN a() {
            return ZN.d;
        }

        public a() {
        }
    }

    public final C8565tm0 b() {
        return this.a;
    }

    public final void c() {
        if (!this.a.u()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        C8565tm0 c8565tm0 = this.a;
        int iR = c8565tm0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i = 0;
            do {
                SN snD = ((C3695cO) objArrQ[i]).d();
                if (snD != null) {
                    AbstractC4820gO.h(snD);
                }
                i++;
            } while (i < iR);
        }
    }
}
