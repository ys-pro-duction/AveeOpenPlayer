package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.Oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1767Oc extends AbstractC4400eu {
    public final Context a;
    public final InterfaceC6333lm b;
    public final InterfaceC6333lm c;
    public final String d;

    public C1767Oc(Context context, InterfaceC6333lm interfaceC6333lm, InterfaceC6333lm interfaceC6333lm2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (interfaceC6333lm == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = interfaceC6333lm;
        if (interfaceC6333lm2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = interfaceC6333lm2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // com.daaw.AbstractC4400eu
    public Context b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC4400eu
    public String c() {
        return this.d;
    }

    @Override // com.daaw.AbstractC4400eu
    public InterfaceC6333lm d() {
        return this.c;
    }

    @Override // com.daaw.AbstractC4400eu
    public InterfaceC6333lm e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4400eu) {
            AbstractC4400eu abstractC4400eu = (AbstractC4400eu) obj;
            if (this.a.equals(abstractC4400eu.b()) && this.b.equals(abstractC4400eu.e()) && this.c.equals(abstractC4400eu.d()) && this.d.equals(abstractC4400eu.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.d + "}";
    }
}
