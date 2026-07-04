package com.daaw;

import android.os.Bundle;
import com.daaw.W3;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9443wt implements W3.b {
    public InterfaceC3888d4 a;
    public InterfaceC3888d4 b;

    public static void b(InterfaceC3888d4 interfaceC3888d4, String str, Bundle bundle) {
        if (interfaceC3888d4 == null) {
            return;
        }
        interfaceC3888d4.b(str, bundle);
    }

    @Override // com.daaw.W3.b
    public void a(int i, Bundle bundle) {
        String string;
        C2106Rd0.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public final void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.a : this.b, str, bundle);
    }

    public void d(InterfaceC3888d4 interfaceC3888d4) {
        this.b = interfaceC3888d4;
    }

    public void e(InterfaceC3888d4 interfaceC3888d4) {
        this.a = interfaceC3888d4;
    }
}
