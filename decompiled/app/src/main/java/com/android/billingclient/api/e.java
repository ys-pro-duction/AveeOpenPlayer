package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final boolean a;
    public final boolean b;

    public static final class a {
        public boolean a;
        public boolean b;

        public a() {
        }

        public e a() {
            if (!this.a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new e(true, this.b);
        }

        public a b() {
            this.a = true;
            return this;
        }
    }

    public e(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static a c() {
        return new a();
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }
}
