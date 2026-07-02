package com.android.billingclient.api;

import com.daaw.CU1;
import com.daaw.JC1;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public int a;
    public String b;

    public static class a {
        public int a;
        public String b = "";

        public /* synthetic */ a(CU1 cu1) {
        }

        public d a() {
            d dVar = new d();
            dVar.a = this.a;
            dVar.b = this.b;
            return dVar;
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(int i) {
            this.a = i;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        return "Response Code: " + JC1.g(this.a) + ", Debug Message: " + this.b;
    }
}
