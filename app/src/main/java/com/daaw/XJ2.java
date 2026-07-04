package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class XJ2 {
    public final C9327wU2 a;

    public XJ2(C8812uf3 c8812uf3) {
        this.a = c8812uf3.b0();
    }

    public final boolean a() {
        try {
            C4391es0 c4391es0A = C6878nj1.a(this.a.v());
            if (c4391es0A != null) {
                return c4391es0A.f("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.w().s().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.a.w().s().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
