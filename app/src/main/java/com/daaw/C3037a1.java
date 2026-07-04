package com.daaw;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3037a1 {
    public final Map a = new HashMap();
    public final Context b;
    public final InterfaceC7569qB0 c;

    public C3037a1(Context context, InterfaceC7569qB0 interfaceC7569qB0) {
        this.b = context;
        this.c = interfaceC7569qB0;
    }

    public C5925kL a(String str) {
        return new C5925kL(this.b, this.c, str);
    }

    public synchronized C5925kL b(String str) {
        try {
            if (!this.a.containsKey(str)) {
                this.a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C5925kL) this.a.get(str);
    }
}
