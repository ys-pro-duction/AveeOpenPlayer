package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.e;
import com.daaw.C5003h2;
import com.daaw.C7015oC0;
import com.daaw.C7294pC0;
import com.daaw.C7474pr;
import com.daaw.InterfaceC1548Lz0;
import com.daaw.InterfaceC3182aZ;
import com.daaw.InterfaceC3370bC0;
import com.daaw.InterfaceC3648cC0;
import com.daaw.InterfaceC5282i2;
import com.daaw.InterfaceC7135of;
import com.daaw.InterfaceC7753qr;
import com.daaw.InterfaceC9807yB0;
import com.daaw.Tk3;
import com.daaw.ZY;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0041a {
    }

    public static final class b {
        public volatile e a;
        public final Context b;
        public volatile InterfaceC3648cC0 c;
        public volatile boolean d;
        public volatile boolean e;

        public /* synthetic */ b(Context context, Tk3 tk3) {
            this.b = context;
        }

        public a a() {
            if (this.b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.c == null) {
                if (this.d || this.e) {
                    return new com.android.billingclient.api.b(null, this.b, null, null);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.a == null || !this.a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return this.c != null ? new com.android.billingclient.api.b(null, this.a, this.b, this.c, null, null, null) : new com.android.billingclient.api.b(null, this.a, this.b, null, null, null);
        }

        public b b() {
            e.a aVarC = e.c();
            aVarC.b();
            c(aVarC.a());
            return this;
        }

        public b c(e eVar) {
            this.a = eVar;
            return this;
        }

        public b d(InterfaceC3648cC0 interfaceC3648cC0) {
            this.c = interfaceC3648cC0;
            return this;
        }
    }

    public static b g(Context context) {
        return new b(context, null);
    }

    public abstract void a(C5003h2 c5003h2, InterfaceC5282i2 interfaceC5282i2);

    public abstract void b(C7474pr c7474pr, InterfaceC7753qr interfaceC7753qr);

    public abstract void c();

    public abstract d d(String str);

    public abstract boolean e();

    public abstract d f(Activity activity, c cVar);

    public abstract void h(g gVar, InterfaceC1548Lz0 interfaceC1548Lz0);

    public abstract void i(C7015oC0 c7015oC0, InterfaceC9807yB0 interfaceC9807yB0);

    public abstract void j(C7294pC0 c7294pC0, InterfaceC3370bC0 interfaceC3370bC0);

    public abstract d k(Activity activity, ZY zy, InterfaceC3182aZ interfaceC3182aZ);

    public abstract void l(InterfaceC7135of interfaceC7135of);
}
