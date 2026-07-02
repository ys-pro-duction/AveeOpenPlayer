package com.daaw;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.sd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8241sd0 implements InterfaceC6847nd0 {
    public final LocaleList a;

    public C8241sd0(Object obj) {
        this.a = AbstractC7962rd0.a(obj);
    }

    @Override // com.daaw.InterfaceC6847nd0
    public String a() {
        return this.a.toLanguageTags();
    }

    @Override // com.daaw.InterfaceC6847nd0
    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((InterfaceC6847nd0) obj).b());
    }

    @Override // com.daaw.InterfaceC6847nd0
    public Locale get(int i) {
        return this.a.get(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.daaw.InterfaceC6847nd0
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // com.daaw.InterfaceC6847nd0
    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }
}
